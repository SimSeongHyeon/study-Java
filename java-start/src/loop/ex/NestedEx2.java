package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 4;

        /*
        트리 그리기
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

         */

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
