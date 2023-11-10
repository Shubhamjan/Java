import java.util.Scanner;
public class StringDemo {
public static void main(String[] agrs) {
	String s="Hello";
	String s1= "hello";
	String s2="Welcome";
	String s3="Welcome";
	//s=s2+"World";
	System.out.println(s);
	String s4="Hello";
	String s5= new String ("Welcome");
	System.out.println("s1.equals(s5)"+(s1.equals(s5)));
	System.out.println(s3.compareTo(s5));
}
}
