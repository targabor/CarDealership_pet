package com.rofa.cardealership;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGetDataBaseData {

    DataBase db = new DataBase();
    @BeforeEach
    public void init(){
        db.openDBConnection();
    }

    @Test
    public void testGetTableLength(){
        assertEquals(1,GetDataBaseData.getTableLength(db.getConnection(),"cars"));
    }
}
