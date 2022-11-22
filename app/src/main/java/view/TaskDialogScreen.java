/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Task;
import model.Project;

/**
 *
 * @author bruno
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    /**
     * Creates new form TaskDialogScreen
     */
    TaskController controller;
    Project project;
    
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelSave = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(403, 480));

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));
        jPanelToolBar.setForeground(new java.awt.Color(0, 153, 102));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setForeground(java.awt.Color.white);
        jLabelTitle.setText("Task");

        jLabelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSave)
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelName.setText("Name");

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescription.setText("Decription");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescription.setRows(5);
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        jLabelNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotes.setText("Notes");

        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotes.setRows(5);
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jLabelDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeadline.setText("Deadline");

        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(jTextFieldName)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDeadline)
                            .addComponent(jLabelName)
                            .addComponent(jLabelDescription)
                            .addComponent(jLabelNotes)
                            .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveMouseClicked
        // TODO add your handling code here:
       
        try {
            
            
            
            Task task = new Task(
                    1,
                    jTextFieldName.getText(),
                    jTextAreaDescription.getText(),
                    false,
                    jTextAreaNotes.getText(),
                    new SimpleDateFormat("dd/MM/yyyy").parse(jFormattedTextFieldDeadline.getText())
            );
            controller.save(task);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

        this.dispose();
    }//GEN-LAST:event_jLabelSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
    public void setProject(Project project){
        this.project = project;
    }
}
