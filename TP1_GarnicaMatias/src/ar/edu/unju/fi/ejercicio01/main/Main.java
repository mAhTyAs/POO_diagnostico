package ar.edu.unju.fi.ejercicio01.main;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Cadena: ");
		String cad = sc.nextLine();
		System.out.println(SubStringCount(cad));
		
	}
	
	public static int SubStringCount(String cad) {
		int n = cad.length();
		int cont=0;
		
		for(int i=0;i<n;i++) {
			int caracter=1;
			while (i + 1 < n && cad.charAt(i) == cad.charAt(i + 1)) {
                caracter++;
                i++;
            }
            cont += (caracter * (caracter + 1)) / 2;
		}
	
		for (int i = 1; i < n; i++) {
            int caracter = 1;
            while (i + caracter < n && i - caracter >= 0 
                    && cad.charAt(i - 1) == cad.charAt(i - caracter) 
                    && cad.charAt(i + caracter) == cad.charAt(i - 1)) {
                cont++;
                caracter++;
            }
        }

		return cont;
		
	}

}

