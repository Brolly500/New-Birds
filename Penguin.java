import java.awt.*;
import javax.swing.*;

public class Penguin extends Bird {
            static boolean addedCoordinates = false;
            static int minX;
            static int minY;
            static int maxX;
            static int maxY;
            private void setCoordinates(int x, int y){
                 System.out.println(" Coordinates added");
                 minX = x;
                 minY = y;
                 maxX = x+size;
                 maxY= y+size;
    }

    public Penguin() {
        x = (int) (Math.random() * 750);
        y = (int) (Math.random() * 750);
        color = Color.blue;
        int size = 10;
        System.out.println("I`m peguin");

        if (addedCoordinates == true) {
            if (x < minX) {
                minX = x;
            }
            if (y < minY) {
                minY = y;
            }
            if (x + size > maxX) {
                maxX = x + size;
            }
            if (y + size > maxY) {
                maxY = y + size;
            }}
            else{
                addedCoordinates=true;
                setCoordinates(x, y);
            }
        }


    public void fly() {
        System.out.println("I can`t fly ");
    }
}
