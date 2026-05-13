package view;

import javax.swing.*;
import java.awt.*;

public class CadastroCachorroView extends JInternalFrame {
    private JTextField nomeField;
    private JTextField dataField;
    private JTextField tipoRacaField;
    private JButton cadastrarButton;
    private JButton cancelarButton;

    public CadastroCachorroView() {
        setTitle("Cadastro de Cachorro");
        setLayout(new GridLayout(4, 2));
        
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);
        
        add(new JLabel("Data de Nascimento (dd/MM/yyyy):"));
        dataField = new JTextField();
        add(dataField);
        
        add(new JLabel("Tipo de Raça:"));
        tipoRacaField = new JTextField();
        add(tipoRacaField);
        
        cadastrarButton = new JButton("Cadastrar");
        add(cadastrarButton);
        cancelarButton = new JButton("Cancelar");
        add(cancelarButton);
        
        setSize(300, 200);
        setVisible(true);
    }

    public JTextField getNomeField() { return nomeField; }
    public JTextField getDataField() { return dataField; }
    public JTextField getTipoRacaField() { return tipoRacaField; }
    public JButton getCadastrarButton() { return cadastrarButton; }
    public JButton getCancelarButton() { return cancelarButton; }
}