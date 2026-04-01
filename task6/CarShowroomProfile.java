class CarShowroomProfile {
    public static void main(String[] args) {
	
        char modelType;
        int carId;
        String carName;
        double price;
        boolean isAvailable;

        modelType = 'S';
        carId = 901;
        carName = "Hyundai i20";
        price = 850000.75;
        isAvailable = true;

        System.out.println("Model Type: " + modelType);
        System.out.println("Car ID: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);

        modelType = 'X';
        carId = 902;
        carName = "Honda City";
        price = 1200000.50;
        isAvailable = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Model Type: " + modelType);
        System.out.println("Car ID: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}