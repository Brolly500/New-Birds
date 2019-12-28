import java.awt.*;

public class Bird {
    protected int x = 50;
    protected int y = 50;
    protected int size = 15;
    protected Color color = Color.red;


    public Bird(){

        System.out.println("Я птица!");
    }
    public void fly(){ //fly это метод, если стоит static - метод класса, если нет - метод объекта
        System.out.println("Я летаю!");
    }
}