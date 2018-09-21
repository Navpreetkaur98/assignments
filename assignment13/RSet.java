import java.util.*;
public class RSet{
public static void main(String[] args){
HashSet h1=new HashSet();
h1.add(8);
h1.add(52);
h1.add(64);
h1.add(91);
h1.add(88);
HashSet h2=new HashSet();
h2.add(52);
h2.add(23);
h2.add(65);
h2.add(8);
h2.add(78);
h1.retainAll(h2);
System.out.println(h1);
}
}







