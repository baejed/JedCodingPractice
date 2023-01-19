package FirstYear2ndSem;

import java.awt.*;

public class GearShifter {

    public static void main(String args[]) throws AWTException, InterruptedException {

        int idleCheckingInterval = 0;
        double idleXCoordinate = 0, idleYCoordinate = 0;
        long start;
        PointerInfo pointerInfo;
        Point mouseCoordinates;
        Robot keyPresser = new Robot();


        while (true) {

            pointerInfo = MouseInfo.getPointerInfo();
            mouseCoordinates = pointerInfo.getLocation();

//            if (idleCheckingInterval == 10) {
//                idleCheckingInterval = 0;
//                if (idleXCoordinate == mouseCoordinates.getX() && idleYCoordinate == mouseCoordinates.getY()) {
//                    System.exit(0);
//                }
//                idleXCoordinate = mouseCoordinates.getX();
//                idleYCoordinate = mouseCoordinates.getY();
//            }

            if (mouseCoordinates.getX() <= 640 && mouseCoordinates.getY() <= 540) {
                keyPresser.keyPress(38);
            }

            Thread.sleep(100);

            idleCheckingInterval++;

        }

    }

}
