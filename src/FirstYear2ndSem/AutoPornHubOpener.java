package FirstYear2ndSem;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.Key;

public class AutoPornHubOpener {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {

        //objects
        Robot robot = new Robot();
        File chrome = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        Desktop desktop = Desktop.getDesktop();

        //variables
        String searchBarInput = "PORNHUB.COM";

        desktop.open(chrome);

        Thread.sleep(100);

        robot.keyPress(17);
        robot.keyPress(16);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(17);
        robot.keyRelease(16);
        robot.keyRelease(KeyEvent.VK_N);

        for(int i = 0; i < searchBarInput.length(); i++){
            robot.keyPress(searchBarInput.charAt(i));
            robot.keyRelease(searchBarInput.charAt(i));
        }

        robot.keyPress(KeyEvent.VK_ENTER);

    }

}
