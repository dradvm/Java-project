/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;
import javax.swing.JFrame;
import javaeproject.dao.LoginLogoutDAO;
/**
 *
 * @author Voke
 */
public class LoginLogout {
    
    private static String instanceUsername = null;
    private static String instancePassword = null;
    private static String position = null;
    private static boolean isLogin = false;
    private static final LoginLogoutDAO dao = new LoginLogoutDAO();
    
    public LoginLogout() {
    }
    
    public static void Login() {
        //Nhap luc dung giao dien
        String username = "e03username";
        String password = "e03password";
        if (dao.validAccount(username, password)) {
            instanceUsername = username;
            instancePassword = password;
            position = dao.getPositionFromDB(username, password);
            isLogin = true;
            System.out.println("Login successfully with account: " + instanceUsername + " " + instancePassword + " as a " + position);
        }
        else {
            System.out.println("Incorrect username or password");
        }
    }
    
    public static boolean checkIfLogin() {
        return isLogin;
    }
    
    public static String getPosition() {
        return position;
    }
    
    public static void Logout() {
        instanceUsername = null;
        instancePassword = null;
        position = null;
        isLogin = false;
        System.out.println("Logout successfully");
        Login();
    }
    
    public static void disposeOnLogout(JFrame frame) {
        if (!isLogin) {
            frame.dispose();
        }
    }
}
