package br.com.estacionamento.mvc.model.persitent_object;

import br.com.estacionamento.mvc.model.enumerated.EnumStatus;

public class Cidade extends PersistentObject{
	protected int id;
	protected Estado estado;
	protected String nome;
	protected EnumStatus status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
}
