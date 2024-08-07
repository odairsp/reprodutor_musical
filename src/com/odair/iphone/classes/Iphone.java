package com.odair.iphone.classes;

import com.odair.iphone.interfaces.AparelhoTelefonico;
import com.odair.iphone.interfaces.NavegadorInternet;
import com.odair.iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet,ReprodutorMusical{

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica selecionada - "+ musica);
		tocar();
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibir - "+ url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página...");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para - "+ numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação...");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz...");
	}

}
