class OnlineOrder {
    public static void main(String[] args) {
        
        char orderType;
        int orderId;
        String customerName;
        double totalAmount;
        boolean isDelivered;

        orderType = 'E';
        orderId = 1001;
        customerName = "Rohit";
        totalAmount = 1599.75;
        isDelivered = true;

        System.out.println("Order Type: " + orderType);
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivered: " + isDelivered);

        orderType = 'N';
        orderId = 1002;
        customerName = "Swathi";
        totalAmount = 2499.50;
        isDelivered = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Order Type: " + orderType);
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivered: " + isDelivered);
    }
}