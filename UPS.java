class UPS {
public static void main(String[] args) {
System.out.println("UPS Features:");
System.out.println("Type: Online");
System.out.println("Capacity: 1500 VA");
System.out.println("Input Voltage: 220V");
System.out.println("Output Voltage: 220V");
int price = 12000;            
float backupTime = 3.5f;      
byte batteryCount = 2;      
short warrantyYears = 2;      
long serialNumber = 123456789L; 
double efficiency = 92.5;     
char size = 'M';              
boolean isSmart = true;  
System.out.println("UPS Details:");
System.out.println("Price: " + price);
System.out.println("Backup Time: " + backupTime + " hours");
System.out.println("Battery Count: " + batteryCount);
System.out.println("Warranty Years: " + warrantyYears);
System.out.println("Serial Number: " + serialNumber);
System.out.println("Efficiency: " + efficiency + "%");
System.out.println("Size: " + size);
System.out.println("Smart UPS: " + isSmart);
}
}
