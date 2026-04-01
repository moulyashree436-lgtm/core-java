class HotelService {
static void hotelWelcome(){
System.out.println("Welcome to Hotel");
}
static void guestBooking(String guestName, String roomType){
System.out.println(guestName + " booked " + roomType + " room");
}
static int roomNumber(){
int room = 205;
return room;
}
static int calculateBill(int foodCost, int roomCost){
int totalBill = foodCost + roomCost;
return totalBill;
}
}