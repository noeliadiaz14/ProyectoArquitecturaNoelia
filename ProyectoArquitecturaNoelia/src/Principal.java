
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Uso de la clase EntradaDatos
		EntradaDatos ed = new EntradaDatos();
		String estilo  = ed.estilos();
		System.out.println(estilo);
		
		//Uso de la clase EstilosArquitectonicos
		EstilosArquitectonicos f1 = new EstilosArquitectonicos();	
		f1.infest(estilo);
		
		
		
	}

}
