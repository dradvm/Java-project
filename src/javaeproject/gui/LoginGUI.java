/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui;

import java.awt.event.*;
import javax.swing.*;
import javaeproject.dao.LoginDAO;
import javaeproject.model.User;
import javax.swing.event.*;
/**
 *
 * @author Voke
 */
public class LoginGUI extends JFrame {
    
    private LoginDAO dao = new LoginDAO();
    private String username = "";
    private String password = "";
    private User user;
    
    public LoginGUI() {
        //Tao container
        setTitle("Login");
        setLayout(null);
        setSize(480, 720);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tao header
        JLabel header = new JLabel("Remedy Scheduler", (int) JLabel.CENTER_ALIGNMENT);
        header.setVisible(true);
        add(header);
        header.setBounds(96, 144, 288, 144);
        //Tao input field label
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setVisible(true);
        add(usernameLabel);
        usernameLabel.setBounds(96, 288, 96, 65);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setVisible(true);
        add(passwordLabel);
        passwordLabel.setBounds(96, 360, 96, 65);
        //Tao input field
        JTextField usernameInput = new JTextField();
        usernameInput.setVisible(true);
        add(usernameInput);
        usernameInput.setBounds(192, 288, 192, 65);
        JTextField passwordInput = new JTextField();
        passwordInput.setVisible(true);
        add(passwordInput);
        passwordInput.setBounds(192, 360, 192, 65);
        //Tao nut login
        JButton loginButton = new JButton("Login");
        loginButton.setVisible(true);
        add(loginButton);
        loginButton.setBounds(120, 576, 240, 65);
        //Tao event listener
        usernameInput.getDocument().addDocumentListener(new DocumentListener() {
            
            public void changedUpdate(DocumentEvent e) {
                username = usernameInput.getText().trim();
            }
            
            public void removeUpdate(DocumentEvent e) {
                username = usernameInput.getText().trim();
            }
            
            public void insertUpdate(DocumentEvent e) {
                username = usernameInput.getText().trim();
            }
        });
        passwordInput.getDocument().addDocumentListener(new DocumentListener() {
           
            public void changedUpdate(DocumentEvent e) {
                password = passwordInput.getText().trim();
            }
            
            public void removeUpdate(DocumentEvent e) {
                password = passwordInput.getText().trim();
            }
            
            public void insertUpdate(DocumentEvent e) {
                password = passwordInput.getText().trim();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (dao.validAccount(username, password)) {
                    user = dao.getUserFromDB(username, password);
                }
                else if (username.length() != 0 && password.length() != 0) {
                    displayErrorFrame();
                }
            }
        });
    }
    
    private void displayErrorFrame() {
        JFrame error = new JFrame("Error");
        error.setSize(360, 240);
        error.setLocationRelativeTo(null);
        error.setLayout(null);
        error.setVisible(true);
        JLabel notification = new JLabel("Incorrect username or password, please try again!", (int) JLabel.CENTER_ALIGNMENT);
        notification.setVisible(true);
        error.add(notification);
        notification.setBounds(0, 0, 360, 120);
        JButton confirmButton = new JButton("OK");
        confirmButton.setVisible(true);
        error.add(confirmButton);
        confirmButton.setBounds(120, 120, 120, 60);
        confirmButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                error.dispose();
            }
        });
    }
}
