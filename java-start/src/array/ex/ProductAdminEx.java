package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productNames = new String[10];

        int[] productPrices = new int[10];

        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");

            System.out.print("메뉴를 선택하세요:");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("상품 이름을 입력하세요:");
                    String productName = sc.next();

                    productNames[productCount] = productName;

                    System.out.print();

                    break;

                case 2:
                    for ()
            }
        }
    }
}
