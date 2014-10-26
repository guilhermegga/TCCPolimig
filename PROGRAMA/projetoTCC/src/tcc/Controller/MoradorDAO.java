package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.Morador;

/**
 * @author Guilherme Garcia
 */
public class MoradorDAO {

    Connection conn;

    public MoradorDAO(Connection con) {
    }

    public void cadastrarMorador(Morador mora) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("INSERT INTO `morador`(`codFuncionario`, `codApartamento`, `cpfMorador`, `nomeMorador`, `nacionalidadeMorador`, `naturalidadeMorador`, `dataNascMorador`, `loginMorador`, `senhaMorador`, `telefone1`) VALUES (?,?,?,?,?,?,?,?,?,?)")) {
            p.setInt(1, mora.codFuncFK);
            p.setInt(2, mora.codAPTOFK);
            p.setString(3, mora.cpfMorador);
            p.setString(4, mora.nomeMorador);
            p.setString(5, mora.nacionMorador);
            p.setString(6, mora.natMorador);
            p.setString(7, mora.dataNascMorador);
            p.setString(8, mora.loginMorador);
            p.setString(9, mora.senhaMorador);
            p.setString(10, mora.tel1Morador);
            p.executeUpdate();
            p.close();
        }
    }

    public void atualizarMorador(Morador mora) throws Exception {

        try (PreparedStatement p = conn.prepareStatement("UPDATE `morador` SET `codFuncionario`=?,`codApartamento`=?,`cpfMorador`=[value-4],`nomeMorador`=?,`nacionalidadeMorador`=?,`naturalidadeMorador`=?,`dataNascMorador`=?,`loginMorador`=?,`senhaMorador`=?,`telefone1`=? WHERE codMorador=?")) {
            p.setInt(1, mora.codFuncFK);
            p.setInt(2, mora.codAPTOFK);
            p.setString(3, mora.cpfMorador);
            p.setString(4, mora.nomeMorador);
            p.setString(5, mora.nacionMorador);
            p.setString(6, mora.natMorador);
            p.setString(7, mora.dataNascMorador);
            p.setString(8, mora.loginMorador);
            p.setString(9, mora.senhaMorador);
            p.setString(10, mora.tel1Morador);
            p.setInt(11,mora.codMorador);
            p.executeUpdate();
            p.close();
        }
    }
    
    public ResultSet listarMoradores() throws Exception{
    
    PreparedStatement p = conn.prepareStatement("select * from morador");
    ResultSet resultado = p.executeQuery();
    
    return resultado;
    
    }

}
