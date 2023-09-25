/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaeproject.gui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javaeproject.dao.ShiftRequestDAO;
import javaeproject.events.EventSelected;
import javaeproject.model.ShiftRequest;
import javaeproject.model.User;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class MyTable extends JTable{
    
    private EventSelected event;
    private int selectedIndex = -1;
    private String typeOfTable; 
    
    public void addEventSelected(EventSelected event) {
        this.event = event;
    }
    
    
    public MyTable() {
        typeOfTable = "";
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setFont(new Font("sansserif", Font.PLAIN, 12));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                MyTableHeader header = new MyTableHeader(o + "");
                
                if (typeOfTable.equals("CheckStatusShiftRequest")) {
                    if (i1 == 4) {
                        header.setHorizontalAlignment(JLabel.CENTER);
                    }
                }
                else if (typeOfTable.equals("ADShiftRequest")) {
                
                }
                
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                com.setForeground(Color.BLACK);
                setBorder(noFocusBorder);
                setIntercellSpacing(new Dimension(0, 0));
                setShowGrid(false);
                if (selected) {
                    com.setBackground(Color.decode("#eeeeee"));
                    if (selectedIndex != i) {
                        selectedIndex = i;
                        event.setSelected(i);
                    }
                } else {
                        
                }
                if (typeOfTable.equals("CheckStatusShiftRequest")) {
                    if (i1 == 4) {
                        CellStatus cell = new CellStatus((String) o);
                        if (selected) {
                            cell.setBackground(Color.decode("#eeeeee"));
                            cell.repaint();
                        } else {
                            
                        }
                        return cell;
                    }
                }
                else if (typeOfTable.equals("ADShiftRequest")) {
            
                }
                return com;
            }
        });
        
        getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
    
    public void setTypeOfTable(String str) {
        this.typeOfTable = str;
        repaint();
    }
}
