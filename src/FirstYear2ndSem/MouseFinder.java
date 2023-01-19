package FirstYear2ndSem;

import java.awt.*;

public class MouseFinder {

    public static void main(String[] args) {

        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point mouseCoordinates = pointerInfo.getLocation();

        System.out.println(mouseCoordinates.getX() + " " + mouseCoordinates.getY());

    }

}
