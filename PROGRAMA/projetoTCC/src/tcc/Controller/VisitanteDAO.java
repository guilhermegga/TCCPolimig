package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import tcc.Model.Visitante;

/**
 * @author Guilherme Garcia
 */
public class VisitanteDAO {
    Connection conn;

    public VisitanteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void cadastraVisitante(Visitante visi) throws Exception{
    
        PreparedStatement p = conn.prepareStatement("INSERT INTO `visitante`(`rgVisitante`, `nomeVisitante`) VALUES (?,?)");
    
        p.setString(1, visi.rgVisitante);
        p.setString(2, visi.nomeVisitante);
        p.executeUpdate();
        p.close();
        
   }
    
      public void editaVisitante(Visitante visi) throws Exception{
    
        PreparedStatement p = conn.prepareStatement("UPDATE `visitante` SET `rgVisitante`=?,`nomeVisitante`=? WHERE `codVisitante`=?");
    
        p.setString(1, visi.rgVisitante);
        p.setString(2, visi.nomeVisitante);
        p.setInt(3, visi.codVisitante);
        p.executeUpdate();
        p.close();
        
    }

}
