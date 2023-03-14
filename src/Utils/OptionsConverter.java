package utils;

public enum OptionsConverter {

    SELECT("Seleccione"), CURRENCY_CONVERTER("Conversor de Divisas"),
    MEASURE_CONVERTER("Conversor de Medidas");

    private String text;

    OptionsConverter(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
