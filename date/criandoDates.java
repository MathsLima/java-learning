package arrays.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class criandoDates {
    public static void main(String[] args) {

        LocalDate data1 = LocalDate.now();
        System.out.println("Date: " + data1);

        LocalDateTime data2 = LocalDateTime.now();
        System.out.println("Datetime: " + data2);

        Instant data3 = Instant.now();
        System.out.println("Instant: " + data3.toString());

        //formatando string para date 
        DateTimeFormatter formata1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //importar o formatter
        LocalDate data4 = LocalDate.parse("15/01/2024", formata1);
        System.out.println("Instant: " + data4.toString());


    }
}
