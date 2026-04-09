package avvioageable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MainDate
{
    static void main()
    {
        //Metodo che restituisce data di oggi
        LocalDate data = LocalDate.now();
        //Dando noi 3 parametri, anno mese giorno
        LocalDate compleannoGennaro = LocalDate.of(1999,2,15);
        //Trasformando una String
        LocalDate mioCompleanno = LocalDate.parse("1995-08-27");

        //confrontiamo
        System.out.println(mioCompleanno.isBefore(compleannoGennaro));


        //con plus/minus aggiungiamo o togliamo giorni/mesi/anni o anche settimane
        LocalDate il2maggio = data.plusDays(23);
        System.out.println(il2maggio);

        //prendere solo parti
        int giorno = compleannoGennaro.getDayOfMonth();
        System.out.println("Gennaro è nato il giorno "+giorno);

        //possiamo anche calcolare la differenza tra 2 date
        System.out.println(mioCompleanno.until(compleannoGennaro, ChronoUnit.DAYS));


        //uguale c'è LocalTime
        LocalTime ora = LocalTime.now();
        LocalTime le12e29= LocalTime.of(12,29);
        System.out.println(ora);
        //resto uguale a LocalDate

        LocalDateTime dataPiuOra = LocalDateTime.now();
        System.out.println(dataPiuOra);

        //prendere solo data
        LocalDate soloData = dataPiuOra.toLocalDate();

    }
}
