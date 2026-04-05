class AmazonOrder {
    String productName;
    int orderId;
    boolean isShipped;
    int quantity;
    public AmazonOrder() {
        this("Laptop", 501, true);
        System.out.println("Details 1st");
    }
    public AmazonOrder(String productName) {
        System.out.println("Product Name: " + productName);
        System.out.println("Details 2nd");
    }
    public AmazonOrder(String productName, int orderId) {
        System.out.println("Product Name: " + productName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Details 3rd");
    }
    public AmazonOrder(String productName, int orderId, boolean isShipped) {
        this(productName); 
        System.out.println("Order ID: " + orderId);
        System.out.println("Shipped: " + isShipped);
        System.out.println("Details 4th");
    }
    public AmazonOrder(String productName, int orderId, boolean isShipped, int quantity) {
        this(productName, orderId);  
        System.out.println("Shipped: " + isShipped);
        System.out.println("Quantity: " + quantity);
        System.out.println("Details 5th");
    }
}