package tcc.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Guilherme Garcia
 */
public class Conexao {
    
    public Connection getConexao()throws SQLException{
        
        return DriverManager.getConnection("jdbc:mysql://localhost/banco","root","");
    }

}
