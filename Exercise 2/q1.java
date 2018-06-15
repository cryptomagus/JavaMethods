class q1{


	public static void main(String args[]){
		int base =5;
		int powerraised =2;
		System.out.println(numpower(base,powerraised));

	}
	public static int numpower(int x,int y){
		return x*numpower(x,y-1);
	}
}