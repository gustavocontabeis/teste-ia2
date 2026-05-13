package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroPeixe extends JInternalFrame {
    private JTextField nomePeixeField;
    private JFormattedTextField dataNascimentoField;
    private JComboBox<String> tipoAguaCombo;
    private JTextField especieField;
    private JTextField pesoField;

    public CadastroPeixe() {
        setTitle("Cadastro de Peixe");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Inicializando os componentes
        nomePeixeField = new JTextField();
        dataNascimentoField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        tipoAguaCombo = new JComboBox<>(new String[]{"Doce", "Salgada", "Mista"});
        especieField = new JTextField();
        pesoField = new JTextField();

        JButton salvarButton = new JButton("Salvar");
        JButton cancelarButton = new JButton("Cancelar");

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // Adicionando componentes ao JInternalFrame
        add(new JLabel("Nome do Peixe:"));
        add(nomePeixeField);
        add(new JLabel("Data de Nascimento:"));
        add(dataNascimentoField);
        add(new JLabel("Tipo de Água:"));
        add(tipoAguaCombo);
        add(new JLabel("Espécie:"));
        add(especieField);
        add(new JLabel("Peso:"));
        add(pesoField);
        add(salvarButton);
        add(cancelarButton);

        setResizable(true);
        setClosable(true);
        setIconifiable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void salvar() {
        String nome = nomePeixeField.getText().trim();
        String dataString = dataNascimentoField.getText().trim();
        String tipoAgua = (String) tipoAguaCombo.getSelectedItem();
        String pesoString = pesoField.getText().trim();

        // Validação dos campos obrigatórios
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O nome do peixe não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tipoAgua == null) {
            JOptionPane.showMessageDialog(this, "O tipo de água deve ser selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isDataValida(dataString)) {
            JOptionPane.showMessageDialog(this, "Data de nascimento inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isPesoValido(pesoString)) {
            JOptionPane.showMessageDialog(this, "Peso deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Aqui você pode adicionar a lógica para salvar os dados
        JOptionPane.showMessageDialog(this, "Peixe cadastrado com sucesso!");
        limparCampos();
    }

    private boolean isDataValida(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dt = sdf.parse(data);
            return !dt.after(new Date()); // Data não pode ser futura
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isPesoValido(String peso) {
        try {
            double p = Double.parseDouble(peso);
            return p > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void limparCampos() {
        nomePeixeField.setText("");
        dataNascimentoField.setValue(null);
        tipoAguaCombo.setSelectedIndex(-1);
        especieField.setText("");
        pesoField.setText("");
    }
}