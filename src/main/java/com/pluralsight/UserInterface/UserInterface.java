package com.pluralsight.UserInterface;

import com.pluralsight.data.ProductLists;
import com.pluralsight.model.Sandwich;

import java.util.Arrays;

public class UserInterface {

    ProductLists productLists;


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
    private void addSandwichScreen() {
        while (true) {
            String sandwichSelectionScreen = """
                    ===================| Sandwich Screen |======================
                    1 - Select bread\n
                    2 - Select size\n
                    3 - Add meats \n
                    4 - Add cheese\n
                    5 - Add regular Topping\n
                    6 - Add sauce \n
                    7 - Toast Sandwich? \n
                    8 - return \n
                    """;

            System.out.println(sandwichSelectionScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    selectSize();
                    break;
                case 2:
                    selectBread();
                    break;
                case 3:
                    addMeat();
                    break;
                case 4:
                    addCheese();
                    break;
                case 5:
                    addTopping();
                    break;
                case 6:
                    addSauce();
                    break;
                case 7:
                    toastSandwich();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }


    //SANDWICH SCREEN MENU OPTIONS
    private void toastSandwich() {
    }

    private void addSauce() {
    }

    private void addTopping() {
    }

    private void addCheese() {
    }

    private void addMeat() {
    }

    private void selectSize() {

        System.out.println("BREAD SIZE");
        System.out.println(Arrays.toString(ProductLists.sizes));
        int sizeChoice = InputCollector.promptForInt("Which bread type would you like? ");

        int sandwichLength = 0;

        switch (sizeChoice){

            case 1:
                sandwichLength = 4;
                break;
            case 2:
                sandwichLength = 8;
                break;
            case 3:
                sandwichLength = 12;
                break;
            default:
                System.out.println("invalid choice");
        }



        Sandwich sandwich = new Sandwich(sandwichLength,"");
    }

    private void selectBread() {
        System.out.println("BREAD OPTIONS");
        System.out.println(Arrays.toString(ProductLists.bread));
        int sizeChoice = InputCollector.promptForInt("Which bread type would you like? ");

        String breadChoice;

        switch (sizeChoice){

            case 1:
                breadChoice = "white";
                break;
            case 2:
                breadChoice = "wheat";
                break;
            case 3:
                breadChoice = "rye";
                break;
            case 4:
                breadChoice = "wrap";
            default:
                System.out.println("invalid choice");

                
        }


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
