import java.util.Scanner;
class example
{
public static void main(String[] args)
{
Scanner in =new Scanner(System.in);
int num=in.nextInt();
int i,j;
for(i=1;i<=num;i++)
{
int fact=0;
for(j=1;j<=num;j++)
{
if(i%j==0)
fact++;
}
if(fact==2)
{
System.out.println(i);
}
}
}
}