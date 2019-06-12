package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testQueue(){
        AnimalShelter newAnimalShelter = new AnimalShelter();
        assertNotNull("The new stack should not be null",newAnimalShelter);
    }

}