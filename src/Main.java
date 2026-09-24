import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter first number: &quot;);
int a = sc.nextInt();
System.out.print(&quot;Enter second number: &quot;);
int b = sc.nextInt();
System.out.println(&quot;\n1. Addition&quot;);
System.out.println(&quot;2. Subtraction&quot;);
System.out.println(&quot;3. Multiplication&quot;);
System.out.println(&quot;4. Division&quot;);
System.out.print(&quot;Enter your choice: &quot;);
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.println(&quot;Addition = &quot; + (a + b));
break;
case 2:
System.out.println(&quot;Subtraction = &quot; + (a - b));
break;
case 3:
System.out.println(&quot;Multiplication = &quot; + (a * b));
break;
case 4:
System.out.println(&quot;Division = &quot; + (a / b));
break;
default:
System.out.println(&quot;Invalid choice&quot;);
}
// Security Hotspot: hard-coded credential
String password = &quot;admin123&quot;;
// Code Smell: unused variable
int unusedNumber = 100;
// Security issue example: database connection with hard-coded password
try {
Connection con = DriverManager.getConnection(
&quot;jdbc:mysql://localhost:3306/testdb&quot;,

&quot;root&quot;,
password
);
Statement stmt = con.createStatement();
System.out.println(&quot;Database connected&quot;);
} catch (Exception e) {
e.printStackTrace();
}
// Bug example: possible division by zero
int x = 10;
int y = 0;
int result = x / y;
System.out.println(&quot;Result = &quot; + result);
sc.close();
}
}
