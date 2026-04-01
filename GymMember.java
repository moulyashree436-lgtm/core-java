class GymMember {
    public static void main(String[] args) {
        
        char membershipType;
        int memberId;
        String memberName;
        double monthlyFee;
        boolean isActive;

        membershipType = 'P';
        memberId = 1201;
        memberName = "Rahul";
        monthlyFee = 1500.75;
        isActive = true;

        System.out.println("Membership Type: " + membershipType);
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Active: " + isActive);

        membershipType = 'B';
        memberId = 1202;
        memberName = "Sneha";
        monthlyFee = 1000.50;
        isActive = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Membership Type: " + membershipType);
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Active: " + isActive);
    }
}