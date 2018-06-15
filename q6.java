//armstrong number is a number in which sum of cubes == number itself
//first seperate numbers then cube and add them .


import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;

class q6{


	public static void main(String args[]){

		System.out.println("Enter The Number ?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		



	}

	public static void AtmstrongFinder(int num){
		int orignalnum = num;
		int lastdigit = num%10;
		num= num/10;
		int seconddigit = num%10;
		num=num/10;
		int firstdigit = num%10;
		int sumofcube = lastdigit*lastdigit*lastdigit + seconddigit*seconddigit*seconddigit + firstdigit*firstdigit*firstdigit;
		if(sumofcube==orignalnum){
			System.out.println("Number Is Armstrong Number !");
		}
		else
			System.out.println("NUmber Is Not An Armstrong Number !");
	}
}