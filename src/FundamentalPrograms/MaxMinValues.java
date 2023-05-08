package FundamentalPrograms;

public class MaxMinValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,5,1,7,6};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max>a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println(max);
		
		

	}

}
