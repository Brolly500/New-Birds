import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class MyWindow extends JFrame {
    private Flock f;



    public MyWindow () {
        this.setSize(900, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void paint(Graphics g){
    }

    public void paintBird(Bird b){
        Graphics g = this.getGraphics();
        g.setColor(b.color);
        g.fillOval(b.x,b.y,b.size,b.size);
        System.out.println("printed");
       // repaint();
    }
    public void drawBorders() {
        Graphics g = this.getGraphics();
        g.setColor(Color.black);
        g.drawLine(Penguin.minX, Penguin.minY, Penguin.maxX, Penguin.minY);
        g.drawLine(Penguin.minX, Penguin.minY, Penguin.minX, Penguin.maxY);
        g.drawLine(Penguin.minX, Penguin.maxY, Penguin.maxX, Penguin.maxY);
        g.drawLine(Penguin.maxX, Penguin.minY, Penguin.maxX, Penguin.maxY);
        System.out.println(Penguin.maxX +" "+ Penguin.maxY+ " " + Penguin.minX+ " " + Penguin.minY);
        g.setColor(Color.green);
        g.drawLine(Macaw.minX, Macaw.minY, Macaw.maxX, Macaw.minY);
        g.drawLine(Macaw.minX, Macaw.minY, Macaw.minX, Macaw.maxY);
        g.drawLine(Macaw.minX, Macaw.maxY, Macaw.maxX, Macaw.maxY);
        g.drawLine(Macaw.maxX, Macaw.minY, Macaw.maxX, Macaw.maxY);

        g.setColor(Color.gray);
        g.drawLine(Vorobey.minX, Vorobey.minY, Vorobey.maxX, Vorobey.minY);
        g.drawLine(Vorobey.minX, Vorobey.minY, Vorobey.minX, Vorobey.maxY);
        g.drawLine(Vorobey.minX, Vorobey.maxY, Vorobey.maxX, Vorobey.maxY);
        g.drawLine(Vorobey.maxX, Vorobey.minY, Vorobey.maxX, Vorobey.maxY);



    }
    public void drawOval(int x0,int y0,int r){
        System.out.println("cordinates of oval "+x0+" "+y0+" "+r);
        Graphics g = this.getGraphics();
        g.setColor(Color.gray);
        g.drawOval(x0-r,y0-r,r*2,r*2);
        g.drawLine(x0-r,y0,x0+r,y0);
    }



}

