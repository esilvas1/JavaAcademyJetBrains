
class ArrayOperations {
    
    public static int[][][] createCube() {
        // write your code here
        final int rows = 3;
        final int columns = 3;
        final int elements = 3;
        int[][][] createCube = new int[rows][columns][elements];
        int value = 0;
        for (int i = 0; i < createCube.length; i++) {
            for (int j = 0; j < createCube[i].length; j++) {
                for (int k = 0; k < createCube[i][j].length; k++) {
                    createCube[i][j][k] = value;
                    value++;
                }
            }
            value = 0;
        }
        return createCube;
    }
}
