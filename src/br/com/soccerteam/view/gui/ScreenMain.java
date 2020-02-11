package br.com.soccerteam.view.gui;

import java.util.Scanner;

import br.com.soccerteam.controller.SoccerTeamController;
import br.com.soccerteam.controller.helper.CleanScanner;

public class ScreenMain {

	SoccerTeamController soccer = new SoccerTeamController();
	private static Scanner sc = new Scanner(System.in);

	public void screenMain() throws Exception {
		Integer opition = 1;

		while (opition != 0) {
			System.out.println("Cadastro do Time");

			System.out.println("");

			System.out.println(
					"Menu: 1 - Cadastrar; 2 - Excluir; 3 - Consultar; 4 - Atualizar Jogador Principal; 5 - Listagem dos times; "
							+ "6 - Listagem por ano do titulo principal; \n 7 - Listagem por criacao do time;  "
							+ "8 - Listagem por ordem alfabetica; 9 - Listagem por maior pontuacao; 0 - Sair");
			opition = CleanScanner.readInteger();

			switch (opition) {
			case 1:
				addSoccerTeam();
				break;
			case 2:
				remove();
				break;
			case 3:
				find();
				break;
			case 4:
				update();
				break;
			case 5:
				list();
				break;
			case 6:
				listMainTitleYear();
				break;
			case 7:
				listCreateYear();
				break;
			case 8:
				listNameSoccerTeam();
				break;
			case 9:
				listPoints();
				break;
			case 0:
				opition = 0;
				break;

			default:
				opition = 10;
				break;
			}
		}
	}

	private void addSoccerTeam() throws Exception {

		while (true) {
			try {
				System.out.println("Digite o nome do time: ");
				String nameSoccerTeam = sc.nextLine();
				System.out.println("Digite o ano de criacao do time: ");
				int createYear = CleanScanner.readInteger();
				System.out.println("Jogador Principal: ");
				String starPlay = sc.nextLine();
				System.out.println("Digite o titulo principal: ");
				String mainTitle = sc.nextLine();
				System.out.println("Digite o ano do titulo principal: ");
				int mainTitleYear = CleanScanner.readInteger();
				System.out.println("Digite o total de pontos: ");
				int points = CleanScanner.readInteger();
				soccer.add(nameSoccerTeam, starPlay, createYear, mainTitle, mainTitleYear, points);
				System.out.println("Time cadastrado com sucesso!");
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor invalido!");
			}
		}
	}

	public void remove() throws Exception {

		while (true) {
			try {
				System.out.println("Digite o nome do time: ");
				String nameSoccerTeam = sc.nextLine().toUpperCase();
				if (soccer.find(nameSoccerTeam) != null) {
					soccer.remove();
					System.out.println("Time excluido com sucesso!");
					break;
				} else {
					System.out.println("Time nao localizado!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Valor invalido!");
			}
		}
	}

	private void find() throws Exception {

		while (true) {
			try {
				System.out.println("Digite o nome do time: ");
				String nameSoccerTeam = sc.nextLine().toUpperCase();
				if (soccer.find(nameSoccerTeam) != null) {
					System.out.println(soccer.list());
					break;
				} else {
					System.out.println("Time nao localizado!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Valor invalido!");
			}
		}
	}

	private void update() throws Exception {

		while (true) {
			try {
				System.out.println("Digite o nome do time: ");
				String nameSoccerTeam = sc.nextLine().toUpperCase();
				if (soccer.find(nameSoccerTeam) != null) {
					System.out.println("Jogador principal do time: " + soccer.find(nameSoccerTeam).getStarPlay());
					System.out.println("Alterar jogador principal do time: ");
					String name = sc.nextLine().toUpperCase();
					soccer.update(nameSoccerTeam, name);
					System.out.println("Alteracao realizada com sucesso!");
					break;
				} else {
					System.out.println("Time nao localizado!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Valor invalido!");
			}
		}
	}

	private void list() {

		System.out.println("Listagem dos Times - Fila");
		System.out.println(soccer.list());
	}

	private void listMainTitleYear() {
		System.out.println("Listagem dos Times - Ordem Titulo Principal");
		System.out.println(soccer.list());
	}

	private void listCreateYear() {
		System.out.println("Listagem dos Times - Ordem ano Criacao");
		System.out.println(soccer.list());
	}

	private void listNameSoccerTeam() {
		System.out.println("Listagem dos Times - Ordem Alfabetica");
		System.out.println(soccer.list());
	}

	private void listPoints() {
		System.out.println("Listagem dos Times - Ordem de Pontuacao");
		System.out.println(soccer.list());
	}
}
