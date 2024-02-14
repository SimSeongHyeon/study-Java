package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        //깔끔하지 못함
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
