
package view;

import java.awt.Color;
import service.CadastroProdutos;
import model.Produto;

public class ProdutoGUI extends javax.swing.JFrame {
    private CadastroProdutos cp;
    
    public ProdutoGUI() {
        initComponents();
        this.cp = new CadastroProdutos();
        this.getContentPane().setBackground(new Color(204, 204, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        cadastrarbtn = new javax.swing.JButton();
        consultarbtn = new javax.swing.JButton();
        atualizarbtn = new javax.swing.JButton();
        excluirbtn = new javax.swing.JButton();
        listarbtn = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProd = new javax.swing.JList<>();
        txtbusca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtqtdestoque = new javax.swing.JTextField();
        retirarbtn = new javax.swing.JButton();
        adicionarbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtcodestoque = new javax.swing.JTextField();
        msgestoque = new javax.swing.JLabel();
        calcularbtn = new javax.swing.JButton();
        msgvalor = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Produtos");
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Preço");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantidade");

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtCod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPreco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtQtd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cadastrarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        cadastrarbtn.setForeground(new java.awt.Color(0, 0, 102));
        cadastrarbtn.setText("Cadastrar");
        cadastrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarbtnActionPerformed(evt);
            }
        });

        consultarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        consultarbtn.setForeground(new java.awt.Color(0, 0, 102));
        consultarbtn.setText("Consultar");
        consultarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarbtnActionPerformed(evt);
            }
        });

        atualizarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        atualizarbtn.setForeground(new java.awt.Color(0, 0, 102));
        atualizarbtn.setText("Atualizar");
        atualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarbtnActionPerformed(evt);
            }
        });

        excluirbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        excluirbtn.setForeground(new java.awt.Color(0, 0, 102));
        excluirbtn.setText("Excluir");
        excluirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirbtnActionPerformed(evt);
            }
        });

        listarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        listarbtn.setForeground(new java.awt.Color(0, 0, 102));
        listarbtn.setText("Listar Produtos");
        listarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarbtnActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(153, 0, 0));
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        listaProd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaProd);

        txtbusca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Produto Pesquisado:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Área de Operações");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Área de Cadastro e Pesquisa");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Para modificar o estoque, insira a quantidade:");

        txtqtdestoque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        retirarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        retirarbtn.setForeground(new java.awt.Color(0, 0, 102));
        retirarbtn.setText("Retirar do Estoque (-)");
        retirarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarbtnActionPerformed(evt);
            }
        });

        adicionarbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        adicionarbtn.setForeground(new java.awt.Color(0, 0, 102));
        adicionarbtn.setText("Adicionar ao Estoque (+)");
        adicionarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarbtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Código do produto:");

        txtcodestoque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        msgestoque.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        msgestoque.setForeground(new java.awt.Color(153, 0, 0));
        msgestoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calcularbtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        calcularbtn.setForeground(new java.awt.Color(0, 0, 102));
        calcularbtn.setText("Calcular Valor em Estoque");
        calcularbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtnActionPerformed(evt);
            }
        });

        msgvalor.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        msgvalor.setForeground(new java.awt.Color(255, 0, 0));
        msgvalor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtcodestoque)
                                .addGap(119, 119, 119)
                                .addComponent(retirarbtn)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(msgvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msgestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(cadastrarbtn))
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCod)
                                            .addComponent(txtNome)
                                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPreco)
                                            .addComponent(txtQtd)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(consultarbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(atualizarbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(excluirbtn)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adicionarbtn)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(listarbtn)))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(calcularbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCod, txtDesc, txtNome, txtPreco, txtQtd});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listarbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrarbtn)
                            .addComponent(consultarbtn)
                            .addComponent(atualizarbtn)
                            .addComponent(excluirbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcodestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retirarbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarbtn))
                .addGap(18, 18, 18)
                .addComponent(msgestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calcularbtn)
                .addGap(18, 18, 18)
                .addComponent(msgvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCod, txtDesc, txtNome, txtPreco, txtQtd});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarbtnActionPerformed
        int codigo = Integer.parseInt(txtCod.getText());
        int quantidade = Integer.parseInt(txtQtd.getText());
        cp.cadastrar(codigo, txtNome.getText(), txtDesc.getText(), Double.parseDouble(txtPreco.getText()), quantidade);
        msg.setText("Produto cadastrado com sucesso!");
        txtCod.setText("");
        txtNome.setText("");
        txtDesc.setText("");
        txtPreco.setText("");
        txtQtd.setText("");
    }//GEN-LAST:event_cadastrarbtnActionPerformed

    private void listarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarbtnActionPerformed
        listaProd.setListData(cp.listar());
    }//GEN-LAST:event_listarbtnActionPerformed

    private void consultarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarbtnActionPerformed
        Produto produto = new Produto();
        produto = cp.localizar(Integer.parseInt(txtCod.getText()));
        txtbusca.setText("Código: " + produto.getCodigo() + "  Nome: " + produto.getNome() + "  Preço: " + produto.getPreco() + "  Quantidade: " + produto.getQuantidade());
        txtCod.setText("");
        txtNome.setText("");
        txtDesc.setText("");
        txtPreco.setText("");
        txtQtd.setText("");
    }//GEN-LAST:event_consultarbtnActionPerformed

    private void atualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarbtnActionPerformed
        int codigo = Integer.parseInt(txtCod.getText());
        int quantidade = Integer.parseInt(txtQtd.getText());
        cp.atualizar(codigo, txtNome.getText(), txtDesc.getText(), Double.parseDouble(txtPreco.getText()), quantidade);
        msg.setText("Produto atualizado com sucesso!");
        txtCod.setText("");
        txtNome.setText("");
        txtDesc.setText("");
        txtPreco.setText("");
        txtQtd.setText("");
    }//GEN-LAST:event_atualizarbtnActionPerformed

    private void excluirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbtnActionPerformed
        cp.remover(Integer.parseInt(txtCod.getText()));
        msg.setText("Produto excluído com sucesso!");
    }//GEN-LAST:event_excluirbtnActionPerformed

    private void retirarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarbtnActionPerformed
        for (Produto p: cp.getProdutos()){
            if (p.getCodigo()==Integer.parseInt(txtcodestoque.getText())){
                p.retirarEstoque(Integer.parseInt(txtqtdestoque.getText()));
            }
        }
        msgestoque.setText("Retirada bem sucedida!");
        txtcodestoque.setText("");
        txtqtdestoque.setText("");
    }//GEN-LAST:event_retirarbtnActionPerformed

    private void adicionarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarbtnActionPerformed
        for (Produto p: cp.getProdutos()){
            if (p.getCodigo()==Integer.parseInt(txtcodestoque.getText())){
                p.adicionarEstoque(Integer.parseInt(txtqtdestoque.getText()));
            }
        }
        msgestoque.setText("Inclusão bem sucedida!");
        txtcodestoque.setText("");
        txtqtdestoque.setText("");
    }//GEN-LAST:event_adicionarbtnActionPerformed

    private void calcularbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtnActionPerformed
        for (Produto p: cp.getProdutos()){
            if (p.getCodigo()==Integer.parseInt(txtcodestoque.getText())){
                msgvalor.setText("Valor total em estoque: R$ " + p.calcularValorEstoque(p.getCodigo()));
            }
        }
        txtcodestoque.setText("");
    }//GEN-LAST:event_calcularbtnActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarbtn;
    private javax.swing.JButton atualizarbtn;
    private javax.swing.JButton cadastrarbtn;
    private javax.swing.JButton calcularbtn;
    private javax.swing.JButton consultarbtn;
    private javax.swing.JButton excluirbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listaProd;
    private javax.swing.JButton listarbtn;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msgestoque;
    private javax.swing.JLabel msgvalor;
    private javax.swing.JButton retirarbtn;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtcodestoque;
    private javax.swing.JTextField txtqtdestoque;
    // End of variables declaration//GEN-END:variables
}
