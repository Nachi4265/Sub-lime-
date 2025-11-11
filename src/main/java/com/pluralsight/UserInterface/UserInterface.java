package com.pluralsight.UserInterface;

import com.pluralsight.data.ProductLists;
import com.pluralsight.data.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Topping;

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
    private void toastSandwich(Sandwich sandwich) {
        System.out.println("TOASTED BREAD?");
        String answer = InputCollector.promptForString("Would you like your sandwich toasted?(Y/N)");
        if (answer.equalsIgnoreCase("y")){
            sandwich.setToasted(true);
        }
    }

    private void addSauce(Sandwich sandwich) {
        System.out.println("SAUCE OPTIONS");
        System.out.println(Arrays.toString(ProductLists.sauces));
        int choice = InputCollector.promptForInt("Which sauce would you like? ");

        String sauceName = "";

        switch (choice){

            case 1:
                sauceName = "mayo";
                System.out.println(" mayo selected! ");
                break;
            case 2:
                sauceName = "mustard";
                System.out.println(" mustard selected! ");
                break;
            case 3:
                sauceName = "ketchup";
                System.out.println(" ketchup selected! ");
                break;
            case 4:
                sauceName = "ranch";
                System.out.println(" ranch selected! ");
                break;
            case 5:
                sauceName = "thousand islands";
                System.out.println(" thousand islands selected! ");
                break;
            case 6:
                sauceName = "vinaigrette";
                System.out.println(" vinaigrette selected! ");
                break;
            case 7:
                sauceName = "au jus";
                System.out.println(" au jus selected! ");
                break;
            default:
                System.out.println("invalid choice");
                return;
        }

        //Make a new topping (sauces are free)
        Topping topping = new Topping(sauceName, "sauce", false);

        //Topping is added to our sandwich
        sandwich.addTopping(topping);
    }

    private void addTopping(Sandwich sandwich) {
        System.out.println("REGULAR TOPPING OPTIONS");
        System.out.println(Arrays.toString(ProductLists.regularToppings));
        int choice = InputCollector.promptForInt("Which topping would you like? ");

        String toppingName = "";

        switch (choice){

            case 1:
                toppingName = "lettuce";
                System.out.println(" lettuce selected! ");
                break;
            case 2:
                toppingName = "peppers";
                System.out.println(" peppers selected! ");
                break;
            case 3:
                toppingName = "onions";
                System.out.println(" onions selected! ");
                break;
            case 4:
                toppingName = "tomatoes";
                System.out.println(" tomatoes selected! ");
                break;
            case 5:
                toppingName = "jalapeños";
                System.out.println(" jalapeños selected! ");
                break;
            case 6:
                toppingName = "cucumbers";
                System.out.println(" cucumbers selected! ");
                break;
            case 7:
                toppingName = "pickles";
                System.out.println(" pickles selected! ");
                break;
            case 8:
                toppingName = "guacamole";
                System.out.println(" guacamole selected! ");
                break;
            case 9:
                toppingName = "mushrooms";
                System.out.println(" mushrooms selected! ");
                break;
            default:
                System.out.println("invalid choice");
                return;
        }

        //Make a new topping to add based on what they chose (regular toppings are free)
        Topping topping = new Topping(toppingName, "regular", false);

        //Topping is added to our sandwich
        sandwich.addTopping(topping);
    }

    private void addCheese(Sandwich sandwich) {

        System.out.println("CHEESE OPTIONS");
        System.out.println(Arrays.toString(ProductLists.cheese));
        int choice = InputCollector.promptForInt("Which meat topping would you like? ");

        String sandwichCheeseTopping = "";

        switch (choice){


            case 1:
                sandwichCheeseTopping = "American";
                System.out.println(" American selected! ");
                break;
            case 2:
                sandwichCheeseTopping = "Provolone";
                System.out.println(" Provolone selected! ");
                break;
            case 3:
                sandwichCheeseTopping = "Cheddar";
                System.out.println(" Cheddar selected! ");
                break;
            case 4:
                sandwichCheeseTopping = "Swiss";
                System.out.println(" Swiss selected! ");
                break;
            default:
                System.out.println("invalid choice");
        }


        Topping topping = new Topping(sandwichCheeseTopping,"cheese",false);

        String wantExtra = InputCollector.promptForString("Want extra cheese? (Y/N)");
        if(wantExtra.equalsIgnoreCase("Y")){
            topping.setExtra(true);
        }

        sandwich.addTopping(topping);

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

        //Make a new topping to add based on what they chose (String for the name)
        Topping topping = new Topping(sandwichMeatTopping,"meat",false);

        //Ask if they want extra
        String wantExtra = InputCollector.promptForString("Want Extra meat? (Y/N)");
        if(wantExtra.equalsIgnoreCase("Y")){
            topping.setExtra(true);
        }

        //Topping is added to out sandwich
        sandwich.addTopping(topping);
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
