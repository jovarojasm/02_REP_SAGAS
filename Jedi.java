package matrices;

import java.util.Scanner;
import java.util.Arrays; 

public class Jedi {

	public static void main(String[] args) {
		/*1. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de
		 *una empresa y detectar si existe brecha salarial entre ambos. 
		 *El programa pedirá por teclado la información de N personas distintas (valor también
		 *introducido por teclado). Para cada persona, pedirá su género (0 para hombre y 1
		 *para mujer) y su sueldo. Esta información debe guardarse en una única matriz.
		 *Luego se mostrará por pantalla el sueldo medio de cada género*/

		/*Existen distintas formas de invertir una matriz, mostrar la matriz empezando por
		 *las filas del final, mostrar la matriz empezando por las columnas del final… Pero
		 *en este ejercicio queremos que se muestre la matriz invirtiendo filas por
		 *columnas, por ejemplo:
		 *44444 41023 Las filas ahora son columnas
		 *11111 41023
		 *00000 41023
		 *22222 41023
		 *33333 41023
		 *Crea un programa que genere una matriz de NxM y rellene las filas con números
		 *aleatorios. Después muestra la matriz original y la matriz invertida.*/

		/*Un cuadrado mágico es una matriz cuadrada en la que la suma de cada fila, de
		 * cada columna y de las dos diagonales principales tienen el mismo valor
		 * En el siguiente ejemplo tenemos una matriz de 3x3 en la que cada columna suma 15,
		 *cada fila suma 15 y las dos diagonales principales también suman 15.
		 *  Desarrolla un programa que permita al usuario introducir los valores (enteros)
		 *  de una matriz de tamaño 3x3, luego la muestre por pantalla y por último muestre
		 *  un mensaje indicando si es un cuadrado mágico o no. Deberás utilizar bucles.
		 */

		/*Modifica el programa para permitir matrices cuadradas de cualquier tamaño
		 * NxN, siendo N un valor mayor o igual a 1 que introducirá el usuario. Por ejemplo
		 * 2x2, 5x5, 20x20, etc.*/

		sueldos3(); 
	}

	static void sueldos3() {
		Scanner sc = new Scanner (System.in); 
		int n; 
		int hom=0, muj=0;
		int salariom=0; 
		int salarioh=0; 

		System.out.println("Cuantos sueldos quieres registrar?");
		n = sc.nextInt(); 
		sc.nextLine(); 

		int salarios[][] = new int [n][2]; 

		for (int i = 0; i<n; i++) {
				System.out.println("Escribe el genero (h:0, m:1)");
				salarios[i][0] = sc.nextInt();
				sc.nextLine(); 

				System.out.println("Escribe el salario");
				salarios[i][1] = sc.nextInt();
				sc.nextLine();

				if (salarios[i][0] == 0) {
					hom++;
					salarioh+= salarios[i][1]; 
				} else {
					muj++; 
					salariom+=salarios[i][1]; 
				}
			}
		
		for (int x[]: salarios) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println("Salario medio hombres: " + (salarioh/hom));
		System.out.println("Salario medio mujeres: " + (salariom/muj));
	}

	static void sueldos2() {
		Scanner sc = new Scanner (System.in); 
		int n; 
		int hom=0, muj=0;
		int salariom=0; 
		int salarioh=0;

		System.out.println("Cuantos sueldos quieres registrar?");
		n = sc.nextInt(); 
		sc.nextLine(); 

		int salarios[][] = new int [n][2]; 

		for (int i = 0; i<n; i++) {
			for (int j = 0; j<salarios[i].length; j++) {

				if (j%2==0) {
					System.out.println("Escribe el genero (h:0, m:1)");
					salarios[i][j] = sc.nextInt();
					sc.nextLine(); 

				} else {
					System.out.println("Escribe el salario");
					salarios[i][j] = sc.nextInt();
					sc.nextLine();


					if (salarios[i][0] == 0) {
						hom++;
						salarioh+= salarios[i][j]; 
					} else {
						muj++; 
						salariom+=salarios[i][j]; 
					}
				}
			}
		}

		for (int x[]: salarios) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println("Salario medio hombres: " + (salarioh/hom));
		System.out.println("Salario medio mujeres: " + (salariom/muj));
	}

	static void magico() {
		int magico[][] = new int [3][3]; 
		Scanner sc = new Scanner (System.in); 
		int v=0, h=0, d=0; 

		System.out.println("Introduce los valores de la matriz");
		for (int i = 0; i<magico.length; i++) {
			for (int j = 0; j<magico[i].length; j++) {
				magico[i][j] = sc.nextInt(); 
			}
		}

		for (int i = 0; i<magico.length; i++) {
			for (int j = 0; j<magico[i].length; j++) {
				System.out.printf("%4d", magico[i][j]);
			}
			System.out.println(); 
		}

		for (int i = 0; i<magico.length; i++) {
			for (int j = 0; j<magico[i].length; j++) {
				h+= magico[i][j]; 
			}

		}
	}

	static void invertido() {
		Scanner sc = new Scanner (System.in); 
		int n,m; 

		System.out.println("Inserta el numero de filas");
		n = sc.nextInt();
		sc.nextLine();

		System.out.println("Inserta el numero de columnas");
		m = sc.nextInt();
		sc.nextLine();

		int invert[][] = new int [n][m]; 

		for (int i = 0; i<invert.length; i++) {
			for (int j = 0; j<invert[i].length; j++) {
				invert[i][j] = (int) (Math.random()*(10)+1); 
			}
		}

		for (int i = 0; i<invert.length; i++) {
			for (int j = 0; j<invert[i].length; j++) {
				System.out.printf( "%4d", invert[i][j]);
			}
			System.out.println();
		}

		System.out.println(); 

		for (int i = 0; i<invert.length; i++) {
			for (int j = 0; j<invert[i].length; j++) {
				System.out.printf("%4d",invert[j][i]);
			}
			System.out.println();
		}

	}
	static void sueldos() {
		Scanner sc = new Scanner (System.in); 
		int n, gen =0, sal=0; 
		int hom=0, muj=0;
		int salariom=0; 
		int salarioh=0;

		System.out.println("Cuantos sueldos quieres registrar?");
		n = sc.nextInt(); 
		sc.nextLine(); 

		int salarios[][] = new int [n][2]; 

		for (int i = 0; i<n; i++) {
			for (int j = 0; j<salarios[i].length; j++) {

				if (j%2==0) {
					System.out.println("Escribe el genero (h:0, m:1)");
					gen = sc.nextInt();
					sc.nextLine(); 
					salarios[i][j] =  gen;
				} else {
					System.out.println("Escribe el salario");
					sal = sc.nextInt();
					sc.nextLine();
					salarios[i][j] =  sal;

					if (gen == 0) {
						hom++;
						salarioh+=sal; 
					}

					if (gen == 1) {
						muj++; 
						salariom+=sal; 
					}
				}
			}
		}

		for (int x[]: salarios) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println("Salario medio hombres: " + (salarioh/hom));
		System.out.println("Salario medio mujeres: " + (salariom/muj));

//prueba en git 
	}
}
