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
                // Randomize between 1 and 9999 seconds
                int x = rand.nextInt(10000) + 1;
                // Randomize between 1 and 4 seconds
                int y = rand.nextInt(5) + 1;
                // Randomize between 1 and 4 seconds
                int z = rand.nextInt(5) + 1;

                // How long program waits till next iteration
                Thread.sleep(x);

                // Time to move the mouse! But make it spicy...
                // We don't want to go out of bounds, so lets do some logic using the screen size
                robot.mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / y, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / z);
            }

        // Mandatory catch because we're using AWT class
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
