import javax.swing.*;
import view.CadastroCachorroView;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Cachorro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JDesktopPane desktop = new JDesktopPane();
        frame.add(desktop);

        CadastroCachorroView cadastroView = new CadastroCachorroView();
        desktop.add(cadastroView);

        frame.setVisible(true);
    }
}