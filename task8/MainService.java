class MainService {

public static void main(String[] args){

// GymService
GymService.gymWelcome();
GymService.memberRegistration("Arjun","Ramesh");
int locker = GymService.lockerAllocation();
System.out.println(locker);
int gymFee = GymService.calculateGymFee(2000,1000);
System.out.println(gymFee);


// HotelService
HotelService.hotelWelcome();
HotelService.guestBooking("Ravi","Deluxe");
int room = HotelService.roomNumber();
System.out.println(room);
int hotelBill = HotelService.calculateBill(500,1500);
System.out.println(hotelBill);


// LibraryService
LibraryService.libraryWelcome();
LibraryService.bookIssue("Anu","Java Book");
int bookNo = LibraryService.bookNumber();
System.out.println(bookNo);
int fine = LibraryService.calculateFine(3,10);
System.out.println(fine);


// BankService
BankService.bankWelcome();
BankService.accountOpening("Kiran","Savings");
int accNo = BankService.generateAccountNumber();
System.out.println(accNo);
int balance = BankService.calculateBalance(10000,3000);
System.out.println(balance);


// SchoolService
SchoolService.schoolWelcome();
SchoolService.studentAdmission("Megha","10th");
int classRoom = SchoolService.classroomAllocation();
System.out.println(classRoom);
int schoolFee = SchoolService.calculateSchoolFee(5000,1000);
System.out.println(schoolFee);


// RestaurantService
RestaurantService.restaurantWelcome();
RestaurantService.orderFood("Rahul","Biryani");
int table = RestaurantService.tableAllocation();
System.out.println(table);
int foodBill = RestaurantService.calculateFoodBill(250,50);
System.out.println(foodBill);


// CollegeService
CollegeService.collegeWelcome();
CollegeService.studentAdmission("Deepu","BCA");
int collegeRoom = CollegeService.classroomAllocation();
System.out.println(collegeRoom);
int collegeFee = CollegeService.calculateCollegeFee(20000,2000);
System.out.println(collegeFee);


// AirportService
AirportService.airportWelcome();
AirportService.passengerCheckIn("Suresh","AI203");
int gate = AirportService.gateAllocation();
System.out.println(gate);
int ticketPrice = AirportService.calculateTicketPrice(5000,500);
System.out.println(ticketPrice);


// MovieTheatreService
MovieTheatreService.theatreWelcome();
MovieTheatreService.ticketBooking("Ramesh","KGF");
int seat = MovieTheatreService.seatAllocation();
System.out.println(seat);
int ticketBill = MovieTheatreService.calculateTicketBill(200,150);
System.out.println(ticketBill);


// HospitalService
HospitalService.hospitalWelcome();
HospitalService.patientRegistration("Sita","Dr.Raj");
int hospitalRoom = HospitalService.roomAllocation();
System.out.println(hospitalRoom);
int medicalBill = HospitalService.calculateMedicalBill(500,700);
System.out.println(medicalBill);

}
}