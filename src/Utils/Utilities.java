package utils;

public class Utilities {
    
    public static OptionsConverter getOptionConverter(String text) {
        OptionsConverter optionSelected = OptionsConverter.SELECT;
        if (!optionSelected.getText().equals(text)) {
            optionSelected = OptionsConverter.CURRENCY_CONVERTER.getText().equals(text)
                    ? OptionsConverter.CURRENCY_CONVERTER
                    : OptionsConverter.MEASURE_CONVERTER;
        }
        return optionSelected;
    }
    
    public static CurrencyOptions getCurrencyOption(String optionSelected) {
        CurrencyOptions currencyOptions = null;
        for (CurrencyOptions option : CurrencyOptions.values()) {
            if (option.getText().equals(optionSelected)) {
                currencyOptions = option;
            }
        }
        return currencyOptions;
    }

    public static MeasureOptions getMeasureOption(String optionSelected) {
        MeasureOptions measureOptions = null;
        for (MeasureOptions option : MeasureOptions.values()) {
            if (option.getText().equals(optionSelected)) {
                measureOptions = option;
            }
        }
        return measureOptions;
    }
}
