import com.sun.java_cup.internal.runtime.Scanner;
import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;

class question2{
	public static void main(String args[]){

	
	System.out.println("Enter The Radius ? ");
	Scanner scan =new Scanner(System.in);
	int r= scan.nextInt();
	int d = diameter(r);
	double area =area(r);
	double cir = circumference(r);
		System.out.println( d + area + cir + "Are The Diameter,Area,Circumference");
}




	public static int diameter(int r){
		return 2*r;
	}
	public static double circumference(int r){
		return 2*3.14*r;
	}
	public static double area(int r){
		return 3.14*r*r;
	}
}