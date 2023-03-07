package task;

import enums.Periodicity;
import enums.Type;
import interfaces.DateInterfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Objects;

public class MonthlyTask extends Task implements DateInterfaces {

    private final Periodicity periodicity;
    public MonthlyTask(Type type, String title, LocalDateTime dateTime, String description) {
        super(type, title, dateTime, description);
        this.periodicity = Periodicity.MONTHLY;
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        Period periodBetween = Period.between(getOnlyDate(), date);
        return periodBetween.getMonths() >= 1 && periodBetween.getDays() == 0 && !periodBetween.isNegative() || date.equals(getOnlyDate());
    }

    @Override
    public LocalDate getDateFromTask() {
        return getOnlyDate();
    }

    @Override
    public String getTitleFromTask() {
        return getTitle();
    }

    @Override
    public String getDescriptionFromTask() {
        return getDescription();
    }

    @Override
    public void setTitleFromTask(String title) {
        setTitle(title);
    }

    @Override
    public void setDescriptionFromTask(String description) {
        setDescription(description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonthlyTask that)) return false;
        if (!super.equals(o)) return false;
        return periodicity == that.periodicity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), periodicity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "периодичность=" + periodicity.getPeriodicityTranslate() +
                '}';
    }
}
