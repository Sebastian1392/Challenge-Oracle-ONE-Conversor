package models;

public class Measure {
    
    private double MeasureValueInMeters;

    public Measure(double value) {
        this.MeasureValueInMeters = value;
    }

    public double getMeasureValue() {
        return MeasureValueInMeters;
    }

    public void setMeasureValue(double MeasureValue) {
        this.MeasureValueInMeters = MeasureValue;
    }

    public double metersToMeasure(double valueConverter) {
        return valueConverter / MeasureValueInMeters;
    }

    public double measureToMeters(double valueConverter) {
        return valueConverter * MeasureValueInMeters;
    }
}
