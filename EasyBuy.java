class EasyBuy {
    public static void main(String[] args) {

	String[] electronics = new String[10];
        electronics[0] = "tv";
        electronics[2] = "refrigerator";
        electronics[4] = "washing machine";
        electronics[6] = "air conditioner";
        electronics[8] = "microwave";

        for (String sec : electronics) {
            System.out.println("electronics section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < electronics.length; i++) {
            System.out.println("electronics item index :" + i);
            System.out.println(electronics[i]);
        }

        String[] furniture = new String[10];
        furniture[1] = "sofa";
        furniture[3] = "bed";
        furniture[5] = "table";
        furniture[7] = "chair";
        furniture[9] = "cupboard";

        for (String sec : furniture) {
            System.out.println("furniture section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < furniture.length; j++) {
            System.out.println("furniture item index :" + j);
            System.out.println(furniture[j]);
        }

        String[] groceries = new String[8];
        groceries[0] = "rice";
        groceries[2] = "wheat";
        groceries[4] = "sugar";
        groceries[6] = "salt";

        for (String sec : groceries) {
            System.out.println("groceries section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < groceries.length; k++) {
            System.out.println("groceries item index :" + k);
            System.out.println(groceries[k]);
        }

        String[] accessories = new String[10];
        accessories[1] = "watch";
        accessories[3] = "belt";
        accessories[5] = "wallet";
        accessories[7] = "sunglasses";
        accessories[9] = "cap";

        for (String sec : accessories) {
            System.out.println("accessories section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < accessories.length; m++) {
            System.out.println("accessories item index :" + m);
            System.out.println(accessories[m]);
        }
		
        String[] toys = new String[9];
        toys[0] = "car toy";
        toys[2] = "doll";
        toys[4] = "puzzle";
        toys[6] = "blocks";
        toys[8] = "remote car";

        for (String sec : toys) {
            System.out.println("toys section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < toys.length; n++) {
            System.out.println("toys item index :" + n);
            System.out.println(toys[n]);
        }
    }
}