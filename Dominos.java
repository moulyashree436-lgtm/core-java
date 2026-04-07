class Dominos {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Margherita" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 199;
            return price;

        } else if ("Farmhouse" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 299;
            return price;

        } else if ("Peppy Paneer" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 279;
            return price;

        } else if ("Veg Extravaganza" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 349;
            return price;

        } else if ("Chicken Dominator" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 399;
            return price;

        } else if ("Chicken Sausage" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 249;
            return price;

        } else if ("Paneer Makhani" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 269;
            return price;

        } else if ("Deluxe Veggie" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 259;
            return price;

        } else if ("Cheese Burst" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 320;
            return price;

        } else if ("Garlic Bread" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 120;
            return price;

        } else if ("Stuffed Garlic Bread" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 180;
            return price;

        } else if ("Choco Lava Cake" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 110;
            return price;

        } else if ("Pepsi" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 60;
            return price;

        } else if ("Coke" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 60;
            return price;

        } else if ("Sprite" == foodItem) {
            System.out.println("food Item is:" + foodItem);
            price = 60;
            return price;

        } else {
            System.out.println("No item founds");
            return 0;
        }
    }

    static int checkItem(String foodItem, int price, int noItems) {

        int totalPrice = 0;

        if ("Margherita" == foodItem) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("Farmhouse" == foodItem) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("Peppy Paneer" == foodItem) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("Veg Extravaganza" == foodItem) {
            totalPrice = price * noItems;
            return totalPrice;

        } else {
            return 0;
        }
    }
}