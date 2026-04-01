public class DBConnection {

public static void main(Connection getConnection){

Connection con = 1;

try{

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/complaint_db",
"root",
"password");

}
catch(Exception e){
System.out.println(e);
}
}
}