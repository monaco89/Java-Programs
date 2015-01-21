/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jframeexample;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author NickMonaco
 */
public class JFrameExample extends JFrame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame frame = new JFrameExample();
        frame.setTitle("Example");
        frame.setSize(500, 600);
        frame.setLocation(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public JFrameExample()
    {
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("ENter");
        
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        
        add(panel);
       
    }
    
}
