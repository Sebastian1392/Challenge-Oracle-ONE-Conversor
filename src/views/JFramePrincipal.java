package views;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class JFramePrincipal extends JFrame {

    private static final String TITLE = "Conversor Challenge";

    private PanelPrincipal panelPrincipal;

    public JFramePrincipal(ActionListener listener) {
        setMinimumSize(new Dimension(700, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setIconImage(new ImageIcon("resources/img/logo3.png").getImage());
        setTitle(TITLE);
        initComponents(listener);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents(ActionListener listener){
        this.panelPrincipal = new PanelPrincipal(listener);
        this.add(panelPrincipal);
    }

}
