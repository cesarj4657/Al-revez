import java.io.*;

public class Texto {
	String FILE_NAME ="input.txt";
	String text=" ";

	public void runAdvanced(){
		FileReader input =null;
		File x= new File(FILE_NAME);
		String textInvertido="";
		try {

			input = new FileReader(x);
			int c=0;

			while((c=input.read())!=-1 ){

				text+=(char)c;

			}
			for (int i=text.length()-1;i>0;i--) {
				textInvertido = textInvertido + text.charAt(i);
			}
			System.out.println(textInvertido);

		}catch(FileNotFoundException ex) {
			System.out.println("Problems opening "+FILE_NAME);
		}catch(IOException ex) {
			System.out.println("Problems reading"+FILE_NAME);
		}finally {
			try {
				input.close();
			}catch(IOException ex) {
				System.out.println("Problemsclosing"+FILE_NAME);
			}
		}
	}
	public static void main(String[]args) {
		Texto start = new Texto();
		start.runAdvanced();
	}
}
