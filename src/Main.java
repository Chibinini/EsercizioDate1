import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //creare un oggetto offsetDateTime, tramite il metodo parse gli metto la stringa dentro
        OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");


        //formatta la data usando il formatter specificato
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        String dateString = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateStrin2 = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString3 = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        //Stampa il risultato
        System.out.println("Data formattata in FULL: " + dateString);
        System.out.println("Data formattata in MEDIUM " + dateStrin2);
        System.out.println("Data formattata in SHORT: " + dateString3);
    }
}
