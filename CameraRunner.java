class CameraRunner {
public static void main(String[] args){
Camera.brand();
Camera.customerName("Moulya");
double price = Camera.priceOfCamera();
System.out.println("The price of Camera : " + price);
int cameraOrdered = Camera.numberOfCameraOrdered(2, 3);
System.out.println("The total number of Cameras Ordered: " + cameraOrdered);
}
}