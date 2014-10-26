package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import tcc.Model.Veiculo;

/**
 * @author Guilherme Garcia
 */
public class VeiculoDAO {

    Connection conn;

    public VeiculoDAO(Connection conn) {
        this.conn = conn;
    }

    public void cadastraVeiculo(Veiculo veic) throws Exception {

        PreparedStatement p = conn.prepareStatement("INSERT INTO `veiculo`( `placaVeiculo`, `codVisitante`, `codMorador`, `codDependente`, `codFuncionario`, `marcaVeiculo`, `modeloVeiculo`, `corVeiculo`, `anoVeiculo`) VALUES ([value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10])");

        p.setString(1, veic.placaVeiculo);
        p.setInt(2, veic.codVisitanteFK);
        p.setInt(3, veic.codMoradorFK);
        p.setInt(4, veic.codDependenteFK);
        p.setInt(5, veic.codFuncionarioFK);
        p.setString(6, veic.marcaVeiculo);
        p.setString(7, veic.modeloVeiculo);
        p.setString(8, veic.corVeiculo);
        p.setInt(9, veic.anoVeiculo);

    }

}
