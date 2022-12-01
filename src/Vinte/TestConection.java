package Vinte;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConection {

	public static void main(String[] args) {
		try {
			Connection c = Conection.CriaConexao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}