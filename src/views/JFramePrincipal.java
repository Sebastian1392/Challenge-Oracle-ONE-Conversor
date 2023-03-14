package views;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFramePrincipal extends JFrame {

    private static final String TITLE = "Conversor Challenge";

    private PanelPrincipal panelPrincipal;

    public JFramePrincipal(ActionListener listener, KeyListener keyListener) {
        setMinimumSize(new Dimension(300, 200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon("src/resources/logo.png").getImage());
        setTitle(TITLE);
        initComponents(listener, keyListener);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents(ActionListener listener, KeyListener keyListener) {
        this.panelPrincipal = new PanelPrincipal(listener, keyListener);
        this.add(panelPrincipal);
    }

    public String getConversorOption() {
        return panelPrincipal.getConversorOption();
    }

    public void addPanelConvertCurrency() {
        panelPrincipal.addPanelConvertCurrency();
    }

    public void addPanelConvertMeasure() {
        panelPrincipal.addPanelConvertMeasure();
    }

    public void removePanels() {
        panelPrincipal.removePanels();
    }

    public double getInputValue() {
        return panelPrincipal.getInputValue();
    }

    public void setInputResult(Object[] resultAndCurrency) {
        panelPrincipal.setInputResult(resultAndCurrency);
    }

    public String getSelection() {
        return panelPrincipal.getSelection();
    }
}
