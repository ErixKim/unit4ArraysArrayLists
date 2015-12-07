// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    private char grid[][];
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        this.grid = new char[rows][cols];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = ' ';
            }
        }
    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = fill;
            }
        }
    }
    // Returns the number of rows in grid
    public int numRows()
    {
        int rows = 0;
        for (int i = 0; i < grid.length; i++)
        {
            rows += 1;
        }
        return rows;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        int columns = 0;
        for (int i = 0; i < grid[i].length; i++)
        {
            columns += 1;
        }
        return columns;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return grid[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        grid[row][col] = ch;
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        boolean space = false;
        if (grid[row][col] == ' ')
        {
            space = true;
        }
        return space;
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {

    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {

    }

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {

    }
}
