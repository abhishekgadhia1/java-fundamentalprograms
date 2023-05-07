package FundamentalPrograms;

public class LargestNumberOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 5;
		int c = 4;
		
		if(a>b && a>c)
			System.out.println("a is largest");
		else if(b>a && b>c)
			System.out.println("b is largest");
		else
			System.out.println("c is largest");
		
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		System.out.println(largest2+" is the latgest number");

	}

}
