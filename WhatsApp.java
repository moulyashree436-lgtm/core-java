class WhatsApp {
static void openApp() {
System.out.println("Open WhatsApp App");
login("Srinivas");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int chats = viewChats();
System.out.println("Total Chats: " + chats);
}
static int viewChats() {
System.out.println("Viewing Chats");
return 45;
}
}