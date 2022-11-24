import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Type a value n: >");
        int n = scanner.nextInt();
        //System.out.println("Type a value m: >");
        int m = scanner.nextInt();


        int[][] matrix = new int[n][m];
        //System.out.println("Type a matrix: >");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        //System.out.println("Type a value i: >");
        int i2 = scanner.nextInt();
        //System.out.println("Type a value j: >");
        int j2 = scanner.nextInt();

        //Swap the columns i j
        for (int i3 = 0 ; i3 < matrix.length; i3++) {
            for (int j3 = 0; j3 < matrix[i3].length; j3++) {
                if (j3 == i2) {
                    System.out.print(matrix[i3][j2] + " ");
                } else if (j3 == j2) {
                    System.out.print(matrix[i3][i2] + " ");
                } else {
                    System.out.print(matrix[i3][j3] + " ");
                }
            }
            System.out.println();
        }
    }
}