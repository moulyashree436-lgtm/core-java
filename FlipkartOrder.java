class FlipkartOrder {
    String itemName;
    int orderId;
    boolean isDelivered;
    int quantity;
    public FlipkartOrder() {
        this("Shoes", 901, false);
        System.out.println("Details 1st");
    }
    public FlipkartOrder(String itemName) {
        System.out.println("Item Name: " + itemName);
        System.out.println("Details 2nd");
    }
    public FlipkartOrder(String itemName, int orderId) {
        System.out.println("Item Name: " + itemName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Details 3rd");
    }
    public FlipkartOrder(String itemName, int orderId, boolean isDelivered) {
        this(itemName);  
        System.out.println("Order ID: " + orderId);
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Details 4th");
    }
    public FlipkartOrder(String itemName, int orderId, boolean isDelivered, int quantity) {
        this(itemName, orderId); 
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Quantity: " + quantity);
        System.out.println("Details 5th");
    }
}