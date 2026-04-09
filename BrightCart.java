class BrightCart {
    public static void main(String[] args) {

        String[] babyThings = new String[10];
        babyThings[0] = "baby lotion";
        babyThings[2] = "diapers";
        babyThings[4] = "baby wipes";
        babyThings[6] = "baby powder";
        babyThings[8] = "feeding bottle";

        for (String sec : babyThings) {
            System.out.println("baby things section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < babyThings.length; i++) {
            System.out.println("baby things item index :" + i);
            System.out.println(babyThings[i]);
        }

        String[] fruits = new String[10];
        fruits[1] = "apple";
        fruits[3] = "banana";
        fruits[5] = "mango";
        fruits[7] = "orange";
        fruits[9] = "grapes";

        for (String sec : fruits) {
            System.out.println("fruits section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < fruits.length; j++) {
            System.out.println("fruits item index :" + j);
            System.out.println(fruits[j]);
        }

        String[] books = new String[8];
        books[0] = "java book";
        books[2] = "python book";
        books[4] = "c book";
        books[6] = "data science book";

        for (String sec : books) {
            System.out.println("books section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < books.length; k++) {
            System.out.println("books item index :" + k);
            System.out.println(books[k]);
        }

        String[] homeItems = new String[10];
        homeItems[1] = "duster";
        homeItems[3] = "mop";
        homeItems[5] = "bucket";
        homeItems[7] = "dustbin";
        homeItems[9] = "curtains";

        for (String sec : homeItems) {
            System.out.println("home items section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < homeItems.length; m++) {
            System.out.println("home items item index :" + m);
            System.out.println(homeItems[m]);
        }

        String[] dairy = new String[9];
        dairy[0] = "milk";
        dairy[2] = "cheese";
        dairy[4] = "butter";
        dairy[6] = "yogurt";
        dairy[8] = "cream";

        for (String sec : dairy) {
            System.out.println("dairy section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < dairy.length; n++) {
            System.out.println("dairy item index :" + n);
            System.out.println(dairy[n]);
        }
    }
}