class HyperCty {
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

        String[] washing = new String[10];
        washing[1] = "detergent";
        washing[3] = "soap";
        washing[5] = "floor cleaner";
        washing[7] = "dish wash liquid";
        washing[9] = "bleach";

        for (String sec : washing) {
            System.out.println("washing products section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < washing.length; j++) {
            System.out.println("washing products item index :" + j);
            System.out.println(washing[j]);
        }

        String[] dryFruits = new String[8];
        dryFruits[0] = "almonds";
        dryFruits[2] = "cashews";
        dryFruits[4] = "raisins";
        dryFruits[6] = "walnuts";

        for (String sec : dryFruits) {
            System.out.println("dry fruits section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < dryFruits.length; k++) {
            System.out.println("dry fruits item index :" + k);
            System.out.println(dryFruits[k]);
        }

        String[] cosmetics = new String[10];
        cosmetics[1] = "lipstick";
        cosmetics[3] = "face cream";
        cosmetics[5] = "perfume";
        cosmetics[7] = "nail polish";
        cosmetics[9] = "shampoo";

        for (String sec : cosmetics) {
            System.out.println("cosmetics section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < cosmetics.length; m++) {
            System.out.println("cosmetics item index :" + m);
            System.out.println(cosmetics[m]);
        }

        String[] vegetables = new String[9];
        vegetables[0] = "tomato";
        vegetables[2] = "onion";
        vegetables[4] = "potato";
        vegetables[6] = "carrot";
        vegetables[8] = "beans";

        for (String sec : vegetables) {
            System.out.println("vegetables section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < vegetables.length; n++) {
            System.out.println("vegetables item index :" + n);
            System.out.println(vegetables[n]);
        }
    }
}