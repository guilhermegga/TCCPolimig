package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.Cargo;

/**
 * @author Guilherme Garcia
 */
public class CargoDAO {

    Connection conn;

    public CargoDAO(Connection con) {

        this.conn = con;

    }

    public void cadastrarCargo(Cargo carg) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("INSERT INTO cargo( nomecargo, descCargo, salarioBase) VALUES (?,?,?)")) {
            p.setString(1, carg.nomecargo);
            p.setString(2, carg.descCargo);
            p.setDouble(3, carg.salario);
            p.executeUpdate();
            p.close();
        }

    }

    public void atualizarCargo(Cargo carg) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("UPDATE `cargo` SET `nomecargo`=?,`descCargo`=?, salarioBase =? WHERE codCargo=?")) {
            p.setString(1, carg.nomecargo);
            p.setString(2, carg.descCargo);
            p.setDouble(3, carg.salario);
            p.setInt(4, carg.codCargo);
            p.executeUpdate();
            p.close();
        }

    }

    public ResultSet listarCargo() throws Exception {

        PreparedStatement p = conn.prepareStatement("select * from cargo");

        ResultSet resultado = p.executeQuery();

        return resultado;

    }

    public ResultSet listarCargoNome() throws Exception {

        PreparedStatement p = conn.prepareStatement("select nomecargo from cargo");

        ResultSet resultado = p.executeQuery();
       
        return resultado;

    }

}
