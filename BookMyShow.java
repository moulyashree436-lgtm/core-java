class BookMyShow {
    String movieName;
    int ticketId;
    boolean isBooked;
    int seats;
    public BookMyShow() {
        this("KGF", 1101, true);
        System.out.println("Details 1st");
    }
    public BookMyShow(String movieName) {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Details 2nd");
    }
    public BookMyShow(String movieName, int ticketId) {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Details 3rd");
    }
    public BookMyShow(String movieName, int ticketId, boolean isBooked) {
        this(movieName); // constructor chaining
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Booked: " + isBooked);
        System.out.println("Details 4th");
    }
    public BookMyShow(String movieName, int ticketId, boolean isBooked, int seats) {
        this(movieName, ticketId); // constructor chaining
        System.out.println("Booked: " + isBooked);
        System.out.println("Seats: " + seats);
        System.out.println("Details 5th");
    }
}