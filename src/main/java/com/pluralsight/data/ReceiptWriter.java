package com.pluralsight.data;

import com.pluralsight.model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static final String receiptFolder = "receipts";

    public ReceiptWriter(){

        //make a folder
        File folder = new File(receiptFolder);


        if(!folder.exists()){
            boolean createFolder = folder.mkdir();

            if(!createFolder){
                System.out.println("Error finding receipts!!");
            }
        }
    }

    public void saveReceipts(Order order){

        String receiptTimeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));

    }



    /* Receipt System
    Goal: Save receipts to files

    //Flow
    When user confirms Order -> call ReceiptWriter -> Save the receipt -> Return to home screen*/


    //Method to generate filename from date/time
    //What does this method need : Date and Time
    // (yyyyMMdd-hhmmss.txt - i.e. 20230329-121523.txt)



    public void createReceipt(Receipt receipt){

    }

    public void filenameGenerator(){



    }

    //Method to create receipts folder
    public void receiptFolderCreation(){}

    //Connect Receipt to Checkout
    public void orderFileWriter(){
//        FileWriter fileWriter = new FileWriter("Receipt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    }


}
