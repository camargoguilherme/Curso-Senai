package pedido;

public class Atendente extends Funcionario {
	private Pessoa pessoa;
	private int numAtendente;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public int getNumAtendente() {
		return numAtendente;
	}
	public void setNumAtendente(int numAtendente) {
		this.numAtendente = numAtendente;
	}
	
	
}
