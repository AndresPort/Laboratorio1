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
    public String buscar_computador(int num_inventario_computo_ingresado){
		Computadores un_computador= new Computadores();
		String coleccion_de_computadores="";
        boolean encontrado=false;

		for(int i=0; i<5; i++){
			un_computador= list_computadores.get(i);

            if (num_inventario_computo_ingresado==un_computador.get_num_inventario_computo()) {
                coleccion_de_computadores +=	"La marca del computador es "+un_computador.get_marca()+
             " el computador fue comprado en el "+un_computador.get_ano_compra()+
            " y el numero de inventario del computador es el "+un_computador.get_num_inventario_computo()+"\n";
            encontrado=true;
            }	
		}
        if (encontrado== false){
            coleccion_de_computadores= "El computador no existe";
        }

		return coleccion_de_computadores;

    }
}
