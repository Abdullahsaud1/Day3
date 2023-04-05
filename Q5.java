import java.util.Scanner;

public class Q5 {

	
	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		System.out.println("Enter name : ");
        String name=Name.nextLine();
int lien = name.length();

for(int i =lien-1 ; i>=0; i--) {
	System.out.println(name.charAt(i));
	
}
}
	}
