import java.util.Scanner;

public class Q4 {

	
	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		System.out.println("Enter name : ");
        String name=Name.nextLine();
int lien = name.length();

for(int i =0 ; i<=lien -1; i++) {
	System.out.println(name.charAt(i));
	
}
}
	}


