class ProductDetails {
    public static void main(String[] args) {
	
        char category;
        int productId;
        String productName;
        double price;
        boolean isAvailable;

        category = 'E';
        productId = 501;
        productName = "Laptop";
        price = 55000.99;
        isAvailable = true;

        System.out.println("Category: " + category);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);

        category = 'F';
        productId = 502;
        productName = "Mobile";
        price = 25000.75;
        isAvailable = false;
		
        System.out.println("---- After Changing Values ----");

        System.out.println("Category: " + category);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}