import javax.swing.JOptionPane;

public class Usa_gestionar_docentes {
    //Atributos
		Gestionar_docentes la_verdadera_coleccion= new Gestionar_docentes();
		
		//Metodos

		//Metodo constructor
		public Usa_gestionar_docentes(){
		}

		//Metodo para crear obtener los atributos para un objeto de la clase reserva y luego se agrega a la lista de reservas
		public void agregar_datos_quemados(){

//-------------------------------------------------Computador 1-------------------------------------------------------------------------------------
			//Asignar valores a los atributos de una reserva
			Docentes el_verdadero_docente= new Docentes();
            el_verdadero_docente.set_nombres("David Alejandro");
			el_verdadero_docente.set_apellidos("Diaz Moncada");
            el_verdadero_docente.set_numero_de_cedula(1975407839);
            el_verdadero_docente.set_curso("Matematicas");
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_docentes(el_verdadero_docente);

//-------------------------------------------------Computador 2-------------------------------------------------------------------------------------
            Docentes el_verdadero_docente_2= new Docentes();
            el_verdadero_docente_2.set_nombres("Andres David");
			el_verdadero_docente_2.set_apellidos("Fernandez Bedon");
            el_verdadero_docente_2.set_numero_de_cedula(1273625735);
            el_verdadero_docente_2.set_curso("Ingles");
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_docentes(el_verdadero_docente_2);

//----------------------------------------------------Computador 3--------------------------------------------------------------------------------
            Docentes el_verdadero_docente_3= new Docentes();
            el_verdadero_docente_3.set_nombres("Camilo Alejandro");
			el_verdadero_docente_3.set_apellidos("Fernandez Dubian");
            el_verdadero_docente_3.set_numero_de_cedula(1232343232);
            el_verdadero_docente_3.set_curso("Lectura critica");
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_docentes(el_verdadero_docente_3);

//----------------------------------------------------Computador 4--------------------------------------------------------------------------------
            Docentes el_verdadero_docente_4= new Docentes();
            el_verdadero_docente_4.set_nombres("Yuyeimi Alexandra");
			el_verdadero_docente_4.set_apellidos("Trululu Renteria");
            el_verdadero_docente_4.set_numero_de_cedula(1234545676);
            el_verdadero_docente_4.set_curso("Matematicas discretas");
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_docentes(el_verdadero_docente_4);

//----------------------------------------------------Computador 5--------------------------------------------------------------------------------
            Docentes el_verdadero_docente_5= new Docentes();
            el_verdadero_docente_5.set_nombres("Andrik Santiago");
			el_verdadero_docente_5.set_apellidos("Perez mejia");
            el_verdadero_docente_5.set_numero_de_cedula(1937454323);
            el_verdadero_docente_5.set_curso("Fundamentos de programacion orientada a eventos");
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_docentes(el_verdadero_docente_5);

		} 

		//Metodo para llamar a la clase Gestionar_reserva y mostrar los elementos de la lista de reservas
		public void mostrar() {
            int num_cedula= Integer.parseInt(JOptionPane.showInputDialog("Por favro ingrese el numero de de un profesor para ver su informacion: "));
			JOptionPane.showMessageDialog(null, la_verdadera_coleccion.buscar_docente(num_cedula), "Resultado =", JOptionPane.INFORMATION_MESSAGE);
		}
}
