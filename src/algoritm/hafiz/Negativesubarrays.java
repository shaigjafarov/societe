package algoritm.hafiz;

import java.util.ArrayList;
import java.util.List;

public class Negativesubarrays {

    public static void main(String[] args) {
        findNegativesubarrays();
    }

    public static void findNegativesubarrays() {

        List<Integer> arraylist = new ArrayList<>();
         arraylist.add(1);
         arraylist.add(-2);
         arraylist.add(4);
         arraylist.add(-5);
         arraylist.add(1);

        System.out.println(arraylist);
        int negativeCount = 0;



        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = i; j < arraylist.size(); j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum += arraylist.get(k);
                }
                if (sum<0){
                    negativeCount++;
                }
            }
        }
        System.out.println(negativeCount);
    }


}
