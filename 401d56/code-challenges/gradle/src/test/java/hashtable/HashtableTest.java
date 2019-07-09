package hashtable;

import org.junit.Test;


import static org.junit.Assert.*;

public class HashtableTest {

    public Hashtable addToHashtableSmall() {
        Hashtable ht = new Hashtable(1024);
        ht.set("Roger", "Man");
        ht.set("Michelle", "Woman");
        ht.set("Chloe", "girl");
        ht.set("Jameson", "boy");
        return ht;
    }

    @Test
    public void testGetLengthOfHashtable(){
        Hashtable ht = addToHashtableSmall();
        assertEquals("The value should be 'TestValue'.", 1024, ht.getLength());
    }

    @Test
    public void testAddingValueToHashtable(){
        Hashtable ht = addToHashtableSmall();
        String testValue = ht.get("Roger");
        assertEquals("The value should be 'Man'.", "Man", testValue);
    }

    @Test
    public void testHashtableContains(){
        Hashtable ht = addToHashtableSmall();
        boolean testValue = ht.contains("Roger");
        assertTrue(testValue);
    }

    @Test
    public void testAddValueToHashtable(){
        Hashtable ht = new Hashtable(1);
        ht.set("Test", "50");
        String testValue = ht.get("Test");
        assertEquals("The value should be '50'.", "50", testValue);
    }

    @Test
    public void testHashMethodInRange(){
        Hashtable ht = new Hashtable(50);
        int htLength = ht.getLength();
        int testHash = ht.hash("BigNameVariable");
        assertTrue(testHash <= htLength);
    }

    @Test
    public void testHandleCollision(){
        Hashtable ht = new Hashtable(1);
        ht.set("test", "1");
        String testValue = ht.get("test");
        assertEquals("The value should be '1'.", "1", testValue);

        ht.set("test", "2");
        String testValue2 = ht.get("test");
        assertEquals("The value should be '2'.", "2", testValue2);
    }

    @Test
    public void testReturnNullNotThere(){
        Hashtable ht = addToHashtableSmall();
        Boolean testValue = ht.contains("Rogerr");
        assertEquals("The value should be 'null'.", null, testValue);
    }

}