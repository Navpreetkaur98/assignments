import java.util.Scanner;
class complex
{

public void display(int real,int imaginary)
{
System.out.println(real+"+"+ imaginary+"" +"i");
}
}
public class imag
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int r=in.nextInt();
int i=in.nextInt();
complex c1=new complex();
c1.display(r,i);
}
}