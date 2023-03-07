package interfaces;

import java.time.LocalDate;

public interface DateInterfaces {
    boolean appearsIn(LocalDate date);

    LocalDate getDateFromTask();

    String getTitleFromTask();

    String getDescriptionFromTask();

    void setTitleFromTask(String title);

    void setDescriptionFromTask(String description);
}