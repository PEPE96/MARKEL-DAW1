package programa1;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Como se llama el alumno?");
		String nombre = entrada.next();
	
		System.out.println("Bienvenido a la plataforma "+nombre);
		
		Scanner NOTAS = new Scanner(System.in);
		
		System.out.println("Introduce tu nota de programacion");
		Double notaProg = entrada.nextDouble();
		
		System.out.println("Introduce tu nota de Base de Datos");
		Double notaBD = entrada.nextDouble();
		
		System.out.println("Introduce tu nota de Lenguaje de Marcas");
		Double notaLM = entrada.nextDouble();
		
		System.out.println("Introduce tu nota de Analisis");
		Double notaAn= entrada.nextDouble();
		
		System.out.println("Introduce tu nota de Empleabilidad");
		Double notaEmp= entrada.nextDouble();
		
		System.out.println("Estas son tus notas:");
		System.out.println(notaProg);
		System.out.println(notaBD);
		System.out.println(notaLM);
		System.out.println(notaAn);
		System.out.println(notaEmp);
		
		System.out.println("Tu media es la siguiente:");
		System.out.println((notaProg+notaBD+notaLM+notaAn+notaEmp)/5);
		
		if ((notaProg < 5) || (notaBD < 5) || (notaLM < 5) || (notaAn < 5) || (notaEmp < 5)) {
		System.out.println("El alumno "+nombre+" tiene una media de "+((notaProg+notaBD+notaLM+notaAn+notaEmp)/5)+" y NO es apto. Pringau");
		} else { System.out.println("El alumno "+nombre+" tiene una media de "+((notaProg+notaBD+notaLM+notaAn+notaEmp)/5)+" y SI es apto.");
		}
		
		
		
		
		
		
		
	}

}
