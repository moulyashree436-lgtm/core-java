class Zudio {
    public static void main(String[] args) {

        String[] girls = new String[10];
        girls[0] = "top";
        girls[2] = "kurti";
        girls[4] = "jeans";
        girls[6] = "skirt";
        girls[8] = "dress";

        for (String sec : girls) {
            System.out.println("girls section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < girls.length; i++) {
            System.out.println("girls item index :" + i);
            System.out.println(girls[i]);
        }

        String[] boys = new String[10];
        boys[1] = "tshirt";
        boys[3] = "shirt";
        boys[5] = "jeans";
        boys[7] = "shorts";
        boys[9] = "jacket";

        for (String sec : boys) {
            System.out.println("boys section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < boys.length; j++) {
            System.out.println("boys item index :" + j);
            System.out.println(boys[j]);
        }
		
        String[] shoes = new String[8];
        shoes[0] = "sneakers";
        shoes[2] = "sandals";
        shoes[4] = "heels";
        shoes[6] = "boots";

        for (String sec : shoes) {
            System.out.println("shoes section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < shoes.length; k++) {
            System.out.println("shoes item index :" + k);
            System.out.println(shoes[k]);
        }

        String[] cosmetics = new String[10];
        cosmetics[1] = "lipstick";
        cosmetics[3] = "foundation";
        cosmetics[5] = "eyeliner";
        cosmetics[7] = "compact";
        cosmetics[9] = "perfume";

        for (String sec : cosmetics) {
            System.out.println("cosmetics section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < cosmetics.length; m++) {
            System.out.println("cosmetics item index :" + m);
            System.out.println(cosmetics[m]);
        }

        String[] baby = new String[9];
        baby[0] = "baby dress";
        baby[2] = "diapers";
        baby[4] = "baby lotion";
        baby[6] = "feeding bottle";
        baby[8] = "baby shoes";

        for (String sec : baby) {
            System.out.println("baby section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < baby.length; n++) {
            System.out.println("baby item index :" + n);
            System.out.println(baby[n]);
        }
    }
}