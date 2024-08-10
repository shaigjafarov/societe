package algoritm.hafiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Negativesubarrays {

    public static void main(String[] args) {
        findNegativesubarrays();
    }
    // Arrayda menfi ededlerin ceminin sayi (Subarrays)

    public static void findNegativesubarrays() {

        List<Integer> arraylist = new ArrayList<>();

        System.out.println("Ededleri daxil et");
        Scanner sc = new Scanner(System.in);

        arraylist.add(sc.nextInt());
        arraylist.add(sc.nextInt());
        arraylist.add(sc.nextInt());
        arraylist.add(sc.nextInt());
        arraylist.add(sc.nextInt());


        System.out.println(arraylist);

        int negativeCount = 0;
//  [1,-2,-3,4,5]
//
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = i; j < arraylist.size(); j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arraylist.get(k);
                }
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }
        System.out.println(negativeCount);
    }


}
