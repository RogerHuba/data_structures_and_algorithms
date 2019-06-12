package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {

    private Stack<Integer> makeStack(){
        Stack<Integer> newStack = new Stack<>();
        return newStack;
    }

    private Stack<Integer> addNodesSingle(Stack newStack){
        newStack.add(5);
        return newStack;
    }

    private Stack<Integer> addNodesTwo(Stack newStack){
        newStack.add(5);
        newStack.add(10);
        return newStack;
    }

    private Stack<Integer> addNodesMultiple(Stack newStack){
        newStack.add(10);
        newStack.add(15);
        newStack.add(20);
        newStack.add(25);
        newStack.add(30);
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
        assertEquals("Should be 5", 5, newStack.front);
    }
//
//    @Test
//    public void addToStackMany(){
//        makeNode();
//        addNodesMultiiple();
//        assertEquals("The top should be 10", 1, newStack.front.data);
//        assertEquals("The top next should be 3988", 3988, newStack.front.next.data);
//    }
//
//    @Test
//    public void removeFromStackPopulated(){
//        makeNode();
//        addNodesMultiiple();
//        newStack.remove();
//        assertEquals("The new top should be 3988", 3988, newStack.front.data);
//    }
//
//    @Test(expected=NullPointerException.class)
//    public void removeFromStackOfOne(){
//        makeNode();
//        addNodesTwo();
//        newStack.remove();
//        assertEquals("The new top should be 10", 10, newStack.front.data);
//        newStack.remove();
//        assertEquals("The new top should be Null", null, newStack.front.data);
//    }
//
//    @Test(expected=NullPointerException.class)
//    public void removeFromStackEmpty(){
//        makeNode();
//        newStack.remove();
//        assertEquals("The new top should be 10", null, newStack.front.data);
//    }
//
//    @Test
//    public void peekStackPass(){
//        makeNode();
//        addNodesMultiple();
//        int value = newStack.peekTopOfStack();
//        assertEquals("Peek should return 1", 1, value);
//    }
//
//    @Test
//    public void peekStackFail(){
//        makeNode();
//        addNodesMultiple();
//        int value = newStack.peekTopOfStack();
//        assertNotEquals("Peek should return 1", 10, value);
//    }
//
//    @Test
//    public void testIsStackNotEmpty(){
//        makeNode();
//        addNodesMultiple();
//        boolean empty = newStack.isEmpty();
//        assertFalse("The Stack is not empty", empty);
//    }
//
//    @Test
//    public void testIsStackEmpty(){
//        makeNode();
//        boolean empty = newStack.isEmpty();
//        assertTrue("The Stack is not empty", empty);
//    }
}
