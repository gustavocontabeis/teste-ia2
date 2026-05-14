package com.example.cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CadastroPeixe extends JInternalFrame {
    private JTextField nomeField;
    private JComboBox<String> tipoAguaCombo;
    private JTextField dataNascimentoField;
    private JTextField pesoField;
    private JButton salvarButton;
    private JButton cancelarButton;

    public CadastroPeixe() {
        setTitle("Cadastro de Peixe");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth()) / 2, 
                (Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);

        nomeField = new JTextField();
        tipoAguaCombo = new JComboBox<>(new String[]{"Doce", "Salgada"});
        dataNascimentoField = new JTextField();
        pesoField = new JTextField();
        salvarButton = new JButton("Salvar");
        cancelarButton = new JButton("Cancelar");

        add(new JLabel("Nome do Peixe:"));
        add(nomeField);
        add(new JLabel("Tipo de Água:"));
        add(tipoAguaCombo);
        add(new JLabel("Data de Nascimento (yyyy-mm-dd):"));
        add(dataNascimentoField);
        add(new JLabel("Peso (kg):"));
        add(pesoField);
        add(salvarButton);
        add(cancelarButton);

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarPeixe();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        setVisible(true);
    }

    private void salvarPeixe() {
        String nome = nomeField.getText();
        String tipoAgua = (String) tipoAguaCombo.getSelectedItem();
        String dataNascimento = dataNascimentoField.getText();
        String pesoText = pesoField.getText();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome do peixe não pode estar vazio.");
            return;
        }

        if (tipoAgua == null) {
            JOptionPane.showMessageDialog(this, "Tipo de água deve ser selecionado.");
            return;
        }

        LocalDate dataValida;
        try {
            dataValida = LocalDate.parse(dataNascimento);
            if (dataValida.isAfter(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "Data de nascimento não pode ser futura.");
                return;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data de nascimento inválida.");
            return;
        }

        double peso;
        try {
            peso = Double.parseDouble(pesoText);
            if (peso <= 0) {
                JOptionPane.showMessageDialog(this, "Peso deve ser maior que zero.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Peso inválido.");
            return;
        }

        // Salvar peixe no repositório
        JOptionPane.showMessageDialog(this, "Peixe cadastrado com sucesso!");
        limparCampos();
    }

    private void limparCampos() {
        nomeField.setText("");
        tipoAguaCombo.setSelectedIndex(-1);
        dataNascimentoField.setText("");
        pesoField.setText("");
    }
}