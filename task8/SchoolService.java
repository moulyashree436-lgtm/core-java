class SchoolService {
static void schoolWelcome(){
System.out.println("Welcome to School");
}
static void studentAdmission(String studentName, String className){
System.out.println(studentName + " admitted to " + className);
}
static int classroomAllocation(){
int room = 20;
return room;
}
static int calculateSchoolFee(int tuitionFee, int examFee){
int totalFee = tuitionFee + examFee;
return totalFee;
}
}