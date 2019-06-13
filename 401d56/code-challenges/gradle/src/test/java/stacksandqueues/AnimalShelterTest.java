package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    private AnimalShelter<String> makeShelter(){
        AnimalShelter newDog = new AnimalShelter<>();
        return newDog;
    }

    private AnimalShelter<String> addSingleDog(AnimalShelter newDog){
        newDog.enQueue("FuzzyDog");
        return newDog;
    }

    private AnimalShelter<String> addSingleCat(AnimalShelter newCat){
        newCat.enQueue("FuzzyCat");
        return newCat;
    }

    private AnimalShelter<String> addTwoDog(AnimalShelter newDog){
        newDog.enQueue("FuzzyDog");
        newDog.enQueue("FatDog");
        return newDog;
    }

    private AnimalShelter<String> addTwoCat(AnimalShelter newCat){
        newCat.enQueue("FuzzyCat");
        newCat.enQueue("FatCat");
        return newCat;
    }

    private AnimalShelter<String> addMultipleDog(AnimalShelter newDog){
        newDog.enQueue("FuzzyDog");
        newDog.enQueue("FatDog");
        newDog.enQueue("SillyDog");
        newDog.enQueue("GrumpyDog");
        return newDog;
    }

    private AnimalShelter<String> addMultipleCat(AnimalShelter newCat){
        newCat.enQueue("FuzzyCat");
        newCat.enQueue("FatDog");
        newCat.enQueue("SillyCat");
        newCat.enQueue("GrumpyCat");
        return newCat;
    }


    @Test
    public void testDogQueue(){
        AnimalShelter newDog = makeShelter();
        assertNotNull("The new stack should not be null",newDog);
    }

    @Test
    public void testCatQueue(){
        AnimalShelter newCat = makeShelter();
        assertNotNull("The new stack should not be null",newCat);
    }

    @Test
    public void testDequeueSingleEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addSingleDog(newDog);
        newDog.deQueue();
        Object valueDog = newDog.head;
        assertNull("Top Dog should be Null", valueDog);
    }

    @Test
    public void testDequeueSingleEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addSingleCat(newCat);
        newCat.deQueue();
        Object valueCat = newCat.head;
        assertNull("Top Cat should be Null", valueCat);
    }

    @Test
    public void testDequeueTwoEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addTwoDog(newDog);
        newDog.deQueue();
        Object valueDog = newDog.head.data;
        assertEquals("Top Dog should be FatDog","FatDog",  valueDog);
    }

    @Test
    public void testDequeueTwoEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addTwoCat(newCat);
        newCat.deQueue();
        Object valueCat = newCat.head.data;
        assertEquals("Top Cat should be FatCat", "FatCat", valueCat);
    }

    @Test
    public void testDequeueMultipleEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addMultipleDog(newDog);
        newDog.deQueue();
        newDog.deQueue();
        Object valueDog = newDog.head.data;
        assertEquals("Top Dog should be SillyDog","SillyDog",  valueDog);
    }

    @Test
    public void testDequeueMultipleEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addMultipleCat(newCat);
        newCat.deQueue();
        newCat.deQueue();
        Object valueCat = newCat.head.data;
        assertEquals("Top Cat should be SillyCat", "SillyCat", valueCat);
    }

    @Test(expected=IllegalStateException.class)
    public void testPeekDogQueueEmpty(){
        AnimalShelter newDog = makeShelter();
        newDog.peek();
    }

    @Test(expected=IllegalStateException.class)
    public void testPeekCatQueueEmpty(){
        AnimalShelter newCat = makeShelter();
        newCat.peek();
    }

    @Test
    public void testPeekSingleEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addSingleDog(newDog);
        newDog.peek();
        Object valueDog = newDog.head.data;
        assertEquals("Top Dog should be FuzzyDog", "FuzzyDog", valueDog);
    }

    @Test
    public void testPeekSingleEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addSingleCat(newCat);
        newCat.peek();
        Object valueCat = newCat.head.data;
        assertEquals("Top Cat should be FuzzyDog", "FuzzyCat", valueCat);
    }

    @Test
    public void testPeekTwoEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addTwoDog(newDog);
        newDog.peek();
        Object valueDog = newDog.head.data;
        assertEquals("Top Dog should be FuzzyDog", "FuzzyDog", valueDog);
    }

    @Test
    public void testPeekTwoEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addTwoCat(newCat);
        newCat.peek();
        Object valueCat = newCat.head.data;
        assertEquals("Top Cat should be FuzzyCat", "FuzzyCat", valueCat);
    }

    @Test
    public void testPeekMultipleEntryDogShelter(){
        AnimalShelter newDog = makeShelter();
        addMultipleDog(newDog);
        newDog.peek();
        Object valueDog = newDog.head.data;
        assertEquals("Top Dog should be FuzzyDog", "FuzzyDog", valueDog);
    }

    @Test
    public void testPeekMultipleEntryCatShelter(){
        AnimalShelter newCat = makeShelter();
        addMultipleCat(newCat);
        newCat.peek();
        Object valueCat = newCat.head.data;
        assertEquals("Top Cat should be FuzzyCat", "FuzzyCat", valueCat);
    }
}