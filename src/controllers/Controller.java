package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Conversor;
import views.JFramePrincipal;

public class Controller implements ActionListener{
    
    private Conversor conversor;
    private JFramePrincipal framePrincipal;

    public Controller() {
        this.conversor = new Conversor();
        this.framePrincipal = new JFramePrincipal(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Commands.valueOf(e.getActionCommand())) {
        }
    }

    private void convertCurrency() {
        double valueConverted = conversor.convertToSelectedCurrency(null, 0, false);
    }

    public static void main(String[] args) {
        new Controller();
    }
}
