
public class Program {

    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                builder.append(value);
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    
    public static void main(String[] args) {
        // Test your method here
    }

}
