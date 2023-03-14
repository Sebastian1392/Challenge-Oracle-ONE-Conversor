package models;

import utils.CurrencyType;
import utils.MeasureType;

public class Conversor {

    private DollarCurrency dollarCurrency;
    private EuroCurrency euroCurrency;
    private SterlingCurrency sterlingCurrency;
    private WonCurrency wonCurrency;
    private YenCurrency yenCurrency;
    private MilimeterMeasure milimeterMeasure;
    private CentimeterMeasure centimeterMeasure;
    private KilometerMeasure kilometerMeasure;
    private MileMeasure mileMeasure;
    private YardMeasure yardMeasure;

    public Conversor() {
        initCurrency();
        initMeasure();
    }

    private void initCurrency() {
        this.dollarCurrency = new DollarCurrency();
        this.euroCurrency = new EuroCurrency();
        this.sterlingCurrency = new SterlingCurrency();
        this.wonCurrency = new WonCurrency();
        this.yenCurrency = new YenCurrency();
    }

    private void initMeasure() {
        this.milimeterMeasure = new MilimeterMeasure();
        this.centimeterMeasure = new CentimeterMeasure();
        this.kilometerMeasure = new KilometerMeasure();
        this.mileMeasure = new MileMeasure();
        this.yardMeasure = new YardMeasure();
    }

    public Object[] convertToSelectedCurrency(String currencyType, double value, boolean toCop) {
        String currency = "";
        double valueConverter = 0;
        switch (CurrencyType.valueOf(currencyType)) {
            case DOLLAR:
                valueConverter = convertToSelection(toCop, dollarCurrency, value);
                currency = CurrencyType.DOLLAR.getName();
                break;
            case EURO:
                valueConverter = convertToSelection(toCop, euroCurrency, value);
                currency = CurrencyType.EURO.getName();
                break;
            case STERLING:
                valueConverter = convertToSelection(toCop, sterlingCurrency, value);
                currency = CurrencyType.STERLING.getName();
                break;
            case WON:
                valueConverter = convertToSelection(toCop, wonCurrency, value);
                currency = CurrencyType.WON.getName();
                break;
            case YEN:
                valueConverter = convertToSelection(toCop, yenCurrency, value);
                currency = CurrencyType.YEN.getName();
                break;
        }
        return new Object[] { toCop ? "COP" : currency, String.format("%.5f",valueConverter) };
    }

    public Object[] convertToSelectedMeasure(String measureType, double value, boolean toMeters) {
        String currency = "";
        double valueConverter = 0;
        switch (MeasureType.valueOf(measureType)) {
            case MILIMETER:
                valueConverter = convertToSelection(toMeters, milimeterMeasure, value);
                currency = MeasureType.MILIMETER.getName();
                break;
            case CENTIMETER:
                valueConverter = convertToSelection(toMeters, centimeterMeasure, value);
                currency = MeasureType.CENTIMETER.getName();
                break;
            case KILOMETER:
                valueConverter = convertToSelection(toMeters, kilometerMeasure, value);
                currency = MeasureType.KILOMETER.getName();
                break;
            case MILE:
                valueConverter = convertToSelection(toMeters, mileMeasure, value);
                currency = MeasureType.MILE.getName();
                break;
            case YARD:
                valueConverter = convertToSelection(toMeters, yardMeasure, value);
                currency = MeasureType.YARD.getName();
                break;
        }
        return new Object[] { toMeters ? "metros" : currency, valueConverter };
    }

    private double convertToSelection(boolean toPrincipal, Currency currency, double value) {
        double valueConverted = currency.COPToCurrency(value);
        if (toPrincipal) {
            valueConverted = currency.CurrencyToCOP(value);
        }
        return valueConverted;
    }

    private double convertToSelection(boolean toPrincipal, Measure measure, double value) {
        double valueConverted = measure.metersToMeasure(value);
        if (toPrincipal) {
            valueConverted = measure.measureToMeters(value);
        }
        return valueConverted;
    }

}
