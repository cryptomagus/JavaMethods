import static java.lang.Boolean.compare;
import static java.lang.Byte.compare;
import static java.lang.Character.compare;
import java.util.Scanner;
class q5{

	public static void main(String args[]){


		System.out.println("Enter Number Between Which U Want To Find All Prime Numbers");
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextINt();
		getmeprime(start,end);		
	}

	public static void getmeprime(int x,int y){
		int flag =0;
		for(int i=x;i<y;i++){

			for(int j=2;j<i;j++){
				if(i%j==o){
					flag=1;
				}
				if(flag==0){
					System.out.println(i);
					flag=0; 
				}

			}
		}
	}
}