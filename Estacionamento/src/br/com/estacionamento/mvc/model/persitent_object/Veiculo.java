package br.com.estacionamento.mvc.model.persitent_object;

import br.com.estacionamento.mvc.model.enumerated.EnumCor;

public class Veiculo extends PersistentObject{
	protected int id;
	protected String placa;
	protected EnumCor cor;
	protected Modelo modelo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public EnumCor getCor() {
		return cor;
	}
	public void setCor(EnumCor cor) {
		this.cor = cor;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
}
