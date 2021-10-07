import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Texto1 {
	String FILE_NAME ="input.txt";
	String text="";
	String nuevoFichero="nuevo.txt";
	public void runAdvanced() throws IOException{
		FileReader input =null;
		File x= new File(FILE_NAME);
		String textInvertido="";
		FileWriter escritor = null;

		
		input = new FileReader(x);
		int c=0;

		while((c=input.read())!=-1 ){

			text+=(char)c;

		}
		
		for (int i=text.length()-1;i>=0;i--) {
			textInvertido = textInvertido + text.charAt(i);
		}

		escritor= new FileWriter(nuevoFichero);
		
		for (int i=0;i<=textInvertido.length()-1;i++) {
			escritor.write(textInvertido.charAt(i));
		}
		

		

		input.close();
		escritor.close();

	}
	public static void main(String[]args) throws IOException {
		Texto1 start = new Texto1();
		start.runAdvanced();
	}
}

