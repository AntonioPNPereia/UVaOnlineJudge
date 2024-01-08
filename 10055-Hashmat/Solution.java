import java.awt.List;
import java.io.FileInputStream;
import java.io.PrintStream;
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

		while (sc.hasNextLong()) {
			long value1 = sc.nextLong();
			long value2 = sc.nextLong();
			
			System.out.println(Math.abs(value1 - value2));
		}		
	}
}