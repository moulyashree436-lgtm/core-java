class MangoFarm {

    static boolean isFresh = true;

    public static void main(String[] args) {

        int pricePerBox;
        double marketPricePerKg;
        
        pricePerBox = 2000;
        marketPricePerKg = 120;

        System.out.println("Income per box: " + pricePerBox);
        System.out.println("Present market price: " + marketPricePerKg);
        System.out.println("Is Fresh: " + isFresh);
        System.out.println("********");
        
        pricePerBox = 3000;
        marketPricePerKg = 150;
        boolean isFresh = false;

        System.out.println("It is not fresh: " + isFresh);
        System.out.println("Income per box: " + pricePerBox);
        System.out.println("Present market price: " + marketPricePerKg);
        System.out.println("********");
        
        pricePerBox = 4000;
        marketPricePerKg = 180;

        System.out.println("It is fresh: " + MangoFarm.isFresh);
        System.out.println("Income per box: " + pricePerBox);
        System.out.println("Present market price: " + marketPricePerKg);
    }
}