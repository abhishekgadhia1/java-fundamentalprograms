package FundamentalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		int count = 0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("yes prime");
		else
			System.out.println("no prime");
		
		s.close();

	}

}
