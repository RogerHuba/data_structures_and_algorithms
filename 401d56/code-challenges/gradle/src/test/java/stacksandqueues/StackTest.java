package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {


    // Push on to a stack single value
    @Test
    public void testStackPass(){
        Stack newStack = new Stack();
        assertNotNull("The new stack should not be null",newStack);
    }

    @Test
    public void addToEmptyStack(){
        Stack newStack = new Stack();
        newStack.add(10);
        assertEquals("The top should be 10", 10, newStack.top.data);
    }

    @Test
    public void addToStackMany(){
        Stack newStack = new Stack();
        newStack.add(10);
        newStack.add(18);
        newStack.add(3988);
        newStack.add(1);
        assertEquals("The top should be 10", 1, newStack.top.data);
        assertEquals("The top next should be 3988", 3988, newStack.top.next.data);
    }

    @Test
    public void removeFromStackPopulated(){
        Stack newStack = new Stack();
        newStack.add(18);
        newStack.add(3988);
        newStack.add(1);
        newStack.remove();
        assertEquals("The new top should be 3988", 3988, newStack.top.data);
    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackOfOne(){
        Stack newStack = new Stack();
        newStack.add(10);
        newStack.add(15);
        newStack.remove();
        assertEquals("The new top should be 10", 10, newStack.top.data);
        newStack.remove();
        assertEquals("The new top should be Null", null, newStack.top.data);

    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackEmpty(){
        Stack newStack = new Stack();
        newStack.remove();
        assertEquals("The new top should be 10", null, newStack.top.data);

    }

    @Test
    public void peekStackPass(){
        Stack newStack = new Stack();
        newStack.add(10);
        newStack.add(18);
        newStack.add(3988);
        newStack.add(1);
        int value = newStack.peekTopOfStack();
        assertEquals("Peek should return 1", 1, value);
    }

    @Test
    public void peekStackFail(){
        Stack newStack = new Stack();
        newStack.add(10);
        newStack.add(18);
        newStack.add(3988);
        newStack.add(1);
        int value = newStack.peekTopOfStack();
        assertNotEquals("Peek should return 1", 10, value);
    }

    @Test
    public void testIsStackNotEmpty(){
        Stack newStack = new Stack();
        newStack.add(10);
        boolean empty = newStack.isEmpty();
        assertFalse("The Stack is not empty", empty);
    }
    
    @Test
    public void testIsStackEmpty(){
        Stack newStack = new Stack();
        boolean empty = newStack.isEmpty();
        assertTrue("The Stack is not empty", empty);
    }

}
