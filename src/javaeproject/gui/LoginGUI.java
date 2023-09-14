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
    private String username;
    private String password;
    private User user;
    
    public LoginGUI() {
        //Tao container
        setTitle("Login");
        setSize(480, 720);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tao header
        JLabel header = new JLabel("Remedy Scheduler", (int) JLabel.CENTER_ALIGNMENT);
        header.setBounds(96, 144, 288, 144);
        header.setVisible(true);
        add(header);
        //Tao input field label
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(96, 288, 96, 65);
        usernameLabel.setVisible(true);
        add(usernameLabel);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(96, 360, 96, 65);
        passwordLabel.setVisible(true);
        add(passwordLabel);
        //Tao input field
        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(192, 288, 192, 65);
        usernameInput.setVisible(true);
        add(usernameInput);
        JTextField passwordInput = new JTextField();
        passwordInput.setBounds(192, 360, 192, 65);
        passwordInput.setVisible(true);
        add(passwordInput);
        //Tao nut login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 576, 240, 65);
        loginButton.setVisible(true);
        add(loginButton);
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
                System.out.println(username + " " + password);
                if (dao.validAccount(username, password)) {
                    user = dao.getUserFromDB(username, password);
                    //Su dung tren console
                    System.out.println("Connected successfully as a " + user.getPosition());
                }
                else {
                    //Frame bao loi
                    JFrame error = new JFrame("Error");
                    error.setSize(360, 240);
                    error.setLocationRelativeTo(null);
                    error.setLayout(null);
                    error.setVisible(true);
                    JLabel notification = new JLabel("Incorrect username or password, please try again!", (int) JLabel.CENTER_ALIGNMENT);
                    notification.setBounds(0, 0, 360, 120);
                    notification.setVisible(true);
                    error.add(notification);
                    JButton confirmButton = new JButton("OK");
                    confirmButton.setBounds(120, 120, 120, 60);
                    confirmButton.setVisible(true);
                    error.add(confirmButton);
                    //Them event listener
                    confirmButton.addActionListener(new ActionListener() {
                       
                        public void actionPerformed(ActionEvent e) {
                            error.dispose();
                        }
                    });
                }
            }
        });
    }
}
