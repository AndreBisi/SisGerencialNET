package SisGerencialNet;

public enum TipoPessoa {
	
	FISICA("F�sica"),
	JURIDICA("Juridica");
	
	private String descricao;

	TipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
