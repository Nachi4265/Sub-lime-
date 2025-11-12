package com.pluralsight.UserInterface;

import com.pluralsight.data.OrderManager;
import com.pluralsight.data.ProductLists;
import com.pluralsight.model.Order;
import com.pluralsight.model.Chip;
import com.pluralsight.model.Drink;
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

        //Create an instance of orderManager
        OrderManager orderManager = new OrderManager();

        //use its start new order method
        orderManager.startNewOrder();

        //set an Order named current order to the get current order method.
        Order currentOrder = orderManager.getCurrentOrder();

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
                    sandwichAndScreen(currentOrder);
                    break;
                case 2:
                    drinkAddScreen(currentOrder);
                    break;
                case 3:
                    chipsAddScreen(currentOrder);
                    break;
                case 4:
                    //todo fix error
                    checkoutScreen(currentOrder);
                    return;
                case 5:
                    orderManager.cancelOrder();
                    System.out.println("ORDER CANCELLED!!");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }



    //SANDWICH SCREEN MENU/OPTIONS
    private void sandwichAndScreen(Order currentOrder){

        //Create a new Sandwich when selected.
        Sandwich sandwich = new Sandwich();

        while (true){
            String sandwichSelectionScreen = """
                    ===================| Sandwich Screen |======================
                    1 - Select size \n
                    2 - Select bread \n
                    3 - Add meats \n
                    4 - Add cheese\n
                    5 - Add regular Topping\n
                    6 - Add sauce \n
                    7 - Toast Sandwich? \n
                    8 - Done \n
                    """;

            System.out.println(sandwichSelectionScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    sandwichSelectSize(sandwich);
                    break;
                case 2:
                    sandwichSelectBread(sandwich);
                    break;
                case 3:
                    sandwichAddMeat(sandwich);
                    break;
                case 4:
                    sandwichAddCheese(sandwich);
                    break;
                case 5:
                    sandwichAddTopping(sandwich);
                    break;
                case 6:
                    sandwichAddSauce(sandwich);
                    break;
                case 7:
                    sandwichAskIsToasted(sandwich);
                    break;
                case 8:
                    //Add the completed sandwich to
                    //check is Sandwich is valid
                    //todo come back to fix
                   if(sandwich.sandwichIsValid()){
                       currentOrder.addProduct(sandwich);
                       System.out.println("SANDWICH ADDED TO ORDER!");
                       return;
                   }else {
                       System.out.println("sandwich is incomplete!");
                   }

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    private void sandwichAskIsToasted(Sandwich sandwich) {
        System.out.println("TOASTED BREAD?");
        String answer = InputCollector.promptForString("Would you like your sandwich toasted?(Y/N)");
        if (answer.equalsIgnoreCase("y")){
            System.out.println("SANDWICH TOASTED!");
            sandwich.setToasted(true);
        }
    }

    private void sandwichAddSauce(Sandwich sandwich) {
        System.out.println("SAUCE OPTIONS");
        System.out.println(Arrays.toString(ProductLists.sauces));
        int choice = InputCollector.promptForInt("Which sauce would you like? ");

        String sauceName ;

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

    private void sandwichAddTopping(Sandwich sandwich) {
        System.out.println("REGULAR TOPPING OPTIONS");
        System.out.println(Arrays.toString(ProductLists.regularToppings));
        int choice = InputCollector.promptForInt("Which topping would you like? ");

        String toppingName ;

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

    private void sandwichAddCheese(Sandwich sandwich) {

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
            System.out.println("Extra " + sandwichCheeseTopping + " selected! ");
        }else {
            System.out.println("NO extra "+ sandwichCheeseTopping +" added!");
        }


        sandwich.addTopping(topping);

    }

    private void sandwichAddMeat(Sandwich sandwich) {
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
            System.out.println("Extra " + sandwichMeatTopping + " selected");
        }else {
            System.out.println("NO extra "+ sandwichMeatTopping+" added!");
        }

        //Topping is added to out sandwich
        sandwich.addTopping(topping);
    }

    private void sandwichSelectSize(Sandwich sandwich) {

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

    private void sandwichSelectBread(Sandwich sandwich) {
        System.out.println("BREAD OPTIONS");
        System.out.println(Arrays.toString(ProductLists.bread));
        int sizeChoice = InputCollector.promptForInt("Which bread type would you like? ");

        String breadType = "";

        switch (sizeChoice){

            case 1:
                breadType = "white";
                System.out.println("White bread selected!");
                break;
            case 2:
                breadType = "wheat";
                System.out.println("Wheat bread selected!");
                break;
            case 3:
                breadType = "rye";
                System.out.println("Rye bread selected!");
                break;
            case 4:
                breadType = "wrap";
                System.out.println("Wrap bread selected!");
                break;
            default:
                System.out.println("invalid choice");

        }

        sandwich.setBreadType(breadType);
    }



    // DRINK PRODUCT MENU/OPTIONS
    private void drinkAddScreen(Order currentOrder) {

        Drink drink = new Drink("","");

        while (true) {
            String drinkScreen = """
                    ===================| Order Screen |======================
                    1 - select Size \n
                    2 - Select Flavor \n
                    3 - Done \n
                    """;

            System.out.println(drinkScreen);

            int command = InputCollector.promptForInt("Enter a number command");

            switch (command) {
                case 1:
                    drinkSelectSize(drink);
                    break;
                case 2:
                    drinkSelectFlavor(drink);
                    break;
                case 3:
                    currentOrder.addProduct(drink);
                    System.out.println("DRINK ADDED TO ORDER!");
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    private void drinkSelectFlavor(Drink drink) {
        System.out.println("DRINK FLAVOR OPTIONS");
        System.out.println(Arrays.toString(ProductLists.drinkFlavors));
        int choice = InputCollector.promptForInt("Which drink flavor would you like? ");

        String drinkFlavor;

        switch (choice){


            case 1:
                drinkFlavor = "Coke";
                System.out.println(" Coke selected! ");
                break;
            case 2:
                drinkFlavor = "Pepsi";
                System.out.println(" Pepsi selected! ");
                break;
            case 3:
                drinkFlavor = "Sprite";
                System.out.println(" Sprite selected! ");
                break;
            case 4:
                drinkFlavor = "Fanta";
                System.out.println(" Fanta selected! ");
                break;
            case 5:
                drinkFlavor = "Dr Pepper";
                System.out.println(" Dr Pepper selected! ");
                break;
            case 6:
                drinkFlavor = "Lemonade";
                System.out.println(" Lemonade selected! ");
                break;
            case 7:
                drinkFlavor = "Iced Tea";
                System.out.println(" Iced Tea selected! ");
                break;
            case 8:
                drinkFlavor = "Water";
                System.out.println(" Water selected! ");
                break;
            default:
                System.out.println("invalid choice");
                return;
        }

        //Set the flavor on the drink
        drink.setFlavor(drinkFlavor);

    }

    private void drinkSelectSize(Drink drink){

        System.out.println("DRINK SIZE OPTIONS");
        System.out.println("1) Small - $2.00");
        System.out.println("2) Medium - $2.50");
        System.out.println("3) Large - $3.00");

        int choice = InputCollector.promptForInt("Which size would you like? ");

        String drinkSize ;

        switch (choice){

            case 1:
                drinkSize = "small";
                System.out.println(" Small selected! ");
                break;
            case 2:
                drinkSize = "medium";
                System.out.println(" Medium selected! ");
                break;
            case 3:
                drinkSize = "large";
                System.out.println(" Large selected! ");
                break;
            default:
                System.out.println("invalid choice");
                return;
        }

        //Set the size on the drink
        drink.setSize(drinkSize);

    }



    // CHIPS PRODUCT MENU/OPTIONS
    private void chipsAddScreen(Order currentOrder) {

        Chip chips = new Chip("","");

        System.out.println("CHIPS FLAVOR OPTIONS");
        System.out.println(Arrays.toString(ProductLists.chipTypes));
        int choice = InputCollector.promptForInt("Which type of chips would you like? ");

        String chipType ;

        switch (choice){

            case 1:
                chipType = "BBQ";
                System.out.println(" BBQ Chips selected! ");
                break;
            case 2:
                chipType = "Sour Cream & Onion";
                System.out.println(" Sour Cream & Onion Chips selected! ");
                break;
            case 3:
                chipType = "Salt & Vinegar";
                System.out.println(" Salt & Vinegar Chips selected! ");
                break;
            case 4:
                chipType = "Classic";
                System.out.println(" Classic Chips selected! ");
                break;
            case 5:
                chipType = "Cheddar";
                System.out.println(" Cheddar Chips selected! ");
                break;
            case 6:
                chipType = "Jalapeño";
                System.out.println(" Jalapeño Chips selected! ");
                break;
            default:
                System.out.println("invalid Chips choice");
                return;
        }

        //Set the chip type
        chips.setChipName(chipType);

        currentOrder.addProduct(chips);

        System.out.println("CHIPS ADDED TO ORDER!");

        }




    //CHECKOUT SCREEN
    private void checkoutScreen(Order currentOrder) {

        // 1. Check if order is valid
        if(currentOrder.isValidOrder()) {

            // 2. Display order details
            System.out.println(currentOrder.getOrderDetails());

        }
            // 3. Ask to confirm or cancel
            String confirmOrCancel = InputCollector.promptForString("Is your order correct? (Y/N)");

            // 4. If confirm: save receipt and return to home
            // 5. If cancel: delete order and return to home

            if(confirmOrCancel.equalsIgnoreCase("Y")){
                System.out.println("Order confirmed!");
                System.out.println("Printing receipt...");
            }else if(confirmOrCancel.equalsIgnoreCase("N")){
                System.out.println("Order canceled!");
                System.out.println("Returning to home Menu!");
            }else{
                System.out.println("Invalid entry!");
            }

    }
