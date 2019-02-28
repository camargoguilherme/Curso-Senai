package br.com.estacionamento.mvc.view;

import java.lang.reflect.Field;
import br.com.estacionamento.mvc.model.enumerated.EnumEstado;
import br.com.estacionamento.mvc.model.enumerated.EnumStatus;
import br.com.estacionamento.mvc.model.persitent_object.Cidade;
import br.com.estacionamento.mvc.model.persitent_object.Endereco;
import br.com.estacionamento.mvc.model.persitent_object.Estado;
import br.com.estacionamento.mvc.model.persitent_object.Mensalista;

public class Teste {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Endereco end = new Endereco();
		Mensalista mens = new Mensalista();
		Cidade cidade = new Cidade();
		Estado est = new Estado();
		
		est.setId(1);
		est.setNome(EnumEstado.PR.getNome());
		est.setSigla(EnumEstado.PR.toString());
		
		cidade.setEstado(est);
		cidade.setId(1);
		cidade.setStatus(EnumStatus.ATIVO);
		
		mens.setCpf("086.405.069-06");
		mens.setNome("Guilherme Camargo");
		mens.setStatus(EnumStatus.ATIVO);
		mens.setId(1);
		
		end.setCidade(cidade);
		end.setId(1);
		end.setLogradouro("Profe");
		end.setMensalista(mens);
		end.setNumero("430");
		
		System.out.println(end.toString());
		
	}
}
