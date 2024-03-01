import javax.swing.JOptionPane;

public class Usa_rellenar_reserva{

		Gestionar_reserva la_verdadera_coleccion= new Gestionar_reserva();
		
		public Usa_rellenar_reserva(){}

		public void agregarAuto(){

			Reserva la_verdadera_reserva= new Reserva();

			int cel_doc;
			int inventario_computo;
			int fech;
			int h_recog;
			int h_ent;

			cel_doc= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cedula del docente (10 digitos)","Ingreso de Datos",1));
			inventario_computo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de inventario del equipo de computo ","Ingreso de Datos",1));
			fech= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha (dd/mm/aa)","Ingreso de Datos",1));
			h_recog= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora recogida (formato 24hr)","Ingreso de Datos",1));
			h_ent=  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de entrega (formato 24hr)","Ingreso de Datos",1));
			
			la_verdadera_reserva.set_cedula_docente(cel_doc);
			la_verdadera_reserva.set_num_inv_computo(inventario_computo);
			la_verdadera_reserva.set_fecha(fech);
			la_verdadera_reserva.set_hora_recogida(h_recog);
			la_verdadera_reserva.set_hora_entrega(h_ent);
			la_verdadera_coleccion.agregarreserva(la_verdadera_reserva);
		} 
		public void mostrar() {
			JOptionPane.showMessageDialog(null, la_verdadera_coleccion.mostrar_lista(), "Resultado =", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

		
}