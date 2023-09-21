/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui.components;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javaeproject.model.MenuModal;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 * @param <E>
 */
public class ShiftList<E extends Object> extends JList<E> {
    
    
    
//    private final DefaultListModel model;
    
    public ShiftList() {
//        model = new DefaultListModel();
//        setModel(model);
//        setOpaque(false);
    }
    
    
//    @Override
//    public ListCellRenderer<? super E> getCellRenderer() {
//        return new DefaultListCellRenderer() {
//            @Override
//            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean selected, boolean focus) {
//                return new JLabel();
//            }
//        };
//    }
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D)g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        
//        super.paintComponent(g); 
//    }
}
