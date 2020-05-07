package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyLeftOneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightOneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("I Love you.[]"));
    }
    @Test
    public void stringBehindBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]I Love you."));
    }
    @Test
    public void stringMixBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("I Love you[Miley]."));
    }
    @Test
    public void stringMixTwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("I [Love] you[Miley]."));
    }



}
