import java.util.Scanner;
class rectangle
{
public int area(int l,int b)
{
return l*b;
}
}
public class Getarea
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int l=in.nextInt();
int b=in.nextInt();
rectangle r1=new rectangle();
System.out.println(r1.area(l,b));
}
}
