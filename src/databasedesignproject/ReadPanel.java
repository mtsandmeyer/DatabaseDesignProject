/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedesignproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author murraysandmeyer
 */
public class ReadPanel extends JPanel implements ActionListener {
    
    public ReadPanel(){
        //TODO:
        // Set the layout manager
        // Make components and add them here
        // (you can have sub-panels with their own layout managers if  you want)
        
        BorderLayout experimentLayout = new BorderLayout();
        this.setLayout(experimentLayout);
        
        JButton button = new JButton("Push Middle Button");
        this.add(button, BorderLayout.PAGE_START);

        button = new JButton("Push me");
        button.setPreferredSize(new Dimension(100, 100));
        this.add(button, BorderLayout.CENTER);
        button.addActionListener(this);

        button = new JButton("Push Middle Button");
        this.add(button, BorderLayout.PAGE_END);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Custom button text:  Feel free to modify.
        Object[] options = {"Ok", "Yeah"};
        int n = JOptionPane.showOptionDialog(this,
            "You pushed the middle button!", "Go you!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
    }
    
}
