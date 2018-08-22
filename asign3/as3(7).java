import java.util.Arrays;
import java.util.Scanner;
 
public class example
{

    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       int num=in.nextInt();
	int i;
        int[] arr = {1,4,6,7,8,9,10};
 	int flag=0;
        for(i=0;i<=6;i++)
	{

		if(num==arr[i])
		{
			flag=1;
			break;
		}
		
	}
if(flag==1)
{
System.out.println("yes");
}
else if(flag==0)
{
{
System.out.println("No");
}
   }
}
}