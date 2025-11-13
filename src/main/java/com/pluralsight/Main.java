package com.pluralsight;

import com.pluralsight.UserInterface.UserInterface;
import com.pluralsight.data.ReceiptWriter;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.homeScreen();
    }
}