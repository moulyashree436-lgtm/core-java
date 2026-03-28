class Car {
static String brand;
static String model;
static double price;
static String fuelType;
static int mileage;
static String color;
static int seating;
public static void setBrand(String b) {
brand = b;
System.out.println("Brand: " + brand);
}
public static void setModel(String m) {
model = m;
System.out.println("Model: " + model);
}
public static void setPrice(double p) {
price = p;
System.out.println("Price: " + price);
}
public static void setFuelType(String f) {
fuelType = f;
System.out.println("Fuel Type: " + fuelType);
}
public static void setMileage(int m) {
mileage = m;
System.out.println("Mileage: " + mileage + " km/l");
}
public static void setColor(String c) {
color = c;
System.out.println("Color: " + color);
}
public static void setSeating(int s) {
seating = s;
System.out.println("Seating Capacity: " + seating);
System.out.println("------------------------");
}
}

