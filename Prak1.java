/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Prak1 extends JFrame{
    /**
     * @param args the command line arguments
     */
    JButton nButton = new JButton ("North");
    JButton sButton = new JButton ("South");
    JButton eButton = new JButton ("East");
    JButton wButton = new JButton ("West");
    JButton cButton = new JButton ("Center");
public Prak1 (){
    super("Border Layout Beraksi");
    setSize(240, 280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(cButton, BorderLayout.CENTER);
}
        
    public static void main(String[] args) {
        // TODO code application logic here
        Prak1 frame = new Prak1();
        frame.setVisible(true);
    }
   
}
