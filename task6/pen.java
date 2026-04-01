class Pen {
    public static void main(String[] args) {
        
        char colorCode;
        int penId;
        String brand;
        double price;
        boolean isAvailable;

        colorCode = 'B';
        penId = 11;
        brand = "Reynolds";
        price = 20.50;
        isAvailable = true;

        System.out.println("Color Code: " + colorCode);
        System.out.println("Pen ID: " + penId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);

        colorCode = 'R';
        penId = 12;
        brand = "Cello";
        price = 15.75;
        isAvailable = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Color Code: " + colorCode);
        System.out.println("Pen ID: " + penId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}