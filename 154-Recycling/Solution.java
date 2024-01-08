import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		if (!new Object(){}.getClass().getName().contains("Main"))
			
            try {   // redirect System.in and System.out to in/out text files
                System.setIn (new FileInputStream("data/uva0102.in.txt"));
                System.setOut(new PrintStream("data/uva0102.out.txt"));

        } catch (Exception e) {
        	e.printStackTrace();
        }   
		
		Scanner sc = new Scanner(System.in);
		char letra = 'e';
		char acabar = '#';
		
		String line = sc.nextLine();
		
		while (sc.hasNextLine() && line.charAt(0) != acabar) {
			
			ArrayList<String[]> lista = new ArrayList<String[]>();

			while(line.charAt(0) != letra) {
				
				lista.add(line.split(","));		
				line = sc.nextLine();
			}
			
			line = sc.nextLine();
			
			int maior = 0;
			
			int escolhido = 0;
			
			if (lista.size() > 2) {
				for (int i=0; i<lista.size(); i++) {

					int valor = igualdade(lista);
					if (valor > maior) {
						maior = valor;
						escolhido = i+1;
					}
					
					String [] temp = lista.get(0);
					lista.remove(0);
					lista.add(temp);
					
				}
			}
			else {
				escolhido = 1;
			}
			System.out.println(escolhido);
			
		}
	}
	
	public static int igualdade (ArrayList<String[]> lista) {
		
		int resultado = 0;
			
		for (int i=0; i<lista.get(0).length; i++) {
					
			for (int y=1; y<lista.size(); y++) {
					
				for (int z=0; z<lista.get(0).length; z++) {
						
					if(lista.get(y)[z].equals(lista.get(0)[i])) {

						resultado += 1;
					}
				}
			}
		}
		return resultado;
	}
}
