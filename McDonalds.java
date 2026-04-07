class McDonalds {

    static int checkItem(String itemName) {

        int price = 0;

        if ("Burger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else if ("FrenchFries" == itemName) {
            System.out.println("Item : " + itemName);
            price = 90;
            return price;
        }

        else if ("Coke" == itemName) {
            System.out.println("Item : " + itemName);
            price = 60;
            return price;
        }

        else if ("ChickenBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 150;
            return price;
        }

        else if ("VegBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }

        else if ("McNuggets" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("McFlurry" == itemName) {
            System.out.println("Item : " + itemName);
            price = 130;
            return price;
        }

        else if ("IceCream" == itemName) {
            System.out.println("Item : " + itemName);
            price = 50;
            return price;
        }

        else if ("Wrap" == itemName) {
            System.out.println("Item : " + itemName);
            price = 140;
            return price;
        }

        else if ("ChickenWrap" == itemName) {
            System.out.println("Item : " + itemName);
            price = 170;
            return price;
        }

        else if ("Coffee" == itemName) {
            System.out.println("Item : " + itemName);
            price = 80;
            return price;
        }

        else if ("HotChocolate" == itemName) {
            System.out.println("Item : " + itemName);
            price = 100;
            return price;
        }

        else {
            return price;
        }
    }


    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("Burger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("FrenchFries" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Coke" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("McNuggets" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("McFlurry" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("IceCream" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Wrap" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenWrap" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Coffee" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("HotChocolate" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}