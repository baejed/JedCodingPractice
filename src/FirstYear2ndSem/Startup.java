package FirstYear2ndSem;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Startup {

    static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {

        //objects
        File chrome = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        File taskMgr = new File("C:\\WINDOWS\\system32\\Taskmgr.exe");
        Desktop desktop = Desktop.getDesktop();

        //variables
        String searchBarInput = "FACEBOOK.COM";
        String searchBarInput2 = "YOUTUBE.COM";

        desktop.open(taskMgr);
        desktop.open(chrome);

        Thread.sleep(400);

        typeInSearchBar(searchBarInput);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);

        typeInSearchBar(searchBarInput2);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_1);

    }

    public static void typeInSearchBar(String searchInput){

        for(int i = 0; i < searchInput.length(); i++){
            robot.keyPress(searchInput.charAt(i));
            robot.keyRelease(searchInput.charAt(i));
        }

    }

}
