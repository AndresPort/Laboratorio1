import java.util.ArrayList;
import java.util.List;

public class Gestionar_computadores {
    //Atributos
    private List<Computadores> list_computadores= new ArrayList<>();

    //metodos

    //Metodo constructor
    public Gestionar_computadores(){
    }

    //Metodo para agregar elementos a la lista de computadores
    public void agregar_computadores(Computadores obj_computador){
        list_computadores.add(obj_computador);
    }

    //Metodo para mostrar todos los elementos de la lista de reservas
    public String mostrar_lista(){

		Computadores un_computador= new Computadores();
		String coleccion_de_computadores="";

		for(int i=0; i<list_computadores.size(); i++){
			un_computador= list_computadores.get(i);
			coleccion_de_computadores +=	"La marca del computador es "+un_computador.get_marca()+
             "el computador fue comprado en el "+un_computador.get_ano_compra()+
            " y el numero de inventario del computador es el "+un_computador.get_num_inventario_computo();
		}
		return coleccion_de_computadores;

    }
}
