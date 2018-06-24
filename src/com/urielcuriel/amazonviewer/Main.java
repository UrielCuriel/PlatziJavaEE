package com.urielcuriel.amazonviewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import com.urielcuriel.amazonviewer.model.Magazine;
import com.urielcuriel.amazonviewer.model.Movie;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		Movie movie = new Movie("Coco", "Animation", "Lee Unkrich", 180, (short)2017);
		System.out.println(movie);
		System.out.println();
		Magazine magazine = new Magazine("Muy Interresante", new Date(), "Morma");
		System.out.println(magazine.toString());
		//showMenu();
		
		
	}

	public static void showMenu() throws NumberFormatException, IOException {
		
		//reader from command line input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		//loop for show menu
		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			int option = Byte.parseByte(br.readLine());
			System.out.println(option);
			switch (option) {
			case 0:
				System.out.println("Vuelve pronto :)");
				exit = true;
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				makeReport(new Date());
				break;

			default:
				System.out.println("La opción "+option+" no existe");
				break;
			}
		} while (!exit);
	}

	public static void showMovies() {
		boolean exit = true;
		do {
			System.out.println();
			System.out.println("::    M O V I E S    ::");
			System.out.println();
		}while(!exit);
	}
	public static void showSeries() {
		boolean exit = true;
		do {
			System.out.println();
			System.out.println("::    S E R I E S    ::");
			System.out.println();
		}while(!exit);
	}
	public static void showChapters() {
		boolean exit = true;
		do {
			System.out.println();
			System.out.println("::  C H A P T E R S  ::");
			System.out.println();
		}while(!exit);
	}
	public static void showBooks() {
		boolean exit = true;
		do {
			System.out.println();
			System.out.println("::     B O O K S     ::");
			System.out.println();
		}while(!exit);
	}
	public static void showMagazines() {
		boolean exit = true;
		do {
			System.out.println();
			System.out.println(":: M A G A Z I N E S ::");
			System.out.println();
		}while(!exit);
	}
	public static void makeReport() {
		
	}
	public static void makeReport(Date date) {
		
	}
	
}
