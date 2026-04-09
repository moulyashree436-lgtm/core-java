class StarBazar {
    public static void main(String[] args) {

        String[] groceries = new String[10];
        groceries[0] = "rice";
        groceries[2] = "wheat";
        groceries[4] = "sugar";
        groceries[6] = "salt";
        groceries[8] = "oil";

        for (String sec : groceries) {
            System.out.println("groceries section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < groceries.length; i++) {
            System.out.println("groceries item index :" + i);
            System.out.println(groceries[i]);
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

        String[] beverages = new String[8];
        beverages[0] = "tea";
        beverages[2] = "coffee";
        beverages[4] = "juice";
        beverages[6] = "soft drink";

        for (String sec : beverages) {
            System.out.println("beverages section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < beverages.length; k++) {
            System.out.println("beverages item index :" + k);
            System.out.println(beverages[k]);
        }

        String[] snacks = new String[10];
        snacks[1] = "chips";
        snacks[3] = "biscuits";
        snacks[5] = "namkeen";
        snacks[7] = "popcorn";
        snacks[9] = "chocolate";

        for (String sec : snacks) {
            System.out.println("snacks section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < snacks.length; m++) {
            System.out.println("snacks item index :" + m);
            System.out.println(snacks[m]);
        }

        String[] household = new String[9];
        household[0] = "detergent";
        household[2] = "soap";
        household[4] = "toothpaste";
        household[6] = "bleach";
        household[8] = "cleaner";

        for (String sec : household) {
            System.out.println("household section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < household.length; n++) {
            System.out.println("household item index :" + n);
            System.out.println(household[n]);
        }
    }
}