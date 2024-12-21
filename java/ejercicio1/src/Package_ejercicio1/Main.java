package Package_ejercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Selecciona un ejercicio\n-A\n-B\n-C\n-D");
		System.out.print("Opción: ");
		String opcion = teclado.nextLine();
		switch (opcion.toUpperCase().trim()) {
		case "A" -> opcionA(teclado);
		case "B" -> opcionB(teclado);
		case "C" -> opcionC(teclado);
		case "D" -> opcionD(teclado);
		default -> System.err.println("No has elegido ninguna opción válida");
		}
		teclado.close();
	}

	private static void opcionA(Scanner teclado) {
		System.out.println("Introduce un número para comprobar si es par o impar");
		System.out.print("Número: ");
		String elegirNumero = teclado.nextLine();
		int numero = Integer.parseInt(elegirNumero);
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
	}

	private static void opcionB(Scanner teclado) {
		System.out.println("Introduce un número del 1 al 7 para comprobar el día de la semana");
		System.out.print("Día de la semana: ");
		String elegirDia = teclado.nextLine();
		int dia = Integer.parseInt(elegirDia);
		switch (dia) {
		case 1 -> System.out.println("Has elegido el día " + dia + ", es Lunes");
		case 2 -> System.out.println("Has elegido el día " + dia + ", es Martes");
		case 3 -> System.out.println("Has elegido el día " + dia + ", es Miércoles");
		case 4 -> System.out.println("Has elegido el día " + dia + ", es Jueves");
		case 5 -> System.out.println("Has elegido el día " + dia + ", es Viernes");
		case 6 -> System.out.println("Has elegido el día " + dia + ", es Sábado");
		case 7 -> System.out.println("Has elegido el día " + dia + ", es Domingo");
		default -> System.out.println("No has elegido ningún día válido");
		}
	}

	private static void opcionC(Scanner teclado) {
		System.out.println("Introduce una calificación entre A-D para comprobar su equivalente numérico");
		System.out.print("Valor alfabético: ");
		String valor = teclado.nextLine().toUpperCase();
		switch (valor) {
		case "A" -> System.out.println("Has elegido el valor " + valor + ", su equivalente numérico es 11");
		case "B" -> System.out.println("Has elegido el valor " + valor + ", su equivalente numérico es 12");
		case "C" -> System.out.println("Has elegido el valor " + valor + ", su equivalente numérico es 13");
		case "D" -> System.out.println("Has elegido el valor " + valor + ", su equivalente numérico es 14");
		case "E" -> System.out.println("Has elegido el valor " + valor + ", su equivalente numérico es 15");
		default -> System.out.println("No has elegido ningín valor alfabético válido");
		}
	}

	private static void opcionD(Scanner teclado) {
		System.out.println("Introduce el importe bruto para comprobar el neto");
		System.out.print("Importe: ");
		DecimalFormat decimales = new DecimalFormat("#.##");
		String indicarValor = teclado.nextLine();
		Double bruto = Double.parseDouble(indicarValor);
		Double irpf = 10.0 / 100;
		Double seguridadSocial = 6.35 / 100;
		Double neto = bruto - ((bruto * irpf) + (bruto * seguridadSocial));
		System.out.println(
				"Tu importe bruto es " + decimales.format(bruto) + "$ y tu neto es " + decimales.format(neto) + "$");
	}
}
