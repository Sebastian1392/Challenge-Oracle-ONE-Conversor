package models;

import Utils.CurrencyType;

public class Conversor {

    private DollarCurrency dollarCurrency;
    private EuroCurrency euroCurrency;
    private SterlingCurrency sterlingCurrency;
    private WonCurrency wonCurrency;
    private YenCurrency yenCurrency;
    
    public Conversor() {
        this.dollarCurrency = new DollarCurrency();
        this.euroCurrency = new EuroCurrency();
        this.sterlingCurrency = new SterlingCurrency();
        this.wonCurrency = new WonCurrency();
        this.yenCurrency = new YenCurrency();
    }
    
    public double convertToSelectedCurrency(String currencyType, double value, boolean toCop) {
        double valueConverter = 0;
        switch (CurrencyType.valueOf(currencyType)) {
            case DOLLAR:
                valueConverter = convert(toCop, dollarCurrency, value);
                break;
            case EURO:
                valueConverter = convert(toCop, euroCurrency, value);
                break;
            case STERLING:
                valueConverter = convert(toCop, sterlingCurrency, value);
                break;
            case WON:
                valueConverter = convert(toCop, wonCurrency, value);
                break;
            case YEN:
                valueConverter = convert(toCop, yenCurrency, value);
                break;
        }
        return valueConverter;
    }
    
    private double convert(boolean toCop, Currency currency, double value) {
        double valueConverted = currency.COPToCurrency(value);
        if (toCop) {
            valueConverted = currency.CurrencyToCOP(value);
        }
        return valueConverted;
    }
}
