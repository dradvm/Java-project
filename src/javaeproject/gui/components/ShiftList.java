/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javaeproject.events.EventSelected;
import javaeproject.model.MenuModal;
import javaeproject.model.Shift;
import javaeproject.model.User;
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
    
    private int selectedIndex = -1;
    private EventSelected event;
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
    } 
    
    private final DefaultListModel model;
    public ShiftList() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Shift o = (Shift) model.getElementAt(index);
                    if (selectedIndex != index) {
                        selectedIndex = index;
                        if (event != null) {
                            event.setSeleted(o);
                        }
                    }
                    
                    repaint();
                }
            }
            
        });
    }
    
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean selected, boolean focus) {
                ShiftItem item = new ShiftItem((Shift) o);
                item.setSelected(selectedIndex == i);
                return item;
            }
        };
    }
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.decode("#FFFFFF"));
        super.paintComponent(g); 
    }
    
    
    public void addItem(Shift item) {
        model.addElement(item);
    } 
    
    public void reset() {
        selectedIndex = -1;
        model.clear();
    }
    
    public Shift getShiftSelected() {
        return (Shift) model.getElementAt(selectedIndex);
    }
    
    public boolean isSelected() {
        return selectedIndex != -1;
    }
}
