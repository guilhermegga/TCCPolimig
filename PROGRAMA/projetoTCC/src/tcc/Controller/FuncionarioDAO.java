package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import tcc.Model.Funcionario;

/**
 * @author Guilherme Garcia
 */
public class FuncionarioDAO {

    Connection con;

    public FuncionarioDAO(Connection con) {
        this.con = con;
    }

    public void cadastrarFuncionario(Funcionario func) throws Exception {    
        
        
        PreparedStatement p= con.prepareStatement("insert into funcionario()values()");
    }

}
