package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("출력");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[4 - i]);

            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
