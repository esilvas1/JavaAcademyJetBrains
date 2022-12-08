package cinema;
import java.util.Scanner;
public class Cinema {

    public static void main(String[] args) {
        // Write your code here

        String[][] matrix = roomConstruction();
        int currentIncome = 0;
        int option  = optionMenu();

        while (option != 0) {

            if      (option == 1) printMatrix(matrix);
            else if (option == 2) currentIncome += buyTicket(matrix);
            else if (option == 3) printStatistics(numberOfPurchased(matrix), percentage(matrix), currentIncome, totalIncome(matrix));

            option  = optionMenu();
        }

    }

    public static int ticketValue(int row, int rows, int columns) {
        int value = 0;
        if (rows * columns <= 60) value = 10;
        else if (row <= rows / 2) value = 10;
        else value = 8;
        return value;
    }

    public static int totalIncome(String matrix[][]) {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        int totalIncome = 0;
        if (rows * columns <= 60) totalIncome = 10 * rows * columns;
        else totalIncome = (10 * (rows / 2) * columns) + (8 * ((rows / 2) + 1) *  columns);
        return totalIncome;
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
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.print("> ");
        int option = scanner.nextInt();
        return option;
    }


    public static int buyTicket(String matrix[][]){
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        int ticketPrice = 0;
        boolean selectTicket = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter a row number: ");
        System.out.print("> ");
        int row = scanner.nextInt();

        System.out.println("Enter a seat number in that row: ");
        System.out.print("> ");
        int seat = scanner.nextInt();

        while (row > rows || seat > columns) {
            System.out.println("Wrong input!");

            System.out.println("Enter a row number: ");
            System.out.print("> ");
            row = scanner.nextInt();

            System.out.println("Enter a seat number in that row: ");
            System.out.print("> ");
            seat = scanner.nextInt();
        }

            if (matrix[row][seat] == "B") {
                System.out.println("That ticket has already been purchased!");
                ticketPrice = buyTicket(matrix);
            } else {
                matrix[row][seat] = "B";
                System.out.println("Ticket price: $" + ticketValue(row, rows, columns));
                ticketPrice += ticketValue(row, rows, columns);
                System.out.println();
            }

        return ticketPrice;
      }

    public static void printStatistics(int numberOfPurchased, float percentage, int currentIncome, int totalIncome) {
        System.out.println();

        System.out.printf("Number of purchased tickets: %d%n", numberOfPurchased);
        System.out.printf("Percentage: %.2f%% %n", percentage);
        System.out.printf("Current income: $%d%n" , currentIncome);
        System.out.printf("Total income: $%d%n" , totalIncome);
        System.out.println();

    }

    public static float percentage(String[][] matrix) {

        float count = 0;
        float numberOfSeats;
        float percentage = 0;

        numberOfSeats = (matrix.length -1)  * (matrix[0].length - 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == "B") {
                    count++;
                }
            }
        }

        percentage = (count / numberOfSeats) * 100;
        return percentage;
    }

    public static int numberOfPurchased(String[][] matrix) {
        int numberOfPurchased = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == "B") {
                    numberOfPurchased++;
                }
            }
        }
        return numberOfPurchased;
    }
}//class