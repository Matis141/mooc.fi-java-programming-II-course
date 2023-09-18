
import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        //MagicSquare ms = new MagicSquare(4);
        //ArrayList<Integer> sumsOfDiagonals = ms.sumsOfDiagonals();
        //System.out.println(sumsOfDiagonals);
        //MagicSquareFactory msFactory = new MagicSquareFactory();
        //System.out.println(msFactory.createMagicSquare(3));
        int[][] arr = {{1, 1}, {5, 7}};
        
        ArrayList<Integer> listOfDiagonalsSums = new ArrayList<Integer>();
        int firstSum = 0;
        int secondSum = 0;
        for (int row = 0; row < arr.length; row++) {
            firstSum += arr[row][row];
            secondSum += arr[row][arr.length-1-row];
            System.out.println(arr.length-1-row);
            System.out.println(arr.length-1-row);
            System.out.println(arr[arr.length-1-row][arr.length-1-row]);
        }
        System.out.println(firstSum);
        System.out.println(secondSum);
        listOfDiagonalsSums.add(firstSum);
        listOfDiagonalsSums.add(secondSum);
        System.out.println(listOfDiagonalsSums);
    }
}
