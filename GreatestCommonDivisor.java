import java.util.Scanner;
public class GreatestCommonDivisor{
	public void GreatestCommonDivisor(){

	}
	public int calcGCD(int number1, int number2){
		int dividend = number1;
		int divisor = number2;
		int remainder = dividend%divisor;
		int quotient = (dividend-remainder)/divisor;
		if(remainder!=0){
			System.out.println(" "+dividend+"="+divisor+"*"+quotient+"+"+remainder);
			return calcGCD(divisor,remainder);
		}
		else return divisor;
	}
	public static void main(String[] args){
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		Scanner scan = new Scanner(System.in);
		System.out.println("please input number divisor and divident below: ");
		int divident = scan.nextInt();
		int divisor = scan.nextInt();
		System.out.println("so GCD is : "+ gcd.calcGCD(divident,divisor));
	}
}