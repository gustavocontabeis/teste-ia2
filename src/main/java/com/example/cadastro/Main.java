package com.example.cadastro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Cadastro de Gato");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        CadastroGato cadastroGato = new CadastroGato();
        desktopPane.add(cadastroGato);
        cadastroGato.setVisible(true);

        frame.setVisible(true);
    }
}
