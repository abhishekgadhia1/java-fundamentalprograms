package FundamentalPrograms;

public class ArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		boolean flag = true;
		
//		if(Arrays.equals(a, b))
//			System.out.println("E");
//		else
//			System.out.println("NE");
		
		if(a.length!=b.length)
		{
			System.out.println("Arrays are not eq");
			return;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
			flag=false;
			break;
			}
		}
		
		if(flag==false)
			System.out.println("arrays not eq");
		else
			System.out.println("arrays eq");

	}

}
