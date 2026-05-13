import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField tela;
    private double num1, num2, resultado;
    private String operador;

    public Calculadora() {
        setTitle("Calculadora Simples");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        tela = new JTextField();
        add(tela, BorderLayout.NORTH);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4));

        String[] botoes = {"7", "8", "9", " ", "4", "5", "6", " ", "1", "2", "3", " ", "C", "0", "=", " ", "/", "*", "-", "+"};

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.addActionListener(this);
            painel.add(botao);
        }

        add(painel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        try {
            if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
                tela.setText(tela.getText() + comando);
            } else if (comando.charAt(0) == 'C') {
                tela.setText("");
                num1 = num2 = resultado = 0;
                operador = "";
            } else if (comando.charAt(0) == '=') {
                num2 = Double.parseDouble(tela.getText());
                resultado = calcular(num1, num2, operador);
                tela.setText(Double.toString(resultado));
            } else {
                num1 = Double.parseDouble(tela.getText());
                operador = comando;
                tela.setText("");
            }
        } catch (NumberFormatException ex) {
            tela.setText("Erro");
        }
    }

    private double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) {
                    tela.setText("Divisão por zero!");
                    return 0;
                } else {
                    return num1 / num2;
                }
            default: return 0;
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}