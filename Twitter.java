class Twitter {

    String userName;
    int userId;
    boolean isVerified;
    int followersCount;
    double accountBalance;

    public Twitter(String t1, int t2, boolean t3, int t4, double t5) {
        userName = t1;
        userId = t2;
        isVerified = t3;
        followersCount = t4;
        accountBalance = t5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isVerified);
        System.out.println(followersCount);
        System.out.println(accountBalance);
    }
}

