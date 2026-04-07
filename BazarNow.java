class BazaarNow {

    static int checkItem(String itemName) {

        int price = 0;

        if ("RiceBag" == itemName) {
            System.out.println("Item : " + itemName);
            price = 1200;
            return price;
        }

        else if ("WheatFlour" == itemName) {
            System.out.println("Item : " + itemName);
            price = 600;
            return price;
        }

        else if ("CookingOil" == itemName) {
            System.out.println("Item : " + itemName);
            price = 250;
            return price;
        }

        else if ("SugarPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 80;
            return price;
        }

        else if ("SaltPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 25;
            return price;
        }

        else if ("MilkPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 50;
            return price;
        }

        else if ("EggTray" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("BreadLoaf" == itemName) {
            System.out.println("Item : " + itemName);
            price = 40;
            return price;
        }

        else if ("BiscuitsPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 30;
            return price;
        }

        else if ("TeaPowder" == itemName) {
            System.out.println("Item : " + itemName);
            price = 220;
            return price;
        }

        else if ("CoffeeJar" == itemName) {
            System.out.println("Item : " + itemName);
            price = 350;
            return price;
        }

        else if ("Detergent" == itemName) {
            System.out.println("Item : " + itemName);
            price = 150;
            return price;
        }

        else {
            return price;
        }
    }


    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("RiceBag" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("WheatFlour" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CookingOil" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SugarPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SaltPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("MilkPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("EggTray" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("BreadLoaf" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("BiscuitsPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("TeaPowder" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CoffeeJar" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Detergent" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}