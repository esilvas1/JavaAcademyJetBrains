class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (array == null) {
            System.out.print("Exception!");
        } else {
            if (index < 0 || index > array.length) {
                System.out.print("Exception!");
            } else {
                System.out.print(array[index] *  array[index]);
            }
        }
    }
}