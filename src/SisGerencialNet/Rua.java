package SisGerencialNet;

import java.util.ArrayList;
import java.util.List;

public class Rua {
	
	private int codigo;
	private String nome;
	private String cep;
	private Logradouro logradouro;
	
	public Rua() {
		logradouro = new Logradouro();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Logradouro getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}   
	
	public void validaDados() throws DadosException {
		if (this.codigo == 0){
			throw new DadosException("Código inválido");
		}
		
		if (this.nome == ""){
			throw new DadosException("Nome inválido");
		}
		
		this.logradouro.validaDados();
	}
	
	@Override
	public String toString() {
		
		return String.format( "%s - %s - %s ( %s)", this.codigo, this.nome, this.cep, this.logradouro.toString() );
	}

}
