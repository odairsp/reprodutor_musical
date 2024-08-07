package com.odair.iphone.app;

import com.odair.iphone.classes.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
		meuIphone.ligar("11995027854");
		meuIphone.exibirPagina("https://google.com.br");
		meuIphone.selecionarMusica("BLACK SABBATH - 'Iron Man'");
	}
}
