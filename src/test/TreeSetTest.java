package test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {



        Set<User>  sortedSet= new TreeSet<>();


        User umid = new User(15, "Umid");
        User umid2 = new User(12, "Samir");
        User nurlan= new User(18, "Nurlan");
        User nurlan2= new User(16, "hafiz");
        sortedSet.add(umid);
        sortedSet.add(umid2);
        sortedSet.add(nurlan);
        sortedSet.add(nurlan2);

        System.out.println(sortedSet);


    }
}
