class Swiggy {
    String foodItem;
    int orderId;
    boolean isPaid;
    int quantity;
    public Swiggy() {
        this("Burger", 201, true);
        System.out.println("Details 1st");
    }
    public Swiggy(String foodItem) {
        System.out.println("Food Item: " + foodItem);
        System.out.println("Details 2nd");
    }
    public Swiggy(String foodItem, int orderId) {
        System.out.println("Food Item: " + foodItem);
        System.out.println("Order ID: " + orderId);
        System.out.println("Details 3rd");
    }
    public Swiggy(String foodItem, int orderId, boolean isPaid) {
        this(foodItem);  
        System.out.println("Order ID: " + orderId);
        System.out.println("Payment Done: " + isPaid);
        System.out.println("Details 4th");
    }
    public Swiggy(String foodItem, int orderId, boolean isPaid, int quantity) {
        this(foodItem, orderId);  
        System.out.println("Payment Done: " + isPaid);
        System.out.println("Quantity: " + quantity);
        System.out.println("Details 5th");
    }
}