package homework.tasks.sixth;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {

    private String text;

    Note (String text){
        this.text = text;
    }

    @Override
    public String toString() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now) + " [" + text + "]";
    }
}
