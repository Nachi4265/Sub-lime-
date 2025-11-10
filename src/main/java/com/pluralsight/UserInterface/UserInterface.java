package com.pluralsight.UserInterface;

import com.pluralsight.data.ProductLists;

import java.util.Arrays;

public class UserInterface {

    ProductLists productLists;

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
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }


    }

    private void checkoutScreen() {
    }

    private void addChipsScreen() {
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
                    selectBread();
                    break;
                case 2:
                    selectSize();
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



    //SANDWICH MENU OPTIONS
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
    }

    private void selectBread() {
        System.out.println(Arrays.toString(ProductLists.bread));
    }
}
