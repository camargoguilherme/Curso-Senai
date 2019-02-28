package br.com.estacionamento.mvc.model.persitent_object;

import java.time.LocalDateTime;

import br.com.estacionamento.mvc.model.enumerated.EnumStatus;

public class Estadia extends PersistentObject{
	protected int id;
	protected LocalDateTime inicio;
	protected LocalDateTime termino;
	protected String placa;
	protected EnumStatus status;
	protected Vaga vaga;
	protected TabelaPreco tabelaPreco;
	protected Veiculo veiculo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getTermino() {
		return termino;
	}
	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	public TabelaPreco getTabelaPreco() {
		return tabelaPreco;
	}
	public void setTabelaPreco(TabelaPreco tabelaPreco) {
		this.tabelaPreco = tabelaPreco;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
}
