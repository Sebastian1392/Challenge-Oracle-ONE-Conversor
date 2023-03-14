package utils;

public enum MeasureType {
    
    MILIMETER("milimetros"), CENTIMETER("centimetros"), KILOMETER("Kilometros"),
    MILE("Milla"), YARD("Yarda");

    private String name;

    MeasureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
