/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedesignproject;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author murraysandmeyer
 */
public class DatabaseDesignProject extends JFrame implements ActionListener {

    //////////////////////
    // Member Variables
    JPanel readPanel;
    JPanel updatePanel;
    JPanel deletePanel;
    
     
    public DatabaseDesignProject() {
        initComponents();
    }
    
    private void initComponents() {
        JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        
        readPanel = new ReadPanel();
        // The test panel below provides examples of how the layout managers can be used.
        JPanel testPanel = new JPanel();

        jTabbedPane1.addTab("Read", readPanel);
        jTabbedPane1.addTab("Update", updatePanel);
        jTabbedPane1.addTab("Delete", deletePanel);
        jTabbedPane1.addTab("Create", testPanel);
        
        // Add a button to handle the modal dialog.  Make it right justified on the bottom
        // using an embedded flow layout.
        JButton popupButton = new JButton();
        popupButton.setText("Press to Get the Party Started");
        popupButton.addActionListener(this);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        southPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        southPanel.add(popupButton);
        
        testPanel.setLayout(new BorderLayout());
        testPanel.add(southPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(jTabbedPane1);

        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          DatabaseDesignProject layoutDemo = new DatabaseDesignProject();
          layoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          layoutDemo.setSize(800, 400);
          layoutDemo.setMinimumSize(new Dimension(300, 300));
          layoutDemo.setVisible(true);
      });
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //Custom button text:  Feel free to modify.
        Object[] options = {"Ok",
                            "Cancel"};
        int n = JOptionPane.showOptionDialog(this,
            "Are you having fun yet?", "Party Popup",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
    }
}
