
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int currentNumber = 1;
        int row = 0;
        int col = size / 2;

        while (currentNumber <= size * size) {
            square.placeValue(col, row, currentNumber);
            currentNumber++;

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextCol, nextRow) == 0) {
                // Move one up and one right
                row = nextRow;
                col = nextCol;
            } else {
                // Move one down
                row = (row + 1) % size;
            }
        }
        return square;
    }

}
