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
        ll.insertValue(10);
        assertEquals("Head should return 10", 10, ll.head.data);
    }

    @Test
    public void testInsertValueHeadMultiple(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(10);
        assertEquals("Head should return 1", 1, ll.head.data);
    }

    @Test
    public void testInsertValueHeadEmpty(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        assertNull("Head.next should return Null", ll.head.next);
    }

    @Test
    public void testInsertValueHeadMultipleCheckNext(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        assertEquals("Head should return 1", 1, ll.head.data);
    }

    @Test
    public void testInsertValueNextEmptyTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        assertTrue("Head.next should equal 5 and resolve true", ll.head.next.data == 5);
    }

    @Test
    public void testIncludesTestTrueFirst(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertTrue("Should return true on returning 5", ll.includesValue(1));
    }

    @Test
    public void testIncludesTestTrueMiddle(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertTrue("Should return true on returning 5", ll.includesValue(5));
    }

    @Test
    public void testIncludesTestTrueEnd(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertTrue("Should return true on returning 5", ll.includesValue(8));
    }

    @Test
    public void testIncludesTestFalse(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertFalse("Should return true on returning 5", ll.includesValue(10));
    }

    @Test
    public void testSizeOfListEqualsIsTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertTrue("Should return True as the size is 3", ll.sizeOfLinkedList() == 3);
    }

    @Test
    public void testSizeOfListEqualsIsFalse(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(5);
        ll.insertValue(8);
        assertFalse("Should return False as the true size is 3 not 4", ll.sizeOfLinkedList() == 4);
    }

    @Test
    public void testPrintValueTrue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(1);
        ll.insertValue(3);
        ll.insertValue(5);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        assertEquals("Will return a Visual Representation of List", ll.printLinkedList(),
                "LinkedList: 1->3->5->12->18->25");
    }

    @Test
    public void testAppendValueEquals(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.append(1);
        assertEquals("Append of 1 should make new head", 1, ll.head.data);
    }

    @Test
    public void testAppendValueNotEqual(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.append(1);
        assertNotEquals("Append of 1 should make new head, not 3.", 3, ll.head.data);
    }

    @Test
    public void testInsertBeforeFirstValue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertBefore(1,3);
        assertEquals("Insert Before value 3, 1 should make new head", 1, ll.head.data);
    }

    @Test
    public void testInsertBeforeMiddleValue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertBefore(10,12);
        assertTrue("Insert Before value 12, 10 should be in list.", ll.includesValue(10));
    }

    @Test
    public void testInsertBeforeLastValue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertBefore(20,25);
        assertTrue("Insert Before value 25, 20 should be in list.", ll.includesValue(20));
    }

    @Test(expected = IllegalStateException.class)
    public void testInsertBeforeNotInListValue(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertBefore(20,21);

    }

    @Test
    public void testInsertAfterFirstHead(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertAfter(4,3);
        assertTrue("Insert after value 3, 4 should be in list.", ll.includesValue(4));
    }

    @Test
    public void testInsertAfterInMiddle(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertAfter(15,12);
        assertTrue("Insert after value 12, 15 should be in list.", ll.includesValue(15));
    }

    @Test
    public void testInsertAfterAtEnd(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertAfter(26,25);
        assertTrue("Insert after value 12, 10 should be in list.", ll.includesValue(26));
    }

    @Test(expected = IllegalStateException.class)
    public void testInsertAfterPivotNotInList(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.insertAfter(11,10);
    }

    @Test
    public void testKthFromEndLastInList(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        assertEquals("Last Item in List is 0", ll.kthFromEnd(0), 25);
    }

    @Test
    public void testKthFromEndSameNumber(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(2);
        ll.insertValue(18);
        ll.insertValue(25);
        assertEquals("Last Item in List is 0", ll.kthFromEnd(2), 2);
    }

    @Test
    public void testKthFromEndListSizeOne(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        assertEquals("Last Item in List is 0", ll.kthFromEnd(0), 3);
    }

    @Test
    public void testKthFromEndFirstInList(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        assertEquals("Last Item in List is 0", ll.kthFromEnd(5), 3);
    }

    @Test(expected = IllegalStateException.class)
    public void testKthFromEndNotInList(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.kthFromEnd(6);
    }

    @Test(expected = IllegalStateException.class)
    public void testKthFromEndNotInListNegative(){
        LinkedList ll = new LinkedList();
        ll.insertValue(3);
        ll.insertValue(7);
        ll.insertValue(9);
        ll.insertValue(12);
        ll.insertValue(18);
        ll.insertValue(25);
        ll.kthFromEnd(-5);
    }
}