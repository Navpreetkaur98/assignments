import java.util.Scanner;
class example
{
public static void main(String[] args)
{
Scanner in =new Scanner(System.in);
int n;
 n=in.nextInt();
for(int i=2;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}