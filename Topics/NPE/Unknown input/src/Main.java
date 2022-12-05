import java.util.Objects;

class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        String var = null;
        if (!Objects.equals(name, var)) {
            System.out.println(name.length());
        }
    }
}