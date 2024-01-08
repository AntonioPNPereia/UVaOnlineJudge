import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		if (!new Object(){}.getClass().getName().contains("Main"))
            try {   // redirect System.in and System.out to in/out text files
                System.setIn (new FileInputStream("data/uva0102.in.txt" ));
                System.setOut(new     PrintStream("data/uva0102.out.txt") );
        } catch (Exception e) {}   
		
		Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
        	
        	int farmers = sc.nextInt();
        	
        	Long total = 0L;
        	
        	for (int y = 0; y < farmers; y++) {
        		
        		Long size = sc.nextLong();
        		Long animals = sc.nextLong();
        		Long value = sc.nextLong();
        		
        		total+= size*value;
        		
        	}
        	System.out.println(total);	
        }     
        sc.close();
	}
}
