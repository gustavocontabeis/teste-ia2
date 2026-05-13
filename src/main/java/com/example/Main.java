package com.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cadastro de Peixe");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            JDesktopPane desktop = new JDesktopPane();
            frame.add(desktop, BorderLayout.CENTER);

            CadastroPeixe cadPeixe = new CadastroPeixe();
            desktop.add(cadPeixe);
            cadPeixe.setVisible(true);

            frame.setVisible(true);
        });
    }
}