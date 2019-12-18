package contactos;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public interface Conexion {
	    //String url       = "jdbc:mysql://82.98.177.200:3306/contactos_crm";
    	//String user      = "trigo_";
    	//String password  = "Trigo2018";

		String url		 = "jdbc:mysql://localhost:3306/contactos";
	    String user 	 = "root";
	    String password = "";
	    
}

