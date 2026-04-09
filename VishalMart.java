class VishalMart {
    public static void main(String[] args) {

        String[] cosmetics = new String[10];
        cosmetics[0] = "face wash";
        cosmetics[2] = "nail polish";
        cosmetics[4] = "mascara";
        cosmetics[6] = "sunscreen";
        cosmetics[8] = "nail polish remover";

        for (String sec : cosmetics) {
            System.out.println("cosmetics section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < cosmetics.length; i++) {
            System.out.println("cosmetics item index :" + i);
            System.out.println(cosmetics[i]);
        }

        String[] medicines = new String[10];
        medicines[1] = "aspirin";
        medicines[3] = "antacid";
        medicines[5] = "insulin";
        medicines[7] = "ointment";
        medicines[9] = "cold tablets";

        for (String sec : medicines) {
            System.out.println("medical section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < medicines.length; j++) {
            System.out.println("medical item index :" + j);
            System.out.println(medicines[j]);
        }

        String[] electrical = new String[8];
        electrical[0] = "fan";
        electrical[2] = "iron box";
        electrical[4] = "heater";
        electrical[6] = "charger";

        for (String sec : electrical) {
            System.out.println("electrical section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < electrical.length; k++) {
            System.out.println("electrical item index :" + k);
            System.out.println(electrical[k]);
        }

        String[] travel = new String[10];
        travel[1] = "duffle bag";
        travel[3] = "passport cover";
        travel[5] = "travel kit";
        travel[7] = "sleep mask";
        travel[9] = "luggage lock";

        for (String sec : travel) {
            System.out.println("travel section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < travel.length; m++) {
            System.out.println("travel item index :" + m);
            System.out.println(travel[m]);
        }

        String[] music = new String[9];
        music[0] = "violin";
        music[2] = "flute";
        music[4] = "tabla";
        music[6] = "harmonium";
        music[8] = "headphones";

        for (String sec : music) {
            System.out.println("music section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < music.length; n++) {
            System.out.println("music item index :" + n);
            System.out.println(music[n]);
        }
    }
}