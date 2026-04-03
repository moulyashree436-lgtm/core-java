class FurnitureItemsRunner {
public static void main(String[] args) {
FurnitureItems f1 = new FurnitureItems("Wood");
f1.display();
FurnitureItems f2 = new FurnitureItems("Chair", 3000);
f2.display();
FurnitureItems f3 = new FurnitureItems("Table", "Teak Wood", 7000, true);
f3.display();
}
}