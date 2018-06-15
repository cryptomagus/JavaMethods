import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;
//
 class question1 {

    public static void main(String args[]){
    		System.out.println("Enter Number You Want To Cube ?");
    		Scanner scan =new Scanner(System.in);
    		int x = scan.nextInt();
    		cube(x);

    }



    public static void cube(int x){
	int cube = x*x*x;

	System.out.println("Cube Of The Number " + x + " is " + cube);
	}
}


