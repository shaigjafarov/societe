package algoritm.hafiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadArraylist {

    public static void main(String[] args) {
        operationsinArraylist();
    }

    public static void operationsinArraylist() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Arrayda olacag Elementlerin sayini gir...");
        int n = scanner.nextInt(); // Siyahıda olan elementlərin sayı
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Başlanğıc vəziyyət: " + list);


        int sorguSayi = scanner.nextInt();  // 3 sayda sorgu var 2 insert var 1 delete
        scanner.nextLine();

        for (int i = 0; i < sorguSayi; i++) {
            System.out.println("Zehmet olmasa Emeliyyati sec");
            String operation = scanner.nextLine();  // insert yada delete oldugunu secirik burda

            String[] detallar = scanner.nextLine().split(" ");  // detallari oxyurug ve indeksi tapacg
            int index = Integer.parseInt(detallar[0]);

            if (operation.equals("Insert")){
                int deyer = Integer.parseInt(detallar[1]);
                if (index <= list.size()){
                    list.add(index,deyer);
                }else {
                    System.out.println("Bu indeksi elave ede bilmerem!" + index);
                }
            } else if (operation.equals("Delete")) {
                 if (index <= list.size() && index >=0){
                     list.remove(index);
                 }
            }else {
                System.out.println("bele bir emeliyyat yoxdur");
            }


            // indi ise daxil edeceyimiz ede
        }

    }
}
