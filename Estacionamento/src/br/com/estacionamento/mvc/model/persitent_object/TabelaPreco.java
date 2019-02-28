package br.com.estacionamento.mvc.model.persitent_object;

import java.time.LocalDateTime;

public class TabelaPreco extends PersistentObject{
	protected int id;
	protected double valor;
	protected LocalDateTime tempo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDateTime getTempo() {
		return tempo;
	}
	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}
	
}
