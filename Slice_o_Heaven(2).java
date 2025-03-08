import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class Slice_o_Heaven {

    private String orderID;
    private double orderTotal;
    public String storeName;
    public String storeAdddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;


    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;

    
    public Slice_o_Heaven() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "";
        this.drinks = "";
    }

    
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }
    
    public String getOrderID() {
        return orderID;
    }

    
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    
    public double getOrderTotal() {
        return orderTotal;
    }

    
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    
    public void takeOrder() {
        Scanner sc = new Scanner(System.in);
        boolean validIngredientInput = false;
        while(!validIngredientInput){
        System.out.println("Please pick any three of the following ingredients:\n" +
                    "1. Mushroom\n" +
                    "2. Paprika\n" +
                    "3. Sun-dried tomatoes\n" +
                    "4. Chicken\n" +
                    "5. Pineapple\n" +
                    "Enter only three choices (1, 2, 3...) separated by spaces:");
        String input = sc.nextLine();
        String[] choices = input.split("");
        if (choices.length = 3){
            boolean allValid = true;
                for (String choice : choices) {
                    if (String choice : choices){
                        int numChoice = Integer.parseInt(choice);
                        if (numChoice < 1 || numChoice > 5) {
                            allValid = false;
                            break;
                        }
                    } else{
                        allValid = false;
                        break;
                    }
        }
    }
    if (allValid) {
        Int ingChoice1 = Integer.parseInt(choices[0]);
        Int ingChoice2 = Integer.parseInt(choices[1]);
        Int ingChoice3 = Integer.parseInt(choices[2]);
        
        switch (ingChoice1) {
            case 1:
                ingChoice1 = "Mushroom";
                break;
            case 2:
                ingChoice1= "Paprika";
                break;
            case 3:
                ingChoice1 = "Sun-dried tomatoes";
                break;
            case 4:
                ingChoice1 = "Chicken";
                break;
            case 5:
                ingChoice1 = "Pineapple";
                break;
        }
        switch (ingChoice2) {
            case 1:
                ingChoice2 = "Mushroom";
                break;
            case 2:
                ingChoice2 = "Paprika";
                break;
            case 3:
                ingChoice2 = "Sun-dried tomatoes";
                break;
            case 4:
                ingChoice2 = "Chicken";
                break;
            case 5:
                ingChoice2 = "Pineapple";
                break;
        }
        switch (ingChoice3) {
            case 1:
                ingChoice3 = "Mushroom";
                break;
            case 2:
                ingChoice3 = "Paprika";
                break;
            case 3:
                ingChoice3 = "Sun-dried tomatoes";
                break;
            case 4:
                ingChoice3 = "Chicken";
                break;
            case 5:
                ingChoice3 = "Pineapple";
                break;
        }
        validIngredientInput = true;
    } else {
        System.out.println("Invalid choice(s). Please pick only from the given list:");
    }
   } else {
    System.out.println("Invalid choice(s). Please pick only three choices from the given list:");
   }
}


