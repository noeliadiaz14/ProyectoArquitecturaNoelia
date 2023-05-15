
public class EstilosArquitectonicos {
	
	void infest(String estilo){
		
		//Condicional para dar información sobre los estilos seleccionados
		
		if (estilo.equals("Gótico")) {
			System.out.println( "\n" +"Este estilo se compone de los siguientes elementos:" 
								+ "\n" + "- Las bobedas de crucería"
								+ "\n" + "- Las vidrieras se inspiran en la biblia y dejan pasar la luz de color"
								+ "\n" + "- El arco ovijal "
								+ "\n" + "- Decoración ornamentada"
								+ "\n" + "- La anchura de los edificios es proporcional a su altura (muy alta)"
								+ "\n" + "Además, este estilo es muy común en las catedrales y monasterios."
								+ "\n" );
			
			//Uso de la clase EntradaDatos para ver los paises
			EntradaDatos ed = new EntradaDatos();
			String paisgotico  = ed.paisgotico();
			System.out.println(paisgotico);
			
			//Condicional para dar información sobre los monumentos de cada país seleccionado
			
			 if (paisgotico.equals("España"))
			 {
				 System.out.println("- La Catedral de Burgos"
						 			+ "\n" + "- La Lonja de Valencia"
						 			+ "\n" + "- La Catedral de León"
						 			+ "\n" + "- El Monasterio de San Juan de los Reyes");
			 }
			 
			 if (paisgotico.equals("Francia"))
			 {
				 System.out.println("- La catedral de Notre-Dame"
						 			+ "\n" + "- La Basílica de Saint-Denis"
						 			+ "\n" + "- La Sainte-Chapelle de París"
						 			+ "\n" + "- La catedral de Reims");
			 }
			 
			 if (paisgotico.equals("Italia"))
			 {
				 System.out.println("- La Catedral de Orvieto"
						 			+ "\n" + "- La Basílica de San Francisco de Asís "
						 			+ "\n" + "- La Iglesia de San Antonio de Padua "
						 			+ "\n" + "- El Palazzo Vecchio de Florencia");
			 }
			 
			 if (paisgotico.equals("Reino Unido"))
			 {
				 System.out.println("- La Catedral de Canterbury"
						 			+ "\n" + "- La Catedral de Santa María y San Chad de Lichfield."
						 			+ "\n" + "- La Iglesia de San Jorge "
						 			+ "\n" + "- El King's College, Cambridge");
			 }
		}
		
		else if (estilo.equals("Barroco")) {
			
			System.out.println( "\n" +"Este estilo se compone de los siguientes elementos:" 
					+ "\n" + "- Los detalles de decoración altamente ornamentados"
					+ "\n" + "- Las torres y cúpulas o domos"
					+ "\n" + "- La sensación de movimiento en las formas "
					+ "\n" + "- Se utiliza mucho el dorado"
					+ "\n" + "- Los techos abuhardillados de doble inclinación"
					+ "\n" + "Además, este estilo es muy común en los palacios y en las iglesias."
					+ "\n" );

			//Uso de la clase EntradaDatos para ver los paises
				EntradaDatos ed = new EntradaDatos();
				String paisbarroco  = ed.paisbarroco();
						System.out.println(paisbarroco);
						
			//Condicional para dar información sobre los monumentos de cada país seleccionado

			if (paisbarroco.equals("Holanda"))
			{
				System.out.println( "- El Palacio Real de Ámsterdam "
			 			+ "\n" + "- Westerkerk"
			 			+ "\n" + "- El Ayuntamiento de Maastricht"
			 			+ "\n" + "- El Paleis Het Loo ");
			}
 
			if (paisbarroco.equals("España"))
			{
				System.out.println("- El Palacio de Santa Cruz"
			 			+ "\n" + "- La Iglesia de San Ildefonso de Toledo"
			 			+ "\n" + "- El Monasterio de la Encarnación "
			 			+ "\n" + "- El Palacio de los Consejos");
			}
 
			if (paisbarroco.equals("Portugal"))
			{
				System.out.println("- El Santuário do Bom Jesus do Monte"
			 			+ "\n" + "- El Mosteiro de São João de Tarouca "
			 			+ "\n" + "- Sé Catedral do Porto"
			 			+ "\n" + "- El Museu Nacional de Machado de Castro");
			}
 
			if (paisbarroco.equals("Italia"))
			{
				System.out.println("- La Iglesia de San Ivo della Sapienza"
			 			+ "\n" + "- La Catedral de San Pedro"
			 			+ "\n" + "- La Columnata de San Pedro"
			 			+ "\n" + "- La Basílica Superga de Turín");
			}
		
		}
		
		else if (estilo.equals("Romano")) {
			
			System.out.println( "\n" +"Este estilo se compone de los siguientes elementos:" 
					+ "\n" + "- Los muros"
					+ "\n" + "- Los pilares"
					+ "\n" + "- Las columnas suelen ser más decorativas que estructurales "
					+ "\n" + "- Las bóvedas utilizadas fueron las de cañón, de aristas y las anulares"
					+ "\n" + "- Los materiales son muy variados, destacando la piedra"
					+ "\n" + "Además, este estilo es muy común en los acueductos, teatros, circos...,"
							+ "estaban enfocados al servicio público"
					+ "\n" );

			//Uso de la clase EntradaDatos para ver los paises
				EntradaDatos ed = new EntradaDatos();
				String paisromano  = ed.paisromano();
						System.out.println(paisromano);

						
			//Condicional para dar información sobre los monumentos de cada país seleccionado
			if (paisromano.equals("Italia"))
			{
				System.out.println("- El Coliseo Romano"
			 			+ "\n" + "- El Panteón"
			 			+ "\n" + "- La Muralla de Adriano"
			 			+ "\n" + "- El Arco del Triunfo");
			}
 
			if (paisromano.equals("Croacia"))
			{
				System.out.println("- Coliseo de Pula"
			 			+ "\n" + "- El Palacio de Diocleciano"
			 			+ "\n" + "- El Foro Romano de Zadar"
			 			+ "\n" + "- Las RUinas de Salona");
			}
 
			if (paisromano.equals("Grecia"))
			{
				System.out.println("- El Templo de la Fortuna Viril o de Portunus"
			 			+ "\n" + "- El Mausoleo de Augusto "
			 			+ "\n" + "- El Ara Pacis de Augusto "
			 			+ "\n" + "- El Templo de Hefestos");
			}
 
			if (paisromano.equals("España"))
			{
				System.out.println("- El Templo de Diana "
			 			+ "\n" + "- El Acueducto de Segovia "
			 			+ "\n" + "- El Teatro Romano de Cartagena "
			 			+ "\n" + "- La Torre de Hércules");
			}
		
		
		}
		
		else if (estilo.equals("Modernista")) {
			
			System.out.println( "\n" +"Este estilo se compone de los siguientes elementos:" 
					+ "\n" + "- Una gran iluminación "
					+ "\n" + "- No hay ornamentaciones"
					+ "\n" + "- Se busca la transparencia"
					+ "\n" + "- Se sustituyen los grandes muros por cristales"
					+ "\n" + "- Los pilares de ladrillos lisos"
					+ "\n" + "Además, este estilo es muy común en lugares públicos."
					+ "\n" );

			//Uso de la clase EntradaDatos para ver los paises
				EntradaDatos ed = new EntradaDatos();
				String paismodernista  = ed.paismodernista();
						System.out.println(paismodernista);

			//Condicional para dar información sobre los monumentos de cada país seleccionado
			if (paismodernista.equals("Bélgica"))
			{
				System.out.println("- Casa Tassel"
			 			+ "\n" + "- Museos Reales de Bellas Artes "
			 			+ "\n" + "- El Comercio Marjolaine"
			 			+ "\n" + "- El Hotel Le Palace");
			}
 
			if (paismodernista.equals("Portugal"))
			{
				System.out.println("- Gran Hotel Europa"
			 			+ "\n" + "- El Museu da República "
			 			+ "\n" + "- La Librería Lello e Irmao"
			 			+ "\n" + "- La Casa do Major Pessoa");
			}
 
			if (paismodernista.equals("Francia"))
			{
				System.out.println("- La estación de metro de Abesses"
			 			+ "\n" + "-  El Castel Béranger"
			 			+ "\n" + "- EL Hotel Guimard "
			 			+ "\n" + "- La Pirámide del Louvre");
			}
 
			if (paismodernista.equals("Italia"))
			{
				System.out.println("- La Casa Galimberti"
			 			+ "\n" + "- El Villaggio Leumann"
			 			+ "\n" + "- La Casa Fenoglio-Lafleur"
			 			+ "\n" + "- La Villa Scott");
			}
		
			
		}
		
		else if (estilo.equals("Neoclásico")) {
			
			System.out.println( "\n" +"Este estilo se compone de los siguientes elementos:" 
					+ "\n" + "- Decoración mínima"
					+ "\n" + "- Techo Abovedado"
					+ "\n" + "- Simetría general"
					+ "\n" + "- Columnas"
					+ "\n" + "- Uso de tonos llamativos, o neutros acompañados de pinceladas de colores llamativos"
					+ "\n" + "Además, este estilo es común tanto el edificios públicos y privados ."
					+ "\n" );

			//Uso de la clase EntradaDatos para ver los paises
				EntradaDatos ed = new EntradaDatos();
				String paisneoclasico  = ed.paisneoclasico();
						System.out.println(paisneoclasico);
						
			//Condicional para dar información sobre los monumentos de cada país seleccionado
			if (paisneoclasico.equals("Rusia"))
			{
				System.out.println("- La Catedral de San Basilio"
			 			+ "\n" + "- El Palais des Académies"
			 			+ "\n" + "- El Observatorio Real"
			 			+ "\n" + "- El Teatro Monnaie");
			}
 
			if (paisneoclasico.equals("Estados Unidos"))
			{
				System.out.println("- La Casa Blanca"
			 			+ "\n" + "- El Edificio Flatiron"
			 			+ "\n" + "- El Capitolio de los Estados Unidos"
			 			+ "\n" + "- Schermerhorn Symphony Center");
			}
 
			if (paisneoclasico.equals("Italia"))
			{
				System.out.println("- Torre de Pisa"
			 			+ "\n" + "- El Templo Canoviano "
			 			+ "\n" + "- La Iglesia de la Gran Madre di Dio "
			 			+ "\n" + "- El Teatro Carlo Felice en Génova");
			}
 
			if (paisneoclasico.equals("Grecia"))
			{
				System.out.println("- La Biblioteca Nacional de Grecia"
			 			+ "\n" + "- La Universidad"
			 			+ "\n" + "- La Academina de Atenas"
			 			+ "\n" + "- El Zappeion Megaron");
			}
		
		
		}
		
		
	}
	

}
