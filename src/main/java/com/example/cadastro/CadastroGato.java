package com.example.cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CadastroGato extends JInternalFrame {
    private JTextField nomeField;
    private JComboBox<String> sexoCombo;
    private JSpinner dataNascimentoField;
    private JButton salvarButton;
    private List<String> gatos;

    public CadastroGato() {
        super("Cadastro de Gato", true, true, true, true);
        gatos = new ArrayList<>();
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Nome do Gato:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Data de Nascimento do Gato:"));
        dataNascimentoField = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editor = new JSpinner.DateEditor(dataNascimentoField, "dd/MM/yyyy");
        dataNascimentoField.setEditor(editor);
        panel.add(dataNascimentoField);

        panel.add(new JLabel("Sexo do Gato:"));
        sexoCombo = new JComboBox<>(new String[]{"Macho", "Fêmea"});
        panel.add(sexoCombo);

        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarGato();
            }
        });
        panel.add(salvarButton);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    private void salvarGato() {
        String nome = nomeField.getText();
        String dataNascimento = dataNascimentoField.getValue().toString();
        String sexo = (String) sexoCombo.getSelectedItem();

        if (nome.isEmpty() || dataNascimento.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        gatos.add(nome + " - " + dataNascimento + " - " + sexo);
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        nomeField.setText("");
        dataNascimentoField.setValue(new java.util.Date());
        sexoCombo.setSelectedIndex(0);
    }
}