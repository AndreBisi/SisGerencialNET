package SisGerencialNet;

public class Movimento {
	
	private int codigo;
	private String nome;
	private boolean ativo;
	private String sinal;
	private boolean receber;
	private boolean pagar;
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
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getSinal() {
		return sinal;
	}
	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	public boolean isReceber() {
		return receber;
	}
	public void setReceber(boolean receber) {
		this.receber = receber;
	}
	public boolean isPagar() {
		return pagar;
	}
	public void setPagar(boolean pagar) {
		this.pagar = pagar;
	}
	
	public void validaDados() throws DadosException {
		if (this.codigo == 0) {
			throw new DadosException("Código inválido");
		}
		
		if (this.nome == "") {
			throw new DadosException("Nome inválido");			
		}
		
		if (this.sinal == "") {
			throw new DadosException("Sinal inválido");			
		}
		
		if (!this.pagar && !this.receber){
			throw new DadosException("Informe se é recber ou pagar");
		}
	}
}
