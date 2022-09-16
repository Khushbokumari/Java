import java.util.Scanner;

public class Counts {
	//private static Scanner sc;
	public static void main(String[] args) {
		String st;
		int i, totalWords;
		totalWords = 1;
		char Gh_ch;
		
		 Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to Count Words =  ");
		st = sc.nextLine();
		
		for(i = 0; i < st.length(); i++)
		{
			Gh_ch = st.charAt(i);
			if((Gh_ch == ' ' ) || Gh_ch == '\t') {
				totalWords++;
			}
		}		
		System.out.println("\nTotal Number of Words  =  " + totalWords);
	}
}