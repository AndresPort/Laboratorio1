import java.util.List;
import java.util.ArrayList;

public class Gestionar_reserva{

	
	private List<Reserva> list_reserva= new ArrayList<>();
	
	
	public Gestionar_reserva(){}


	public void agregarreserva(Reserva obj_reserva){

		list_reserva.add(obj_reserva);
    }
    public String mostrar_lista(){

		Reserva unarserva= new Reserva();
		String colecciondereservas="";

		for(int i=0; i<list_reserva.size(); i++){
			unarserva= list_reserva.get(i);
			colecciondereservas +=	"Cedula del docente : "+unarserva.getcedula_docente()+
					" - Numero del inventario de computo: "+unarserva.getnum_inv_computo()+
					" - Fecha: "+unarserva.getfecha()+
					" - Hora de recogida: "+unarserva.gethora_recogida()+
					" - Hora de entrega: "+unarserva.gethora_entrega()+"\n";
		}
		return colecciondereservas;
	}
}
