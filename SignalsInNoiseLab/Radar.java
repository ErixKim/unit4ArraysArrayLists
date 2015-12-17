
/**
 * The model for radar scan and accumulator
 * 
 * @author @Eric Kim
 * @version 14 December 2015
 */
public class Radar
{
    
    // stores whether each cell triggered detection for the current scan of the radar
    // (true represents a detected monster, which may be a false positive)
    private boolean[][] currentScan;
    
    // value of each cell is incremented for each scan in which that cell triggers detection
    private int[][] accumulator;
    
    // location of the monster
    private int monsterLocationRow;
    private int monsterLocationCol;

    // probability that a cell will trigger a false detection (must be >= 0 and < 1)
    private double noiseFraction;
    
    // number of scans of the radar since construction
    private int numScans;

    /**
     * Constructor for objects of class Radar
     * 
     * @param   rows    the number of rows in the radar grid
     * @param   cols    the number of columns in the radar grid
     */
    public Radar(int rows, int cols)
    {
        // initialize the currentScan 2D array and the accumulator 2D array
        currentScan = new boolean[rows][cols];
        accumulator = new int[rows][cols];
        
        //
        // !!! add code here !!!

        noiseFraction = 0.05;
        numScans= 0;
    }
    
    /**
     * Performs a scan of the radar. Noise is injected into the grid and the accumulator is updated.
     * 
     */
    public void scan()
    {
        // algorithm for performing a scan:
        //    1. set all cells in the currentScan 2D array to false
        //    2. set the location of the monster in the currentScan 2D array
        //    3. inject noise into the grid
        //    4. update the accumulator 2D array based on the state of the currentScan 2D array
        //    5. increment the numScans instance variable
        
        //Step 1: Iterates through currentScan array list and sets each cell to no detections or false
        for (int i = 0; i < currentScan.length; i ++)
        {
            for (int j = 0; j < currentScan[i].length; j++)
            {
                // Sets each cell to false
                currentScan[i][j] = false;
            }
        }
        
        //Step 2: Sets the monster's row and column location by calling the setMonsterLocation method
        setMonsterLocation(monsterLocationRow , monsterLocationCol);
        
        //Step 3: Calls the injectNoise method
        injectNoise();
        //Iterates through the currentScan array list
        for (int i = 0; i < currentScan.length; i ++)
        {
            for (int j = 0; j < currentScan[i].length; j++)
            {
                if (currentScan[i][j] == true)
                {
                    //Step 4: Increments each detected location from the currentScan array list
                    //in the accumulator array list
                    accumulator[i][j] += 1;
                }
            }
        }
        
        //Step 5: Increments and keeps track of the number of times the scan method is called
        numScans += 1;
    }

    /**
     * Sets the location of the monster
     * 
     * @param   row     the row in which the monster is located
     * @param   col     the column in which the monster is located
     * @pre row and col must be within the bounds of the radar grid
     */
    public void setMonsterLocation(int row, int col)
    {
        // remember the row and col of the monster's location
        monsterLocationRow = row;
        monsterLocationCol = col;
        
        // update the radar grid to show that something was detected at the specified location
        currentScan[row][col] = true;
    }
    
     /**
     * Sets the probability that a given cell will generate a false detection
     * 
     * @param   fraction    the probability that a given cell will generate a flase detection expressed
     *                      as a fraction (must be >= 0 and < 1)
     */
    public void setNoiseFraction(double fraction)
    {
        noiseFraction = fraction;
    }
    
    /**
     * Returns true if the specified location in the radar grid triggered a detection.
     * 
     * @param   row     the row of the location to query for detection
     * @param   col     the column of the location to query for detection
     * @return true if the specified location in the radar grid triggered a detection
     */
    public boolean isDetected(int row, int col)
    {
        return currentScan[row][col];
    }
    
    /**
     * Returns the number of times that the specified location in the radar grid has triggered a
     *  detection since the constructor of the radar object.
     * 
     * @param   row     the row of the location to query for accumulated detections
     * @param   col     the column of the location to query for accumulated detections
     * @return the number of times that the specified location in the radar grid has
     *          triggered a detection since the constructor of the radar object
     */
    public int getAccumulatedDetection(int row, int col)
    {
        return accumulator[row][col];
    }
    
    /**
     * Returns the number of rows in the radar grid
     * 
     * @return the number of rows in the radar grid
     */
    public int getNumRows()
    {
        return currentScan.length;
    }
    
    /**
     * Returns the number of columns in the radar grid
     * 
     * @return the number of columns in the radar grid
     */
    public int getNumCols()
    {
        return currentScan[0].length;
    }
    
    /**
     * Returns the number of scans that have been performed since the radar object was constructed
     * 
     * @return the number of scans that have been performed since the radar object was constructed
     */
    public int getNumScans()
    {
        return numScans;
    }
    
    /**
     * Sets cells as falsely triggering detection based on the specified probability
     * 
     */
    private void injectNoise()
    {
        // The noiseFraction instance variable is the probability that a given cell will be
        // detected as a false positive. Use the Math.random method to determine if each cell should be set
        // as a false positive.
        
        //
        double num;
        // Iterate through all cells in the currentScan 2D array to inject noise by setting false positives.
        for (int i = 0; i < currentScan.length; i++)
        {
            for (int j = 0; j < currentScan[i].length; j++)
            {
                num = Math.random();
                // Determines whether the current cell should be set to a false positive
                if (num <= noiseFraction)
                {
                    //Sets the cell to a false positive
                    currentScan[i][j] = true;
                }
            }
        }
        
    }
    
}
