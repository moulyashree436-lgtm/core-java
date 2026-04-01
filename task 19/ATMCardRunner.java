class ATMCardRunner {

    public static void main(String[] args) {

        ATMCard a1 = new ATMCard();
        a1.cardHolderName = "Rahul Sharma";
        a1.bankName = "SBI";
        a1.cardNumber = "1234 5678 9012 3456";
        a1.expiryDate = "12/28";
        a1.cardType = "Debit";
        a1.branch = "BTM Layout";
        a1.phoneNumber = "9876543210";

        System.out.println("---- ATM CARD 1 ----");
        System.out.println("Card Holder Name: " + a1.cardHolderName);
        System.out.println("Bank Name: " + a1.bankName);
        System.out.println("Card Number: " + a1.cardNumber);
        System.out.println("Expiry Date: " + a1.expiryDate);
        System.out.println("Card Type: " + a1.cardType);
        System.out.println("Branch: " + a1.branch);
        System.out.println("Phone: " + a1.phoneNumber);


        ATMCard a2 = new ATMCard();
        a2.cardHolderName = "Priya Reddy";
        a2.bankName = "HDFC";
        a2.cardNumber = "9876 5432 1098 7654";
        a2.expiryDate = "11/27";
        a2.cardType = "Credit";
        a2.branch = "Whitefield";
        a2.phoneNumber = "9123456780";

        System.out.println("---- ATM CARD 2 ----");
        System.out.println("Card Holder Name: " + a2.cardHolderName);
        System.out.println("Bank Name: " + a2.bankName);
        System.out.println("Card Number: " + a2.cardNumber);
        System.out.println("Expiry Date: " + a2.expiryDate);
        System.out.println("Card Type: " + a2.cardType);
        System.out.println("Branch: " + a2.branch);
        System.out.println("Phone: " + a2.phoneNumber);


        ATMCard a3 = new ATMCard();
        a3.cardHolderName = "Kiran Kumar";
        a3.bankName = "ICICI";
        a3.cardNumber = "4567 8901 2345 6789";
        a3.expiryDate = "10/29";
        a3.cardType = "Debit";
        a3.branch = "Davangere";
        a3.phoneNumber = "9012345678";

        System.out.println("---- ATM CARD 3 ----");
        System.out.println("Card Holder Name: " + a3.cardHolderName);
        System.out.println("Bank Name: " + a3.bankName);
        System.out.println("Card Number: " + a3.cardNumber);
        System.out.println("Expiry Date: " + a3.expiryDate);
        System.out.println("Card Type: " + a3.cardType);
        System.out.println("Branch: " + a3.branch);
        System.out.println("Phone: " + a3.phoneNumber);


        ATMCard a4 = new ATMCard();
        a4.cardHolderName = "Sneha Patil";
        a4.bankName = "Axis Bank";
        a4.cardNumber = "1122 3344 5566 7788";
        a4.expiryDate = "09/26";
        a4.cardType = "Credit";
        a4.branch = "Mysore";
        a4.phoneNumber = "9988776655";

        System.out.println("---- ATM CARD 4 ----");
        System.out.println("Card Holder Name: " + a4.cardHolderName);
        System.out.println("Bank Name: " + a4.bankName);
        System.out.println("Card Number: " + a4.cardNumber);
        System.out.println("Expiry Date: " + a4.expiryDate);
        System.out.println("Card Type: " + a4.cardType);
        System.out.println("Branch: " + a4.branch);
        System.out.println("Phone: " + a4.phoneNumber);

    }
}