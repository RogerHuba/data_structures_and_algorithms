package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatWordTest {


    @Test
    public void testDuplicateValueSmallPass(){
        String string = "Once upon a time, there was a brave princess who...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertEquals("Duplicate value should be 'a", "a", duplicateValue);
    }

    @Test
    public void testDuplicateValueLargePass(){
        String string = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age " +
                "of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, " +
                "it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had " +
                "everything before us, we had nothing before us, we were all going direct to Heaven, we were all " +
                "going direct the other way – in short, the period was so far like the present period, that some of " +
                "its noisiest authorities insisted on its being received, for good or for evil, in the superlative " +
                "degree of comparison only...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertEquals("Duplicate value should be 'it", "it", duplicateValue);
    }

    @Test
    public void testDuplicateValueFail(){
        String string = "Once upon a time, there was a brave princess who...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertNotEquals("Duplicate value should be 'a", "Once", duplicateValue);
    }

    @Test
    public void testDuplicateValueLargeFail(){
        String string = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age " +
                "of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, " +
                "it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had " +
                "everything before us, we had nothing before us, we were all going direct to Heaven, we were all " +
                "going direct the other way – in short, the period was so far like the present period, that some of " +
                "its noisiest authorities insisted on its being received, for good or for evil, in the superlative " +
                "degree of comparison only...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertNotEquals("Duplicate value should be 'it", "was", duplicateValue);
    }

    @Test
    public void testDuplicateValueSmallReturnNull(){
        String string = "Once upon a time, there was NOTHING!";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertNull("Duplicate value should be null", duplicateValue);
    }

    @Test
    public void testDuplicateValueSmallWithCommaPass(){
        String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t " +
                "know what I was doing in New York...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertEquals("Duplicate value should be 'summer", "summer", duplicateValue);
    }

    @Test
    public void testDuplicateValueSmallWithCommaFail(){
        String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t " +
                "know what I was doing in New York...";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertNotEquals("Duplicate value should be 'summer", "summer,", duplicateValue);
    }

    @Test
    public void testDuplicateValueEmptyString(){
        String string = "";
        String[] stringArray = RepeatWord.splitTheWords(string);
        String duplicateValue = RepeatWord.addWordsToHash(stringArray);
        assertNull("Duplicate value should be 'null", duplicateValue);
    }


}