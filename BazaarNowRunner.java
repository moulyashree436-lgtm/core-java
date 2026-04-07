class BazaarNowRunner {

    public static void main(String[] args) {

        int price = 0;

        price = BazaarNow.checkItem("RiceBag");
        System.out.println("for one item: " + price);

        int totalPrice = BazaarNow.checkItem("RiceBag", price, 3);
        System.out.println("totalPrice: " + totalPrice);

    }
}