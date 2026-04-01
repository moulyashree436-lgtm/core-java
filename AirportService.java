class AirportService {
static void airportWelcome(){
System.out.println("Welcome to Airport");
}
static void passengerCheckIn(String passengerName, String flightName){
System.out.println(passengerName + " checked in for " + flightName);
}
static int gateAllocation(){
int gate = 5;
return gate;
}
static int calculateTicketPrice(int ticketCost, int tax){
int totalPrice = ticketCost + tax;
return totalPrice;
}
}