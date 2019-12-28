import java.awt.*;


public class Vorobey extends Bird {
    static boolean addedCoordinates = false;
    static int minX;
    static int minY;
    static int maxX;
    static int maxY;
    static int R2;
    static int Y;
    static int x0;
    static int y0;


    private void setCoordinates(int x, int y) {
        System.out.println("Coordinates added");
        minX = x;
        minY = y;
        maxX = x + size;
        maxY = y + size;


    }

    public Vorobey(int r, int x0, int y0) {


        R2 = r*r;
        x = (int) ((x0-r)+(Math.random() * (r*2)));
        color = Color.gray;
        if (x0-x<=0) y= (r^2)-((x0-x)^2);

        else y = (r^2)-(x-x0)^2;
        System.out.println((r^2)-((x0-x)^2));
        System.out.println("y without  sqrt: "+y);
        y= (int) Math.sqrt(y);
        y=y+y0;
        System.out.println((r^2)+" r|x-x0  "+ ((x-x0)^2));
        System.out.println(x+" "+y);

        if (addedCoordinates == true) {
            if (x < minX) {
                minX = x ;
            }
            if (y < minY) {
                minY = y ;
            }
            if (x + size > maxX) {
                maxX = x + size ;
            }
            if (y + size > maxY) {
                maxY = y + size ;
            }
        }
        else{
            addedCoordinates = true;
            setCoordinates(x,y);
        }
    }
    public void fly() {
        System.out.println("I can fly ");
    }
}
