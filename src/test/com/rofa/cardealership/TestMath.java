package com.rofa.cardealership;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMath {

    @Test
    public void testSum(){
        assertEquals(3,Math.sum(1,2));
        assertEquals(-52,Math.sum(-192,140));
        assertEquals(1333,Math.sum(-8354,9687));
    }

    @Test
    public void testIsNumber(){
        assertTrue(Math.isNumber("06305478563"));
        assertFalse(Math.isNumber("O6301253647")); //There is a big o instead of 0
    }

}
