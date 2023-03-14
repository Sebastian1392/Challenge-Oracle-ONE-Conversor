package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import models.Conversor;
import utils.CurrencyOptions;
import utils.MeasureOptions;
import utils.OptionsConverter;
import utils.Utilities;
import views.JFramePrincipal;

public class Controller implements ActionListener,KeyListener {

    private Conversor conversor;
    private JFramePrincipal framePrincipal;
    private boolean isCurrency; 
    private boolean isMasure; 

    public Controller() {
        this.conversor = new Conversor();
        this.framePrincipal = new JFramePrincipal(this,this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.framePrincipal != null) {
            switch (Commands.valueOf(e.getActionCommand())) {
                case OPTION_CONVERSOR:
                    showConverterInterface();
                    break;
            }
        }
    }

    private void showConverterInterface() {
        String option = Utilities.getOptionConverter(this.framePrincipal.getConversorOption()).toString();
        switch (OptionsConverter.valueOf(option)) {
            case CURRENCY_CONVERTER:
                framePrincipal.addPanelConvertCurrency();
                isCurrency = true;
                isMasure = false;
                break;
            case MEASURE_CONVERTER:
                framePrincipal.addPanelConvertMeasure();
                isMasure = true;
                isCurrency = false;
                break;
            case SELECT:
                framePrincipal.removePanels();
                isCurrency = false;
                isMasure = false;
                break;
        }
    }

    public static void main(String[] args) {
        new Controller();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (isCurrency == true) {
            CurrencyOptions optionSelected = Utilities.getCurrencyOption(framePrincipal.getSelection());
            Object[] valueConverted = conversor.convertToSelectedCurrency(optionSelected.getCurrencyType().toString(),
                    framePrincipal.getInputValue(), optionSelected.isConvertToCOP());
            framePrincipal.setInputResult(valueConverted);
        }
        if (isMasure == true) {
            MeasureOptions optionSelected = Utilities.getMeasureOption(framePrincipal.getSelection());
            Object[] valueConverted = conversor.convertToSelectedMeasure(optionSelected.getMeasureType().toString(),
                    framePrincipal.getInputValue(), optionSelected.isConvertToMeters());
            framePrincipal.setInputResult(valueConverted);
        }
        
    }
}
