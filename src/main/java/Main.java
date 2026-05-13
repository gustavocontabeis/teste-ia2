import view.CadastroCachorroView;
import controller.CachorroController;
import service.CachorroService;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Cadastro de Cachorro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        CadastroCachorroView view = new CadastroCachorroView();
        CachorroService service = new CachorroService();
        new CachorroController(view, service);
        frame.add(view);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}