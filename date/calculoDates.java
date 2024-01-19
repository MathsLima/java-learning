package arrays.dataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class calculoDates {
    public static void main(String[] args) {

        LocalDate data1 = LocalDate.parse("2024-01-15");

        // diminuindo e inserindo dias
        LocalDate semanaPassadaLocalDate = data1.minusDays(7);
        LocalDate ProximasemanaLocalDate = data1.plusDays(7);

        System.out.println("Hoje = " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(
                "Semana passada = " + semanaPassadaLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(
                "Proxima semana = " + ProximasemanaLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
