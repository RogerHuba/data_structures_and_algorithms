package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {
    private Stack<Integer> makeStack(){
        Stack<Integer> newStack = new Stack<>();
        return newStack;
    }

    private Stack<Integer> addNodesSingle(Stack newStack){
        newStack.push(5);
        return newStack;
    }

    private Stack<Integer> addNodesTwo(Stack newStack){
        newStack.push(5);
        newStack.push(10);
        return newStack;
    }

    private Stack<Integer> addNodesMultiple(Stack newStack){
        newStack.push(10);
        newStack.push(15);
        newStack.push(20);
        newStack.push(25);
        newStack.push(30);
        return newStack;
    }


    @Test
    public void testStackPass(){
        Stack<Integer> newStack = makeStack();
        assertNotNull("The new stack should not be null",newStack);
    }

    @Test
    public void addToEmptyStack(){
        Stack<Integer> newStack = makeStack();
        addNodesSingle(newStack);
        int value = newStack.front.data;
        assertEquals("Should be 5", 5, value);
    }

    @Test
    public void addToStackMany(){
        Stack<Integer> newStack = makeStack();
        addNodesMultiple(newStack);
        int value = newStack.front.data;
        int nextValue = newStack.front.next.data;
        assertEquals("The top should be 30", 30, value);
        assertEquals("The top next should be 25", 25, nextValue);
    }

    @Test
    public void removeFromStackPopulated(){
        Stack<Integer> newStack = makeStack();
        addNodesMultiple(newStack);
        newStack.pop();
        int value = newStack.front.data;
        assertEquals("The new top should be 25", 25, value);
    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackOfOne(){
        Stack<Integer> newStack = makeStack();
        addNodesTwo(newStack);
        newStack.pop();
        int value = newStack.front.data;
        assertEquals("The new top should be 5", 5, value);
        newStack.pop();
        value = newStack.front.data;
        assertNull("The new top should be Null", value);
    }

    @Test(expected=NullPointerException.class)
    public void removeFromStackEmpty(){
        Stack<Integer> newStack = makeStack();
        newStack.pop();
        assertNull("The new top should be Null", newStack.front.data);
    }

    @Test
    public void peekStackPass(){
        Stack<Integer> newStack = makeStack();
        addNodesMultiple(newStack);
        int value = newStack.peek();
        assertEquals("Peek should return 30", 30, value);
    }

    @Test
    public void peekStackFail(){
        Stack<Integer> newStack = makeStack();
        addNodesMultiple(newStack);
        int value = newStack.peek();
        assertNotEquals("Peek should return 10", 10, value);
    }

    @Test
    public void testIsStackNotEmpty(){
        Stack<Integer> newStack = makeStack();
        addNodesMultiple(newStack);
        boolean empty = newStack.isEmpty();
        assertFalse("The Stack is not empty", empty);
    }

    @Test
    public void testIsStackEmpty(){
        Stack<Integer> newStack = makeStack();
        boolean empty = newStack.isEmpty();
        assertTrue("The Stack is not empty", empty);
    }
}
