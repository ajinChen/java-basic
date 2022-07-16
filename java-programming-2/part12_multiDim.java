public class part12_multiDim {
    public static void main(String[] args) {
        
        // Multi-dimension array
        int rows = 2;
        int columns = 3;
        int[][] twoDimensionArray = new int[rows][columns];

        // Iterate
        for (int row = 0; row < twoDimensionArray.length; row++) {
            for (int col = 0; col < twoDimensionArray[row].length; col++) {
                int val = twoDimensionArray[row][col];
                System.out.println(val);
            }
        }

    }
}
