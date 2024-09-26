package precios;

import java.util.Scanner;

public class clientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido, que tipo de cliente eres|Normal, Socio, VIP|?");
		
		Scanner entrada = new Scanner(System.in);
		
		String TipoCliente = entrada.next();
		
		switch (TipoCliente) {
		
		case "normal":
			System.out.println("Tipo de cliente: Normal");
		break;
		case "socio":
			System.out.println("Tipo de cliente: socio");
		break;
		case "vip":
			System.out.println("Tipo de cliente: vip");
		break;
		default:
			System.out.println("Este tipo de cliente no existe, vuelva a intentarlo por favor");
		}
		
		
		System.out.println("Cual es el importe de tu compra?");
		Double compraImp = entrada.nextDouble();
		
		
		if (TipoCliente.equals("normal")) {
			System.out.println("El importe total de tu compra es: "+compraImp);		
		} else if (TipoCliente.equals("socio")) { 
			System.out.println("El impote total de tu compra es:"+compraImp*0.95);
		} else if (TipoCliente.equals("vip")) {
			System.out.println("El importe total de tu compra es:"+compraImp*0.80);
		}
					
					
					
					
					
					
					
					
				
	
		
		
		
		
		
		
		
		
		
	}

}
