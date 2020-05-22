import java.util.Scanner;
public class Form{
    public static void main (String []args){
        String name;
        int PhoneNo;
        String email;
        String Password;

Scanner input = new Scanner(System.in);
System.out.println("Enter your name:");
String name=input.nextString();
System.out.println("Phone Number:");
int PhoneNo=input.nextInt();
System.out.println("Enter your email:");
String email=input.nextString();
System.out.println("Password");

String Password=input.nextString();
System.out.println(name,PhoneNo,email);


    }
}