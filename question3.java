import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;


public static class questionn3{

	public static void main(String args[]){

		System.out.println("Enter Two Number's ?");
		Scanner scan = new Scanner(System.in);
		int x,y;
		x=scan.nextInt();
		y=scan.nextInt();

		int max =max(x,y);
		int min =min(x,y);
		System.out.println(max + min + "max ,min");
	}


	public static int max(int x,int y){
		if(x>y)
			return x;
		else 
			return y;
	}
	public static int min(int x,int y){
		if(x<y)
			return x;
		else
			return y;
	}
}