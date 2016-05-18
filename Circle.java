import java.util.Scanner;
public class Circle{
	public double radius;

	public void Circle(){

	}

	public double getPerimeter(double x)
	{
		radius = x;
		return radius*2;
	}

	public double getArea(){
		return 3.14*(radius*radius);
	}

	public static void main(String[] args){
		Circle cir = new Circle();
		System.out.println("please input radius of circle: ");
		int r = new Scanner(System.in).nextInt();

		System.out.println("so this perimeter from your radius: ");
		System.out.println(cir.getPerimeter(r));

		System.out.println("so this area from your radius: ");
		System.out.println(cir.getArea());
	}
}