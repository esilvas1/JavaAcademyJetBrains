package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        // Write your code here

        String[][] matrix = roomConstruction();
        int option  = optionMenu();
        while (option != 0) {
            if (option == 1)  printMatrix(matrix);
            else if (option == 2) buyTicket(matrix);
            option  = optionMenu();
        }

    }//main

    public static int TicketValue(int row, int rows, int columns) {
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

    public static String[][] roomConstruction() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        System.out.print("> ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row: ");
        System.out.print("> ");
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows + 1][columns + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                if (i == 0 && j == 0) {
                    matrix[i][j] = " ";
                } else if (i == 0) {
                    matrix[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    matrix[i][j] = String.valueOf(i);
                } else {
                    matrix[i][j] = "S";
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int optionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a tickets");
        System.out.println("0. Exit");
        System.out.print("> ");
        int option = scanner.nextInt();
        return option;
    }


    public static void buyTicket(String[][] matrix) {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

        Scanner scanner = new Scanner(System.in);

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
        matrix[row][seat] = "B";
        System.out.println("Ticket price: $" + TicketValue(row, rows, columns));
        System.out.println();
    }

}//class