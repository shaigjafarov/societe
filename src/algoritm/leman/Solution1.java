package algoritm.leman;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.convertToBase7(new Scanner(System.in).nextInt()));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder base7 = new StringBuilder();

        while (num > 0) {
            base7.append(num % 7);
            num /= 7;
        }

        if (isNegative) {
            base7.append("-");
        }

        return base7.reverse().toString();
    }

}
