package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {

    private void makeNode(){
        Stack<Integer> newStack = new Stack<>();
    }

    private void addNodesSingle(){
        newStack.add(5);
    }

    private void addNodesTwo(){
        newStack.add(5);
        newStack.add(10);
    }

    private void addNodesMultiiple(){
        newStack.add(5);
        newStack.add(10);
        newStack.add(15);
        newStack.add(20);
        newStack.add(25);
        newStack.add(30);
    }


    @Test
    public void testStackPass(){
        makeNode();
        assertNotNull("The new stack should not be null",newStack);
    }

    @Test
    public void addToEmptyStack(){
        makeNode();
        addNodesSingle();
        assertEquals("The top should be 10", 10, newStack.front.data);
    }

    @Test
    public void addToStackMany(){
        makeNode();
        addNodesMultiiple();
        assertEquals("The top should be 10", 1, newStack.front.data);
        assertEquals("The top next should be 3988", 3988, newStack.front.next.data);
    }

    @Test
    public void removeFromStackPopulated(){
        makeNode();
        addNodesMultiiple();
        newStack.remove();
        assertEquals("The new top should be 3988", 3988, newStack.front.data);
    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackOfOne(){
        makeNode();
        addNodesTwo();
        newStack.remove();
        assertEquals("The new top should be 10", 10, newStack.front.data);
        newStack.remove();
        assertEquals("The new top should be Null", null, newStack.front.data);
    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackEmpty(){
        makeNode();
        newStack.remove();
        assertEquals("The new top should be 10", null, newStack.front.data);
    }

    @Test
    public void peekStackPass(){
        makeNode();
        addNodesMultiiple();
        int value = newStack.peekTopOfStack();
        assertEquals("Peek should return 1", 1, value);
    }

    @Test
    public void peekStackFail(){
        makeNode();
        addNodesMultiiple();
        int value = newStack.peekTopOfStack();
        assertNotEquals("Peek should return 1", 10, value);
    }

    @Test
    public void testIsStackNotEmpty(){
        makeNode();
        addNodesMultiiple();
        boolean empty = newStack.isEmpty();
        assertFalse("The Stack is not empty", empty);
    }

    @Test
    public void testIsStackEmpty(){
        makeNode();
        boolean empty = newStack.isEmpty();
        assertTrue("The Stack is not empty", empty);
    }
}
