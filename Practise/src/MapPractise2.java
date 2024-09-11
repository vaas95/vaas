import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MapPractise2 {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    HashMap<Character,Integer> map=new HashMap<>();
    String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(map.containsKey(c))
        {
            map.put(c,map.get(c)+1);
        }
        else
        {
            map.put(c,1);
        }
    }
        for(HashMap.Entry<Character,Integer> dup:map.entrySet())

        {
            System.out.println(dup.getKey()+" "+dup.getValue());



        }

}
}
