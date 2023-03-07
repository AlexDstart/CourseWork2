package enums;

public enum Periodicity {
    ONETIME("однократная задача"),
    DAILY("ежедневная задача"),
    WEEKLY("еженедельная задача"),
    MONTHLY("ежемесячная задача"),
    YEARLY("ежегодная задача");

    private final String periodicityTranslate;

    Periodicity(String periodicityTranslate) {
        this.periodicityTranslate = periodicityTranslate;
    }

    public String getPeriodicityTranslate() {
        return "'" + periodicityTranslate + "'";
    }
}