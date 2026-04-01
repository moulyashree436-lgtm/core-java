class NumberData {
static int[] arrayOne() {
int a[] = {2,4,6,8,10,12,14,16,18,20};
return a;
}
static int[] arrayTwo() {
int b[] = {1,3,5,7,9,11,13,15,17,19};
return b;
}
static int[] arrayThree() {
int c[] = {21,22,23,24,25,26,27,28,29,30};
return c;
}
static int[] arrayFour() {
int d[] = {31,32,33,34,35,36,37,38,39,40};
return d;
}
static int[] arrayFive() {
int e[] = {41,42,43,44,45,46,47,48,49,50};
return e;
}
public static void main(String[] args) {
int arr1[] = arrayOne();
int arr2[] = arrayTwo();
int arr3[] = arrayThree();
int arr4[] = arrayFour();
int arr5[] = arrayFive();
for(int i : arr1)
System.out.println(i);
for(int i : arr2)
System.out.println(i);
for(int i : arr3)
System.out.println(i);
for(int i : arr4)
System.out.println(i);
for(int i : arr5)
System.out.println(i);
}
}