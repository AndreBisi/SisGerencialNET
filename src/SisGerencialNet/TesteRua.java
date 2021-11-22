package SisGerencialNet;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributesException;


public class TesteRua {

	public static void main(String[] args) throws InvalidAttributesException, SQLException {
		
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
		
		Cidade cidade = new Cidade();
		cidade.setCodigo(85);
		cidade.setNome("Tup�");
		cidade.setUF("SP");
		cidade.setIBGE("");
		
		try {
			cidade.validaDados();			
			System.out.println(cidade.toString());
		} catch (DadosException e) {			
			System.out.println("Erro" + e.getMessage());
		}
		
		System.out.println("informe um n�mero inteiro");
		Scanner ler = new Scanner(System.in);
		int codigo;
		
		codigo = ler.nextInt();	
		
		try {
			cidade.getDados( codigo );
			
			System.out.println( cidade.toString() );
		} catch( Exception e ) {
			System.out.println( e.getMessage());
		}

	}
}
