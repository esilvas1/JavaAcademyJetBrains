import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean comb1, comb2, comb3;
        comb1 = number1 != number2;
        comb2 = number2 != number3;
        comb3 = number1 != number3;
        
        System.out.print(comb1 && comb2 && comb3);
    }
}
