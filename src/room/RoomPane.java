/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.TreeMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Administrator
 */
public class RoomPane extends javax.swing.JPanel {
    JPanel roomName;
    RoomEntityEmpty roomEmpty;
    RoomEntityRent roomRent;
    boolean[] status = {false, true, false, true, true, true, false, false, true,false, 
                            true, false, true, true, true, false, false, true};

    
    
    
    /**
     * Creates new form RoomPane
     */
    public RoomPane() {
        initComponents();
        int height =0;
        int c = 0;
        for (int i = 0; i < status.length; i++) {
            if(status[i] == true){
                roomRent = new RoomEntityRent("Room "+ (i+1));
                roomRent.setSize(100,100);
                roomRent.setName("roomRent"+i+1);
                roomRent.setLocation(c,height);
                add(roomRent);
                c+=100;
            }
            if(status[i] == false){
                roomEmpty = new RoomEntityEmpty("Room "+ (i+1));
                roomEmpty.setSize(100,100);
                roomEmpty.setName("roomEmpty"+i+1);
                roomEmpty.setLocation(c, height);
                add(roomEmpty);
                c+=100;
            }
            if(getComponentCount()%5==0 && getComponentCount() !=0){
                height += 100;
                c = 0;
            }
            
            
        }

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    
    
    

}

