class GymService {
static void gymWelcome(){
System.out.println("Welcome to Gym");
}
static void memberRegistration(String memberName, String trainerName){
System.out.println(memberName + " training under " registered for Gym");
}
static int lockerAllocation(){
int locker = 15;
return locker;
}
static int calculateGymFee(int monthlyFee, int trainerFee){
int totalFee = monthlyFee + trainerFee;
return totalFee;
}
}