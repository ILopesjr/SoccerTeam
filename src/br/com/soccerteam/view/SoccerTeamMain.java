package br.com.soccerteam.view;

import br.com.soccerteam.controller.helper.CleanScanner;
import br.com.soccerteam.view.gui.ScreenMain;

public class SoccerTeamMain {

	public static void main(String[] args) throws Exception {

		ScreenMain screenMain = new ScreenMain();

		Integer opition = 1;
		while (opition != 0) {
			System.out.println("Sistema Unit");

			System.out.println("");

			System.out.println("Menu: 1 - Cadastrar Time; 0 - Sair");
			opition = CleanScanner.readInteger();

			switch (opition) {
			case 1:
				screenMain.screenMain();
				break;
			case 0:
				opition = 0;
				break;

			default:
				opition = 9;
				break;
			}
		}
		System.out.println("Sistema encerrado!");
	}
}
