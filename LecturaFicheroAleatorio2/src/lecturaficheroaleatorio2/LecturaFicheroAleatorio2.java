package lecturaficheroaleatorio2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LecturaFicheroAleatorio2 {
	  public static void main(String[] args) throws IOException {     
		  
		   try {
			   File fichero = new File ("C:\\Users\\anavarro\\eclipse-workspace\\LecturaFicheroAleatorio2\\src\\lecturaficheroaleatorio2\\Texto.txt");
			   File ficheroEsc = new File("C:\\Users\\anavarro\\eclipse-workspace\\LecturaFicheroAleatorio2\\src\\lecturaficheroaleatorio2\\Texto2.txt");
			   
			   RandomAccessFile file = new RandomAccessFile(fichero, "r");
			   RandomAccessFile fileRes = new RandomAccessFile(ficheroEsc, "rw");
			   
			   for(int i=(int)file.length()-1 ; i>=0 ; i-=1) {
				   file.seek(i);
				   fileRes.write(file.read());
			   }
			   
			   file.close();
			   fileRes.close();
			   }catch(IOException e) {
				   e.printStackTrace();
			   }
		   
		   }
		}
