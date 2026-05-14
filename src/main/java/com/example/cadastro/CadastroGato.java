package com.example.cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroGato extends JInternalFrame {
    private JTextField nomeField;
    private JFormattedTextField dataNascimentoField;
    private JComboBox<String> sexoComboBox;

    public CadastroGato() {
        setTitle("Cadastro de Gato");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nome do Gato:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Data de Nascimento do Gato:"));
        dataNascimentoField = new JFormattedTextField();
        add(dataNascimentoField);

        add(new JLabel("Sexo do Gato:"));
        sexoComboBox = new JComboBox<>(new String[] {"Macho", "Fêmea"});
        add(sexoComboBox);

        JButton salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarGato();
            }
        });
        add(salvarButton);
    }

    private void salvarGato() {
        String nome = nomeField.getText();
        String dataNascimento = dataNascimentoField.getText();
        String sexo = (String) sexoComboBox.getSelectedItem();

        if (validarCadastro(nome, dataNascimento, sexo)) {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarCadastro(String nome, String dataNascimento, String sexo) {
        return !nome.trim().isEmpty() && !dataNascimento.trim().isEmpty() && sexo != null;
    }
}