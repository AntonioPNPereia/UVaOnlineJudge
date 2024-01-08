import java.awt.List;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		if (!new Object(){}.getClass().getName().contains("Main"))
            try {   // redirect System.in and System.out to in/out text files
                System.setIn (new FileInputStream("data/uva0102.in.txt" ));
                System.setOut(new     PrintStream("data/uva0102.out.txt") );
        } catch (Exception e) {}   
		
		Scanner sc = new Scanner(System.in);
		
		int TotalRows = Integer.valueOf(sc.nextLine());
		
		while (TotalRows != 0) {
			int SmallestNumber = 25;
			int Spaces = 0;
			
			ArrayList<Integer> SpaceArray = new ArrayList<Integer>();
			
			for(int i = 0; i < TotalRows; i++) {
				

				String Row = sc.nextLine();
				int spaceCount = Row.split(" ").length - 1;
				
				SpaceArray.add(spaceCount);
				
				if (spaceCount < SmallestNumber) {
					SmallestNumber = spaceCount;
				}
			}
			
			for(int i = 0; i < SpaceArray.size(); i++) {
				Spaces += SpaceArray.get(i) - SmallestNumber;
			}
			
			System.out.println(Spaces);
			
			TotalRows = Integer.valueOf(sc.nextLine());
		}	
	}
}
