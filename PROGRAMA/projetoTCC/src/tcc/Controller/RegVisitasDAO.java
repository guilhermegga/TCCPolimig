package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.RegVisitas;

/**
 * @author Guilherme Garcia
 */
public class RegVisitasDAO {
    
    Connection conn;

    public RegVisitasDAO(Connection conn) {
        this.conn = conn;
    }

    public void cadastrarRegVisita(RegVisitas regVisi) throws Exception{
    
        PreparedStatement p =conn.prepareStatement("INSERT INTO `regvisitas`(`codVisitante`, `codApartamento`, `dataVisita`, `horaEntrada`, `dataSaida`, `horaSaida`) VALUES (?,?,?,?,?,?)");
        
        p.setInt(1, regVisi.codVisitanteFK);
        p.setInt(2, regVisi.codApartamentoFK);
        p.setString(3, regVisi.dataVisita);
        p.setString(4, regVisi.horaVisita);
        p.setString(5, regVisi.dataSaida);
        p.setString(6,regVisi.horaSaida);
        p.executeUpdate();
        p.close();
    }
    
    public ResultSet listarRegVisita(RegVisitas regVisi) throws Exception{
    
        PreparedStatement p =conn.prepareStatement("INSERT INTO `regvisitas`(`codVisitante`, `codApartamento`, `dataVisita`, `horaEntrada`, `dataSaida`, `horaSaida`) VALUES (?,?,?,?,?,?)");
        
        ResultSet resultado = p.executeQuery();
        
        return resultado;
    }

}
