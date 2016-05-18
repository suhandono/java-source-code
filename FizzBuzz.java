import java.util.Scanner;
public class FizzBuzz{
	public int input;

	public String answer(int number){
		input = number;
		if(input%3==0)
			return "fizz";
		if(input%5==0)
			return "buzz";
		if(input%15==0)
			return "fizzbuzz";
		else return ""+input;
	}

	public static void main(String[] args){
		FizzBuzz fis = new FizzBuzz();
		System.out.println("please input number as you want: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println(fis.answer(number));
	}
}