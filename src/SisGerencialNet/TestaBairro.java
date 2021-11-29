package SisGerencialNet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestaBairro {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println( LocalDate.now().format(formatador) );
	}

}
