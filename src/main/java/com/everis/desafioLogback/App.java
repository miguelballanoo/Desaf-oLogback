package com.everis.desafioLogback;


import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

	/*LOGGER*/
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/*
	 * Método principal
	 * 
	 * @param args
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LOGGER.info("Inicio LOGGER");
//		double notaAlum1=2;
//		double notaAlum2=7.5;
//		double notaAlum3=5.25;
//		double notaAlum4=6.75;
//		double notaAlum5=2.5;
//		double notaAlum6=1;
//		double notaAlum7=8.75;
//		double notaAlum8=9.25;
//		double notaAlum9=9.25;
//		double notaAlum10=5;
//		
		
		
		System.out.println("Introduce el numero de alumnos que vas a introducir: ");
		int numAlumnos=sc.nextInt();
		double notaAlum;
		double notasTotales=0;
		
		for(int i=0; i<numAlumnos; i++) {
			System.out.println("Introduce la nota del alumno "+ (i+1));
			notaAlum=sc.nextDouble();
			notasTotales+=notaAlum;
		}
		
		double notaMedia=notasTotales/numAlumnos;
		
		if(notaMedia<5) {
			LOGGER.debug("La nota media esta suspensa con un {}" ,notaMedia);

		}else {
			LOGGER.debug("La nota media esta aprobada con un {}" ,notaMedia);

		}
		
		sc.close();
		

		LOGGER.info("LOGGER finalizado");
	}
}
