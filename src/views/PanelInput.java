package views;

import java.awt.BorderLayout;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInput extends JPanel {

    private static final String INPUT_RESULT_MESSAGE = "Valor convertido en ";

    private JTextField input;
    private JTextField result;
    private JLabel labelResult;

    public PanelInput(KeyListener keyListener) {
        setLayout(new BorderLayout());
        setOpaque(false);
        addInput(keyListener);
    }

    private void addInput(KeyListener keyListener) {
        JPanel panelInput = new JPanel(new BorderLayout());
        panelInput.setOpaque(false);
        JLabel labelInput = new JLabel("Ingresa el valor que deseas convertir");
        panelInput.add(labelInput, BorderLayout.PAGE_START);
        input = new JTextField(20);
        input.addKeyListener(keyListener);
        panelInput.add(input, BorderLayout.CENTER);
        JPanel panelResult = new JPanel(new BorderLayout());
        panelResult.setOpaque(false);
        labelResult = new JLabel(INPUT_RESULT_MESSAGE);
        panelResult.add(labelResult, BorderLayout.PAGE_START);
        result = new JTextField(20);
        result.setEditable(false);
        panelResult.add(result, BorderLayout.CENTER);
        this.add(panelInput, BorderLayout.PAGE_START);
        this.add(panelResult, BorderLayout.CENTER);
    }

    public double getInputValue() {
        String inputValue = input.getText();
        return Double.parseDouble(inputValue.equals("") ? "0" : inputValue);
    }

    public void setInputResult(Object[] resultAndCurrency) {
        labelResult.setText(INPUT_RESULT_MESSAGE + resultAndCurrency[0]);
        result.setText(String.valueOf(resultAndCurrency[1]));
    }

    public void removeValues() {
        labelResult.setText(INPUT_RESULT_MESSAGE);
        input.setText("");
        result.setText("");
    }
}
