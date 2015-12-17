import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author Eric Kim
 * @version 14 December 2015
 */
public class RadarTest
{
    /** description of instance variable radar*/
    // Creates a radar instance variable with class Radar
    private Radar radar;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        //Constructs a new radar with a 100 x 100 grid
        this.radar = new Radar(100,100);

    }

    /**
     * Tests to see if radar with monster location (23,50) is found
     *
     * 
     */
    @Test
    public void test1()
    {
        //Calls the setMonsterLocation method in the radar class to set the monster location at (23,50)
        radar.setMonsterLocation(23,50);
        double noiseFraction = 0.05;
        //Calls the scan method in the radar class 100 times
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        int largest = 0;
        int x = 0;
        int y = 0;
        //Finds the location with the highest number of detections which is the location of the monster
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                //Calls the getAccumulatedDetection method in the radar class to get the number of
                //detections
                int n = this.radar.getAccumulatedDetection(i,j);
                if (n > largest)
                {
                    largest = n;
                    x = i;
                    y = j;
                }
            }
        }
        //Checks if the actual location matches with the expected location
        assertEquals(x,23);
        assertEquals(y,50);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void test2()
    {
        //Calls the setMonsterLocation method in the radar class to set the monster location at (35,20)
        radar.setMonsterLocation(35,20);
        double noiseFraction = 0.05;
        //Calls the scan method in the radar class 100 times
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        int largest = 0;
        int x = 0;
        int y = 0;
        //Finds the location with the highest number of detections which is the location of the monster
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                //Calls the getAccumulatedDetection method in the radar class to get the number of
                //detections
                int n = this.radar.getAccumulatedDetection(i,j);
                if (n > largest)
                {
                    largest = n;
                    x = i;
                    y = j;
                }
            }
        }
        //Checks if the actual location matches with the expected location
        assertEquals(x,35);
        assertEquals(y,20);
    }

}
