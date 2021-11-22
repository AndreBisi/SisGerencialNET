package SisGerencialNet;

import java.sql.ResultSet;

public class Logradouro {

	private int codigo;
	private String nome;
	private String abreviacao;
	
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
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao.toUpperCase();
	}	
	
	public void validaDados() throws DadosException{
		if (this.codigo == 0)
			throw new DadosException("Código inválido");
		
		if ( this.nome == "" )
			throw new DadosException("Nome inválido");			
				
	}
	
	@Override
	public String toString() {
		
		return String.format("%s - %s (%s)", this.codigo, this.nome, this.abreviacao);
	}
	
	public void getDados(int codigo) throws Exception {

		ConexaoPGSQL banco = new ConexaoPGSQL();
		banco.Conectar("", "", "");
		ResultSet rs = banco.stmt.executeQuery("select * from tbLogradouro where logradouroCod = " + codigo);

		if (rs.next()) {
			this.codigo = rs.getInt("logradouroCod");
			this.nome = rs.getString("logradouroNome");
			this.abreviacao = rs.getString("logradouroAbrev");			
		}else {
			this.codigo = 0;
			this.nome = "";
			this.abreviacao = "";
		}
			
		banco.Desconectar();
	}		
}
