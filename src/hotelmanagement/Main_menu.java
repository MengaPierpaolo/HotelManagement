/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import hung_Room.Room;
import vu_guest.Customer;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import trach_reservations.ReservationPanel;

import room.RoomPane;
import trach_reservations.EmptyRoomPanel;
import vu_guest.Addcustomer;
import vu_guest.CustomerDao;

/**
 *
 * @author KeVin
 */
public class Main_menu extends javax.swing.JFrame {

    private Frame JFrame;
    CardLayout cLayout;
    String userName, pass, roleN;

    public Main_menu(String user, String pass, String role) {
        initComponents();
        this.userName = user;
        this.pass = pass;
        this.roleN = role;
        setTitle("Hotel Management");

        cLayout = new CardLayout();
        cEditable.setLayout(cLayout);
        cEditable.add(new RoomPane(), "Roompane");
        cLayout.show(cEditable, "Roompane");

        ImageIcon img = new ImageIcon(getClass().getResource("/hotel.png"));
        this.setIconImage(img.getImage());

        setRoleAdmin(false);
        setRoleEmployee(false);
        if (roleN.equalsIgnoreCase("A")) {
            setRoleAdmin(true);
        } else {
            setRoleEmployee(true);
        }
        setCentral();

//        
    }

    public void setCentral() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        setSize(screenSize.width, screenSize.height - 50);
        if (this.getSize().width != screenSize.width && this.getSize().height != screenSize.height) {
            setLocation((screenSize.width - w) / 2, (screenSize.height - h) / 2);
        }

    }

    public void setRoleAdmin(boolean check) {
        //  btnReservation.setEnabled(check);
        //   btnSearchEmty.setEnabled(check);
        btnRooms.setEnabled(check);
        btnRoomType.setEnabled(check);

        btnLogout.setEnabled(check);
        //  btnServices.setEnabled(check);
        //  btnBill.setEnabled(check);
        //    btnSearchRoom.setEnabled(check);
        btnChangeProfile.setEnabled(check);
        btnEmployee.setEnabled(check);
    }

    public void setRoleEmployee(boolean check) {
        btnCustomers.setEnabled(check);
        btnReservation.setEnabled(check);
        btnEmptyRoom.setEnabled(check);
        btnServices.setEnabled(check);
        btnBill.setEnabled(check);
        btnSearchRoom.setEnabled(check);
        btnChangeProfile.setEnabled(check);
        btnLogout.setEnabled(check);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEmptyRoom = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnReservation = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnRooms = new javax.swing.JButton();
        btnRoomType = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBill = new javax.swing.JButton();
        btnSearchRoom = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnChangeProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        cEditable = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        meunuItemLogin = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuItemLogout = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());

        btnEmptyRoom.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnEmptyRoom.setForeground(new java.awt.Color(0, 0, 255));
        btnEmptyRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnEmptyRoom.setText("Empty Room");
        btnEmptyRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmptyRoom.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/search_rolled.png"))); // NOI18N
        btnEmptyRoom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmptyRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmptyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyRoomActionPerformed(evt);
            }
        });
        jPanel3.add(btnEmptyRoom, java.awt.BorderLayout.EAST);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Reservations Management");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanel3.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        btnReservation.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnReservation.setForeground(new java.awt.Color(0, 0, 255));
        btnReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservation.png"))); // NOI18N
        btnReservation.setText("Reservation");
        btnReservation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReservation.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reservation_rolled.png"))); // NOI18N
        btnReservation.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnReservation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });
        jPanel3.add(btnReservation, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new java.awt.GridBagLayout());

        btnRooms.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnRooms.setForeground(new java.awt.Color(0, 0, 255));
        btnRooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room.png"))); // NOI18N
        btnRooms.setText("Rooms");
        btnRooms.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRooms.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/room_rolled.png"))); // NOI18N
        btnRooms.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRooms.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsActionPerformed(evt);
            }
        });
        jPanel5.add(btnRooms, new java.awt.GridBagConstraints());

        btnRoomType.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnRoomType.setForeground(new java.awt.Color(0, 0, 255));
        btnRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room_type.png"))); // NOI18N
        btnRoomType.setText("Room Type");
        btnRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoomType.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/room_tyte_rolled.png"))); // NOI18N
        btnRoomType.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomTypeActionPerformed(evt);
            }
        });
        jPanel5.add(btnRoomType, new java.awt.GridBagConstraints());

        btnCustomers.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnCustomers.setForeground(new java.awt.Color(0, 0, 255));
        btnCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers.png"))); // NOI18N
        btnCustomers.setText("Customers");
        btnCustomers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/customers_rolled.png"))); // NOI18N
        btnCustomers.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCustomers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });
        jPanel5.add(btnCustomers, new java.awt.GridBagConstraints());

        btnServices.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnServices.setForeground(new java.awt.Color(0, 0, 255));
        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/service.png"))); // NOI18N
        btnServices.setText("Services");
        btnServices.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnServices.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/service_rolled.png"))); // NOI18N
        btnServices.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnServices.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(btnServices, new java.awt.GridBagConstraints());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hotel Management");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(jLabel1, gridBagConstraints);

        jPanel1.add(jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reservations Management");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanel2.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        btnBill.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnBill.setForeground(new java.awt.Color(0, 0, 255));
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservation.png"))); // NOI18N
        btnBill.setText("Bill");
        btnBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBill.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/reservation_rolled.png"))); // NOI18N
        btnBill.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnBill, java.awt.BorderLayout.WEST);

        btnSearchRoom.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnSearchRoom.setForeground(new java.awt.Color(0, 0, 255));
        btnSearchRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnSearchRoom.setText("Search Room");
        btnSearchRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearchRoom.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/search_rolled.png"))); // NOI18N
        btnSearchRoom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSearchRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(btnSearchRoom, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Management");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanel4.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        btnChangeProfile.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnChangeProfile.setForeground(new java.awt.Color(0, 0, 255));
        btnChangeProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authen.png"))); // NOI18N
        btnChangeProfile.setText("Change Profile");
        btnChangeProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeProfile.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/authi2.png"))); // NOI18N
        btnChangeProfile.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnChangeProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeProfileActionPerformed(evt);
            }
        });
        jPanel4.add(btnChangeProfile, java.awt.BorderLayout.WEST);

        btnLogout.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/logout2.png"))); // NOI18N
        btnLogout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogout, java.awt.BorderLayout.EAST);

        btnEmployee.setFont(new java.awt.Font(".VnBook-Antiqua", 1, 14)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(0, 0, 255));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee1.png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployee.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee2.png"))); // NOI18N
        btnEmployee.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jPanel4.add(btnEmployee, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        cEditable.setLayout(new java.awt.CardLayout());
        getContentPane().add(cEditable, java.awt.BorderLayout.CENTER);

        meunuItemLogin.setText("Menu");

        jMenuItem5.setText("Login");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        meunuItemLogin.add(jMenuItem5);

        menuItemLogout.setText("Log-out");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        meunuItemLogin.add(menuItemLogout);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        meunuItemLogin.add(menuItemExit);

        jMenuBar1.add(meunuItemLogin);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Rooms");

        jMenuItem1.setText("Add Room");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setText("View Room");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Export Report Rooms");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Customer");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("View Customer");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Export Report Customers");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Employee");

        jMenuItem2.setText("Add Employee");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem8.setText("View Employee");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Export Report Employee");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Service");

        jMenuItem10.setText("Add Service");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("View Service");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Export Report Services");
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Reservation");

        jMenuItem13.setText("Add Reservation");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("View Reservation");
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Export Report Reservations");
        jMenu7.add(jMenuItem15);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Bill");

        jMenuItem16.setText("Add Bill");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuItem17.setText("View Bill");
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Export Report Bills");
        jMenu8.add(jMenuItem18);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        if (cEditable.getComponentCount() != 0) {
            cEditable.removeAll();
        }
        cEditable.add(new ReservationPanel(), "ReservationPanel");
        cLayout.show(cEditable, "ReservationPanel");

    }//GEN-LAST:event_btnReservationActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jLabel1.setBackground(Color.white);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jLabel1.setBackground(Color.blue);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void btnEmptyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyRoomActionPerformed
          cEditable.add(new EmptyRoomPanel(),"emp");
         cLayout.show(cEditable, "emp");

