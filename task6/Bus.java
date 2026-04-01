class Bus {
    public static void main(String[] args) {
        
        char routeCode;
        int busNumber;
        String driverName;
        double ticketPrice;
        boolean isRunning;

        routeCode = 'A';
        busNumber = 101;
        driverName = "Ramesh";
        ticketPrice = 25.50;
        isRunning = true;

        System.out.println("Route Code: " + routeCode);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Running: " + isRunning);

        routeCode = 'B';
        busNumber = 102;
        driverName = "Suresh";
        ticketPrice = 30.75;
        isRunning = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Route Code: " + routeCode);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Running: " + isRunning);
    }
}