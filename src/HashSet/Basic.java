package HashSet;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("James");
        hs.add("Scott");
        hs.add("James");
        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.contains("James"));
        hs.remove("Scott");

        System.out.println(hs);
        for(String s:hs)
        {
            System.out.println(s);
        }
    }
}
