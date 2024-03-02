import javax.swing.JOptionPane;

public class Iniciado{

	public static void main(String [] args){
		
		Usa_rellenar_reserva mini_coleccion= new Usa_rellenar_reserva();
		Usa_gestionar_computadores coleccion_computadores= new Usa_gestionar_computadores();

		String menu= "Bienvenido al sistema de reservas, que desea hacer?\n"+
				"1: Agregar una reserva\n"+
				"2: Mostrar lista de reservas\n" +
				"3: Consultar datos de un profesor\n"+
				"4: Consultar datos de un equipo de computo\n";
		int opcion = 0;

		do{
			opcion= Integer.parseInt(JOptionPane.showInputDialog(null,menu, "Menú de Opciones",1));

			switch(opcion){
				case 1: mini_coleccion.agregarAuto();
					break;

				case 2: mini_coleccion.mostrar();
					break;

				case 3: 
						break;

				case 4: coleccion_computadores.agregar_datos_quemados();
						coleccion_computadores.mostrar();
						break;
						
				default: 
					JOptionPane.showMessageDialog(null,"Esa opción no es válida","Resultado",2);					 
			}
			
		}while(!(opcion==3));		
	}
}