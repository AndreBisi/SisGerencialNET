package SisGerencialNet;

public class Cidade {
	
	private int codigo;
	private String nome;
	private String UF;
	private int IBGE;
	
	public int getIBGE() {
		return IBGE;
	}
	public void setIBGE(int iBGE) {
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

}
