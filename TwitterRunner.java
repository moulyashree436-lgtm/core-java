class TwitterRunner {
    public static void main(String[] args) {

        Twitter t1 = new Twitter("Ragu", 401, true, 5000, 300.0);
        t1.show();

        Twitter t2 = new Twitter("Ambruth", 402, false, 1200, 100.0);
        t2.show();

        Twitter t3 = new Twitter("Kavya", 403, false, 800, 50.0);
        t3.show();

        Twitter t4 = new Twitter("Sahana", 404, true, 10000, 500.0);
        t4.show();

        Twitter t5 = new Twitter("Ankitha", 405, false, 1500, 200.0);
        t5.show();

        Twitter t6 = new Twitter("Mohan", 406, true, 3000, 350.0);
        t6.show();

        Twitter t7 = new Twitter("Varun", 407, false, 900, 80.0);
        t7.show();
    }
}