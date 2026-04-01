class MobileStoreProfile {
    public static void main(String[] args) {
        
        char brandCode;
        int mobileId;
        String mobileName;
        double price;
        boolean isInStock;

        brandCode = 'S';
        mobileId = 1001;
        mobileName = "Samsung Galaxy";
        price = 25000.75;
        isInStock = true;

        System.out.println("Brand Code: " + brandCode);
        System.out.println("Mobile ID: " + mobileId);
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + isInStock);

        brandCode = 'A';
        mobileId = 1002;
        mobileName = "Apple iPhone";
        price = 75000.50;
        isInStock = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Brand Code: " + brandCode);
        System.out.println("Mobile ID: " + mobileId);
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + isInStock);
    }
}