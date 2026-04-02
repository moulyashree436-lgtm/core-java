class Zomato {

    String foodName;
    String restaurantName;
    int price;

    public Zomato() {
    }

    public Zomato(String foodName, String restaurantName, int price) {
        this.foodName = foodName;
        this.restaurantName = restaurantName;
        this.price = price;
    }

    public void display() {
        System.out.println(foodName);
        System.out.println(restaurantName);
        System.out.println(price);
        System.out.println("-------------------");
    }
}

