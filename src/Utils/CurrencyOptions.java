package utils;

public enum CurrencyOptions {
    COP_EURO("COP a Euros", CurrencyType.EURO, false),
    COP_DOLLAR("COP a Dolares", CurrencyType.DOLLAR, false),
    COP_STERLING("COP a Libras Esterlinas", CurrencyType.STERLING, false),
    COP_WON("COP a WON Sur Coreano", CurrencyType.WON, false),
    COP_YEN("COP a YEN Chino", CurrencyType.YEN,false),
    EURO_COP("Euros a COP", CurrencyType.EURO, true),
    DOLLAR_COP("Dolares a COP", CurrencyType.DOLLAR, true),
    STERLING_COP("Libras Esterlinas a COP", CurrencyType.STERLING, true),
    WON_COP("WON Sur Coreano a COP", CurrencyType.WON, true),
    YEN_COP("YEN Chino a COP", CurrencyType.YEN, true);

    private String text;
    private CurrencyType currencyType;
    private boolean convertToCOP;

    CurrencyOptions(String text, CurrencyType currencyType, boolean toCop) {
        this.text = text;
        this.currencyType = currencyType;
        this.convertToCOP = toCop;
    }

    public String getText() {
        return text;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public boolean isConvertToCOP() {
        return convertToCOP;
    }
}
