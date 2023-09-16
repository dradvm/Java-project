package javaeproject.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaeproject.dao.LoginDAO;
import javaeproject.model.User;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LoginGUI extends javax.swing.JFrame {

    private final LoginDAO dao = new LoginDAO();
    private String username = "";
    private String password = "";
    private User user;

    public LoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        usernameLabel = new java.awt.Label();
        usernameInput = new javax.swing.JTextField();
        passwordLabel = new java.awt.Label();
        passwordInput = new javax.swing.JPasswordField();
        notificationLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(480, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 360));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 0, 51));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Remedy Scheduler");
        header.setAlignmentY(0.0F);
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.setName(""); // NOI18N
        header.setPreferredSize(new java.awt.Dimension(480, 90));

        usernameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usernameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameLabel.setPreferredSize(new java.awt.Dimension(120, 90));
        usernameLabel.setText("Username: ");

        usernameInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameInput.setPreferredSize(new java.awt.Dimension(120, 23));
        usernameInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                usernameInputCaretUpdate(evt);
            }
        });

        passwordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        passwordLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordLabel.setPreferredSize(new java.awt.Dimension(120, 90));
        passwordLabel.setText("Password: ");

        passwordInput.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordInput.setToolTipText("");
        passwordInput.setPreferredSize(new java.awt.Dimension(120, 23));
        passwordInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                passwordInputCaretUpdate(evt);
            }
        });

        notificationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        notificationLabel.setForeground(new java.awt.Color(255, 0, 0));
        notificationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificationLabel.setPreferredSize(new java.awt.Dimension(480, 30));

        loginButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setPreferredSize(new java.awt.Dimension(90, 30));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(notificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        if (username.trim().length() == 0 && password.trim().length() == 0) {
        }
        else if (dao.validAccount(username, password)) {
            user = dao.getUserFromDB(username, password);
            MenuGUI menu = new MenuGUI(user);
            dispose();
        }
        else {
            notificationLabel.setText("Incorrect username or password");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_usernameInputCaretUpdate
        // TODO add your handling code here:
        username = usernameInput.getText();
    }//GEN-LAST:event_usernameInputCaretUpdate

    private void passwordInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_passwordInputCaretUpdate
        // TODO add your handling code here:
        password = String.valueOf(passwordInput.getPassword());
    }//GEN-LAST:event_passwordInputCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JPasswordField passwordInput;
    private java.awt.Label passwordLabel;
    private javax.swing.JTextField usernameInput;
    private java.awt.Label usernameLabel;
    // End of variables declaration//GEN-END:variables
}
