class GitDirect {

    static int checkItem(String itemName) {

        int price = 0;

        if ("Laptop" == itemName) {
            System.out.println("Item : " + itemName);
            price = 55000;
            return price;
        }

        else if ("Mobile" == itemName) {
            System.out.println("Item : " + itemName);
            price = 20000;
            return price;
        }

        else if ("Headphones" == itemName) {
            System.out.println("Item : " + itemName);
            price = 1500;
            return price;
        }

        else if ("Keyboard" == itemName) {
            System.out.println("Item : " + itemName);
            price = 800;
            return price;
        }

        else if ("Mouse" == itemName) {
            System.out.println("Item : " + itemName);
            price = 500;
            return price;
        }

        else if ("Monitor" == itemName) {
            System.out.println("Item : " + itemName);
            price = 12000;
            return price;
        }

        else if ("Printer" == itemName) {
            System.out.println("Item : " + itemName);
            price = 7000;
            return price;
        }

        else if ("Tablet" == itemName) {
            System.out.println("Item : " + itemName);
            price = 15000;
            return price;
        }

        else if ("Camera" == itemName) {
            System.out.println("Item : " + itemName);
            price = 30000;
            return price;
        }

        else if ("Speaker" == itemName) {
            System.out.println("Item : " + itemName);
            price = 2500;
            return price;
        }

        else if ("SmartWatch" == itemName) {
            System.out.println("Item : " + itemName);
            price = 5000;
            return price;
        }

        else if ("PowerBank" == itemName) {
            System.out.println("Item : " + itemName);
            price = 1200;
            return price;
        }

        else {
            return price;
        }
    }


    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("Laptop" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Mobile" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Headphones" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Keyboard" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Mouse" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Monitor" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Printer" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Tablet" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Camera" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Speaker" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SmartWatch" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PowerBank" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}