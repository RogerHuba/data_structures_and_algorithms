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

    // Push on to a queue single value
    // empty queue
    // queue of 1
    // queue of many

    // enqueue multiple values onto a queue
    // empty queue
    // queue of 1
    // queue of many

    // dequeue a value off a queue
    // empty queue
    // queue of 1
    // queue of many

    // empty a queue

    // Peek an item on the queue

    // Instantiate an empty queue

}