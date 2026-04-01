class Bike {
    public static void main(String[] args) {
        
        char modelType;
        int bikeId;
        String brand;
        double price;
        boolean isAvailable;

        modelType = 'S';
        bikeId = 21;
        brand = "Honda";
        price = 85000.50;
        isAvailable = true;

        System.out.println("Model Type: " + modelType);
        System.out.println("Bike ID: " + bikeId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);

        modelType = 'R';
        bikeId = 22;
        brand = "Yamaha";
        price = 95000.75;
        isAvailable = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Model Type: " + modelType);
        System.out.println("Bike ID: " + bikeId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}