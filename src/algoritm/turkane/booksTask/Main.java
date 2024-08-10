package algoritm.turkane.booksTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter option:");
            int option= scanner.nextInt();
            switch (option){
                case 1->BookUtil.addBook();//kitab yaradir
                case 2->BookUtil.allPageCount();//butun kitablarin seife cemi
                case 3->BookUtil.filter();//200den cox
                case 4->BookUtil.sortBook();//kitab adini elifba sirasi ile duz
                default -> System.out.println("Option not found...");
            }
        }

    }
}
