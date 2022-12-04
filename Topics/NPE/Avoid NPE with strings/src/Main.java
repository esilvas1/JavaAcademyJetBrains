import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static String concatStrings(String str1, String str2) {
        /* write your code here */
        String var = null;
        String varReturn = "";

        if (!Objects.equals(var, str1) && !Objects.equals(var, str2)) varReturn = str1.concat(str2);
        else if (Objects.equals(var, str1) && Objects.equals(var, str2)) varReturn = "";
        else if (!Objects.equals(var, str1) && Objects.equals(var, str2)) varReturn = str1;
        else if (Objects.equals(var, str1) && !Objects.equals(var, str2)) varReturn = str2;

        return varReturn;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}