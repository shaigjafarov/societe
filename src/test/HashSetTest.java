package test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<User> userSet= new HashSet<>();
        User umid = new User(15, "Umid");
        User umid2 = new User(15, "Umid");
        User nurlan= new User(18, "Nurlan");

        userSet.add(umid2);
        userSet.add(umid);
        userSet.add(nurlan);

        System.out.println(userSet);

    }
}
