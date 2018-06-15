import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;
//Write a Program  to check whether a number is even or odd using functions.

class q4{

public static void main(String args[]){
	System.out.println("Enter The Number ?");
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();

}

public static void oddcheck(int x){
	if(x%2!=0)
		System.out.println("The Number Is odd !");
	else
		System.out.println("The Number is Not Odd");
}
}