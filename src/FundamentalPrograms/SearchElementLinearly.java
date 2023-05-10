package FundamentalPrograms;

public class SearchElementLinearly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,35,40,50};
		boolean flag = true;
		
		for(int i=0;i<a.length;i++)
		{
			if(30==a[i])
			{
				System.out.println("element found at "+i);
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("elem not found");
		}

	}

}
