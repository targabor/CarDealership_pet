package com.rofa.cardealership;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestDataBase {


    DataBase db = new DataBase();
    @BeforeEach
    public void init()
    {

        db.openDBConnection();
    }

    @Test
    public void testOpenDBConnection(){
        assertTrue(db.openDBConnection());
    }

    @Test
    public void testCloseDBConnection() { assertTrue(db.closeDBConnection());}
}
