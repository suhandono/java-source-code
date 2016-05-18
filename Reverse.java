import java.io.*;
import java.util.*;
public class Reverse{
	public static void main(String[] args){
		String input ="";
		System.out.println("please input argument below: ");
		try
		{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			input = buffer.readLine();
			char[] reverse = input.toCharArray();
			for(int i =reverse.length-1;i>=0;i--){
			System.out.print(reverse[i]);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}