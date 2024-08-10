package algoritm.turkane.studentTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter option:");
            int option= scanner.nextInt();
            switch (option){
                case 1-> StudentUtil.addStudent();//telebe ve qiymetlerini capa verin
                case 2->StudentUtil.studentAverage();//telebenin ortalamasi
                case 3->StudentUtil.filter();//70den cox ortalamalar
                case 4->StudentUtil.maxAverage();//max ortalamanin telebe adi
                default -> System.out.println("Option not found...");
            }
        }
    }
}
