package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;


public class NodeTest {

    @Test
    public void testNode(){
        Node newNode = new Node(1);
        assertNotNull("The new stack should not be null",newNode);
    }
}