package FundamentalPrograms;

public class CountSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int sum = 0;
		
		while(num!=0)
		{
			sum = sum + num%10;//sum = 0 + 4 = 4
			num = num/10; //num = 123
		}
		
		System.out.println(sum);

	}

}
