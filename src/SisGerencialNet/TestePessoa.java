package SisGerencialNet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestePessoa {

	public static void main(String[] args) {
		LocalDate data = LocalDate.now();

		System.out.println(data);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(data.format(formatter));
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setDataNascimento(LocalDate.of( 1978, 7, 21 ) );
		
	    System.out.println(pessoa.getDataNascimento().format(formatter));
	    
	    pessoa.setDataCadastro(LocalDate.parse("2021-11-29"));
	    
	    System.out.println(pessoa.getDataCadastro().format(formatter));
	    
	    System.out.println(pessoa.getIdade());
		

	}

}
