import java.util.List;
import java.util.ArrayList;

public class Gestionar_reserva{
	//Atributos
	private List<Reserva> list_reserva= new ArrayList<>();
	
	//Metodos
	
	//Metodo constructor
	public Gestionar_reserva(){
	}

	//Metodo para agregar elementos a la lista de reservas
	public void agregar_reserva(Reserva obj_reserva){
		list_reserva.add(obj_reserva);
    }

	//Metodo para mostrar todos los elementos de la lista de reservas
    public String mostrar_lista(){

		Reserva una_reserva= new Reserva();
		String coleccion_de_reservas="";

		for(int i=0; i<list_reserva.size(); i++){
			una_reserva= list_reserva.get(i);
			coleccion_de_reservas +=	"\nCedula del docente : "+una_reserva.get_cedula_docente()+
					" - Numero del inventario de computo: "+una_reserva.get_num_inventario_computo()+
					" - Fecha: "+una_reserva.get_fecha()+
					" - Hora de recogida: "+una_reserva.get_hora_recogida()+
					" - Hora de entrega: "+una_reserva.get_hora_entrega()+"\n";
		}
		return coleccion_de_reservas;
	}
}
