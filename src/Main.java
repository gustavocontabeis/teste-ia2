import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}