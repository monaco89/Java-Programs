/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

public class ShowFlowLayout extends JFrame {
  public ShowFlowLayout() {
    // Set BorderLayout with horizontal gap 5 and vertical gap 10
    //setLayout(new BorderLayout(5, 10));

    // Add buttons to the frame
    //add(new JButton("South"), BorderLayout.SOUTH);
    //add(new JButton("West"), BorderLayout.WEST);
    //add(new JButton("North"), BorderLayout.NORTH);
    //add(new JButton("Center"), BorderLayout.CENTER);
    
    JButton jbt = new JButton("OK");
    add(jbt);
    Color c = new Color(100,200,255);
    jbt.setForeground(Color.red);
    jbt.setBackground(Color.yellow);
    
  }

  /** Main method */
  public static void main(String[] args) {
    ShowFlowLayout frame = new ShowFlowLayout();
    frame.setTitle("ShowBorderLayout");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}