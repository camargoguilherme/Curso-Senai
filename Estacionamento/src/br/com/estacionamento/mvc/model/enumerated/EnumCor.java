package br.com.estacionamento.mvc.model.enumerated;

public enum EnumCor {
	PRETO("preto"),
	BRANCO("branco"),
	PRATA("prata"),
	VERMELHO("vermelho");
	
	private String cor;
	EnumCor(String cor){
		this.cor = cor;
	}
	
	public String  getCor() {
		return cor;
	}
}
