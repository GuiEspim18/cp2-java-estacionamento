/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkegiro.View;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import parkegiro.Model.Entrance.EntranceCRUD_DAO;
import parkegiro.Model.Entrance.Entrance_DAO;
import parkegiro.Model.Exit.Exit_DAO;
import parkegiro.Model.Exit.ExitsCRUD_DAO;

/**
 *
 * @author labsfiap
 */
public class Home_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Home_View
     */
    public Home_GUI() {
        initComponents();
        EntranceCRUD_DAO.getAll();
        ExitsCRUD_DAO.getAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        carsPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrances = new javax.swing.JTable();
        plateEntrance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        brandEntrance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modelEntrance = new javax.swing.JTextField();
        addEntrance = new javax.swing.JButton();
        exitEntrance = new javax.swing.JButton();
        editEntrance = new javax.swing.JButton();
        deleteEntrance = new javax.swing.JButton();
        hourEntrance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        getEntrance = new javax.swing.JButton();
        exitsPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        exits = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        plateExit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        brandExit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        modelExit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hourExit = new javax.swing.JTextField();
        getExit = new javax.swing.JButton();
        cancelExit = new javax.swing.JButton();
        editExit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        valueExit = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        exit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(240, 240, 240));

        jTabbedPane1.setBackground(new java.awt.Color(240, 240, 240));
        jTabbedPane1.setForeground(new java.awt.Color(20, 72, 121));

        carsPane.setBackground(new java.awt.Color(240, 240, 240));

        entrances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(entrances);
        if (entrances.getColumnModel().getColumnCount() > 0) {
            entrances.getColumnModel().getColumn(0).setResizable(false);
            entrances.getColumnModel().getColumn(1).setResizable(false);
            entrances.getColumnModel().getColumn(2).setResizable(false);
            entrances.getColumnModel().getColumn(3).setResizable(false);
        }

        plateEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateEntranceActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 72, 121));
        jLabel1.setText("Placa:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 72, 121));
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 72, 121));
        jLabel3.setText("Modelo:");

        addEntrance.setBackground(new java.awt.Color(20, 72, 121));
        addEntrance.setForeground(new java.awt.Color(240, 240, 240));
        addEntrance.setText("Adicionar");
        addEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEntranceActionPerformed(evt);
            }
        });

        exitEntrance.setBackground(new java.awt.Color(20, 72, 121));
        exitEntrance.setForeground(new java.awt.Color(240, 240, 240));
        exitEntrance.setText("Retirar");
        exitEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitEntranceActionPerformed(evt);
            }
        });

        editEntrance.setBackground(new java.awt.Color(20, 72, 121));
        editEntrance.setForeground(new java.awt.Color(240, 240, 240));
        editEntrance.setText("Editar");
        editEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEntranceActionPerformed(evt);
            }
        });

        deleteEntrance.setBackground(new java.awt.Color(20, 72, 121));
        deleteEntrance.setForeground(new java.awt.Color(240, 240, 240));
        deleteEntrance.setText("Excluir");
        deleteEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntranceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 72, 121));
        jLabel4.setText("Entrada:");

        getEntrance.setBackground(new java.awt.Color(20, 72, 121));
        getEntrance.setForeground(new java.awt.Color(240, 240, 240));
        getEntrance.setText("Consultar");
        getEntrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEntranceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout carsPaneLayout = new javax.swing.GroupLayout(carsPane);
        carsPane.setLayout(carsPaneLayout);
        carsPaneLayout.setHorizontalGroup(
            carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carsPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plateEntrance, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(brandEntrance)
                    .addComponent(modelEntrance)
                    .addComponent(hourEntrance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteEntrance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getEntrance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editEntrance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEntrance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitEntrance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        carsPaneLayout.setVerticalGroup(
            carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carsPaneLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plateEntrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addEntrance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandEntrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(getEntrance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelEntrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitEntrance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourEntrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(editEntrance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteEntrance)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Páteo", carsPane);

        exitsPane.setBackground(new java.awt.Color(240, 240, 240));

        exits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Saída", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(exits);
        if (exits.getColumnModel().getColumnCount() > 0) {
            exits.getColumnModel().getColumn(0).setResizable(false);
            exits.getColumnModel().getColumn(1).setResizable(false);
            exits.getColumnModel().getColumn(2).setResizable(false);
            exits.getColumnModel().getColumn(3).setResizable(false);
            exits.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 72, 121));
        jLabel5.setText("Placa:");

        plateExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 72, 121));
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 72, 121));
        jLabel7.setText("Modelo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 72, 121));
        jLabel8.setText("Saída:");

        getExit.setBackground(new java.awt.Color(20, 72, 121));
        getExit.setForeground(new java.awt.Color(240, 240, 240));
        getExit.setText("Consultar");
        getExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getExitActionPerformed(evt);
            }
        });

        cancelExit.setBackground(new java.awt.Color(20, 72, 121));
        cancelExit.setForeground(new java.awt.Color(240, 240, 240));
        cancelExit.setText("Cancelar");
        cancelExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelExitActionPerformed(evt);
            }
        });

        editExit.setBackground(new java.awt.Color(20, 72, 121));
        editExit.setForeground(new java.awt.Color(240, 240, 240));
        editExit.setText("Editar");
        editExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editExitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(20, 72, 121));
        jLabel9.setText("Valor:");

        valueExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exitsPaneLayout = new javax.swing.GroupLayout(exitsPane);
        exitsPane.setLayout(exitsPaneLayout);
        exitsPaneLayout.setHorizontalGroup(
            exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addGroup(exitsPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(brandExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(modelExit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hourExit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plateExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        exitsPaneLayout.setVerticalGroup(
            exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitsPaneLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plateExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(getExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cancelExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(modelExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exitsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Saídas", exitsPane);

        header.setBackground(new java.awt.Color(20, 72, 121));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkegiro/Images/mini-logo.png"))); // NOI18N
        jLabel16.setText("   ");

        exit.setBackground(new java.awt.Color(224, 28, 28));
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(526, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(
            this,
            "Tem certeza que deseja encerrar o programa?",
            "Confirmação",
            JOptionPane.OK_CANCEL_OPTION
        );
        if (resposta == JOptionPane.OK_OPTION) {
            System.exit(0); // Encerra o programa se o usuário clicar em "OK"
        }
    }//GEN-LAST:event_exitActionPerformed

    private void plateExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateExitActionPerformed

    private void plateEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateEntranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateEntranceActionPerformed

    private void addEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEntranceActionPerformed
        Entrance_DAO entrance = new Entrance_DAO(plateEntrance.getText(), brandEntrance.getText(), modelEntrance.getText(), hourEntrance.getText());
        EntranceCRUD_DAO.create(entrance);
    }//GEN-LAST:event_addEntranceActionPerformed

    private void getEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEntranceActionPerformed
        EntranceCRUD_DAO.getOne(plateEntrance.getText());
    }//GEN-LAST:event_getEntranceActionPerformed

    private void editEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEntranceActionPerformed
        Entrance_DAO entrance = new Entrance_DAO(plateEntrance.getText(), brandEntrance.getText(), modelEntrance.getText(), hourEntrance.getText());
        EntranceCRUD_DAO.update(entrance);
    }//GEN-LAST:event_editEntranceActionPerformed

    private void deleteEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEntranceActionPerformed
        int resposta = JOptionPane.showConfirmDialog(
            this,
            "Deseja excluír esta entrada?",
            "Confirmação",
            JOptionPane.OK_CANCEL_OPTION
        );
        if (resposta == JOptionPane.OK_OPTION) {
            EntranceCRUD_DAO.delete(plateEntrance.getText());
        }
    }//GEN-LAST:event_deleteEntranceActionPerformed

    private void exitEntranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitEntranceActionPerformed
        int resposta = JOptionPane.showConfirmDialog(
            this,
            "Deseja retirar este carro do seu páteo?",
            "Confirmação",
            JOptionPane.OK_CANCEL_OPTION
        );
        if (resposta == JOptionPane.OK_OPTION) {          
            ExitsCRUD_DAO.create(plateEntrance.getText());
        }
    }//GEN-LAST:event_exitEntranceActionPerformed

    private void getExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getExitActionPerformed
        ExitsCRUD_DAO.getOne(plateExit.getText());
    }//GEN-LAST:event_getExitActionPerformed

    private void cancelExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelExitActionPerformed
        ExitsCRUD_DAO.cancel(plateExit.getText());
    }//GEN-LAST:event_cancelExitActionPerformed

    private void editExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editExitActionPerformed
        Exit_DAO exit = new Exit_DAO(plateExit.getText(), brandExit.getText(), modelExit.getText(), hourExit.getText(), Double.parseDouble(valueExit.getText()));
        ExitsCRUD_DAO.update(exit);
    }//GEN-LAST:event_editExitActionPerformed

    private void valueExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueExitActionPerformed

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
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEntrance;
    public static javax.swing.JTextField brandEntrance;
    public static javax.swing.JTextField brandExit;
    private javax.swing.JButton cancelExit;
    private javax.swing.JPanel carsPane;
    private javax.swing.JButton deleteEntrance;
    private javax.swing.JButton editEntrance;
    private javax.swing.JButton editExit;
    public static javax.swing.JTable entrances;
    private javax.swing.JToggleButton exit;
    private javax.swing.JButton exitEntrance;
    public static javax.swing.JTable exits;
    private javax.swing.JPanel exitsPane;
    private javax.swing.JButton getEntrance;
    private javax.swing.JButton getExit;
    private javax.swing.JPanel header;
    public static javax.swing.JTextField hourEntrance;
    public static javax.swing.JTextField hourExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel mainPanel;
    public static javax.swing.JTextField modelEntrance;
    public static javax.swing.JTextField modelExit;
    public static javax.swing.JTextField plateEntrance;
    public static javax.swing.JTextField plateExit;
    public static javax.swing.JTextField valueExit;
    // End of variables declaration//GEN-END:variables
}
