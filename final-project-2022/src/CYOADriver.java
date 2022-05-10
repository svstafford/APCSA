import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while (con == true) {
						
			System.out.print("Hello, what is your name?: ");
			String name = scan.nextLine();
			
			CYOAObject story = new CYOAObject(name);
			System.out.println(story.beginning());
			System.out.println(story.scenario1());
			
			String choice1 = scan.next().toLowerCase();
			
			
		}
	}

}
