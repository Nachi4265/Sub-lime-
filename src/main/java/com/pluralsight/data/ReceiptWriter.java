package com.pluralsight.data;

import com.pluralsight.model.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static final String receiptFolder = "receipts";


    public String generateFileName(LocalDateTime localDateTime){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        localDateTime.format(dateTimeFormatter);

        return localDateTime + ".txt";
    }

    public void ensureReceiptFolderExist(){
        File file = new File(receiptFolder);

        if(file.exists()){
            System.out.println("folder exist...writing file!");
        }else if (!file.exists()){
            file.mkdir();
        }
    }

    public void saveReceipt(Order order){
        ensureReceiptFolderExist();

       String filename = generateFileName(order.getDate());

       receiptFolder + "/" + filename;

       order.getOrderDetails();

       FileWriter fileWriter = new FileWriter();

       fileWriter.write(order.getOrderDetails());

    }

















//    public void saveReceipts(Order order){
//
//        String receiptTimeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
//
//        File fileToWrite = new File(receiptFolder,receiptTimeStamp + ".txt");
//
//        try( FileWriter fileWriter = new FileWriter(fileToWrite)){
//           fileWriter.write();//todo
//        }catch(){}
//
//    }
//
//    public ReceiptWriter(){
//
//        //make a folder
//        File folder = new File(receiptFolder);
//
//        //if no folder exist then make one!
//        if(!folder.exists()){
//            boolean createFolder = folder.mkdir();
//
//            //if we cant make then give us an error
//            if(!createFolder){
//                System.out.println("Error finding receipts!!");
//            }
//        }
//    }

    /* Receipt System
    Goal: Save receipts to files

    //Flow
    When user confirms Order -> call ReceiptWriter -> Save the receipt -> Return to home screen*/


    //Method to generate filename from date/time
    //What does this method need : Date and Time
    // (yyyyMMdd-hhmmss.txt - i.e. 20230329-121523.txt)



//    public void createReceipt(Receipt receipt){
//
//    }
//
//    public void filenameGenerator(){
//
//
//
//    }
//
//    //Method to create receipts folder
//    public void receiptFolderCreation(){}
//
//    //Connect Receipt to Checkout
//    public void orderFileWriter(){
////        FileWriter fileWriter = new FileWriter("Receipt");
////        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//    }


}
