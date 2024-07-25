package algoritm.turkane;

public class Solution {
    public static void main(String[] args) {

        int number10 = -133;
        int number7 = Integer.parseInt(chevirme(number10));
        System.out.println(number7);
    }

    public static String chevirme(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number == 0) {
            return "0";
        }
        boolean menfi;
        if (menfi = number < 0){
            number = Math.abs(number);}

        while (number > 0) {
            stringBuilder.append(number % 7);
            number /= 7;
        }

        if (menfi) {
            stringBuilder.append('-');
        }

        return stringBuilder.reverse().toString();
    }
}
