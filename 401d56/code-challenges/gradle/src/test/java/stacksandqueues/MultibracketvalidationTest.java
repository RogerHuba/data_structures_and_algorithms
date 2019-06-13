package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultibracketvalidationTest {

    @Test
    public void multiBracketCurlyValidationPass(){
        assertTrue("{} should return true", Multibracketvalidation.multibracketvalidation("{}"));
    }

    @Test
    public void multiBracketCurlyValidationFail(){
        assertFalse("{{ should return false", Multibracketvalidation.multibracketvalidation("{{"));
    }

    @Test
    public void multiBracketSquareValidationPass(){
        assertTrue("[] should return true", Multibracketvalidation.multibracketvalidation("[]"));
    }

    @Test
    public void multiBracketSquareValidationFail(){
        assertFalse("[[ should return false", Multibracketvalidation.multibracketvalidation("[["));
    }

    @Test
    public void multiBracketParenValidationPass(){
        assertTrue("() should return true", Multibracketvalidation.multibracketvalidation("()"));
    }

    @Test
    public void multiBracketParenValidationFail(){
        assertFalse("(( should return false", Multibracketvalidation.multibracketvalidation("(("));
    }

    @Test
    public void multiBracketCurlyBracketParenValidationPass(){
        assertTrue("(( should return false", Multibracketvalidation.multibracketvalidation("{[()]}"));
    }

    @Test
    public void multiBracketCurlyBracketParenValidationFail(){
        assertFalse("(( should return false", Multibracketvalidation.multibracketvalidation("{[(([{"));
    }

    @Test
    public void multiBracketCurlyBracketParenValidationFailOutOfOrder(){
        assertFalse("(( should return false", Multibracketvalidation.multibracketvalidation("{[(])]"));
    }

    @Test
    public void multiBracketCurlyBracketParenValidationPassDoubleBracket(){
        assertTrue("(( should return false", Multibracketvalidation.multibracketvalidation("{{[[][]]}}"));
    }
}