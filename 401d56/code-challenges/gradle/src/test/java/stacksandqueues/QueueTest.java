package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

    private Queue<Integer> makeQueue(){
        Queue<Integer> newQueue = new Queue<>();
        return newQueue;
    }

    private Queue<Integer> addNodesSingle(Queue newQueue){
        newQueue.enQueue(5);
        return newQueue;
    }

    private Queue<Integer> addNodesTwo(Queue newQueue){
        newQueue.enQueue(5);
        newQueue.enQueue(10);
        return newQueue;
    }

    private Queue<Integer> addNodesMultiple(Queue newQueue){
        newQueue.enQueue(10);
        newQueue.enQueue(15);
        newQueue.enQueue(20);
        newQueue.enQueue(25);
        newQueue.enQueue(30);
        return newQueue;
    }

    @Test
    public void testQueue(){
        Queue<Integer> newQueue = makeQueue();
        assertNotNull("The new stack should not be null",newQueue);
    }

    @Test
    public void addToEmptyQueue(){
        Queue<Integer> newQueue = makeQueue();
        addNodesSingle(newQueue);
        int value = newQueue.head.data;
        assertEquals("The top should be 5", 5, value);
    }

    @Test
    public void addMultipleToQueue(){
        Queue<Integer> newQueue = makeQueue();
        addNodesMultiple(newQueue);
        int value = newQueue.head.data;
        assertEquals("The top should be 10", 10, value);
    }


    @Test
    public void addToQueueMany(){
        Queue<Integer> newQueue = makeQueue();
        addNodesMultiple(newQueue);
        int value = newQueue.head.data;
        assertEquals("The top should be 10", 10, value);
    }

    @Test
    public void removeFromQueuePopulatedPass(){
        Queue<Integer> newQueue = makeQueue();
        addNodesMultiple(newQueue);
        newQueue.deQueue();
        newQueue.deQueue();
        newQueue.deQueue();
        int value = newQueue.head.data;
        assertEquals("The new top should be 25", 25, value);
    }

    @Test
    public void removeFromQueuePopulatedFail(){
        Queue<Integer> newQueue = makeQueue();
        addNodesMultiple(newQueue);
        newQueue.deQueue();
        newQueue.deQueue();
        newQueue.deQueue();
        int value = newQueue.head.data;
        assertNotEquals("The new top should be 3988", 15, value);
    }

    @Test
    public void testIsQueueNotEmpty(){
        Queue<Integer> newQueue = makeQueue();
        newQueue.enQueue(10);
        boolean empty = newQueue.isEmpty();
        assertFalse("The Queue is not empty", empty);
    }

    @Test
    public void testIsQueueEmpty(){
        Queue<Integer> newQueue = makeQueue();
        boolean empty = newQueue.isEmpty();
        assertTrue("The Queue is not empty", empty);
    }

    @Test(expected=IllegalStateException.class)
    public void testPeekQueueEmpty(){
        Queue<Integer> newQueue = makeQueue();
        newQueue.peek();
    }

    @Test
    public void testPeekQueueTwoInQueue(){
        Queue<Integer> newQueue = makeQueue();
        addNodesTwo(newQueue);
        newQueue.peek();
        int value = newQueue.head.data;
        assertEquals("The new top should be 5", 5, value);

    }
}