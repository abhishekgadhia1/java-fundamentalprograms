package FundamentalPrograms;

public class CountDigitsEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 124353545;
		int odd_count = 0;
		int even_count = 0;
		
		while(num!=0)
		{
			int rem = num%10;
			num = num/10;
			if(rem%2==0)
				even_count++;
			else
				odd_count++;
		}

		System.out.println("even "+even_count);
		System.out.println("odd "+odd_count);
	}

}
