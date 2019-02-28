package br.com.estacionamento.mvc.model.enumerated;

public enum EnumTipoTelefone {
	COMERCIAL("comercial"),
	RESIDENCIAL("residencial"),
	CELULAR("celular");
	
	private String tipoTelefone;
	
	private EnumTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
