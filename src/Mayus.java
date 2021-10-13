import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mayus {

	String texto1="text1.txt";
	String texto2="TEXT1.txt";
	File text1;
	
	private String convertMayus(String text) {
		return text.toUpperCase();
	}

	public void correr() throws IOException{
	
	
			BufferedReader entrada=new BufferedReader(new FileReader(texto1));
			BufferedWriter salida = new BufferedWriter(new FileWriter(texto2));
			
			String line =entrada.readLine();
			
			while(line!=null) {
				String text=this.convertMayus(line);
				salida.write(text,0,text.length());
				salida.newLine();
				line=entrada.readLine();
			}
			
			entrada.close();
			salida.close();


	}
	public static void main(String [] args) throws IOException {
		Mayus x = new Mayus();
		x.correr();
	}
}
