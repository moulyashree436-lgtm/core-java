class LibraryService {
static void libraryWelcome(){
System.out.println("Welcome to Library");
}
static void bookIssue(String studentName, String bookName){
System.out.println(studentName + " borrowed " + bookName);
}
static int bookNumber(){
int bookNo = 45;
return bookNo;
}
static int calculateFine(int lateDays, int finePerDay){
int totalFine = lateDays * finePerDay;
return totalFine;
}
}