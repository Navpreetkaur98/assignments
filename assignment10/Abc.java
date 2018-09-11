import java.io.*;
class Abc
{
  public static void main(String args[])
{
  try
  {
File f = new File("ab.txt");
    FileWriter w = new FileWriter("pqr.txt");
    String str;
  str=f.getAbsolutePath();
    w.write(str);
    w.close();
    System.out.println("done");
  }
  catch(IOException e)
  {
    e.printStackTrace();
  }
  }
}