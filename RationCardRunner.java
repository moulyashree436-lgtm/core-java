class RationCardRunner {

    public static void main(String[] args) {

        RationCard card1 = new RationCard();
        card1.headName = "Ramesh Kumar";
        card1.rationCardNumber = "RC123456";
        card1.cardType = "APL";
        card1.address = "BTM Layout, Bangalore";
        card1.familyMembers = 4;
        card1.district = "Bangalore Urban";

        System.out.println("---- RATION CARD 1 ----");
        System.out.println("Head Name: " + card1.headName);
        System.out.println("Ration Card No: " + card1.rationCardNumber);
        System.out.println("Card Type: " + card1.cardType);
        System.out.println("Address: " + card1.address);
        System.out.println("Family Members: " + card1.familyMembers);
        System.out.println("District: " + card1.district);


        RationCard card2 = new RationCard();
        card2.headName = "Lakshmi Devi";
        card2.rationCardNumber = "RC654321";
        card2.cardType = "BPL";
        card2.address = "Whitefield, Bangalore";
        card2.familyMembers = 5;
        card2.district = "Bangalore Urban";

        System.out.println("---- RATION CARD 2 ----");
        System.out.println("Head Name: " + card2.headName);
        System.out.println("Ration Card No: " + card2.rationCardNumber);
        System.out.println("Card Type: " + card2.cardType);
        System.out.println("Address: " + card2.address);
        System.out.println("Family Members: " + card2.familyMembers);
        System.out.println("District: " + card2.district);


        RationCard card3 = new RationCard();
        card3.headName = "Kiran Patil";
        card3.rationCardNumber = "RC987654";
        card3.cardType = "APL";
        card3.address = "Davangere";
        card3.familyMembers = 3;
        card3.district = "Davangere";

        System.out.println("---- RATION CARD 3 ----");
        System.out.println("Head Name: " + card3.headName);
        System.out.println("Ration Card No: " + card3.rationCardNumber);
        System.out.println("Card Type: " + card3.cardType);
        System.out.println("Address: " + card3.address);
        System.out.println("Family Members: " + card3.familyMembers);
        System.out.println("District: " + card3.district);


        RationCard card4 = new RationCard();
        card4.headName = "Sneha Reddy";
        card4.rationCardNumber = "RC112233";
        card4.cardType = "BPL";
        card4.address = "Mysore";
        card4.familyMembers = 6;
        card4.district = "Mysore";

        System.out.println("---- RATION CARD 4 ----");
        System.out.println("Head Name: " + card4.headName);
        System.out.println("Ration Card No: " + card4.rationCardNumber);
        System.out.println("Card Type: " + card4.cardType);
        System.out.println("Address: " + card4.address);
        System.out.println("Family Members: " + card4.familyMembers);
        System.out.println("District: " + card4.district);

    }
}