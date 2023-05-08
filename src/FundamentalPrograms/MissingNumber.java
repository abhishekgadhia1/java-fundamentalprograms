package FundamentalPrograms;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,2,4,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=a[0];i<=a[a.length-1];i++)
		{
			sum = sum + i;
		}
		
		System.out.println("sum "+sum);
		
		for(int values : a)
		{
			sum2 = sum2 + values;
		}
		System.out.println("sum2 "+sum2);
		int missing_num = sum-sum2;
		System.out.println(missing_num);

	}

}
