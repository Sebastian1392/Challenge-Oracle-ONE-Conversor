package utils;

public enum CurrencyType {
    
    DOLLAR("Dolares"), EURO("Euros"), STERLING("Libras Esterlinas"), YEN("Yenes"), WON("WON Sur Coreano");

    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
