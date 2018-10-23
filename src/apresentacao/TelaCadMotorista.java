/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.Motorista;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocio.NMotorista;

/**
 *
 * @author Luan
 */
public class TelaCadMotorista extends javax.swing.JInternalFrame {

        /**
     * Creates new form TelaMotorista
     */
    public TelaCadMotorista() {
        initComponents();
    }
    
    JDesktopPane pnlPrincipal;
        
    public TelaCadMotorista(JDesktopPane pnlPrincipal) {
        this();
        this.pnlPrincipal = pnlPrincipal;
    }
    
    TelaCadMotorista(JDesktopPane pnlPrincipal, String codigo) throws SQLException {
        
        this();
        this.pnlPrincipal = pnlPrincipal;
        //preencher a tela
        try {
            NMotorista negocio = new NMotorista();
            Motorista tipo = negocio.consultar(Integer.parseInt(codigo));
            
            txtCodigo.setText(tipo.getIdentificador()+"");
            txtCNH.setText(tipo.getCNH()+"");
            txtNome.setText(tipo.getNome()+"");
            txtLocal.setText(tipo.getLocal()+"");
            
            btnExcluir.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new java.awt.Label();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new java.awt.TextField();
        txtNome = new java.awt.TextField();
        txtLocal = new java.awt.TextField();
        txtCNH = new java.awt.TextField();
        btnSalvar = new java.awt.Button();
        btnExcluir = new java.awt.Button();
        btnLimpar = new java.awt.Button();
        btnFechar = new java.awt.Button();
        btnPesquisar = new java.awt.Button();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Motorista");

        Nome.setText("Nome");

        label3.setText("Local");

        label1.setText("Código");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("CNH");

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        txtCNH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNHActionPerformed(evt);
            }
        });

        btnSalvar.setLabel("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setEnabled(false);
        btnExcluir.setLabel("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setLabel("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setLabel("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnPesquisar.setLabel("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCNH, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try{

            if(txtCNH.getText().isEmpty())
            throw new Exception ("É necessário preencher o CNH!");
            
            if(txtNome.getText().isEmpty())
            throw new Exception ("É necessário preencher o Nome!");
            
            if(txtLocal.getText().isEmpty())
            throw new Exception ("É necessário preencher o Local!");
            
            Motorista tipo = new Motorista();

            if(!txtCodigo.getText().isEmpty())
            tipo.setIdentificador(Integer.parseInt(txtCodigo.getText()));
            tipo.setCNH(txtCNH.getText());
            tipo.setNome(txtNome.getText());
            tipo.setLocal(txtLocal.getText());

            NMotorista negocio = new NMotorista();

            negocio.salvar(tipo);

            JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtCNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNHActionPerformed
       
    }//GEN-LAST:event_txtCNHActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Nome;
    private java.awt.Button btnExcluir;
    private java.awt.Button btnFechar;
    private java.awt.Button btnLimpar;
    private java.awt.Button btnPesquisar;
    private java.awt.Button btnSalvar;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.TextField txtCNH;
    private java.awt.TextField txtCodigo;
    private java.awt.TextField txtLocal;
    private java.awt.TextField txtNome;
    // End of variables declaration//GEN-END:variables

        private void limpar() {
        txtCodigo.setText("");
        txtCNH.setText("");
        txtNome.setText("");
        txtLocal.setText("");
        btnExcluir.setEnabled(false);
        }

    private void excluir() {
    
    try{ 
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do motorista?", "SISTEMA FL", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
        NMotorista negocio = new NMotorista();
        negocio.excluir(Integer.parseInt(txtCodigo.getText()));
        JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
        limpar();
        }
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
    
} 
