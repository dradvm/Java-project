/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.model;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class MenuModal {
    private String icon;
    private String name;
    private MenuType type;

    public MenuModal() {
    
    }
    
    public MenuModal(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public MenuType getType() {
        return type;
    }
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/javaeproject/gui/assests/" + icon + ".png"));
    }
    
    public static enum MenuType {
        MENU, EMPTY, LOGOUT
    }
    
    public static ArrayList<MenuModal> getMenuList(User user) {
        ArrayList<MenuModal> list = new ArrayList<>();
        list.add(new MenuModal("weekly", "View Time Schedule", MenuType.MENU));
        
        if (user.getPosition().equals("Manager") || user.getPosition().equals("Department Head")) {
            list.add(new MenuModal("approval", "Shift Request Approval", MenuType.MENU));
        }
        
        if (user.getPosition().equals("Manager")) {
            
            list.add(new MenuModal("doctor", "Assign Doctor Level", MenuType.MENU));
            list.add(new MenuModal("delegate", "Assign Doctors & Receptionists to Department", MenuType.MENU));
            list.add(new MenuModal("medical-team", "Manage Doctors & Receptionists", MenuType.MENU));
            list.add(new MenuModal("holiday", "View Holiday List", MenuType.MENU));
            list.add(new MenuModal("department", "Manage Departments", MenuType.MENU));
        }
        else {
            list.add(new MenuModal("shift", "Generate Shift Request", MenuType.MENU));
            list.add(new MenuModal("ok", "Check Shift Request Status", MenuType.MENU));
            if (user.getPosition().equals("Department Head")) {
                list.add(new MenuModal("schedule", "Generate Shift", MenuType.MENU));
                list.add(new MenuModal("user", "Assign Shift", MenuType.MENU));
            }
            list.add(new MenuModal("patient", "Manage Patients", MenuType.MENU));
            list.add(new MenuModal("health-check", "Manage Patient Records", MenuType.MENU));
            list.add(new MenuModal("calendar", "View Appointments List", MenuType.MENU));
        }
        list.add(new MenuModal("", "", MenuType.EMPTY));
        list.add(new MenuModal("exit-door", "Log Out", MenuType.LOGOUT));
        return list;
    }
}
