package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        double average = 0;

        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while ((number = input.nextInt()) != -1) {
            sum += number;
            count++;
        }

        average = (double) sum / count;

        System.out.print("입력한 숫자들의 합계: " + sum);
        System.out.print("입력한 숫자들의 평균: " + average);
    }
}
