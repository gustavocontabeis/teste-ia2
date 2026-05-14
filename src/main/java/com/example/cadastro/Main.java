package com.example.cadastro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sistema de Cadastro de Peixes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JDesktopPane desktop = new JDesktopPane();
            frame.setContentPane(desktop);

            CadastroPeixe cadastroPeixe = new CadastroPeixe();
            desktop.add(cadastroPeixe);

            frame.setVisible(true);
        });
    }
}