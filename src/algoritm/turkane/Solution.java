package algoritm.turkane;

public class Solution {
    public static void main(String[] args) {

        int number10 = -133;
        System.out.println(chevirme(number10));
    }

    public static String chevirme(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number == 0) {
            return "0";
        }
        boolean isMenfi =number < 0;
        if (isMenfi){
            number = Math.abs(number);}

        while (number > 0) {
            stringBuilder.append(number % 7);
            number /= 7;
        }

        if (isMenfi) {
            stringBuilder.append('-');
        }

        return stringBuilder.reverse().toString();
    }
}
