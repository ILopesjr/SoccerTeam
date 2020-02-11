package br.com.soccerteam.controller.helper;

import java.util.Scanner;

public class CleanScanner {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int readInteger() {
		String typed = "";

		typed = sc.nextLine();

		return Integer.parseInt(typed);
	}

	public static long readNumeric() {
		String typed = "";

		typed = sc.nextLine();

		return Long.parseLong(typed);
	}

}
