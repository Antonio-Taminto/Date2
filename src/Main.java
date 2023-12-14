import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataString = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        System.out.println(dataString);
    }
}