class Telegram {

    String userName;
    int userId;
    boolean isOnline;
    int groupsJoined;
    double storageUsed;

    public Telegram(String t1, int t2, boolean t3, int t4, double t5) {
        userName = t1;
        userId = t2;
        isOnline = t3;
        groupsJoined = t4;
        storageUsed = t5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isOnline);
        System.out.println(groupsJoined);
        System.out.println(storageUsed);
    }
}