boolean validSizeInput = false;
        while (!validSizeInput) {
            System.out.println("What size should your pizza be?\n" +
                    "1. Large\n" +
                    "2. Medium\n" +
                    "3. Small\n" +
                    "Enter only one choice (1, 2, or 3):");
            String sizeInput = sc.nextLine();
            if (isValidNumber(sizeInput)){
                int sizeChoice = Integer.parseInt(sizeInput);
                if (sizeChoice >= 1 && sizeChoice <= 3) {  
                    switch (sizeChoice) {
                        case 1:
                            pizzaSize = "Large";
                            break;
                        case 2:
                            pizzaSize = "Medium";
                            break;
                        case 3:
                            pizzaSize = "Small";
                            break;
                    }
                    validSizeInput = true;
                } else {
                    System.out.println("Invalid choice. Please pick only from the given list:");
                }
            } else{
                System.out.println("Invalid input. Please enter a valid number from the list:");
            }
        }

        System.out.println("Do you want extra cheese (Y/N):");
        String extraCheese = sc.nextLine();
        
    }
    boolean validDrinkInput = false;
    while (!validDrinkInput) {
        System.out.println();
        String drinkInput = sc.nextLine("Choose from one of the drinks below. We recommend Coca Cola:\n" +
                    "1. Coca Cola\n" +
                    "2. Cold coffee\n" +
                    "3. Cocoa Drink\n" +
                    "4. No drinks for me\n" +
                    "Enter your choice:");
        String drinkInput = sc.nextLine();
            int drinkChoice = Integer.parseInt(drinkInput);
            if (drinkChoice >= 1 && drinkChoice <= 4) {
                switch (drinkChoice){
                    case 1:
                        drinks = "Coca Cola";
                        break;
                    case 2:
                        drinks = "Cold coffee";
                        break;
                    case 3:
                        drinks = "Cocoa Drink";
                        break;
                    case 4:
                        drinks = "No drinks for me";
                        break;
                }
                   validDrinkInput = true;
            } else {
                System.out.println("Invalid choice. Please pick only from the given list:");
            }
       } else{
        System.out.println("Invalid input. Please enter a valid number from the list:");
    } 
 }
    System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
    String wantDiscount = sc.nextLine();

        if(wantDiscount.equalsIgnoreCase("Y")){
            isItYourBirthday();
        }else{
            makeCardPayment();
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");
        printReceipt();
    

    
    @Override
    public String toString() {
        return "--- Receipt ---\nOrder ID: " + orderID + "\nPizza Ingredients: " + pizzaIngredients + "\nOrder Total: " + orderTotal;

    
    public void processCardPayment(long cardNumber, String expiryDate, int cvv) {
        String cardLength = Long.toString(cardNumber);
        if (cardLength.length() == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        long firstCardDigit = Long.parseLong(cardNumber.substring(0, 1));

        long blacklistedNumber = 12345678901234L;
        if (cardNumber == blacklistedNumber){
            System.out.println("Card is blacklisted. Please use another card");
        }

        long lastFourDigits = Long.parseLong(cardNumber.substring(cardNumber.length() - 4));

        String cardNumberToDisplay = cardNumber.charAt(0) + cardNumber.substring(1, cardNumber.length() - 4).replaceAll(".", "*") + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Display Card Number: " + cardNumberToDisplay);
    }
    public int calculateAge(Date birthdate) {
        Date now = new Date();
        long diff = now.getTime() - birthdate.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24 * 365.242199));
    }

    public void isItYourBirthday() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your birthday(yyyy-MM-dd):");
            String birthdaydate = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date birthdate = sdf.parse(birthdaydate);
                long fiveYearsAgo = System.currentTimeMillis() - 5 * 365 * 24 * 60 * 60 * 1000;
                long oneTwentyYearsAgo = System.currentTimeMillis() - 120 * 365 * 24 * 60 * 60 * 1000;
                if (birthdate.getTime() < fiveYearsAgo || birthdate.getTime() > oneTwentyYearsAgo) {
                    System.out.println("Invalid date. You are either too young or too dead to order. Please enter a valid date:");
                } else {
                    int age = calculateAge(birthdate);
                    if (age < 18 && sdf.format(new Date()).equals(sdf.format(birthdate))) {
                        System.out.println("Congratulations! You pay only half the price for your order");
                        orderTotal /= 2;
                    } else {
                        System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter a valid date(yyyy-MM-dd):");
            }
        }
    }

       public void makeCardPayment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your card number:");
        long cardNumber = sc.nextLong();

        while (true) {
            System.out.println("Please enter the card's expiry date (format: yyyy-MM):");
            String expiryDate = sc.next();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            try {
                Date date = sdf.parse(expiryDate);
                if (date.before(new Date())) {
                    System.out.println("Invalid date. The expiry date must be in the future. Please enter the correct date:");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter a valid date (format: yyyy-MM):");
            }
        }

        System.out.println("Please enter the card's cvv number:");
        int cvv = sc.nextInt();

        processCardPayment(cardNumber, expiryDate, cvv);
    }


    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        String info = "Today's Special - Pizza: " + pizzaOfTheDay + ", Side: " + sideOfTheDay + ", Price: " + specialPrice;
        System.out.println(info);
    }
}