
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int row = 0;
        int column = size/2;
        int i = 1;
        square.placeValue(column, row, i);
        i++;
        int previousRow=0;
        int previousColumn=0;

        while (i < (size*size) +1) {
            System.out.println(square);
            previousRow = row;
            previousColumn = column;
            row--;
            if (row < 0) {
                row = square.getHeight() - 1;
            }
            System.out.println("row: " + row);
            column++;
            if (column > square.getWidth() - 1) {
                column = 0;
            }
            if (column < 0) {
                column = square.getWidth() -1;
            }
            System.out.println("column: " + column);
            if (square.readValue(column, row) != 0) {
                System.out.println("dupa");
                row = previousRow + 1;
                column = previousColumn;
                if (row > square.getHeight()-1) {
                    row = 0;
                }
            }
            
            if (square.readValue(column, row) == 0) {
                square.placeValue(column, row, i);
                i++;
            }
        }
        
        return square;
    }

}
