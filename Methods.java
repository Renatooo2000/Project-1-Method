
import java.time.LocalDate;
import java.time.LocalTime;

public class Methods {
    public static void main(String[] args) {
        System.out.println(4 * 3);
        CosaVuoiFareOggi();
        printNumber(22, 11);
    }

    public static void CosaVuoiFareOggi() {
        LocalDate giorno = LocalDate.now();
        LocalTime Ora = LocalTime.now();
        System.out.println(giorno);
        System.out.println(Ora);
        System.out.println("cosa vuoi fare oggi?");
    }

    public static void printNumber(final int b, final int z) {
        System.out.println("Il primo valore è: " + b);
        System.out.println("Il secondo valore è: " + z);
        System.out.println("La somma dei due valori è:" + (b + z));
        System.out.println("Il risultato della moltiplicazione è: " + (b * z));
    }

}
