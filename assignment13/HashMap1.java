import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMap1() {
    public static void main(String []args){
        HashMap h1= new HashMap();
        h1.put("jassi","12345678");
        h1.put("manpreet",23456789");
        h1.put("ansh","7098654321");
        Set s = h1.keySet();
                Iterator i= s.iterator();
        while(i.hasNext())
        {
            System.out.println(h1.get(i.next()));
        }
    }
}
