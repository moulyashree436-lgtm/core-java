class MovieTicket {
    public static void main(String[] args) {
        
        char seatType;
        int ticketId;
        String viewerName;
        double ticketPrice;
        boolean isBooked;

        seatType = 'G';
        ticketId = 1101;
        viewerName = "Akash";
        ticketPrice = 250.75;
        isBooked = true;

        System.out.println("Seat Type: " + seatType);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Viewer Name: " + viewerName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Booked: " + isBooked);

        seatType = 'S';
        ticketId = 1102;
        viewerName = "Pallavi";
        ticketPrice = 300.50;
        isBooked = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Seat Type: " + seatType);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Viewer Name: " + viewerName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Booked: " + isBooked);
    }
}