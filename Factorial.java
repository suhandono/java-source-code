import java.util.Scanner;
public class Factorial{
	public void Factorial(){

	}
	public int factorial(int n){
	if(n==0) return 1;
	else return factorial(n-1)*n;
	}
	public static void main(String[] args){
	Factorial fac = new Factorial();
	Scanner scan = new Scanner(System.in);
	System.out.println("pease input number below: ");
	int input = scan.nextInt();
	System.out.println(fac.factorial(input));
	}
}