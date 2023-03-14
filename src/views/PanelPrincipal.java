package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.Commands;
import utils.CurrencyOptions;
import utils.MeasureOptions;
import utils.OptionsConverter;

public class PanelPrincipal extends JPanel {

    private JComboBox<String> conversorSelector;
    private JComboBox<String> conversorCurrencySelector;
    private JPanel panelConversor;
    private JPanel panelCurrency;
    private JPanel panelMeasure;
    private PanelInput panelInput;

    public PanelPrincipal(ActionListener listener, KeyListener keyListener) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        addComboBox(listener);
        initPanels(keyListener);
    }

    private void initPanels(KeyListener keyListener) {
        panelConversor = new JPanel(new BorderLayout());
        panelConversor.setOpaque(false);
        this.add(panelConversor, BorderLayout.CENTER);
        panelInput = new PanelInput(keyListener);
        this.add(panelInput, BorderLayout.PAGE_END);
    }

    private void addComboBox(ActionListener listener) {
        JPanel panelHead = new JPanel(new BorderLayout());
        panelHead.setOpaque(false);
        JLabel questionLabel = new JLabel("¿Qué conversor quieres usar?");
        panelHead.add(questionLabel, BorderLayout.PAGE_START);

        conversorSelector = new JComboBox<String>();
        conversorSelector.addActionListener(listener);
        conversorSelector.setActionCommand(Commands.OPTION_CONVERSOR.toString());
        for (OptionsConverter option : OptionsConverter.values()) {
            conversorSelector.addItem(option.getText());
        }
        panelHead.add(conversorSelector, BorderLayout.CENTER);

        this.add(panelHead, BorderLayout.PAGE_START);
    }

    public void addPanelConvertCurrency() {
        removePanels();
        panelCurrency = new JPanel(new BorderLayout());
        panelCurrency.setOpaque(false);
        JLabel questionLabel = new JLabel("¿A qué moneda quieres convertir?");
        panelCurrency.add(questionLabel, BorderLayout.PAGE_START);

        conversorCurrencySelector = new JComboBox<String>();
        for (CurrencyOptions option : CurrencyOptions.values()) {
            conversorCurrencySelector.addItem(option.getText());
        }
        panelCurrency.add(conversorCurrencySelector, BorderLayout.CENTER);

        this.panelConversor.add(panelCurrency, BorderLayout.PAGE_START);
        this.panelConversor.revalidate();
        this.panelConversor.repaint();
    }

    public void addPanelConvertMeasure() {
        removePanels();
        panelMeasure = new JPanel(new BorderLayout());
        panelMeasure.setOpaque(false);
        JLabel questionLabel = new JLabel("¿A qué medida quieres convertir?");
        panelMeasure.add(questionLabel, BorderLayout.PAGE_START);

        conversorCurrencySelector = new JComboBox<String>();
        for (MeasureOptions option : MeasureOptions.values()) {
            conversorCurrencySelector.addItem(option.getText());
        }
        panelMeasure.add(conversorCurrencySelector, BorderLayout.CENTER);

        this.panelConversor.add(panelMeasure, BorderLayout.PAGE_START);
        this.panelConversor.revalidate();
        this.panelConversor.repaint();
    }

    public String getConversorOption() {
        return conversorSelector.getSelectedItem().toString();
    }

    public String getConversorCurrencyOption() {
        return conversorCurrencySelector.getSelectedItem().toString();
    }

    public void removePanels() {
        if (panelConversor.getComponents().length > 0) {
            this.panelConversor.remove(0);
        }
        panelInput.removeValues();
    }

    public double getInputValue() {
        return panelInput.getInputValue();
    }

    public void setInputResult(Object[] resultAndCurrency) {
        panelInput.setInputResult(resultAndCurrency);
    }

    public String getSelection() {
        return String.valueOf(conversorCurrencySelector.getSelectedItem());
    }
}
