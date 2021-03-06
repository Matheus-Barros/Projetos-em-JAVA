/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Color;
import negocio.Pecas;
import persistencia.IPecasDAO;
import persistencia.PecasDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author mathe
 */
public class fmPecas extends javax.swing.JInternalFrame {

    /**
     * Creates new form fmPecas
     */
    int idAlteracao=0;
    public fmPecas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbPreco = new javax.swing.JLabel();
        lbAsPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        paFoto = new apresentacao.PainelImagemFundo();
        jLabel4 = new javax.swing.JLabel();
        lbAsNome = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btUpload = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        lbAsCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        lbSetor = new javax.swing.JLabel();
        cbSetor = new javax.swing.JComboBox<>();
        lbAsSetor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setTitle("Cadastro de Peças");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pneus.png"))); // NOI18N
        jLabel2.setText("Cadastro de Peças");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lbPreco.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon (1).png"))); // NOI18N
        lbPreco.setText("Preço:");

        lbAsPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsPreco.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsPreco.setText("*");

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botao.png"))); // NOI18N
        jLabel3.setToolTipText("O código da peça deve ser escrito começando com ID- seguido do numero do produto.  Ex: ID-12345");

        paFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(0, 0, 0)));
        paFoto.setImg(new ImageIcon("src/recursos/menu4.jpg"));
        paFoto.setMaximumSize(new java.awt.Dimension(150, 150));
        paFoto.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout paFotoLayout = new javax.swing.GroupLayout(paFoto);
        paFoto.setLayout(paFotoLayout);
        paFotoLayout.setHorizontalGroup(
            paFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paFotoLayout.setVerticalGroup(
            paFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jLabel4.setText("Foto Produto");

        lbAsNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsNome.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsNome.setText("*");

        lbNome.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nome.png"))); // NOI18N
        lbNome.setText("Nome:");

        btUpload.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/multimidia.png"))); // NOI18N
        btUpload.setText("Upload");
        btUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUploadActionPerformed(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/horizontal.png"))); // NOI18N
        lbCodigo.setText("Código:");

        lbAsCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsCodigo.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsCodigo.setText("*");

        txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("ID-#,##0"))));

        lbSetor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pessoas.png"))); // NOI18N
        lbSetor.setText("Setor:");

        cbSetor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Mecânica", "Elétrica", "Pintura", "Lanternagem", "Borracharia" }));
        cbSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSetorActionPerformed(evt);
            }
        });

        lbAsSetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsSetor.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsSetor.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAsNome)
                        .addGap(1, 1, 1)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAsSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAsCodigo)
                                .addGap(1, 1, 1)
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAsPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(paFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAsNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbAsCodigo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbAsPreco))))
                    .addComponent(paFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSetor)
                            .addComponent(lbAsSetor)
                            .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btUpload)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/saida.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lixeira.png"))); // NOI18N
        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/disquete.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(158, 158, 158)
                                .addComponent(btSalvar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btSalvar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSetorActionPerformed
    private void copiarArquivo(File origem, File destino) throws IOException{
        InputStream in = new FileInputStream(origem);
        OutputStream out = new FileOutputStream(destino);
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0){
        
            out.write(buf,0,len);
            
        }
        in.close();
        out.close();
}
    
    
    File arquivoFoto=null;    
    private void btUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUploadActionPerformed
        // Carregar foto
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("Escolha uma foto");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int returnval=filechooser.showOpenDialog(this);
        if (returnval==JFileChooser.APPROVE_OPTION){
            
            arquivoFoto = filechooser.getSelectedFile();
            BufferedImage bi;
            
            try{
            
                bi = ImageIO.read(arquivoFoto);
                JLabel imgLabel = new JLabel (new ImageIcon(bi));
                imgLabel.setSize(150,150);
                paFoto.add(imgLabel);
                paFoto.revalidate();
                paFoto.repaint();;
            }
            catch(IOException e){
                
                System.out.println("Houve um erro ao carregar a foto");
                
            }
            this.pack();        
    }
    }//GEN-LAST:event_btUploadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Fecchar
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // Salvando dados
        int resposta = 0;
        int valor = 1;
        

        //Verifica se o nome está vazio
        if(txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo nome vazio.");
            lbNome.setForeground(Color.red);
            lbAsNome.setForeground(Color.red);
            resposta = 1;
        }
        //Verifica se código está vazio
        if(txtCodigo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo código vazio.");
            lbCodigo.setForeground(Color.red);
            lbAsCodigo.setForeground(Color.red);
            resposta = 1;
        }
        
        //Verifica se preço está vazio
        if(txtPreco.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo preço vazio.");
            lbPreco.setForeground(Color.red);
            lbAsPreco.setForeground(Color.red);
            resposta = 1;
        }        
        
        //Verifica se o setor está vazio
        if(cbSetor.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo setor vazio.");
            lbSetor.setForeground(Color.red);
            lbAsSetor.setForeground(Color.red);
            resposta = 1;
        }
        
        if(resposta==0){
            //Salvando no BD
            Pecas pecas = new Pecas();
            pecas.setNome(txtNome.getText());
            pecas.setCodigo(txtCodigo.getText());
            pecas.setPreco("R$" + txtPreco.getText());            
            pecas.setSetor(cbSetor.getSelectedItem().toString());


            IPecasDAO dao = new PecasDAO();
            dao.adiciona(pecas);
            JOptionPane.showMessageDialog(null, "Os dados foram gravados.");
            
            String novoNomeFoto=txtNome.getText().replaceAll("","") + txtNome.getText().hashCode()+".png";
            File urlFoto = new File("C:/fotos/"+ novoNomeFoto);   
            
            try{
                copiarArquivo(arquivoFoto, urlFoto);
            } catch (IOException ex) {
                System.out.println("Não foi possovel mover o arquivo, "+ex);
            }
            
        
            pecas.setFoto(urlFoto.getPath());
            
            //Colocando as cores normais para casos de erro
            lbNome.setForeground(Color.black);
            lbAsNome.setForeground(new Color(240, 240, 240, 0));
            lbCodigo.setForeground(Color.black);
            lbAsCodigo.setForeground(new Color(240, 240, 240, 0));
            lbPreco.setForeground(Color.black);
            lbAsPreco.setForeground(new Color(240, 240, 240, 0));
            lbSetor.setForeground(Color.black);
            lbAsSetor.setForeground(new Color(240, 240, 240, 0));

        }
    }//GEN-LAST:event_btSalvarActionPerformed


    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Limpando dados
    txtNome.setText("");
    txtCodigo.setText("");
    txtPreco.setText("");
    cbSetor.selectWithKeyChar('s');

    lbNome.setForeground(Color.black);
    lbAsNome.setForeground(new Color(240, 240, 240, 0));
    txtCodigo.setForeground(Color.black);
    lbAsCodigo.setForeground(new Color(240, 240, 240, 0));     
    lbPreco.setForeground(Color.black);
    lbAsPreco.setForeground(new Color(240, 240, 240, 0));
    lbSetor.setForeground(Color.black);
    lbAsSetor.setForeground(new Color(240, 240, 240, 0));
    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUpload;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAsCodigo;
    private javax.swing.JLabel lbAsNome;
    private javax.swing.JLabel lbAsPreco;
    private javax.swing.JLabel lbAsSetor;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbSetor;
    private apresentacao.PainelImagemFundo paFoto;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
