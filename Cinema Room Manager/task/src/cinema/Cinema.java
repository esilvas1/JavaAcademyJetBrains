package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of rows: ");
        System.out.print("> ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row: ");
        System.out.print("> ");
        int columns = scanner.nextInt();

        //print the matrix
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 1 ; i <= columns; i++) {
            if (i == 1) {
                System.out.print("\s\s1 ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //body
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= columns; j++)
                System.out.print("S ");
            System.out.println();
        }

        //values of the tickets
        System.out.println();
        System.out.println("Enter a row number: ");
        System.out.print("> ");
        int row = scanner.nextInt();

        while (row > 9) {
            System.out.println("It won't be greater than 9, Enter the number of rows: ");
            System.out.print("> ");
            row = scanner.nextInt();
        }

        System.out.println("Enter a seat number in that row: ");
        System.out.print("> ");
        int seat = scanner.nextInt();

        while (seat > 9) {
            System.out.println("It won't be greater than 9, Enter the number of seats in each row: ");
            System.out.print("> ");
            seat = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Ticket price: $" + valorTicket(row, rows, columns));

        //print cordinates of seat

        String[][] matrix = new String[rows + 1][columns + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        matrix[i][j] = "  ";
                    } else {
                        matrix[i][j] = String.valueOf(j) + " ";
                    }
                } else if (j == 0) {
                    matrix[i][j] = String.valueOf(i) + " ";
                } else {
                    matrix[i][j] = "S ";
                }
            }
        }
        //print matrix
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row && j == seat) {
                    System.out.print("B ");
                }else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }

    }//main

    public static int valorTicket(int row, int rows, int columns) {
        int value = 0;
        if (rows * columns <= 60) {
            value = 10;
        } else if (row <= rows / 2) {
            value = 10;
        } else {
            value = 8;
        }
        return value;
    }
}//class