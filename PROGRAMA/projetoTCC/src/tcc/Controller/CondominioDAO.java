package tcc.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import tcc.Model.Condominio;

/**
 * @author Guilherme Garcia
 */
public class CondominioDAO {

    Connection con;//DECLARANDO UM ATRIBUTO DO TIPO CONNECTION

    public CondominioDAO(Connection con) {
        //CRIANDO O CONSTRUTOR QUE ESPERA UMA CONEXAO
        //QUANDO CHAMAR A CLASSE PASSE A CONEXAO COMO PARAMETRO E EM SEGUIDA CHAME O METODO QUE DESEJAR
        //BEM SIMPLLES
        this.con = con;
    }

    public void cadastrarCondomin(Condominio condomin) throws Exception {

        //METODO QUE INSERE DADOS A TABELA CONDOMINIO, O METODO RECEBE A CLASSE COMO PARAMETRO PERMITINDO O USO DOS ATRIBUTOS DELA
        //1.NOTE QUE CRIEI UMA CLASSE PARA FAZER SOMENTE AS FUNÇOES DO CONDOMINIO EM RELAÇÃO AO BANCO DE DADOS
        //2.NOTE TAMBEM QUE JA FIZ A SINTAXE DE SALVAR DIRETAMENTE E CHAMEI OS CAMPOS PARA SEREM MEUS PARAMETROS
        PreparedStatement p = con.prepareStatement("INSERT INTO `condominio`(`cnpj`, `nomeCondominio`, `enderecoCondominio`, `numeroCondominio`, `bairroCondominio`, `cepCondominio`, `cidadeCondominio`, `ufCondominio`) VALUES (?,?,?,?,?,?,?,?)");
       p.setString(1, condomin.cnpj);
        p.setString(2, condomin.nomeCondominio);
        p.setString(3, condomin.enderecoCondom);
        p.setString(4, condomin.numeroCondom);
        p.setString(5, condomin.bairroCondo);
        p.setString(6, condomin.cepCondom);
        p.setString(7, condomin.cidadeCondomin);
        p.setString(8, condomin.ufCondomin);
        p.executeUpdate();
        p.close();

    }

    public void atualizarCondomin(Condominio condomin) throws Exception {

        //METODO QUE INSERE DADOS A TABELA CONDOMINIO, O METODO RECEBE A CLASSE COMO PARAMETRO PERMITINDO O USO DOS ATRIBUTOS DELA
        //1.NOTE QUE CRIEI UMA CLASSE PARA FAZER SOMENTE AS FUNÇOES DO CONDOMINIO EM RELAÇÃO AO BANCO DE DADOS
        //2.NOTE TAMBEM QUE JA FIZ A SINTAXE DE SALVAR DIRETAMENTE E CHAMEI OS CAMPOS PARA SEREM MEUS PARAMETROS
        PreparedStatement p = con.prepareStatement("UPDATE `condominio` SET `nomeCondominio`=?,`enderecoCondominio`=?,`numeroCondominio`=?,`bairroCondominio`=?,`cepCondominio`=?,`cidadeCondominio`=?,`ufCondominio`=? WHERE cnpj=?");
        p.setString(1, condomin.nomeCondominio);
        p.setString(2, condomin.enderecoCondom);
        p.setString(3, condomin.numeroCondom);
        p.setString(4, condomin.bairroCondo);
        p.setString(5, condomin.cepCondom);
        p.setString(6, condomin.cidadeCondomin);
        p.setString(7, condomin.ufCondomin);
        p.setString(8, condomin.cnpj);
        p.executeUpdate();
        p.close();

    }

}
