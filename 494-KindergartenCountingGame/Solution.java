import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		if (!new Object(){}.getClass().getName().contains("Main"))
            try {   // redirect System.in and System.out to in/out text files
                System.setIn (new FileInputStream("data/uva0102.in.txt" ));
                System.setOut(new     PrintStream("data/uva0102.out.txt") );
        } catch (Exception e) {}   
		
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			
			String line = sc.nextLine();
			
			line = line.replaceAll("[^A-Za-z]"," ");
			String[] lines = line.split(" ");
			
	        String[] removedNull = Arrays.stream(lines)
	                .filter(value ->
	                        value != null && value.length() > 0 && value != " "
	                )
	                .toArray(size -> new String[size]);
			
			System.out.println(removedNull.length);
		}
	}
}