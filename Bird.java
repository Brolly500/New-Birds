import java.awt.*;

public class Bird {
    protected int x = 50;
    protected int y = 50;
    protected int size = 15;
    protected Color color = Color.red;


    public Bird(){

        System.out.println("� �����!");
    }
    public void fly(){ //fly ��� �����, ���� ����� static - ����� ������, ���� ��� - ����� �������
        System.out.println("� �����!");
    }
}