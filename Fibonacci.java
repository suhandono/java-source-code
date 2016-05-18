import java.util.Scanner;
public class Fibonacci{
	public static int fibonacci(int n){
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);

	}
	public static void main(String[] args){
		System.out.println("Please enter fibonacci number as you want: ");
		int input = new Scanner(System.in).nextInt();
		for(int i = 1; i<=input; i++){
			System.out.print(fibonacci(i)+" ");
		}



	}
}