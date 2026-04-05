class UberRide {
    String driverName;
    int rideId;
    boolean isCompleted;
    double fare;
    public UberRide() {
        this("Ravi", 2001, true);
        System.out.println("Details 1st");
    }
    public UberRide(String driverName) {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Details 2nd");
    }
    public UberRide(String driverName, int rideId) {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Ride ID: " + rideId);
        System.out.println("Details 3rd");
    }
    public UberRide(String driverName, int rideId, boolean isCompleted) {
        this(driverName);
        System.out.println("Ride ID: " + rideId);
        System.out.println("Completed: " + isCompleted);
        System.out.println("Details 4th");
    }
    public UberRide(String driverName, int rideId, boolean isCompleted, double fare) {
        this(driverName, rideId);
        System.out.println("Completed: " + isCompleted);
        System.out.println("Fare: " + fare);
        System.out.println("Details 5th");
    }
}