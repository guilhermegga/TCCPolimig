package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.Apartamentos;

/**
 * @author Guilherme Garcia
 */
public class ApartamentoDAO {

    Connection conn;

    public ApartamentoDAO(Connection con) {

        this.conn = con;
    }

    public void cadastrarAPTO(Apartamentos apto) throws Exception {

        PreparedStatement p = conn.prepareStatement("INSERT INTO `apartamentos`( `cnpj`, `numeroApartamento`, `blocoApartamento`) VALUES (?,?,?)");

        p.setString(1, apto.cnpjCondominFK);
        p.setString(2, apto.numeroApart);
        p.setString(3, apto.blocoApart);
        p.executeUpdate();
        p.close();
    }

    public void atualizarAPTO(Apartamentos apto) throws Exception {

        PreparedStatement p = conn.prepareStatement("UPDATE apartamentos SET cnpj=?,numeroApartamento=?,blocoApartamento=? WHERE codApartamento=?");

        p.setString(1, apto.cnpjCondominFK);
        p.setString(2, apto.numeroApart);
        p.setString(3, apto.blocoApart);
        p.setInt(4, apto.codApartamento);
        p.executeUpdate();
        p.close();
    }

    public void deletarAPTO(Apartamentos apto) throws Exception {

        PreparedStatement p = conn.prepareStatement("DELETE FROM apartamentos WHERE codApartamento=?");

        p.setInt(1, apto.codApartamento);
        p.executeUpdate();
        p.close();
    }

    public ResultSet listarAPTO() throws Exception {
        ResultSet resultado = null;
        PreparedStatement p = conn.prepareStatement("SELECT * FROM apartamentos");
        resultado = p.executeQuery();

        return resultado;
    }

}
