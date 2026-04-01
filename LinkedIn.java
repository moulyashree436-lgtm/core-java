class LinkedIn {

    String userName;
    int userId;
    boolean isPremium;
    int connections;
    double profileViews;

    public LinkedIn(String l1, int l2, boolean l3, int l4, double l5) {
        userName = l1;
        userId = l2;
        isPremium = l3;
        connections = l4;
        profileViews = l5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isPremium);
        System.out.println(connections);
        System.out.println(profileViews);
    }
}

