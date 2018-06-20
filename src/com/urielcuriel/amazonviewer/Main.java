package com.urielcuriel.amazonviewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//reader from command line input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			int option = Byte.parseByte(br.readLine());
			System.out.println(option);
			switch (option) {
			case 0:
				exit = true;
				break;
			case 1:
				System.out.println("Movies");
				break;
			case 2:
				System.out.println("Series");
				break;
			case 3:
				System.out.println("Books");
				break;
			case 4:
				System.out.println("Magazines");
				break;

			default:
				System.out.println("La opción "+option+" no existe");
				break;
			}
		} while (!exit);
		
	}

}
