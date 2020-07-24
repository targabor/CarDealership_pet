package com.rofa.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSeller {


        Seller testSeller;

        @BeforeEach
        public void init(){
            testSeller = new Seller();
        }
        @Test
        public void testSetSellerPhoneNumber(){
            assertTrue(testSeller.setSellerPhoneNumber("00630541264"));
            assertFalse(testSeller.setSellerPhoneNumber("alma"));
        }
}
