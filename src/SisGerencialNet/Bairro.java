package SisGerencialNet;

public class Bairro {
	
	private int codigo;
	private String nome;
	private TipoBairro tipoBairro;
	
	public Bairro() {
		tipoBairro = new TipoBairro();
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
	public TipoBairro getTipoBairro() {
		return tipoBairro;
	}
	public void setTipoBairro(TipoBairro tipoBairro) {
		this.tipoBairro = tipoBairro;
	}
	
	@Override
	public String toString() {
		return String.format( "%s - %s (%s)", this.codigo, this.nome, this.tipoBairro.toString() );
	}
	
	public void validaDados() throws DadosException {
		if (this.codigo == 0) {
			throw new DadosException("Código inválido");
		}
		
		if (this.nome == "") {
			throw new DadosException("nome inválido");
		}
		
		this.tipoBairro.validaDados();
	}
	

}
