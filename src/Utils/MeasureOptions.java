package utils;

public enum MeasureOptions {
    MS_MM("metros a milimetro", MeasureType.MILIMETER, false),
    MS_CM("metros a centimetros", MeasureType.CENTIMETER, false),
    MS_KM("metros a Kilometros", MeasureType.KILOMETER, false),
    MS_ML("metros a Milla", MeasureType.MILE, false),
    MS_YD("metros a Yardas", MeasureType.YARD,false),
    MM_MS("milimetro a metros", MeasureType.MILIMETER, true),
    CM_MS("centimetros a metros", MeasureType.CENTIMETER, true),
    KM_MS("Kilometros a metros", MeasureType.KILOMETER, true),
    ML_MS("Milla a metros", MeasureType.MILE, true),
    YD_MS("Yarda a metros", MeasureType.YARD, true);
    ;
    private String text;
    private MeasureType measureType;
    private boolean convertToMeters;

    MeasureOptions(String text, MeasureType measureType, boolean convertToMeters) {
        this.text = text;
        this.measureType = measureType;
        this.convertToMeters = convertToMeters;
    }

    public String getText() {
        return text;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public boolean isConvertToMeters() {
        return convertToMeters;
    }
}
