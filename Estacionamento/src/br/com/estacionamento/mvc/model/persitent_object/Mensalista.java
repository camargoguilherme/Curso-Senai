package br.com.estacionamento.mvc.model.persitent_object;

import br.com.estacionamento.mvc.model.enumerated.EnumStatus;

public class Mensalista extends PersistentObject{
	protected int id;
	protected String nome;
	protected String cpf;
	protected EnumStatus status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}	
}
