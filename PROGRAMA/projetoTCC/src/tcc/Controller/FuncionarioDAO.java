package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tcc.Model.Funcionario;

/**
 * @author Guilherme Garcia
 */
public class FuncionarioDAO {

    Connection con;

    public FuncionarioDAO(Connection con) {

        this.con = con;
    }

    public void cadastrarfuncionario(Funcionario func) throws Exception {

        try ( //METODO QUE INSERE DADOS A TABELA CONDOMINIO, O METODO RECEBE A CLASSE COMO PARAMETRO PERMITINDO O USO DOS ATRIBUTOS DELA
                //1.NOTE QUE CRIEI UMA CLASSE PARA FAZER SOMENTE AS FUNÇOES DO CONDOMINIO EM RELAÇÃO AO BANCO DE DADOS
                //2.NOTE TAMBEM QUE JA FIZ A SINTAXE DE SALVAR DIRETAMENTE E CHAMEI OS CAMPOS PARA SEREM MEUS PARAMETROS
                PreparedStatement p = con.prepareStatement("INSERT INTO `funcionarios`(`codCondominio`, `codCargo`, `cpfFuncionario`, `nascionalidadeFunc`, `dataNascFunc`, `naturalidadeFunc`, `rgFuncionario`, `nomeFunc`, `loginFunc`, `senhaFunc`, `cnh`, `estadoFunc`, `cidadeFunc`, `bairroFunc`, `emailFunc`, `enderecoFunc`, `telefone1`, `telefone2`, `cepFunc`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")) {
            p.setInt(1, func.codCondomin);
            p.setInt(2, func.codCargo);
            p.setString(3, func.cpfFuncionario);
            p.setString(4, func.nascionalidadeFunc);
            p.setString(5, func.dataNascFunc);
            p.setString(6, func.naturalidadeFunc);
            p.setString(7, func.rgFuncionario);
            p.setString(8, func.nomeFuncuinario);
            p.setString(9, func.loginFuncionario);
            p.setString(10, func.senhaFuncionario);
            p.setString(11, func.cnh);
            p.setString(12, func.estadoFunc);
            p.setString(13, func.cidadeFunc);
            p.setString(14, func.bairroFunc);
            p.setString(15, func.emailFunc);
            p.setString(16, func.enderecofunc);
            p.setString(17, func.tel1Func);
            p.setString(18, func.tel2Func);
            p.setString(19, func.cepFunc);
            p.executeUpdate();
            p.close();
        }

    }

    public void atualizarfuncionario(Funcionario func) throws Exception {

        try ( //METODO QUE INSERE DADOS A TABELA CONDOMINIO, O METODO RECEBE A CLASSE COMO PARAMETRO PERMITINDO O USO DOS ATRIBUTOS DELA
                //1.NOTE QUE CRIEI UMA CLASSE PARA FAZER SOMENTE AS FUNÇOES DO CONDOMINIO EM RELAÇÃO AO BANCO DE DADOS
                //2.NOTE TAMBEM QUE JA FIZ A SINTAXE DE SALVAR DIRETAMENTE E CHAMEI OS CAMPOS PARA SEREM MEUS PARAMETROS
                PreparedStatement p = con.prepareStatement("UPDATE `funcionarios` SET `codCargo`=?,`cnpj`=?,`cpfFuncionario`=?,`nascionalidadeFunc`=?,`dataNascFunc`=?,`naturalidadeFunc`=?,`rgFuncionario`=?,`nomeFunc`=?,`loginFunc`=?,`senhaFunc`=?,`cnh`=?,`estadoFunc`=?,`cidadeFunc`=?,`bairroFunc`=?,`emailFunc`=?,`enderecoFunc`=?,`telefone1`=?,`telefone2`=?,`cepFunc`=? WHERE codFuncionario=?")) {
            p.setInt(1, func.codCargo);
            p.setInt(2, func.codCondomin);
            p.setString(3, func.cpfFuncionario);
            p.setString(4, func.nascionalidadeFunc);
            p.setString(5, func.dataNascFunc);
            p.setString(6, func.naturalidadeFunc);
            p.setString(7, func.rgFuncionario);
            p.setString(8, func.nomeFuncuinario);
            p.setString(9, func.loginFuncionario);
            p.setString(10, func.senhaFuncionario);
            p.setString(11, func.cnh);
            p.setString(12, func.estadoFunc);
            p.setString(13, func.cidadeFunc);
            p.setString(14, func.bairroFunc);
            p.setString(15, func.emailFunc);
            p.setString(16, func.enderecofunc);
            p.setString(17, func.tel1Func);
            p.setString(18, func.tel2Func);
            p.setString(19, func.cepFunc);
            p.setInt(20, func.codFuncionario);
            p.executeUpdate();
        }

    }

    public ResultSet listarFuncionario() throws Exception {

        PreparedStatement p = con.prepareStatement("select * from funcionario");
        ResultSet resultado = p.executeQuery();
        return resultado;

    }
}
