
public class Countofnumbers 
{
	public static void main(String[] args) 
	{
		int array[]= {11,12,13,14,15};
		int x=0;
		int y=0;
		System.out.println("Even count");
		for (int i=0;i<5;i++)
		{
			if(array[i]%2==0)
			{
				x++;
			}
		}
         System.out.println(x);
          System.out.println("Odd count");
        for (int i=0;i<5;i++)
      {
	if(array[i]%2!=0)
	  {
		y++;
	}
}
        System.out.println(y);
	}
}
