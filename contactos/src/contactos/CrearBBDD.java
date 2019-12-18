package contactos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.mysql.jdbc.*;
import java.sql.*;

public class CrearBBDD implements Conexion{
	private static java.sql.Connection connection;
	static java.sql.Statement st;
	public static void main(String[] args) throws IOException, SQLException {
		CrearConexion();
		CrearContactos.crear();

	}
	public static void CrearConexion() {
		try {
		    // create a connection to the database
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    connection = DriverManager.getConnection(url, user, password);
		    st = connection.createStatement();

		    System.out.println("Conexion OK");  
		} catch(SQLException e) {
		   System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void insertarContacto(Contacto c) throws SQLException, IOException {
		File f = new File("LOGBD.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
	    	  try {
	    	  st.executeUpdate("INSERT INTO contacto (phone,email,company,country,first_name,last_name) VALUES ("
	    			  +"'"+c.getPhone()
	    			  +"','"+c.getEmail() 
	    			  +"','"+c.getCompany() 
	    			  +"','"+c.getCountry() 
	    			  +"','"+c.getFirst_name()
	    			  +"','"+c.getLast_name()+"');");
	    	  }
	    	  catch(Exception e) {
	    		  System.out.println("Error con : "+c.getEmail());
	    		  fw.write(c.getPhone()
	    			  +" "+c.getEmail() 
	    			  +" "+c.getCompany() 
	    			  +" "+c.getCountry() 
	    			  +" "+c.getFirst_name()
	    			  +" "+c.getLast_name()+"\n");
	    	  }
	    	  fw.close();
	      
	      //connection.close();


	}
	

}
