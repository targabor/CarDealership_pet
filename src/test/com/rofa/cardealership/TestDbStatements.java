package com.rofa.cardealership;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDbStatements {

    @Test
    public void testIsTheUserExists(){
        assertTrue(DbStatements.isSellerExists("tar.gabor14@gmail.com","Bimbike"));
    }

}
