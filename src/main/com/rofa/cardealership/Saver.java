package com.rofa.cardealership;

import java.io.File;
import java.io.IOException;

public class Saver {

    public static void saveNewDeal(Deal newDeal){
        File saverFile = new File("C:\\Tar Gábor\\Projects\\CarDealership\\src\\main\\resources\\savedDeals.txt");

        if(saverFile.exists() && !saverFile.isDirectory()){
            try {
                saverFile.createNewFile();
            }catch (IOException ioEx){

            }
        }else{

        }



    }

}
