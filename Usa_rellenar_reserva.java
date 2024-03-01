import javax.swing.JOptionPane;

public class Usa_rellenar_reserva{
		
		//Atributos
		Gestionar_reserva la_verdadera_coleccion= new Gestionar_reserva();
		
		//Metodos

		//Metodo constructor
		public Usa_rellenar_reserva(){
		}

		//Metodo para crear obtener los atributos para un objeto de la clase reserva y luego se agrega a la lista de reservas
		public void agregarAuto(){

			Reserva la_verdadera_reserva= new Reserva();

			int cedula_docente;
			int num_inventario_computo;
	 		String fecha;
	 		String hora_recogida;
	 		String hora_entrega;

			cedula_docente= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula del docente (10 digitos)","Ingreso de Datos",1));
;			num_inventario_computo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de inventario del equipo de computo ","Ingreso de Datos",1));
			fecha= JOptionPane.showInputDialog(null, "Ingrese la fecha (dd/mm/aa)","Ingreso de Datos",1);
			hora_recogida= JOptionPane.showInputDialog(null, "Ingrese la hora recogida (formato 24hr)","Ingreso de Datos",1);
			hora_entrega=  JOptionPane.showInputDialog(null, "Ingrese la hora de entrega (formato 24hr)","Ingreso de Datos",1);
			
			//Asignar valores a los atributos de una reserva
			la_verdadera_reserva.set_cedula_docente(cedula_docente);
			la_verdadera_reserva.set_num_inventario_computo(num_inventario_computo);
			la_verdadera_reserva.set_fecha(fecha);
			la_verdadera_reserva.set_hora_recogida(hora_recogida);
			la_verdadera_reserva.set_hora_entrega(hora_entrega);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_reserva(la_verdadera_reserva);
		} 

		//Metodo para llamar a la clase Gestionar_reserva y mostrar los elementos de la lista de reservas
		public void mostrar() {
			JOptionPane.showMessageDialog(null, la_verdadera_coleccion.mostrar_lista(), "Resultado =", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

		
}