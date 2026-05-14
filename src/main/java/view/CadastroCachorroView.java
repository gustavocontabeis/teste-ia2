package view;

import controller.CadastroCachorroController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCachorroView extends JInternalFrame {
    private JTextField nomeField;
    private JTextField dataNascimentoField;
    private JTextField tipoRacaField;
    private CadastroCachorroController controller;

    public CadastroCachorroView() {
        setTitle("Cadastro de Cachorro");
        setSize(300, 200);
        setLayout(null);

        nomeField = new JTextField();
        nomeField.setBounds(10, 10, 150, 20);
        add(nomeField);

        dataNascimentoField = new JTextField();
        dataNascimentoField.setBounds(10, 40, 150, 20);
        add(dataNascimentoField);

        tipoRacaField = new JTextField();
        tipoRacaField.setBounds(10, 70, 150, 20);
        add(tipoRacaField);

        JButton salvarButton = new JButton("Salvar");
        salvarButton.setBounds(10, 100, 80, 30);
        adicionarActionListenerSalvar(salvarButton);
        add(salvarButton);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setBounds(100, 100, 80, 30);
        adicionarActionListenerCancelar(cancelarButton);
        add(cancelarButton);

        setVisible(true);
    }

    private void adicionarActionListenerSalvar(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.salvarCachorro(nomeField.getText(), dataNascimentoField.getText(), tipoRacaField.getText());
            }
        });
    }

    private void adicionarActionListenerCancelar(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.cancelarCadastro();
            }
        });
    }

    public void setController(CadastroCachorroController controller) {
        this.controller = controller;
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public void fechar() {
        dispose();
    }
}