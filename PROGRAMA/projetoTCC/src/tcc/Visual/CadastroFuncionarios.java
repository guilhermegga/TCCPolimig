/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.visual;

import javax.swing.JOptionPane;
import tcc.Controller.Conexao;
import tcc.Controller.FuncionarioDAO;
import tcc.Model.Funcionario;

/**
 *
 * @author rodrigo
 */
public class CadastroFuncionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFuncionarios
     */
    public CadastroFuncionarios() {
        initComponents();

        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ui = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbTituloFunc = new javax.swing.JLabel();
        Jbnome = new javax.swing.JLabel();
        jbCpf = new javax.swing.JLabel();
        jbRg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JbDtNascimento = new javax.swing.JLabel();
        JbNaturalidade = new javax.swing.JLabel();
        TxtNomeFunc = new javax.swing.JTextField();
        TxtCpf = new javax.swing.JTextField();
        TxtRg = new javax.swing.JTextField();
        txtCNH = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        TxtNaturalidade = new javax.swing.JTextField();
        JbCidade = new javax.swing.JLabel();
        TxtCep = new javax.swing.JTextField();
        JbCpf = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        JbEstado = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        JbBairro = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        JbEndereco = new javax.swing.JLabel();
        TxtEndereco = new javax.swing.JTextField();
        JbNumero = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        LbTelefone = new javax.swing.JLabel();
        LbCelular = new javax.swing.JLabel();
        TxtMaskTelefone = new javax.swing.JFormattedTextField();
        TxtMaskCelular = new javax.swing.JFormattedTextField();
        BtCancelar = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        LbEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 579));
        getContentPane().setLayout(null);

        LbTituloFunc.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LbTituloFunc.setText("Cadastro de Funcionarios");
        getContentPane().add(LbTituloFunc);
        LbTituloFunc.setBounds(237, 0, 305, 29);

        Jbnome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Jbnome.setText("Nome Funcionario:");
        getContentPane().add(Jbnome);
        Jbnome.setBounds(20, 55, 151, 22);

        jbCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbCpf.setText("CPF:");
        getContentPane().add(jbCpf);
        jbCpf.setBounds(265, 100, 41, 30);

        jbRg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbRg.setText("RG:");
        getContentPane().add(jbRg);
        jbRg.setBounds(20, 100, 32, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("CNH:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 100, 44, 30);

        JbDtNascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbDtNascimento.setText("Data De Nascimento:");
        getContentPane().add(JbDtNascimento);
        JbDtNascimento.setBounds(20, 150, 170, 33);

        JbNaturalidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbNaturalidade.setText("Naturalidade:");
        getContentPane().add(JbNaturalidade);
        JbNaturalidade.setBounds(370, 150, 107, 30);
        getContentPane().add(TxtNomeFunc);
        TxtNomeFunc.setBounds(180, 60, 594, 20);
        getContentPane().add(TxtCpf);
        TxtCpf.setBounds(310, 100, 201, 20);
        getContentPane().add(TxtRg);
        TxtRg.setBounds(60, 100, 185, 20);
        getContentPane().add(txtCNH);
        txtCNH.setBounds(568, 100, 200, 20);
        getContentPane().add(txtDataNasc);
        txtDataNasc.setBounds(195, 150, 163, 20);
        getContentPane().add(TxtNaturalidade);
        TxtNaturalidade.setBounds(480, 150, 263, 20);

        JbCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbCidade.setText("Cidade:");
        getContentPane().add(JbCidade);
        JbCidade.setBounds(313, 200, 62, 30);
        getContentPane().add(TxtCep);
        TxtCep.setBounds(441, 250, 216, 20);

        JbCpf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbCpf.setText("CEP:");
        getContentPane().add(JbCpf);
        JbCpf.setBounds(387, 250, 42, 30);
        getContentPane().add(TxtCidade);
        TxtCidade.setBounds(380, 200, 390, 20);

        JbEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbEstado.setText("Estado:");
        getContentPane().add(JbEstado);
        JbEstado.setBounds(21, 205, 61, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o estado:", "MG", "SP", "RJ", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(90, 200, 178, 20);

        JbBairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbBairro.setText("Bairro:");
        getContentPane().add(JbBairro);
        JbBairro.setBounds(21, 255, 53, 22);
        getContentPane().add(TxtBairro);
        TxtBairro.setBounds(86, 250, 289, 20);

        JbEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbEndereco.setText("Endereço:");
        getContentPane().add(JbEndereco);
        JbEndereco.setBounds(20, 305, 82, 22);
        getContentPane().add(TxtEndereco);
        TxtEndereco.setBounds(110, 300, 463, 20);

        JbNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JbNumero.setText("Numero:");
        getContentPane().add(JbNumero);
        JbNumero.setBounds(580, 305, 68, 22);
        getContentPane().add(TxtNumero);
        TxtNumero.setBounds(650, 300, 116, 20);

        LbTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbTelefone.setText("Telefone:");
        getContentPane().add(LbTelefone);
        LbTelefone.setBounds(20, 405, 90, 22);

        LbCelular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbCelular.setText("Celular:");
        getContentPane().add(LbCelular);
        LbCelular.setBounds(330, 405, 80, 22);
        getContentPane().add(TxtMaskTelefone);
        TxtMaskTelefone.setBounds(100, 400, 160, 20);
        getContentPane().add(TxtMaskCelular);
        TxtMaskCelular.setBounds(400, 400, 160, 20);

        BtCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtCancelar);
        BtCancelar.setBounds(100, 470, 130, 31);

        BtSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar);
        BtSalvar.setBounds(540, 470, 130, 31);

        LbEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbEmail.setText("E-mail:");
        getContentPane().add(LbEmail);
        LbEmail.setBounds(20, 355, 70, 22);
        getContentPane().add(TxtEmail);
        TxtEmail.setBounds(80, 350, 500, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed

        Funcionario func = new Funcionario();
        func.codCondomin = 1;
        func.codCargo = 3;
        func.nomeFuncuinario = TxtNomeFunc.getText();
        func.rgFuncionario = TxtRg.getText();
        func.cpfFuncionario = TxtCpf.getText();
        func.cnh = txtCNH.getText();
        func.dataNascFunc = txtDataNasc.getText();
        func.naturalidadeFunc = TxtNaturalidade.getText();
        func.estadoFunc = jComboBox1.getSelectedItem().toString();
        func.cidadeFunc = TxtCidade.getText();
        func.bairroFunc = TxtBairro.getText();
        func.cepFunc = TxtCep.getText();
        func.enderecofunc = TxtEndereco.getText();
        func.emailFunc = TxtEmail.getText();
        func.tel1Func = TxtMaskTelefone.getText();
        func.tel2Func = TxtMaskCelular.getText();
        func.loginFuncionario = "admin";
        func.senhaFuncionario = "admin";
        func.nascionalidadeFunc = "basileira";

        try {
            Conexao coon = new Conexao();
            FuncionarioDAO funcDAO = new FuncionarioDAO(coon.getConexao());
            funcDAO.cadastrarfuncionario(func);
            JOptionPane.showMessageDialog(null, "salvo com sucesso!");

        } catch (Exception e) {
        }

        TxtNomeFunc.setText(null);
        TxtRg.setText(null);
        TxtCpf.setText(null);
        txtCNH.setText(null);
        txtDataNasc.setText(null);
        TxtNaturalidade.setText(null);
        jComboBox1.setSelectedItem(0);
        TxtCidade.setText(null);
        TxtBairro.setText(null);
        TxtCep.setText(null);
        TxtEndereco.setText(null);
        TxtEmail.setText(null);
        TxtMaskTelefone.setText(null);
        TxtMaskCelular.setText(null);


    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_BtCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel JbBairro;
    private javax.swing.JLabel JbCidade;
    private javax.swing.JLabel JbCpf;
    private javax.swing.JLabel JbDtNascimento;
    private javax.swing.JLabel JbEndereco;
    private javax.swing.JLabel JbEstado;
    private javax.swing.JLabel JbNaturalidade;
    private javax.swing.JLabel JbNumero;
    private javax.swing.JLabel Jbnome;
    private javax.swing.JLabel LbCelular;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel LbTituloFunc;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCep;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JFormattedTextField TxtMaskCelular;
    private javax.swing.JFormattedTextField TxtMaskTelefone;
    private javax.swing.JTextField TxtNaturalidade;
    private javax.swing.JTextField TxtNomeFunc;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtRg;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jbCpf;
    private javax.swing.JLabel jbRg;
    private javax.swing.JTextField txtCNH;
    private javax.swing.JTextField txtDataNasc;
    // End of variables declaration//GEN-END:variables
}
