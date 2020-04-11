package cifrado;

import java.util.Scanner;

public class CodigoCesar {
	private String min = "abcdefghijklmnñopqrstuvwxyz";
	private String may = min.toUpperCase();
	private String frase1;
	private String frase2 ="";
	Scanner keyboard = new Scanner(System.in);
	private int desplazamiento;
	public void pedirFrase() {
		System.out.println("Introduce una frase: ");
		frase1 = keyboard.nextLine();
		System.out.println("Introduce la clave de desplazamiento: ");
		desplazamiento = keyboard.nextInt();
		for (int i = 0; i < frase1.length(); i++) {
			for (int j = 0; j < min.length(); j++) {
				if (frase1.charAt(i) == min.charAt(j)) {
					if((j+desplazamiento)>= min.length()) {
						j = (j+desplazamiento) % min.length();
						frase2+= min.charAt(j+desplazamiento);
					}
					else {
						frase2+= min.charAt(j+desplazamiento);
					}
					
				}
				else if (frase1.charAt(i) == may.charAt(j)) {
					if((j+desplazamiento)>= may.length()) {
						j = (j+desplazamiento) % may.length();
						frase2+= may.charAt(j+desplazamiento);
					}
					else {
						frase2+= may.charAt(j+desplazamiento);
					}
				}
			}
		}
		System.out.println(frase2);
		System.out.println("La longitud de la frase que has escrito es de: "+frase1.length()+" caracteres.");
		System.out.println("min y may tienen: "+min.length()+" caraceres.");
		
		
		
		
	}

}
