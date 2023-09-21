/*/
@Author: Z41N
 */


import java.awt.*;
import java.util.Random;

public class sleepytime {
    public static void main(String[] args) {
        moveMouse();
    }

    public static void moveMouse()
    {
        Random rand = new Random();

        try {
            Robot robot = new Robot();
            while (true)
            {
                // Randomize between 1 and 9999 milliseconds
                int sleepTimeInMillis = rand.nextInt(10000) + 1;

                // Randomize between values 1 and 4
                // Used only for division math so we can randomize where the pointer goes
                int widthModifier = rand.nextInt(5) + 1;
                int heightModifier = rand.nextInt(5) + 1;

                // How long program waits till next iteration
                Thread.sleep(sleepTimeInMillis);

                // Time to move the mouse! But make it spicy...
                // We don't want to go out of bounds, so lets do some logic using the screen size
                robot.mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / widthModifier, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / heightModifier);
            }

        // Mandatory catch because we're using AWT class
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
