import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Type a value: >");
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            System.out.println("The value 'n' should be odd and not great than 15");
            n = scanner.nextInt();
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == i || j == n - 1 - i || j == n / 2 || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
