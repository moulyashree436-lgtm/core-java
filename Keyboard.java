class Keyboard {
static String brand;
static String type;
static double price;
static String color;
static String connectivity;
static int keys;
static String lighting;
public static void setBrand(String brandName) {
brand = brandName;
System.out.println("Brand: " + brand);
}
public static void setType(String keyboardType) {
type = keyboardType;
System.out.println("Type: " + type);
}
public static void setPrice(double p) {
price = p;
System.out.println("Price: " + price);
}
public static void setColor(String c) {
color = c;
System.out.println("Color: " + color);
}
public static void setConnectivity(String conn) {
connectivity = conn;
System.out.println("Connectivity: " + connectivity);
}
public static void setKeys(int k) {
keys = k;
System.out.println("Keys: " + keys);
}
public static void setLighting(String light) {
lighting = light;
System.out.println("Lighting: " + lighting);
System.out.println("------------------------");
}
}

