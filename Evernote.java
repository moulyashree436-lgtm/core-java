class Evernote {
static void openApp() {
System.out.println("Open Evernote App");
login("Rohit");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int notes = viewNotes();
System.out.println("Total Notes: " + notes);
}
static int viewNotes() {
System.out.println("Viewing Notes");
return 42;
}
}