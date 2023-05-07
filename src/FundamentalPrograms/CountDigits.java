package FundamentalPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num = 234445675857498738L;
		int count = 0;
		
		while(num!=0) //or n>0
			{
		num = num/10;
		count++;
		}
		
		System.out.println(count);

	}

}
