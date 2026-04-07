class ZomatoRunner {

    public static void main(String[] args) {

        int price = 0;

        price = Zomato.checkItem("Laptop");
        System.out.println("for one item: " + price);

        int totalPrice = Zomato.checkItem("Laptop", price, 5);
        System.out.println("totalPrice: " + totalPrice);

    }
}