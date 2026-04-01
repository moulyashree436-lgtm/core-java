class TrainTicket {
    public static void main(String[] args) {
        
        char coachType;
        int ticketId;
        String passengerName;
        double fare;
        boolean isConfirmed;

        coachType = 'S';
        ticketId = 701;
        passengerName = "Anil";
        fare = 850.75;
        isConfirmed = true;

        System.out.println("Coach Type: " + coachType);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Fare: " + fare);
        System.out.println("Confirmed: " + isConfirmed);

        coachType = 'A';
        ticketId = 702;
        passengerName = "Priya";
        fare = 1250.50;
        isConfirmed = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Coach Type: " + coachType);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Fare: " + fare);
        System.out.println("Confirmed: " + isConfirmed);
    }
}