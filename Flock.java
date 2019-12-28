import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Flock {
    static ArrayList<Bird> flock = new ArrayList<Bird>(10);
    String[] names = {"Oleg", "Jotaro", "Josce", "johny", "Joalin", "Jorno"};
    MyWindow w;

    public Flock(MyWindow w){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = (int) (50+Math.random()*150);
        int x0 = (int) (200 +Math.random()*600);
        int y0 = (int) (200 +Math.random()*400);
        System.out.println("x0: "+x0+" y0: "+y0+" r: "+r);
        for (int i = 0; i < n; i++){
            System.out.println("Choose a bird(1 - Macaw,2 - Penguin,3 - Vorobey)");
            int code = in.nextInt();
            if (code == 1){
                flock.add(new Macaw());
                System.out.println("Macaw added");
            }else if (code == 2) {
                flock.add(new Penguin());
                System.out.println("Penguin added");
            }else if (code == 3){
                flock.add(new Vorobey(r,x0,y0));
                System.out.println("Vorobey added");
            }
            System.out.println(flock.size());
            System.out.println();
                try{
                w.paintBird(flock.get(i));

            } catch (IndexOutOfBoundsException e){

                }
                if (i==n-1){
                    w.drawBorders();
                    w.drawOval(x0,y0,r);
                    System.out.println("borders");
                }

        }
    }

    public static void fly(){
        for(int i = 0; i < flock.size(); i++){
            flock.get(i).fly();
        }
    }
}