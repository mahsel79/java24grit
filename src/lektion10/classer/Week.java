package lektion10.classer;

/*
    Exempel på en liten klass
    Bara för att visa att det inte behöver vara mycket mer än såhär i en klass.
 */
public class Week {
    DayModel[] daysInWeek = new DayModel[7];

    public Week() {
        for (int i = 0; i < daysInWeek.length; i++) {
            daysInWeek[i] = new DayModel("2024,11,1", "dag", false);
        }
    }

    public DayModel[] getDaysInWeek() {
        return daysInWeek;
    }
}