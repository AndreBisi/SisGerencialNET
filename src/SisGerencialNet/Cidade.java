package SisGerencialNet;

import java.sql.ResultSet;
import java.sql.SQLException;

import SisGerencialNet.ConexaoPGSQL;

public class Cidade {
	
	private int codigo;
	private String nome;
	private String UF;
	private String IBGE;
	
	public String getIBGE() {
		return IBGE;
	}
	public void setIBGE(String iBGE) {
		IBGE = iBGE;
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
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF.toUpperCase();
	}
	
	@Override
	public String toString() {		
		return String.format("%s - %s (%s) - %s", this.codigo, this.nome, this.UF, this.IBGE);
	}
	
	public void validaDados() throws DadosException {
		if (this.codigo == 0) {
			throw new DadosException("Código inválido");
		}
		
		if (this.nome == "") {
			throw new DadosException("Nome inválido");
		}		
		
		if (this.UF == "") {
			throw new DadosException("UF inválida");
		}
	}
	
	public void getDados(int codigo) throws Exception {

		ConexaoPGSQL banco = new ConexaoPGSQL();
		banco.Conectar("", "", "");
		ResultSet rs = banco.stmt.executeQuery("select * from tbCidade where cidadeCod = " + codigo);

		if (rs.next()) {
			this.codigo = rs.getInt("cidadeCod");
			this.nome = rs.getString("cidadeNome");
			this.UF = rs.getString("cidadeUF");
    		this.IBGE = rs.getString("cidadeIBGE");			
			
		}else {
			throw new Exception("Cidade não localizada");
		}
			
		banco.Desconectar();
	}	

}
