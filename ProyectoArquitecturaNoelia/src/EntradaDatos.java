import java.util.Scanner;

public class EntradaDatos {
	
	//Cadena para ver los tipos de estilos arquitectónicos
	
	String estilos() {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir el ESTILO ARQUITECTÓNICO:" 
				+ "\n" + "1.Gótico"
				+ "\n" + "2.Barroco"
				+ "\n" + "3.Romano"
				+ "\n" + "4.Modernista"
				+ "\n" + "5.Neoclásico");
		
		String estilo;
		int selector;
		selector = n1.nextInt();
		
		switch(selector) {
		case 1: estilo = "Gótico";
		return estilo;
			
		case 2:estilo = "Barroco";
		return estilo;
		
		case 3: estilo = "Romano";
		return estilo;
	
		case 4 : estilo = "Modernista";
		return estilo;
	
		case 5:estilo = "Neoclásico";
		return estilo;
		
		default: return "Estilo no conocido";
		
		
		}
		
	}
	
	int selector2;
	
	//Cadena países que tienen monumentos goticos
	
	String paisgotico() {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir un país que tiene monumentos de estilo gotico:" 
							+ "\n" + "1.España"
							+ "\n" + "2.Francia"
							+ "\n" + "3.Italia"
							+ "\n" + "4.Reino Unido");
										
		String paisgotico;
		selector2 = n1.nextInt();
		
		switch(selector2) {
		case 1: paisgotico = "España";
		return paisgotico;
			
		case 2:paisgotico = "Francia";
		return paisgotico;
		
		case 3: paisgotico = "Italia";
		return paisgotico;
	
		case 4: paisgotico = "Reino Unido";
		return paisgotico;
		
		default: return "Pais no conocido";
		
		}
		
		
	}
		
		//Cadena países que tienen monumentos barrocos
		
		String paisbarroco() {
			Scanner n1 = new Scanner(System.in);
			System.out.println("Introducir un país que tiene monumentos de estilo barroco:" 
								+ "\n" + "1.Holanda"
								+ "\n" + "2.España"
								+ "\n" + "3.Portugal"
								+ "\n" + "4.Italia");
											
			String paisbarroco;
			selector2 = n1.nextInt();
			
			switch(selector2) {
			case 1: paisbarroco = "Holanda";
			return paisbarroco;
				
			case 2:paisbarroco = "España";
			return paisbarroco;
			
			case 3: paisbarroco = "Protugal";
			return paisbarroco;
		
			case 4: paisbarroco = "Italia";
			return paisbarroco;
			
			default: return "Pais no conocido";
			
			}
			
		
		
	}
		
	
	//Cadena países que tienen monumentos romanos
	
		String paisromano() {
			Scanner n1 = new Scanner(System.in);
			System.out.println("Introducir un país que tiene monumentos de estilo romano:" 
								+ "\n" + "1.Italia"
								+ "\n" + "2.Croacia"
								+ "\n" + "3.Grecia"
								+ "\n" + "4.España");
											
			String paisromano;
			selector2 = n1.nextInt();
			
			switch(selector2) {
			case 1: paisromano = "Italia";
			return paisromano;
				
			case 2:paisromano = "Croacia";
			return paisromano;
			
			case 3: paisromano = "Grecia";
			return paisromano;
		
			case 4: paisromano = "España";
			return paisromano;
			
			default: return "Pais no conocido";
			
			}
			
			
		}
		
		//Cadena países que tienen monumentos modernista
		
			String paismodernista() {
				Scanner n1 = new Scanner(System.in);
				System.out.println("Introducir un país que tiene monumentos de estilo modernista:" 
									+ "\n" + "1.Bélgica"
									+ "\n" + "2.Portugal"
									+ "\n" + "3.Francia"
									+ "\n" + "4.Italia");
												
				String paismodernista;
				selector2 = n1.nextInt();
				
				switch(selector2) {
				case 1: paismodernista = "Bégica";
				return paismodernista;
					
				case 2:paismodernista = "Portugal";
				return paismodernista;
				
				case 3: paismodernista = "Francia";
				return paismodernista;
			
				case 4: paismodernista = "Italia";
				return paismodernista;
				
				default: return "Pais no conocido";
				
				}
				
				
			}
			
			//Cadena países que tienen monumentos neoclásicos
			
			String paisneoclasico() {
				Scanner n1 = new Scanner(System.in);
				System.out.println("Introducir un país que tiene monumentos de estilo neoclásico:" 
									+ "\n" + "1.Rusia"
									+ "\n" + "2.Estados Unidos"
									+ "\n" + "3.Italia5"
									+ "\n" + "4.Grecia");
												
				String paisneoclasico;
				selector2 = n1.nextInt();
				
				switch(selector2) {
				case 1: paisneoclasico = "Rusia";
				return paisneoclasico;
					
				case 2:paisneoclasico = "Estados Unidos";
				return paisneoclasico;
				
				case 3: paisneoclasico = "Italia";
				return paisneoclasico;
			
				case 4: paisneoclasico = "Grecia";
				return paisneoclasico;
				
				default: return "Pais no conocido";
				
				}
				
				
			}
		
}


