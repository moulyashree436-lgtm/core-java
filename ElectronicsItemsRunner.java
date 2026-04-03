class ElectronicsItemsRunner {
public static void main(String[] args) {
ElectronicsItems e1 = new ElectronicsItems("Samsung");
e1.display();
ElectronicsItems e2 = new ElectronicsItems("Mobile", 15000);
e2.display();
ElectronicsItems e3 = new ElectronicsItems("Laptop", "Dell", 55000, true);
e3.display();
}
}