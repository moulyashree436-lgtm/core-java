class VehicleItemsRunner {
public static void main(String[] args) {
VehicleItems v1 = new VehicleItems("Toyota");
v1.display();
VehicleItems v2 = new VehicleItems("Bike", 90000);
v2.display();
VehicleItems v3 = new VehicleItems("Car", "Hyundai", 800000, true);
v3.display();
}
}