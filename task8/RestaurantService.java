class RestaurantService {
static void restaurantWelcome(){
System.out.println("Welcome to Restaurant");
}
static void orderFood(String customerName, String foodItem){
System.out.println(customerName + " ordered " + foodItem);
}
static int tableAllocation(){
int table = 8;
return table;
}
static int calculateFoodBill(int foodCost, int tax){
int totalBill = foodCost + tax;
return totalBill;
}
}