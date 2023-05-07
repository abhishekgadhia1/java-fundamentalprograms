package FundamentalPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int fac = 1;
		
		for(int i=num;i>=2;i--)
		{
			fac = fac * i;//
		}

		System.out.println(fac);
	}

}
