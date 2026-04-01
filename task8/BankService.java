class BankService {
static void bankWelcome(){
System.out.println("Welcome to Bank");
}
static void accountOpening(String customerName, String accountType){
System.out.println(customerName + " opened " + accountType + " account");
}
static int generateAccountNumber(){
int accountNumber = 12345;
return accountNumber;
}
static int calculateBalance(int deposit, int withdraw){
int balance = deposit - withdraw;
return balance;
}
}
