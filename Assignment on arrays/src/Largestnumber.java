
public class Largestnumber 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,-15,20,-30};
		int max=a[0];
		for(int i=0;i<5;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
				System.out.println ("Largest number in the array is:" + max);
			}
		}
			
	}

}
