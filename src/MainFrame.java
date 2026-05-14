import javax.swing.*;
    
public class MainFrame extends JFrame {
    private JDesktopPane desktopPane;
    private JInternalFrame internalFrame;
    
    public MainFrame() {
        setTitle("Tela Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        initializeMenu();
        initializeDesktop();
    }
    
    private void initializeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem openItem = new JMenuItem("Abrir JInternalFrame");
        openItem.addActionListener(e -> openInternalFrame());
        menu.add(openItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
    
    private void initializeDesktop() {
        desktopPane = new JDesktopPane();
        add(desktopPane);
    }
    
    private void openInternalFrame() {
        if (internalFrame == null || !internalFrame.isVisible()) {
            internalFrame = new JInternalFrame("Exemplo", true, true, true, true);
            internalFrame.setSize(300, 200);
            internalFrame.setVisible(true);
            desktopPane.add(internalFrame);
            internalFrame.moveToFront();
        }
    }
}