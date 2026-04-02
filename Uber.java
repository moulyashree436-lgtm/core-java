class Uber {
String driverName;
String carModel;
int fare;
public Uber() {
}
public Uber(String driverName, String carModel, int fare) {
this.driverName = driverName;
this.carModel = carModel;
this.fare = fare;
}
public void display() {
System.out.println(driverName);
System.out.println(carModel);
System.out.println(fare);
System.out.println("-------------------");
}
}

