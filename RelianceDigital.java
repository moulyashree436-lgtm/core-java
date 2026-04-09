class RelianceDigital {
    public static void main(String[] args) {

        String[] mobiles = new String[10];
        mobiles[0] = "iphone";
        mobiles[2] = "samsung galaxy";
        mobiles[4] = "oneplus";
        mobiles[6] = "realme";
        mobiles[8] = "redmi";

        for (String sec : mobiles) {
            System.out.println("mobiles section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < mobiles.length; i++) {
            System.out.println("mobiles item index :" + i);
            System.out.println(mobiles[i]);
        }

        String[] laptops = new String[10];
        laptops[1] = "hp laptop";
        laptops[3] = "dell laptop";
        laptops[5] = "lenovo laptop";
        laptops[7] = "asus laptop";
        laptops[9] = "acer laptop";

        for (String sec : laptops) {
            System.out.println("laptops section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < laptops.length; j++) {
            System.out.println("laptops item index :" + j);
            System.out.println(laptops[j]);
        }

        String[] accessories = new String[8];
        accessories[0] = "headphones";
        accessories[2] = "keyboard";
        accessories[4] = "mouse";
        accessories[6] = "usb cable";

        for (String sec : accessories) {
            System.out.println("accessories section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < accessories.length; k++) {
            System.out.println("accessories item index :" + k);
            System.out.println(accessories[k]);
        }

        String[] appliances = new String[10];
        appliances[1] = "tv";
        appliances[3] = "refrigerator";
        appliances[5] = "washing machine";
        appliances[7] = "air conditioner";
        appliances[9] = "microwave";

        for (String sec : appliances) {
            System.out.println("appliances section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < appliances.length; m++) {
            System.out.println("appliances item index :" + m);
            System.out.println(appliances[m]);
        }

        String[] gadgets = new String[9];
        gadgets[0] = "smart watch";
        gadgets[2] = "tablet";
        gadgets[4] = "power bank";
        gadgets[6] = "bluetooth speaker";
        gadgets[8] = "camera";

        for (String sec : gadgets) {
            System.out.println("gadgets section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < gadgets.length; n++) {
            System.out.println("gadgets item index :" + n);
            System.out.println(gadgets[n]);
        }
    }
}