//        if(tabb_main.getTabCount()!=0)
//             tabb_main.removeAll();
//        RoomPane rooms = new RoomPane();
//        rooms.setSize(800,400);
//        tabb_main.addTab("Rooms List",rooms);
    }//GEN-LAST:event_btnEmptyRoomActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseReleased

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        cEditable.add(new Customer(), "Cus");
        cLayout.show(cEditable, "Cus");
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btnRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsActionPerformed
        cEditable.add(new Room(), "Room");
        cLayout.show(cEditable, "Room");
    }//GEN-LAST:event_btnRoomsActionPerformed

    private void btnRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomTypeActionPerformed
        // TODO add your handling code here:
        cEditable.add(new hung_RoomType.RoomType(),"RoomType");
         cLayout.show(cEditable, "RoomType");
    }//GEN-LAST:event_btnRoomTypeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        cEditable.add(new Customer(), "Cus");
        cLayout.show(cEditable, "Cus");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
//        cEditable.add(new Users(objCon), "user");
//        cLayout.show(cEditable, "user");
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnChangeProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeProfileActionPerformed
        // TODO add your handling code here:
//        ChangProfile changProfile = new ChangProfile(JFrame, true);
//        changProfile.setVisible(true);
    }//GEN-LAST:event_btnChangeProfileActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Login frmLogin = new Login();
        this.dispose();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        // TODO add your handling code here:
        Login frmLogin = new Login();
        this.dispose();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CustomerDao cusdao=new CustomerDao();
        cusdao.report();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login frmLogin = new Login();
        this.dispose();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_menu(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnChangeProfile;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnEmptyRoom;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btnRoomType;
    private javax.swing.JButton btnRooms;
    private javax.swing.JButton btnSearchRoom;
    private javax.swing.JButton btnServices;
    private javax.swing.JPanel cEditable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenu meunuItemLogin;
    // End of variables declaration//GEN-END:variables
}
