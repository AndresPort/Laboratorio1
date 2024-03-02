import javax.swing.JOptionPane;

public class Usa_gestionar_computadores {
    //Atributos
		Gestionar_computadores la_verdadera_coleccion= new Gestionar_computadores();
		
		//Metodos

		//Metodo constructor
		public Usa_gestionar_computadores(){
		}

		//Metodo para crear obtener los atributos para un objeto de la clase reserva y luego se agrega a la lista de reservas
		public void agregar_datos_quemados(){

//-------------------------------------------------Computador 1-------------------------------------------------------------------------------------
			//Asignar valores a los atributos de una reserva
			Computadores el_verdadero_computador= new Computadores();
            el_verdadero_computador.set_marca("Lenovo");
			el_verdadero_computador.set_ano_compra(2020);
            el_verdadero_computador.set_num_inventario_computo(1);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_computadores(el_verdadero_computador);

//-------------------------------------------------Computador 2-------------------------------------------------------------------------------------
            Computadores el_verdadero_computador_2= new Computadores();
            el_verdadero_computador_2.set_marca("HP");
			el_verdadero_computador_2.set_ano_compra(2022);
            el_verdadero_computador_2.set_num_inventario_computo(2);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_computadores(el_verdadero_computador_2);

//----------------------------------------------------Computador 3--------------------------------------------------------------------------------
            Computadores el_verdadero_computador_3= new Computadores();
            el_verdadero_computador_3.set_marca("Razer");
			el_verdadero_computador_3.set_ano_compra(2023);
            el_verdadero_computador_3.set_num_inventario_computo(3);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_computadores(el_verdadero_computador_3);

//----------------------------------------------------Computador 4--------------------------------------------------------------------------------
            Computadores el_verdadero_computador_4= new Computadores();
            el_verdadero_computador_4.set_marca("MAC");
			el_verdadero_computador_4.set_ano_compra(2024);
            el_verdadero_computador_4.set_num_inventario_computo(4);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_computadores(el_verdadero_computador_4);

//----------------------------------------------------Computador 5--------------------------------------------------------------------------------
            Computadores el_verdadero_computador_5= new Computadores();
            el_verdadero_computador_5.set_marca("Asus");
			el_verdadero_computador_5.set_ano_compra(2021);
            el_verdadero_computador_5.set_num_inventario_computo(5);
			
			//Agregar el objeto que se acaba de crear y rellenar a la lista de reservas
			la_verdadera_coleccion.agregar_computadores(el_verdadero_computador_5);

		} 

		//Metodo para llamar a la clase Gestionar_reserva y mostrar los elementos de la lista de reservas
		public void mostrar() {
            int num_computador= Integer.parseInt(JOptionPane.showInputDialog("Por favro ingrese el numero de inventario del computador para ver su informacion: "));
			JOptionPane.showMessageDialog(null, la_verdadera_coleccion.buscar_computador(num_computador), "Resultado =", JOptionPane.INFORMATION_MESSAGE);
		}
		
}
