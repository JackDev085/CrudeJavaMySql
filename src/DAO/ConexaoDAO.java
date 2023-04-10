package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

	public Connection conectaDB() {
		Connection conexao = null;
		
		try {
			String url = "jdbc:mysql://localgost:3306/test?user=root&password=";
			conexao = DriverManager.getConnection(url);
		} catch (SQLException erro) {
			JOptionPane.showConfirmDialog(null, erro.getLocalizedMessage());
		}
		return conexao;
	}
}
