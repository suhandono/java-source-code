import java.util.Scanner;
import java.util.Arrays;
public class Countdown{

	public void Countdown(){

	}
	static int[] countdown(int start){
		
		int[] value = new int[start+1];
		int max = start;

		for(int i = 0; i<= start; i++){
			value[i] = max;
			max -= 1;
			
		}
		return value;


	}

	public static void main(String[] args){
	Scanner scan =new Scanner(System.in);
	System.out.println("please input value number: ");
	
	int input = scan.nextInt();
	System.out.println(input+">>"+Arrays.toString(countdown(input)));

	}
}