import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result, comparacion1, comparacion2;
        comparacion1 = number > 0;
        comparacion2 = number < 10;
        result = comparacion1 && comparacion2;
        System.out.println(result);
    }
}
