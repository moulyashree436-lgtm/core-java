class PanCardRunner {
public static void main(String[] args) {
System.out.println("************Pan card Info**********");
PanCard person1 = new PanCard();
person1.name = "RahuL";
person1.fatherName = "Mahesh";
person1.dob = "12/05/2000";

PanCard person2 = new PanCard();
person2.name = "Reddy";
person2.fatherName = "Ramesh";
person2.dob = "23/09/2000";

PanCard person3 = new PanCard();
person3.name = "Kumar";
person3.fatherName = "Suresh";
person3.dob = "10/01/1997";

System.out.println("-------PAN CARD 1 ------");
System.out.println("PERSON1 Name: " + person1.name);
System.out.println("PERSON1 Father Name: " + person1.fatherName);
System.out.println("PERSON1 DOB: " + person1.dob);

System.out.println("-------PAN CARD 2 ------");
System.out.println("PERSON2 Name: " + person2.name);
System.out.println("PERSON2 Father Name: " + person2.fatherName);
System.out.println("PERSON2 DOB: " + person2.dob);

System.out.println("-------PAN CARD 3 ------");
System.out.println("PERSON3 Name: " + person3.name);
System.out.println("PERSON3 Father Name: " + person3.fatherName);
System.out.println("PERSON3 DOB: " + person3.dob);
}
}