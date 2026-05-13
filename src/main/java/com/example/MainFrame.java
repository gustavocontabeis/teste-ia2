package com.example;

import javax.swing.*;
    
public class MainFrame extends JFrame {
    private JDesktopPane desktopPane;
    private JInternalFrame internalFrame;
    
    public MainFrame() {
        setTitle("Main Application");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeMenu();
        initializeDesktopPane();
    }
    
    private void initializeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open Internal Frame");

        openItem.addActionListener(e -> openInternalFrame());
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }
    
    private void initializeDesktopPane() {
        desktopPane = new JDesktopPane();
        add(desktopPane);
    }
    
    private void openInternalFrame() {
        if (internalFrame == null || internalFrame.isClosed()) {
            internalFrame = new JInternalFrame("Example Internal Frame", true, true, true, true);
            internalFrame.setSize(400, 300);
            internalFrame.setVisible(true);
            desktopPane.add(internalFrame);
        }
        internalFrame.toFront();
    }
}
