package SisGerencialNet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestaBairro {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println( LocalDate.now().format(formatador) );
		
		Bairro bairro= new Bairro();
		TipoBairro tipoBairro = new TipoBairro();
		
		bairro.setCodigo(10);
		bairro.setNome("tupa mirim");
		
		tipoBairro.setCodigo(1);
		tipoBairro.setNome("Jardim");
		tipoBairro.setAbreviacao("JD");
		bairro.setTipoBairro(tipoBairro);
		
		try {
			bairro.validaDados();
			
			System.out.println( bairro.toString() );
		} catch (Exception e) {
			System.out.println("erro" + e);
		}		
	}
}
