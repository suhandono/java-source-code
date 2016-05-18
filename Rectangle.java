import java.util.Scanner;
public class Rectangle{
    public int length, width;

    public void Rectangle(){

    }

    
    public double getPerimeter(int x, int y)
    {
        length = x;
        width = y;
        return x*2+y*2;
    }
    
    public double getArea()
    {
        return length*width;
    }
    
    public static void main(String[] args){

        Rectangle rec = new Rectangle();

        System.out.println("input width value: ");
        int x = new Scanner(System.in).nextInt();

        System.out.println("input length value: ");
        int y = new Scanner(System.in).nextInt();

        System.out.println("so you get the perimeter is: ");
        System.out.println(rec.getPerimeter(x,y));

        System.out.println("so you getArea is: ");
        System.out.println(rec.getArea());





    }
}