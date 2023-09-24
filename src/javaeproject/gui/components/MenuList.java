/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javaeproject.events.EventSelected;
import javaeproject.model.MenuModal;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 * @param <E>
 */
public class MenuList<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int hoveredIndex = -1;

    private EventSelected event;
    
    public void addEventMenuSelected(EventSelected event) {
        this.event = event;
    }
    public MenuList() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    MenuModal o = (MenuModal) model.getElementAt(index);
                    if ((o.getType().equals(MenuModal.MenuType.MENU) || o.getType().equals(MenuModal.MenuType.LOGOUT)) && (index != selectedIndex)) {


                        selectedIndex = index;
                        if (event != null) {
                            event.setSelected(o);
                        }
                    }
                    repaint();
                }
            }

        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                MenuModal o = (MenuModal) model.getElementAt(index);
                if ((o.getType().equals(MenuModal.MenuType.MENU)) || (o.getType().equals(MenuModal.MenuType.LOGOUT))) {
                    hoveredIndex = index;
                }
                else {
                    hoveredIndex = -1;
                }
                repaint();
            }
        });
        
        
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean selected, boolean focus) {
                MenuModal data;
                if (o instanceof MenuModal) {
                    data = (MenuModal) o;
                }
                else {
                    data = new MenuModal("","",MenuModal.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setHovered(hoveredIndex == i);
                item.setSelected(selectedIndex == i);
                return item;
            }
        };
    }
    
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        super.paintComponent(g); 
    }
    
    public void addItem(MenuModal data) {
        model.addElement(data);
    }
}
 