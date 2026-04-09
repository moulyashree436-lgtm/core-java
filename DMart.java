class DMart {
    public static void main(String[] args) {

        String[] fruits = new String[10];
        fruits[0] = "apple";
        fruits[2] = "banana";
        fruits[4] = "mango";
        fruits[6] = "orange";
        fruits[8] = "grapes";

        for (String sec : fruits) {
            System.out.println("fruits section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits item index :" + i);
            System.out.println(fruits[i]);
        }

        String[] vegetables = new String[10];
        vegetables[1] = "carrot";
        vegetables[3] = "potato";
        vegetables[5] = "tomato";
        vegetables[7] = "onion";
        vegetables[9] = "cabbage";

        for (String sec : vegetables) {
            System.out.println("vegetables section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < vegetables.length; j++) {
            System.out.println("vegetables item index :" + j);
            System.out.println(vegetables[j]);
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

        String[] dairy = new String[10];
        dairy[1] = "milk";
        dairy[3] = "cheese";
        dairy[5] = "butter";
        dairy[7] = "curd";
        dairy[9] = "paneer";

        for (String sec : dairy) {
            System.out.println("dairy section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < dairy.length; m++) {
            System.out.println("dairy item index :" + m);
            System.out.println(dairy[m]);
        }

        String[] bakery = new String[9];
        bakery[0] = "bread";
        bakery[2] = "cake";
        bakery[4] = "bun";
        bakery[6] = "cookies";
        bakery[8] = "toast";

        for (String sec : bakery) {
            System.out.println("bakery section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < bakery.length; n++) {
            System.out.println("bakery item index :" + n);
            System.out.println(bakery[n]);
        }
    }
}