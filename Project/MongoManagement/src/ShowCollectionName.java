/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author hexademical
 */
public class ShowCollectionName extends javax.swing.JFrame {

    // modelListDocument : DefaultListModel 
    private final DefaultListModel modelListDocument = new DefaultListModel();

    // modelListCollection : DefaultListModel 
    private final DefaultListModel modelListCollection = new DefaultListModel();

    // selectedDocementName : String
    // using when user select document of database
    private String selectedDocementName;
    
    // using for manage database when connect
    private MongoClient connection;
    
    
    /**
     * Creates new form ShowCollectionName
     */
    public ShowCollectionName() {
        initComponents();
        
        // after we init all components
        // we'll add listener when user select doc in list.
        LDocumentList.addListSelectionListener(
                (ListSelectionEvent arg0) -> {
                    OnSelectDocument(arg0);
                }
        );
    }

    // Using for alert everything.
    public void AlertBox(String title, String description, int messageType) {
        JOptionPane.showMessageDialog(null, description, title, messageType);
    }

    public void OnSelectDocument(ListSelectionEvent arg0) {
        // Implement later should check it's valid or not null or not empty string!!!
        if (!arg0.getValueIsAdjusting()) { // Ensure that this event is not fired twice due to adjustments
            selectedDocementName = LDocumentList.getSelectedValue();
            System.out.println("selectedDocementName=" + selectedDocementName);
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

        LBTitleDocuments = new javax.swing.JLabel();
        BTNViewDatabase = new javax.swing.JButton();
        BTNExit = new javax.swing.JButton();
        LBTitleCollection = new javax.swing.JLabel();
        BTNViewCollections = new javax.swing.JButton();
        SPDocumentList = new javax.swing.JScrollPane();
        LDocumentList = new javax.swing.JList<>();
        SPCollectionList = new javax.swing.JScrollPane();
        LCollectionList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Collection Name");

        LBTitleDocuments.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBTitleDocuments.setText("1.Documents Viewer");

        BTNViewDatabase.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTNViewDatabase.setText("Show Documents");
        BTNViewDatabase.setMargin(new java.awt.Insets(3, 14, 3, 14));
        BTNViewDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNViewDatabaseActionPerformed(evt);
            }
        });

        BTNExit.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTNExit.setText("EXIT");
        BTNExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNExitActionPerformed(evt);
            }
        });

        LBTitleCollection.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        LBTitleCollection.setText("2.Collections Viewer");

        BTNViewCollections.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BTNViewCollections.setText("View Collections");
        BTNViewCollections.setMargin(new java.awt.Insets(3, 14, 3, 14));
        BTNViewCollections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNViewCollectionsActionPerformed(evt);
            }
        });

        SPDocumentList.setViewportView(LDocumentList);

        SPCollectionList.setViewportView(LCollectionList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBTitleDocuments)
                            .addComponent(LBTitleCollection))
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNViewCollections)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPCollectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNViewDatabase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPDocumentList, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBTitleDocuments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNViewDatabase)
                    .addComponent(SPDocumentList, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LBTitleCollection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNViewCollections)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SPCollectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNViewDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNViewDatabaseActionPerformed
        try {
            // options when connect to database
            MongoClientOptions connOptions = MongoClientOptions.builder()
                    .connectTimeout(5000) // connection timeout set to 5 ms
                    .serverSelectionTimeout(5000) // selection timeout set to 5 ms
                    .build();

            // address of connection with port
            // we using local database
            ServerAddress connectAddress = new ServerAddress("localhost", 27017);

            // connect to database
            connection = new MongoClient(connectAddress, connOptions);

            modelListDocument.clear(); // clear model list before add docs name.
            for (String docName : connection.getDatabaseNames()) {
                modelListDocument.addElement(docName); // loop and add each doc name.
            }

            // set model to LDocumentList
            // then it's will re-render show list.
            LDocumentList.setModel(modelListDocument);
        } catch (Exception e) {
            // alert box error
            AlertBox("Something's went wrong!", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTNViewDatabaseActionPerformed

    private void BTNExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNExitActionPerformed
        System.exit(0); // exit program with exit code 0.
    }//GEN-LAST:event_BTNExitActionPerformed

    private void BTNViewCollectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNViewCollectionsActionPerformed
        try
        {
            // get database of selection docs
            MongoDatabase database = connection.getDatabase(selectedDocementName);
            // loop each collection name for add to model.
            modelListCollection.clear();
            for(String collectionName : database.listCollectionNames())
            {
               modelListCollection.addElement(collectionName);
            }
            
            // set model to display.
            LCollectionList.setModel(modelListCollection);
        }
        catch (Exception e)
        {
            // alert box error
            AlertBox("Something's went wrong!", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTNViewCollectionsActionPerformed

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
            java.util.logging.Logger.getLogger(ShowCollectionName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCollectionName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCollectionName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCollectionName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowCollectionName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNExit;
    private javax.swing.JButton BTNViewCollections;
    private javax.swing.JButton BTNViewDatabase;
    private javax.swing.JLabel LBTitleCollection;
    private javax.swing.JLabel LBTitleDocuments;
    private javax.swing.JList<String> LCollectionList;
    private javax.swing.JList<String> LDocumentList;
    private javax.swing.JScrollPane SPCollectionList;
    private javax.swing.JScrollPane SPDocumentList;
    // End of variables declaration//GEN-END:variables
}
