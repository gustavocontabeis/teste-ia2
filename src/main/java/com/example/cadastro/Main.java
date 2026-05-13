package com.example.cadastro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cadastro de Gato");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JDesktopPane desktop = new JDesktopPane();
            frame.add(desktop, BorderLayout.CENTER);

            CadastroGato cadastroGato = new CadastroGato();
            desktop.add(cadastroGato);
            cadastroGato.setVisible(true);

            frame.setVisible(true);
        });
    }
}