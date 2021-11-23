package SisGerencialNet;

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
  
}
