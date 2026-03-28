class Mobile {
static String brand;
static String model;
static double price;
static int storage;
static int ram;
static String color;
static String battery;
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
public static void setStorage(int s) {
storage = s;
System.out.println("Storage: " + storage + "GB");
}
public static void setRAM(int r) {
ram = r;
System.out.println("RAM: " + ram + "GB");
}
public static void setColor(String c) {
color = c;
System.out.println("Color: " + color);
}
public static void setBattery(String b) {
battery = b;
System.out.println("Battery: " + battery);
System.out.println("------------------------");
}
}
