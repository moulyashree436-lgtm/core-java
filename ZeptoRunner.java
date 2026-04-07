class ZeptoRunner {

    public static void main(String[] args) {

        int price = 0;

        price = Zepto.checkItem("Laptop");
        System.out.println("for one item: " + price);

        int totalPrice = Zepto.checkItem("Laptop", price, 5);
        System.out.println("totalPrice: " + totalPrice);

    }
}