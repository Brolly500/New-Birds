import java.awt.*;

public class Macaw extends Bird {
    public String name = "Флекс";
    static boolean addedCoordinates = false;
    static int minX;
    static int minY;
    static int maxX;
    static int maxY;

    private void setCoordinates(int x, int y){
        System.out.println("Coordinates added");
        minX = x;
        minY = y;
        maxX = x+size;
        maxY = y+size;
    }

    public Macaw() {
        //this.name = name;
        //System.out.println("Я попугай" + name + "!");
        x = (int) (Math.random()*750);
        y = (int) (Math.random()*750);
        color = Color.red;

        if (addedCoordinates == true){
            if (x<minX) {
                minX = x;
            }
            if (y<minY) {
                minY=y;
            }
            if (x+size>maxX){
                maxX=x+size;
            }
            if (y+size>maxY){
                maxY=y+size;
            }}
            else{
                addedCoordinates = true;
                setCoordinates(x,y);
            }
        }


    public void speak() {
        System.out.println("Меня зовут " + this.name + "!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(Macaw m) {
        System.out.println("Привет," + m.getName() + "! Меня зовут " + name + ".");
    }

    private static int num = 0;

    public Macaw(int num) {
        this.num = num;
        num = num + 1;
        System.out.println("Нас " + num + "!");
    }
}