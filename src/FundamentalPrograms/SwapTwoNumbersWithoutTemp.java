package FundamentalPrograms;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		a = a+b; //a=30, b=20
		b = a-b; //a=30, b=10
		a = a-b; //a=20, b=10
		
		System.out.println(a+" "+b);
	}

}
