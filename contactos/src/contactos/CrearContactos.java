package contactos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class CrearContactos {
	//static ArrayList<Contacto> contactos=new ArrayList();
	static Contacto c;
	public static void main(String[] args) throws IOException, InterruptedException {
		
	}
	public static void crear() throws IOException {
		File f = new File("C://Users//TRIGO//Desktop//BBDD MailSystem//ContactosJava.csv");
		File f2 = new File("LOGContacto.txt");
		if(!f2.exists()) {
			f2.createNewFile();
		}
		FileWriter fw = new FileWriter(f2);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String linea;
		while ((linea = br.readLine()) != null) {
			String aux[] = linea.split(";");
			System.out.println("array Length "+aux.length);
			for(int i=0;i<aux.length;i++) {
				aux[i]=aux[i].replaceAll("\"", "");
				aux[i]=aux[i].replaceAll(",", "");

				System.out.print(aux[i]+" | ");
			}
			System.out.println();
			if(aux.length>7) {
				
			try {
			if(aux[3].isEmpty()) {
					aux[3]=aux[6];
			}
			else {
				aux[3]=null;
				aux[6]=null;
			}
			if(aux[2].isEmpty()) {
				aux[2]=aux[4];
			}
			
			for(int i=0;i<aux.length;i++) {
				System.out.print(aux[i]+" | ");
			}
			c = new Contacto(aux[3],aux[2],aux[5],aux[7],aux[0],aux[1]);
			CrearBBDD.insertarContacto(c);

			}
		
			catch(Exception e) {
				e.printStackTrace();
				fw.write(linea);
				
			}
			}
			else if(aux.length>2){
				try {
					c = new Contacto(null,aux[2],null,null,aux[0],aux[1]);
					CrearBBDD.insertarContacto(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					fw.write(linea);

				}
			}

		}
		fw.close();
	}

}
