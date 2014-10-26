package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import tcc.Model.RegistroCham;

/**
 * @author Guilherme Garcia
 */
public class RegChamadoDAO {
    
    Connection conn;

    public RegChamadoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserirChamado(RegistroCham regCham) throws Exception{
        PreparedStatement p = conn.prepareStatement("INSERT INTO `registrochamado`( `codMorador`, `codFuncionario`, `dataChamado`, `horaChamado`, `descChamado`, `destinoChamado`, `statusChamado`) VALUES (?,?,?,?,?,?,?)");
        
        p.setInt(1, regCham.codMoradorFK);
        p.setInt(2, regCham.codFuncFK);
        p.setString(3,regCham.dataChamado);
        p.setString(4, regCham.horaChamado);
        p.setString(5, regCham.descrChamado);
        p.setString(6, regCham.destChamado);
        p.setString(7, regCham.statusChamado);
        p.executeUpdate();
        p.close();
        
    }
    
    public void atualizaStatus(RegistroCham regCham)throws Exception{
    
        PreparedStatement p = conn.prepareStatement("UPDATE `registrochamado` SET `statusChamado`=? WHERE`codChamado`=?");
        p.setString(1,regCham.statusChamado);
        p.setInt(2, regCham.codChamado);
        p.executeUpdate();
        p.close();
    }

}
