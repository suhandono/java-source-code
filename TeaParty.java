import java.util.Scanner;
public class TeaParty{
	String input;
	public void TeaParty(){

	}

	public String welcome(String lastName, boolean isWoman, boolean isSir){
		if(isWoman==true)
			return "Woman";
		if(isSir==true)
			return "Knight";
		else return "Man";
	}

	public static void main(String[] args){
	TeaParty tea = new TeaParty();
	System.out.println("The welcome message follow the pattern: ");
	Scanner scan = new Scanner(System.in);
	String arguments = scan.nextLine();
     Scanner n = new Scanner(arguments).useDelimiter("\\s\\s*");
     String sayHello = n.next();
     String title1 = n.next();
     String lastName = n.next();
     String title2 = n.next();
     boolean sir;
     boolean gender;
     if(title2=="sir")
     	sir = true;
     else sir = false;

     if(title1=="Mr")
     	gender = true;
     else gender = false;

    System.out.println(lastName+" "+tea.welcome(lastName, gender, sir));



	}

}