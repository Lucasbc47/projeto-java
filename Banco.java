import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Banco {

    private String url = "jdbc:sqlite:banco.db";
    private Connection conn;
    
    public void inicializarConexao(){
        try{
        conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS dados " +
        "(nome TEXT, " +
        "genero TEXT, " +
        "rg TEXT, " +
        "cpf TEXT, " +
        "nascimento TEXT, " +
        "telefone TEXT, " +
        "email TEXT, " +
        "convenio_1 TEXT, " +
        "convenio_2  TEXT, " + 
        "endereco_logradouro TEXT, " +
        "endereco_n TEXT, " +
        "endereco_complemento TEXT, " +
        "endereco_estado TEXT, " +
        "endereco_bairro TEXT, " +
        "endereco_cep TEXT, " +
        "endereco_uf TEXT, " +
        "agencia TEXT, " +
        "conta TEXT, " +
        "salario TEXT, " +
        "cargo TEXT, " +
        "data_inicio TEXT, " +
        "data_pagamento TEXT, " +
        "pais TEXT)";

        stmt.executeUpdate(sql);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void fecharConexao(){
    try{
        conn.close();    
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

        public void adicionarDados(String nome, String genero, String rg, String cpf, String nascimento, String telefone, String email, String convenio_1, String convenio_2, String endereco_logradouro, String endereco_n, String endereco_complemento, String endereco_estado, String endereco_bairro, String endereco_cep, String endereco_uf, String agencia, String conta, String salario, String cargo, String data_inicio, String data_pagamento, String pais) {
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO dados (nome, genero, rg, cpf, nascimento, telefone, email, convenio_1, convenio_2, endereco_logradouro, endereco_n, endereco_complemento, endereco_estado, endereco_bairro, endereco_cep, endereco_uf, agencia, conta, salario, cargo, data_inicio, data_pagamento, pais) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, nome);
            pstmt.setString(2, genero);
            pstmt.setString(3, rg);
            pstmt.setString(4, cpf);
            pstmt.setString(5, nascimento);
            pstmt.setString(6, telefone);
            pstmt.setString(7, email);
            pstmt.setString(8, convenio_1);
            pstmt.setString(9, convenio_2);
            pstmt.setString(10, endereco_logradouro);
            pstmt.setString(11, endereco_n);
            pstmt.setString(12, endereco_complemento);
            pstmt.setString(13, endereco_estado);
            pstmt.setString(14, endereco_bairro);
            pstmt.setString(15, endereco_cep);
            pstmt.setString(16, endereco_uf);
            pstmt.setString(17, agencia);
            pstmt.setString(18, conta);
            pstmt.setString(19, salario);
            pstmt.setString(20, cargo);
            pstmt.setString(21, data_inicio);
            pstmt.setString(22, data_pagamento);
            pstmt.setString(23, pais);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados adicionados com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    
    
}
    


