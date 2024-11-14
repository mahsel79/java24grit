package lektion10.classer;

/*
    En klass vars enda uppgift är till för att lagra information som flyttas mellan klasser.
    Syntaxen är densamma som för övriga klasser. Dock tyder namnsättningen ...Model på att tanken med
    objektet enbart ör att lagra information.
 */
public class DayModel {
    String date;
    String day;
    boolean isTodya;

    public DayModel(String date, String day, boolean isTodya) {
        this.date = date;
        this.day = day;
        this.isTodya = isTodya;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public boolean isTodya() {
        return isTodya;
    }

    @Override
    public String toString() {
        return "DayModel{" +
                "date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", isTodya=" + isTodya +
                '}';
    }
}
