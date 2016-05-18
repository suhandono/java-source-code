import java.util.Scanner;
public class RomanNumerals{
	public void RomanNumerals(){

	}
	public String Convert(int number){
		String out = "";

		switch(number){
			case 1:  out = "I";
			case 2:  out = "II";
			case 3:  out = "III";
			case 4:  out = "IV";
			case 5:  out =  "V";
			case 6:  out = "VI";
			case 7:  out = "VII";
			case 8:  out = "VIII";
			case 9:  out = "IX";
			case 10: out = "X";
			case 11:  out = "XI";
			case 12:  out = "XII";
			case 13:  out = "XIII";
			case 14:  out = "XIV";
			case 15:  out =  "XV";
			case 16:  out =  "XVI";
			case 17:  out = "XVII";
			case 18:  out = "XVIII";
			case 19:  out = "XIX";
			case 20: out = "XX";
			default: System.out.println("undefine");
					}
		return out;


	}
	public static void main(String[] args){
		RomanNumerals roman = new RomanNumerals();
		Scanner scan = new Scanner(System.in);
		System.out.println("please input number as you want: ");
		int number = scan.nextInt();
		System.out.println(roman.Convert(number));
	}
}