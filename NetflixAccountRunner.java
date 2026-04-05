class NetflixAccountRunner {
    public static void main(String[] args) {
        NetflixAccount n1 = new NetflixAccount();
        NetflixAccount n2 = new NetflixAccount("Kavya");
        NetflixAccount n3 = new NetflixAccount("Rahul", 3102);
        NetflixAccount n4 = new NetflixAccount("Sneha", 3203, false);
        NetflixAccount n5 = new NetflixAccount("Vikram", 3304, true, "Premium");

    }
}