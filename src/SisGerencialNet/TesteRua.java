package SisGerencialNet;

import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;

public class TesteRua {

	public static void main(String[] args) throws InvalidAttributesException {
		
		Rua rua = new Rua();
		Logradouro logradouro = new Logradouro();
		
		rua.setCodigo(1);
		rua.setNome("guaiAnAZeS");
		rua.setCep("17600130");
		logradouro.setCodigo(10);
		logradouro.setNome("RUa");
		logradouro.setAbreviacao("r");		
		rua.setLogradouro(logradouro);
		
		try {
			rua.validaDados();	
			
			System.out.println( rua.toString() );
			
		} catch (DadosException e) {
			System.out.println("Erro " + e.getMessage());
		}
	}
}
