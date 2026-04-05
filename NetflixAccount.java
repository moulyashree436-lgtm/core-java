class NetflixAccount {
    String userName;
    int accountId;
    boolean isActive;
    String plan;
    public NetflixAccount() {
        this("Arjun", 3001, true);
        System.out.println("Details 1st");
    }
    public NetflixAccount(String userName) {
        System.out.println("User Name: " + userName);
        System.out.println("Details 2nd");
    }
    public NetflixAccount(String userName, int accountId) {
        System.out.println("User Name: " + userName);
        System.out.println("Account ID: " + accountId);
        System.out.println("Details 3rd");
    }
    public NetflixAccount(String userName, int accountId, boolean isActive) {
        this(userName); 
        System.out.println("Account ID: " + accountId);
        System.out.println("Active: " + isActive);
        System.out.println("Details 4th");
    }
    public NetflixAccount(String userName, int accountId, boolean isActive, String plan) {
        this(userName, accountId);
        System.out.println("Active: " + isActive);
        System.out.println("Plan: " + plan);
        System.out.println("Details 5th");
    }
}