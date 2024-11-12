package lektion9;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class Datum {

    public static void main(String[] args) {
        //Dagen / idag, kommer påverkas av NÄR koden körs
        LocalDate today = LocalDate.now();

        // Hämta ut sista dagen denna månad
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());

        //Skapar en lista med alla kvarstående dagar
        List<LocalDate> remainingDays = today.datesUntil(endOfMonth.plusDays(1))
                .collect(Collectors.toList()); //Lamda - används för att returnera en lista

        // For each loop
        for(LocalDate remainingDay : remainingDays) {
            // Skriver ut siffran / datum för dagen - skriver ut dagens namn (engelska)
            System.out.println(remainingDay.getDayOfMonth() + "\t" + remainingDay.getDayOfWeek());
        }
    }
}
