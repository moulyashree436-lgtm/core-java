class BookItemsRunner {
public static void main(String[] args) {
BookItems b1 = new BookItems("R.K. Narayan");
b1.display();
BookItems b2 = new BookItems("Malgudi Days", 500);
b2.display();
BookItems b3 = new BookItems("Wings of Fire", "A.P.J Abdul Kalam", 350, true);
b3.display();
}
}