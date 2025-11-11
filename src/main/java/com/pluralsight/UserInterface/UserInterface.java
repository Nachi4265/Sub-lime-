package com.pluralsight.UserInterface;

import com.pluralsight.data.ProductLists;
import com.pluralsight.data.Order;
import com.pluralsight.model.Sandwich;

import java.util.Arrays;

public class UserInterface {




    //HOME SCREEN
    public void homeScreen() {

        while (true) {
            String homeScreen = """
                    ===================| MENU |======================
                    1 - Start New Order\n
                    2 - Exit the Application\n
                    """;

            System.out.println(homeScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    startNewOrderScreen();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }


    //NEW ORDER SCREEN
    private void startNewOrderScreen() {

        //When the start Order screen runs a new order is created.
        Order currentOrder = new Order();

        while (true) {
            String orderScreen = """
                    ===================| Order Screen |======================
                    1 - Add Sandwich\n
                    2 - Add Drink\n
                    3 - Add Chips \n
                    4 - Checkout\n
                    5 - Cancel Order\n
                    """;

            System.out.println(orderScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    addSandwichScreen();
                    break;
                case 2:
                    addDrinkScreen();
                    break;
                case 3:
                    addChipsScreen();
                    break;
                case 4:
                    checkoutScreen();
                    break;
                case 5:
//                    cancelOrder();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }


    // SANDWICH PRODUCT MENU
    private void addSandwichScreen(){

        //Create a new Sandwich when selected.
        Sandwich sandwich = new Sandwich();

        while (true){
            String sandwichSelectionScreen = """
                    ===================| Sandwich Screen |======================
                    1 - Select size\n
                    2 - Select bread\n
                    3 - Add meats \n
                    4 - Add cheese\n
                    5 - Add regular Topping\n
                    6 - Add sauce \n
                    7 - Toast Sandwich? \n
                    8 - return \n
                    """;

            System.out.println(sandwichSelectionScreen);

            int command = InputCollector.promptForInt("Enter a number command");

//            switch (command) {
//                case 1:
//                    selectSize();
//                    break;
//                case 2:
//                    selectBread();
//                    break;
//                case 3:
//                    addMeat();
//                    break;
//                case 4:
//                    addCheese();
//                    break;
//                case 5:
//                    addTopping();
//                    break;
//                case 6:
//                    addSauce();
//                    break;
//                case 7:
//                    toastSandwich();
//                    break;
//                case 8:
//                    return;
//                default:
//                    System.out.println("Invalid Input");
//                    break;
//            }
        }
    }


    //SANDWICH SCREEN MENU OPTIONS
    private void toastSandwich(Sandwich sandwich) {
    }

    private void addSauce(Sandwich sandwich) {
    }

    private void addTopping(Sandwich sandwich) {
    }

    private void addCheese(Sandwich sandwich) {
    }

    private void addMeat(Sandwich sandwich) {
        System.out.println("MEAT OPTIONS");
        System.out.println(Arrays.toString(ProductLists.meats));
        int choice = InputCollector.promptForInt("Which meat topping would you like? ");

        String sandwichMeatTopping = "";

        switch (choice){

            case 1:
                sandwichMeatTopping = "steak";
                System.out.println(" steak selected! ");
                break;
            case 2:
                sandwichMeatTopping = "ham";
                System.out.println(" ham selected! ");
                break;
            case 3:
                sandwichMeatTopping = "salami";
                System.out.println(" salami selected! ");
                break;
            case 4:
                sandwichMeatTopping = "roast beef";
                System.out.println(" roast beef selected! ");
                break;
            case 5:
                sandwichMeatTopping = "chicken";
                System.out.println(" chicken selected! ");
                break;
            case 6:
                sandwichMeatTopping = "bacon";
                System.out.println(" bacon selected! ");
                break;
            default:
                System.out.println("invalid choice");
        }
        //sandwich.addTopping();
    }

    private void selectSize(Sandwich sandwich) {

        System.out.println("BREAD SIZE");
        System.out.println(Arrays.toString(ProductLists.sizes));
        int sizeChoice = InputCollector.promptForInt("Which bread size would you like? ");

        int sandwichLength = 0;

        switch (sizeChoice){

            case 4:
                sandwichLength = 4;
                System.out.println(" 4 inch bread selected! ");
                break;
            case 8:
                sandwichLength = 8;
                System.out.println(" 8 inch bread selected! ");
                break;
            case 12:
                sandwichLength = 12;
                System.out.println(" 12 inch bread selected! ");
                break;
            default:
                System.out.println("invalid choice");
        }

        //set the length of our sandwich
        sandwich.setSize(sandwichLength);
    }

    private void selectBread(Sandwich sandwich) {
        System.out.println("BREAD OPTIONS");
        System.out.println(Arrays.toString(ProductLists.bread));
        int sizeChoice = InputCollector.promptForInt("Which bread type would you like? ");

        String breadType = "";

        switch (sizeChoice){

            case 1:
                breadType = "white";
                break;
            case 2:
                breadType = "wheat";
                break;
            case 3:
                breadType = "rye";
                break;
            case 4:
                breadType = "wrap";
            default:
                System.out.println("invalid choice");

        }

        sandwich.setBreadType(breadType);
    }





    // DRINK PRODUCT MENU
    private void addDrinkScreen() {
        while (true) {
            String drinkScreen = """
                    ===================| Order Screen |======================
                    1 - select Size \n
                    2 - Select Flavor \n
                    3 -return \n
                    """;

            System.out.println(drinkScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    selectDrinkSize();
                    break;
                case 2:
                    selectDrinkFlavor();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    private void selectDrinkFlavor() {
    }

    private void selectDrinkSize(){}




    // CHIPS PRODUCT MENU
    private void addChipsScreen() {
        while (true) {
            String chipsScreen = """
                    ===================| Order Screen |======================
                    1 - select \n
                    2 - Select Flavor \n
                    3 - return \n
                    """;

            System.out.println(chipsScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    selectDrinkSize();
                    break;
                case 2:
                    selectDrinkFlavor();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }







    //CHECKOUT SCREEN
    private void checkoutScreen() {
    }




}
