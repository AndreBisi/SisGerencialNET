package SisGerencialNet;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributesException;


public class TesteRua {

	public static void main(String[] args) throws Exception {
		
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
		cidade.setNome("Tupã");
		cidade.setUF("SP");
		cidade.setIBGE("");
		
		try {
			cidade.validaDados();			
			System.out.println(cidade.toString());
		} catch (DadosException e) {			
			System.out.println("Erro" + e.getMessage());
		}
		
		System.out.println("informe um número inteiro para CIDADE :");
		Scanner ler = new Scanner(System.in);
		int codigo;
		
		codigo = ler.nextInt();	
		
		try {
			cidade.getDados( codigo );			
			System.out.println( cidade.toString() );
		} catch( Exception e ) {
			System.out.println( e.getMessage());
		}		
		System.out.println("----------------");
		
		System.out.println("informe um numero inteiro para RUA : ");
		codigo = ler.nextInt();
		
		Rua ruaPesquisa = new Rua();
		try {
			ruaPesquisa.getDados(codigo);
			System.out.println(ruaPesquisa.toString());
		} catch (Exception e) {
			System.out.println( e.getMessage());
		}
		
		Banco banco = new Banco();
		banco.getDados(1);
		System.out.println(banco);
		
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dia = LocalDate.parse("23/11/2021", formato);
		
		
		//dia.toLocalDate();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCodigo(1);
		pessoa.setTipo(TipoPessoa.FISICA);
		pessoa.setNome("andré");
		pessoa.setDataCadastro(dia);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDataCadastro());
		System.out.println(pessoa.getTipo().getDescricao());

	}
}
