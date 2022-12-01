package Vinte;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conection {
		 
		 static final String URL = "jdbc:postgresql://localhost:5432/postgres";
		 static final String USER = "postgres";
		 static final String PASS = "postgres";
		 
		 public static Connection CriaConexao() throws ClassNotFoundException, SQLException{
			 Class.forName("");
			 Connection conecta = DriverManager.getConnection(URL, USER,PASS);
			 if (conecta != null) {
				 System.out.print("Successful");
				 return conecta;
			 }
			 return null;
		 }
}