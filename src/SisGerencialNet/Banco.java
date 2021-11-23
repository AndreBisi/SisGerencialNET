package SisGerencialNet;

import java.sql.ResultSet;

public class Banco {
	
	private int codigo;
	private String nome;
	private int codigoFebraban;
	private int digitoFebraban;
	
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
	public int getCodigoFebraban() {
		return codigoFebraban;
	}
	public void setCodigoFebraban(int codigoFebraban) {
		this.codigoFebraban = codigoFebraban;
	}
	public int getDigitoFebraban() {
		return digitoFebraban;
	}
	public void setDigitoFebraban(int digitoFebraban) {
		this.digitoFebraban = digitoFebraban;
	}
	
	public void validaDados() throws DadosException {
		if (this.codigo == 0) {
			throw new DadosException("Código inválido");			
		}
		
		if (this.nome == "") {
			throw new DadosException("Nome inválido");
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s ( %s.%s )", this.codigo, this.nome, this.codigoFebraban, this.digitoFebraban);
	}
  
	public void getDados(int codigo) throws Exception {

		ConexaoPGSQL banco = new ConexaoPGSQL();
		banco.Conectar("", "", "");
		ResultSet rs = banco.stmt.executeQuery("select * from tbBanco where bancoCod = " + codigo);

		if (rs.next()) {
			this.codigo = rs.getInt("bancoCod");
			this.nome = rs.getString("bancoNome");
			this.codigoFebraban = rs.getInt("bancoCodFeb");
    		this.digitoFebraban = rs.getInt("bancoDigFeb");			
			
		}else {
			throw new Exception("Banco não localizado");
		}
			
		banco.Desconectar();
	}	
	
	
}
