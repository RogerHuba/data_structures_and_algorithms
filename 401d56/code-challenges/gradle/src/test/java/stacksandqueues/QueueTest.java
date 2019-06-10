package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {
    @Test
    public void testQueue(){
        Queue newQueue = new Queue();
        assertNotNull("The new stack should not be null",newQueue);
    }

    @Test
    public void addToEmptyQueue(){
        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        assertEquals("The top should be 10", 10, newQueue.head.data);
    }

    @Test
    public void addMultipleToQueue(){
        Queue newQueue = new Queue();
        newQueue.enQueue(1);
        newQueue.enQueue(15);
        newQueue.enQueue(16);
        newQueue.enQueue(19);
        assertEquals("The top should be 10", 1, newQueue.head.data);
    }


    @Test
    public void addToQueueMany(){
        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        newQueue.enQueue(18);
        newQueue.enQueue(3988);
        newQueue.enQueue(1);
        assertEquals("The top should be 10", 10, newQueue.head.data);
    }

    @Test
    public void removeFromQueuePopulatedPass(){
        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        newQueue.enQueue(13);
        newQueue.enQueue(15);
        newQueue.enQueue(19);
        newQueue.deQueue();
        newQueue.deQueue();
        newQueue.deQueue();
        assertEquals("The new top should be 3988", 19, newQueue.head.data);
    }

    @Test
    public void removeFromQueuePopulatedFail(){
        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        newQueue.enQueue(13);
        newQueue.enQueue(15);
        newQueue.enQueue(19);
        newQueue.deQueue();
        newQueue.deQueue();
        newQueue.deQueue();
        assertNotEquals("The new top should be 3988", 15, newQueue.head.data);
    }

    @Test
    public void testIsQueueNotEmpty(){
        Queue newQueue = new Queue();
        newQueue.enQueue(10);
        boolean empty = newQueue.isEmpty();
        assertFalse("The Queue is not empty", empty);
    }

    @Test
    public void testIsQueueEmpty(){
        Queue newQueue = new Queue();
        boolean empty = newQueue.isEmpty();
        assertTrue("The Queue is not empty", empty);
    }

}