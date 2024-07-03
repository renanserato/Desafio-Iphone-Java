package usuario;

import java.util.Scanner;

import iphone.internet.NavegadorInternet;
import iphone.ligacao.AparelhoTelefonico;
import iphone.musica.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			Iphone meuIphone = new Iphone();

			System.out.println("----- Escolha uma das opções abaixo -----");
			System.out.println("1 - Tocar Música");
			System.out.println("2 - Pausar Música");
			System.out.println("3 - Selecionar Música");
			System.out.println("4 - Ligar");
			System.out.println("5 - Atender");
			System.out.println("6 - Iniciar Correio de Voz");
			System.out.println("7 - Adicionar Página");
			System.out.println("8 - Atualizar Página");
			System.out.println("9 - Exibir Página");
			
			
			int escolha = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (escolha) {
			case 1:
				meuIphone.tocar();
				break;
				
			case 2: 
				meuIphone.pausar();
				break;
			case 3: 
				meuIphone.selecionarMusica();
				break;
			case 4: 
				meuIphone.ligar();	
				break;
			case 5: 
				meuIphone.atender();
				break;
			case 6: 
				meuIphone.iniciarCorreioVoz();
				break;
			case 7: 
				meuIphone.adicionarNovaAba();
				break;
			case 8: 
				meuIphone.atualizarPagina();
				break;
			case 9: 
				meuIphone.exibirPagina();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
		
		
	}

	
	
	
	
	
	
	
	
	
	public void pausar() {
		System.out.println("Pausando Música");
	}

	
	public void selecionarMusica() {
		System.out.println("Selecionando Música");

	}

	
	public void tocar() {
		System.out.println("Tocando Música");

		
	}


	
	public void exibirPagina() {
		System.out.println("Exibindo Página");

		
	}


	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");

		
	}


	
	public void atualizarPagina() {
		System.out.println("Atualizando Página");

		
	}


	public void ligar() {
		System.out.println("Ligando...");

		
	}


	
	public void atender() {
		System.out.println("Atendendo...");

		
	}


	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");

		
	}
}
