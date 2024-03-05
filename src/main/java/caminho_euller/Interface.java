
package caminho_euller;



import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
// a1.addAttribute("ui.style", "fill-color: yellow;");//colore a aresta
public class Interface extends javax.swing.JFrame {

    
    Grafo g;
     Graph graph ;
    public Interface() {
        super("Caminho Euleriano de Grafo não orientado");
        initComponents();
         setLocationRelativeTo(null);
         vertice_saida.removeAllItems();
         vertice_entrada.removeAllItems();
         quant_vertices_text.setEnabled(false);
         confirmar_botao.setEnabled(false);
         System.setProperty("org.graphstream.ui", "swing");
         graph = new SingleGraph("teste");
         graph.display();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        quant_vertices_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        vertice_saida = new javax.swing.JComboBox<>();
        vertice_entrada = new javax.swing.JComboBox<>();
        confirmar_botao = new javax.swing.JButton();
        finalizar_botao = new javax.swing.JButton();
        add_botao = new javax.swing.JButton();
        criar_grafo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        result_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informe a quantidade de vértices");

        vertice_saida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        vertice_entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        confirmar_botao.setText("Confirmar");
        confirmar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_botaoActionPerformed(evt);
            }
        });

        finalizar_botao.setText("Finalizar adição de arestas");
        finalizar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar_botaoActionPerformed(evt);
            }
        });

        add_botao.setText("Adicionar aresta");
        add_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_botaoActionPerformed(evt);
            }
        });

        criar_grafo.setText("Novo Grafo");
        criar_grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criar_grafoActionPerformed(evt);
            }
        });

        jLabel2.setText("Caminho Euleriano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quant_vertices_text, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vertice_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(vertice_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(finalizar_botao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(add_botao))
                            .addComponent(confirmar_botao)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(criar_grafo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(result_text, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(criar_grafo)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quant_vertices_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmar_botao)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertice_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vertice_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add_botao)
                .addGap(14, 14, 14)
                .addComponent(finalizar_botao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result_text, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar_botaoActionPerformed
         
        vertice_saida.setEnabled(false);
        vertice_entrada.setEnabled(false);
        
            String result = g.imprime_caminho_euleriano_nao_orientado();
            result_text.setText( result);
    }//GEN-LAST:event_finalizar_botaoActionPerformed

    private void confirmar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_botaoActionPerformed
        int num_vertices =Integer.parseInt(quant_vertices_text.getText()) ;
        vertice_saida.setEnabled(true);
        vertice_entrada.setEnabled(true);
        vertice_saida.addItem("Selecionar");
        vertice_entrada.addItem("Selecionar");
        
        g = new Grafo(num_vertices);
        //adiciona vertices na grafica
        for(int i = 0;i<num_vertices;i++){
                graph.addNode((i+1) + "");
                
                //nomeia e define a forma dos vertice  
                Node e1 = graph.getNode(i);
                e1.addAttribute("ui.style", "shape:circle;fill-color: black;size: 40px;");
		e1.addAttribute("ui.label", "Vertice "+(i+1)); 
        }
		
        for(int i = 0; i< num_vertices;i++){//adiciona os vertices criados no combo box
         vertice_saida.addItem((i+1)+"");
         vertice_entrada.addItem((i+1)+"");
        }
        
        quant_vertices_text.setText("");
        quant_vertices_text.setEnabled(false);
        confirmar_botao.setEnabled(false);
    }//GEN-LAST:event_confirmar_botaoActionPerformed

    private void criar_grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criar_grafoActionPerformed
        quant_vertices_text.setEnabled(true);
        confirmar_botao.setEnabled(true);
        
        vertice_saida.removeAllItems();
        vertice_entrada.removeAllItems();
        result_text.setText("");
        
        graph.clear();
    }//GEN-LAST:event_criar_grafoActionPerformed

    private void add_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_botaoActionPerformed
        if((vertice_saida.getSelectedItem() == "Selecionar") || (vertice_entrada.getSelectedItem() == "Selecionar")){
            JOptionPane.showMessageDialog(null,"Vertices não selecionados!", "AVISO", HEIGHT);
           
        }else{
            int v_saida = Integer.parseInt((String)vertice_saida.getSelectedItem());
            int v_entrada = Integer.parseInt((String)vertice_entrada.getSelectedItem());
            
            
            g.Add_aresta_nao_orientado(v_saida-1,v_entrada-1);
             graph.addEdge("a"+v_saida+v_entrada, ""+v_saida,""+v_entrada);
             
             //nomeia a aresta
             Edge a1 = graph.getEdge("a"+v_saida+v_entrada);
             a1.addAttribute("ui.label", "a"+v_saida+v_entrada);
        }

         vertice_saida.setSelectedIndex(0);
         vertice_entrada.setSelectedIndex(0);
         
    }//GEN-LAST:event_add_botaoActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_botao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmar_botao;
    private javax.swing.JButton criar_grafo;
    private javax.swing.JButton finalizar_botao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField quant_vertices_text;
    private javax.swing.JLabel result_text;
    private javax.swing.JComboBox<String> vertice_entrada;
    private javax.swing.JComboBox<String> vertice_saida;
    // End of variables declaration//GEN-END:variables
}
