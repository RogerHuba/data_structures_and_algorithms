package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testCreationOfNewLinkList(){
        LinkedList ll = new LinkedList();
        assertNotNull("Linked List should not be null", ll);
    }

    @Test
    public void testCreationOfNewLinkListButHeadNull(){
        LinkedList ll = new LinkedList();
        assertNull("Linked List should not be null", ll.head);
    }



    @Test
    public void testInsertValueHeadSingle(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 10);
        assertEquals("Head should return 10", 10, ll.head.data);
    }

    @Test
    public void testInsertValueHeadMultiple(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 10);
        assertEquals("Head should return 1", 1, ll.head.data);;
    }

    @Test
    public void testInsertValueHeadEmpty(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        assertNull("Head.next should return Null", ll.head.next);;
    }

    @Test
    public void testInsertValueHeadMultipleCheckNext(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 10);
        assertEquals("Head should return 1", 1, ll.head.data);;
    }

    @Test
    public void testInsertValueNextEmptyTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        assertTrue("Head.next should equal 5 and resolve true", ll.head.next.data == 5);;
    }

    @Test
    public void testIncludesTestTrueFirst(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertTrue("Should return true on returning 5", ll.includesValue(ll, 1));
    }

    @Test
    public void testIncludesTestTrueMiddle(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertTrue("Should return true on returning 5", ll.includesValue(ll, 5));
    }

    @Test
    public void testIncludesTestTrueEnd(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertTrue("Should return true on returning 5", ll.includesValue(ll, 8));
    }

    @Test
    public void testIncludesTestFalse(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertFalse("Should return true on returning 5", ll.includesValue(ll, 10));
    }

    @Test
    public void testSizeOfListEqualsIsTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertTrue("Should return True as the size is 3", ll.sizeOfLinkedList(ll) == 3);
    }

    @Test
    public void testSizeOfListEqualsIsFalse(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 8);
        assertFalse("Should return False as the true size is 3 not 4", ll.sizeOfLinkedList(ll) == 4);
    }

    @Test
    public void TestPrintValueTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(ll, 1);
        ll.insertValue(ll, 3);
        ll.insertValue(ll, 5);
        ll.insertValue(ll, 12);
        ll.insertValue(ll, 18);
        ll.insertValue(ll, 25);
        assertEquals("Will return a Visual Representation of List", ll.printLinkedList(ll),
                "LinkedList: 1->3->5->12->18->25");
    }
}