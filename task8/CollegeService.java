class CollegeService {
static void collegeWelcome(){
System.out.println("Welcome to College");
}
static void studentAdmission(String studentName, String courseName){
System.out.println(studentName + " joined " + courseName);
}
static int classroomAllocation(){
int room = 101;
return room;
}
static int calculateCollegeFee(int tuitionFee, int libraryFee){
int totalFee = tuitionFee + libraryFee;
return totalFee;
}
}