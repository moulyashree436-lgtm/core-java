class MovieTheatreService {
static void theatreWelcome(){
System.out.println("Welcome to Movie Theatre");
}
static void ticketBooking(String customerName, String movieName){
System.out.println(customerName + " booked ticket for " + movieName);
}
static int seatAllocation(){
int seat = 25;
return seat;
}
static int calculateTicketBill(int ticketPrice, int snackPrice){
int totalBill = ticketPrice + snackPrice;
return totalBill;
}
}