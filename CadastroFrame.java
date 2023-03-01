import java.awt.*;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CadastroFrame
{


    
    public static class Cadastro extends JFrame{


        Color azulFundo = new Color(227, 235, 238);
        Color botao = new Color(94, 119, 255);

        JTextField nome = new JTextField ("Nome",20);      
        JTextField cpf = new JTextField ("CPF",20);
        JTextField rg = new JTextField ("RG",10);
        JTextField datadenasc = new JTextField ("Data de Nascimento __/__/__ ",20);
        // JTextField genero = new JTextField ("Genero",20); // 
        
        JComboBox<String> genero = new JComboBox<>(new String[]{"Masculino", "Feminino"});
        JTextField telefone = new JTextField ("Telefone",10);
        JTextField email = new JTextField ("Email",20);

        JTextField logradouro = new JTextField ("Logradouro",20);
        JTextField numdacasa = new JTextField ("Nº",5);
        JTextField complemento = new JTextField ("Complemento",10);
        JTextField bairro = new JTextField ("Bairro",20);
        JTextField CEP = new JTextField ("CEP",10);
        JTextField estado = new JTextField ("Estado",20);
        JTextField pais = new JTextField ("Pais",10);
        JTextField uf = new JTextField ("UF",5);

        JTextField agencia = new JTextField ("Agencia",20);
        JTextField conta = new JTextField ("Conta",10);
        JComboBox<String> tipo = new JComboBox<String>(new String[]{"Corrente", "Poupança"});
        JTextField salario = new JTextField ("Salario",10);
        JTextField cargo = new JTextField ("Cargo",20);
        JTextField dtinicio = new JTextField ("Data de Inicio __/__/__",20);
        JTextField dtpag = new JTextField ("Data de Pagamento __/__/__",20);

        JCheckBox conveniom = new JCheckBox ("Médico");
        JCheckBox convenioo = new JCheckBox ("Odontologico");

        JButton confirmar = new JButton("Confirmar");
        JButton cancelar = new JButton("Cancelar");
        JButton voltar = new JButton("Voltar");
        Metodos m = new Metodos();
        
        public Cadastro(){

            JFrame jFrame = new JFrame("Cadastro");
            jFrame.setLayout(new FlowLayout());
            jFrame.setSize(1086, 680);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.getContentPane().setBackground(azulFundo);

            voltar.setBackground(botao);
            voltar.setFont(Font.getFont(Font.SANS_SERIF));
            voltar.setForeground(Color.WHITE);
            voltar.setSize(500, 400);
            

        
            nome.setPreferredSize(new Dimension(200, 30 ) );
            cpf.setPreferredSize(new Dimension(200, 30 ) );
            rg.setPreferredSize(new Dimension(200, 30 ) );
            datadenasc.setPreferredSize( new Dimension( 200, 30 ) );
            genero.setPreferredSize( new Dimension( 200, 30 ) );
            telefone.setPreferredSize( new Dimension( 200, 30 ) );
            email.setPreferredSize( new Dimension( 200, 30) );


            logradouro.setPreferredSize( new Dimension( 200, 30 ) );
            numdacasa.setPreferredSize( new Dimension( 200, 30 ) );
            complemento.setPreferredSize( new Dimension( 200, 30 ) );
            bairro.setPreferredSize( new Dimension( 200, 30 ) );
            CEP.setPreferredSize( new Dimension( 200, 30 ) );
            estado.setPreferredSize( new Dimension( 200, 30 ) );
            uf.setPreferredSize( new Dimension( 200, 30 ) );
            pais.setPreferredSize( new Dimension( 200, 30) );

            agencia.setPreferredSize( new Dimension( 200, 30 ) );
            tipo.setPreferredSize( new Dimension( 200, 30 ) );
            conta.setPreferredSize( new Dimension( 200, 30 ) );
            salario.setPreferredSize( new Dimension( 200, 30 ) );
            cargo.setPreferredSize( new Dimension( 200, 30 ) );
            dtinicio.setPreferredSize( new Dimension( 200, 30 ) );
            dtpag.setPreferredSize( new Dimension( 200, 30 ) );


            confirmar.setBackground(botao);

            confirmar.setFont(Font.getFont(Font.SANS_SERIF));
            confirmar.setForeground(Color.WHITE);
            confirmar.setSize(500, 400);


            cancelar.setBackground(botao);
            cancelar.setFont(Font.getFont(Font.SANS_SERIF));
            cancelar.setForeground(Color.WHITE);
            cancelar.setSize(500, 400);


            String linha = "  ";

            JTextArea vazio = new JTextArea(linha);
            vazio.setForeground(Color.black);
            vazio.setPreferredSize(new Dimension(1086, 20));
            vazio.setEditable(false);
            vazio.setLineWrap(true);
            vazio.setWrapStyleWord(true);
            vazio.setBackground(Color.white);
            vazio.setFont(new Font("Courier", Font.ITALIC,20));
            vazio.setSelectionColor(Color.lightGray);
            vazio.setSelectedTextColor(Color.darkGray);


            String tdados = "DADOS CADASTRAIS";

            JTextArea tdadosexibir = new JTextArea(tdados);
            tdadosexibir.setForeground(botao);
            tdadosexibir.setPreferredSize(new Dimension(1086, 50));
            tdadosexibir.setEditable(false);
            tdadosexibir.setLineWrap(true);
            tdadosexibir.setWrapStyleWord(true);
            tdadosexibir.setBackground(azulFundo);
            tdadosexibir.setFont(new Font("Courier", Font.ITALIC,20));
            tdadosexibir.setSelectionColor(Color.lightGray);
            tdadosexibir.setSelectedTextColor(Color.darkGray);

            Container dadoscadastrais = this.getContentPane();
            dadoscadastrais.setLayout(new FlowLayout(FlowLayout.LEFT));
            dadoscadastrais.add(vazio);
            dadoscadastrais.add(tdadosexibir);
            dadoscadastrais.add(nome);dadoscadastrais.add(cpf); dadoscadastrais.add(rg);
            dadoscadastrais.add(datadenasc);dadoscadastrais.add(genero);dadoscadastrais.add(telefone);
            dadoscadastrais.add(email);

            String cc = "Convênio:";
            JTextArea ccc = new JTextArea(cc);
            ccc.setForeground(Color.black);
            ccc.setBackground(Color.white);
            ccc.setFont(new Font("Courier", Font.ITALIC,13));
            setPreferredSize(new Dimension(12, 12));

            Container checkboxx =this.getContentPane();
            checkboxx.setBackground(Color.white);
            checkboxx.add(ccc);
            checkboxx.add(conveniom); checkboxx.add(convenioo);

            String tendereco = "ENDEREÇO";

            JTextArea tenderecoexibir = new JTextArea(tendereco);
            tenderecoexibir.setForeground(botao);
            tenderecoexibir.setPreferredSize(new Dimension(1086, 50));
            tenderecoexibir.setEditable(false);
            tenderecoexibir.setLineWrap(true);
            tenderecoexibir.setWrapStyleWord(true);
            tenderecoexibir.setBackground(azulFundo);
            tenderecoexibir.setFont(new Font("Courier", Font.ITALIC,20));
            tenderecoexibir.setSelectionColor(Color.lightGray);
            tenderecoexibir.setSelectedTextColor(Color.darkGray);


            Container enderecos = this.getContentPane();
            enderecos.add(tenderecoexibir);
            enderecos.add(logradouro);enderecos.add(numdacasa);enderecos.add(complemento);
            enderecos.add(bairro);enderecos.add(CEP); enderecos.add(estado);enderecos.add(uf);enderecos.add(pais);

            String tbanco = "DADOS BANCÁRIOS";

            JTextArea tbancoexibir = new JTextArea(tbanco);
            tbancoexibir.setForeground(botao);
            tbancoexibir.setPreferredSize(new Dimension(1086, 50));
            tbancoexibir.setEditable(false);
            tbancoexibir.setLineWrap(true);
            tbancoexibir.setWrapStyleWord(true);
            tbancoexibir.setBackground(azulFundo);
            tbancoexibir.setFont(new Font("Courier", Font.ITALIC,20));
            tbancoexibir.setSelectionColor(Color.lightGray);
            tbancoexibir.setSelectedTextColor(Color.darkGray);

            Container dadosbanco = this.getContentPane();
            dadosbanco.add(tbancoexibir);
            dadosbanco.add(agencia);dadosbanco.add(conta);dadosbanco.add(tipo);dadosbanco.add(salario);dadosbanco.add(cargo);
            dadosbanco.add(dtinicio);dadosbanco.add(dtpag);



            String vv = "  ";

            JTextArea vvv = new JTextArea(vv);
            vvv.setForeground(Color.black);
            vvv.setPreferredSize(new Dimension(400, 400));
            vvv.setEditable(false);
            vvv.setLineWrap(true);
            vvv.setWrapStyleWord(true);
            vvv.setBackground(Color.white);

            Container botoes = this.getContentPane();
            botoes.add(vazio);
            botoes.add(vvv);
            botoes.add(voltar);
            botoes.add(confirmar);
            botoes.add(cancelar);
            

                            
            Banco bd = new Banco();
            bd.inicializarConexao();

            nome.addFocusListener(new Eventos("Nome", Color.GRAY));
            cpf.addFocusListener(new Eventos("CPF", Color.GRAY));
            rg.addFocusListener(new Eventos("RG", Color.GRAY));
            datadenasc.addFocusListener(new Eventos("Data de Nascimento __/__/__ ", Color.GRAY));
            telefone.addFocusListener(new Eventos("Telefone", Color.GRAY));
            email.addFocusListener(new Eventos("Email", Color.GRAY));            
            logradouro.addFocusListener(new Eventos("Logradouro", Color.GRAY));
            numdacasa.addFocusListener(new Eventos("Nº", Color.GRAY));
            bairro.addFocusListener(new Eventos("Bairro", Color.GRAY));
            complemento.addFocusListener(new Eventos("Complemento", Color.GRAY));
            agencia.addFocusListener(new Eventos("Agencia", Color.GRAY));
            conta.addFocusListener(new Eventos("Conta", Color.GRAY));
            salario.addFocusListener(new Eventos("Salario", Color.GRAY));
            cargo.addFocusListener(new Eventos("Cargo", Color.GRAY));
            dtinicio.addFocusListener(new Eventos("Data de Inicio __/__/__", Color.GRAY));
            dtpag.addFocusListener(new Eventos("Data de Pagamento __/__/__", Color.GRAY));
            estado.addFocusListener(new Eventos("Estado", Color.GRAY));
            pais.addFocusListener(new Eventos("Pais", Color.GRAY));
            uf.addFocusListener(new Eventos("UF", Color.GRAY));
            CEP.addFocusListener(new Eventos("CEP", Color.GRAY));
            
            confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    try {
                        String nomeValor = nome.getText();
                        String cpfValor = cpf.getText();
                        String rgValor = rg.getText();
                        String nascimentoValor = datadenasc.getText();
                        String generoValor = genero.getSelectedItem().toString();
                        String telefoneValor = telefone.getText();
                        String emailValor = email.getText();
                        String logradouroValor = logradouro.getText();
                        String numCasaValor = numdacasa.getText();
                        String complementoValor = complemento.getText();
                        String bairroValor = bairro.getText();
                        String cepValor = CEP.getText();
                        String estadoValor = estado.getText();
                        String paisValor = pais.getText();
                        String ufValor = uf.getText();

                        String agenciaValor = agencia.getText();
                        String contaValor = conta.getText();
                        String salarioValor = salario.getText();
                        String cargoValor = cargo.getText();
                        
                        String dataInicioValor = dtinicio.getText();
                        String dataPagamentoValor = dtpag.getText();

                
                        String convenio1Valor = "";
                        String convenio2Valor = "";
                
                        if (conveniom.isSelected()) {
                            convenio1Valor = "Médico";
                        }
                
                        if (convenioo.isSelected()) {
                            convenio2Valor = "Odontológico";
                        }
                

                
                        bd.adicionarDados(nomeValor, generoValor, rgValor, cpfValor, nascimentoValor, telefoneValor, emailValor, convenio1Valor, convenio2Valor, logradouroValor, numCasaValor, complementoValor, estadoValor, bairroValor, cepValor, ufValor, agenciaValor, contaValor, salarioValor, cargoValor, dataInicioValor, dataPagamentoValor, paisValor);
                        
                                          
                        JOptionPane.showMessageDialog(null, "Dados adicionados com sucesso!");
                
                        // Close the connection to the database
                        bd.fecharConexao();
                
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao converter valor numérico");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar dados: " + ex.getMessage());
                    }
                }
                
                
        });
    

            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(1086,700);
            this.setVisible(true);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            
        }


    }


    public static void main(String[] args) throws SQLException
    {   
        Cadastro cc = new Cadastro();

        cc.setTitle("Cadastro de Funcionário");
    }
}

