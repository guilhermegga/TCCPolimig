package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.Dependentes;

/**
 * @author Guilherme Garcia
 */
public class DependenteDAO {

    Connection conn;

    public DependenteDAO(Connection con) {
        this.conn = con;
    }

    public void cadastrarDependente(Dependentes depend) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("INSERT INTO `dependentes`( `codMorador`, `rgDependente`, `cpfDependete`, `nomeDependente`, `dataNacDep`, `nacionDependente`, `naturDependente`) VALUES (?,?,?,?,?,?,?")) {
            p.setInt(1, depend.codMoradorFK);
            p.setString(2, depend.rgDependente);
            p.setString(3, depend.cpfDependente);
            p.setString(4, depend.nomeDependente);
            p.setString(5, depend.dataNascDepend);
            p.setString(6, depend.nacionDependente);
            p.setString(7, depend.naturDependente);
            p.executeUpdate();
        }
    }

    public void atualizarDependente(Dependentes depend) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("UPDATE `dependentes` SET `codMorador`=?,`rgDependente`=?,`cpfDependete`=?,`nomeDependente`=?,`dataNacDep`=?,`nacionDependente`=?,`naturDependente`=? WHERE codDependente=?")) {
            p.setInt(1, depend.codMoradorFK);
            p.setString(2, depend.rgDependente);
            p.setString(3, depend.cpfDependente);
            p.setString(4, depend.nomeDependente);
            p.setString(5, depend.dataNascDepend);
            p.setString(6, depend.nacionDependente);
            p.setString(7, depend.naturDependente);
            p.setInt(8, depend.codDependente);
            p.executeUpdate();
        }
        
    }

    public void deletarDependente(Dependentes depend) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("DELETE FROM `dependentes` WHERE codDependente=?")) {
            p.setInt(1, depend.codDependente);
            p.executeUpdate();
        }
    }

    
    public ResultSet listarDependente() throws Exception {

        PreparedStatement p = conn.prepareStatement("select * from dependentes");

        ResultSet resultado= p.executeQuery();
        
        return resultado;
    }
    
}
