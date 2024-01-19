package arrays.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formataDates {
    public static void main(String[] args) {

        LocalDate data1 = LocalDate.parse("2024-01-15");
        LocalDateTime data2 = LocalDateTime.parse("2024-01-15T23:29:22.499");
        Instant data3 = Instant.parse("2024-01-16T02:29:22.499Z");

        // formata o Date
        DateTimeFormatter formata1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data = " + data1.format(formata1));
        // ou
        System.out.println("Data = " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
