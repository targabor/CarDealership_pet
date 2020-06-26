package com.rofa.cardealership;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestDataBase {


    DataBase carDB = null;

    @BeforeEach
    public void init()
    {
        carDB = new DataBase();
        carDB.openDBConnection();
    }

    @Test
    public void testOpenDBConnection(){
        assertTrue(carDB.openDBConnection());
    }

    @Test
    public void testCloseDBConnection() { assertTrue(carDB.closeDBConnection());}
}
