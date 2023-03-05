package models;

public class Currency {
    
    private double currencyValueInCOP;

    public Currency(double value) {
        this.currencyValueInCOP = value;
    }

    public double getCurrencyValue() {
        return currencyValueInCOP;
    }

    public void setCurrencyValue(double currencyValue) {
        this.currencyValueInCOP = currencyValue;
    }

    public double COPToCurrency(double valueConverter) {
        return valueConverter / currencyValueInCOP;
    }

    public double CurrencyToCOP(double valueConverter) {
        return valueConverter * currencyValueInCOP;
    }
}
