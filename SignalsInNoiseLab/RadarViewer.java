import javax.swing.JFrame;
import java.util.Scanner;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @Eric Kim
 * @version 14 December 2015
 */
public class RadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        final int ROWS = 100;
        final int COLS = 100;
        // Creates a radar that is in a 100 x 100 grid
        Radar radar = new Radar(ROWS, COLS);
        radar.setNoiseFraction(0.10);
        // Runs the scan method in the radar class
        radar.scan();
        JFrame frame = new JFrame();
        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creates a scanner variable in order to receive user input on the monster's row and column
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to choose the monster's location? (y/n) ");
        String choice = scan.next();
        if (choice.equals("y"))
        {
            System.out.println("What's the monster's row");
            int monsterLocationRow = scan.nextInt();
            System.out.println("What's the monster's column");
            int monsterLocationColumn = scan.nextInt();
            // Sets the monster's location by calling the setMonsterLocation method in the Radar class
            radar.setMonsterLocation(monsterLocationRow, monsterLocationColumn);
        }
        else
        {
            //randomly set the location of the monster
            radar.setMonsterLocation((int)(Math.random() * 100), (int)(Math.random() * 100));
        }
        
        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);
        frame.add(component);

        // set the size of the frame to encompass the contained component
        frame.pack();

        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);

        // perform 100 scans of the radar wiht a slight pause between each
        // after each scan, instruct the Java Run-Time to redraw the window
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)

            radar.scan();

            frame.repaint();
        }
    }

}
