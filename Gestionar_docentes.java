import java.util.ArrayList;
import java.util.List;

public class Gestionar_docentes {
    //atributos
    private List<Docentes> list_docentes= new ArrayList<>();

    //metodos

    //Metodo constructor
    public Gestionar_docentes(){
    }

    //Metodo para agregar elementos a la lista de computadores
    public void agregar_docentes(Docentes obj_docente){
        list_docentes.add(obj_docente);
    }

    //Metodo para mostrar todos los elementos de la lista de reservas
    public String buscar_docente(int num_cedula_del_docente_ingresado){
		Docentes un_docente= new Docentes();
		String coleccion_de_docentes="";
        boolean encontrado=false;

		for(int i=0; i<5; i++){
			un_docente= list_docentes.get(i);

            if (num_cedula_del_docente_ingresado==un_docente.get_numero_de_cedula()) {
                coleccion_de_docentes += "El nombre del docente es "+un_docente.get_nombres()+
             " Los apellidos del docente son  "+un_docente.get_apellidos()+
             "El curso que el docente imparte es "+un_docente.get_curso()+
            " y el numero de inventario del computador es el "+un_docente.get_numero_de_cedula()+"\n";
            encontrado=true;
            }	
		}
        if (encontrado== false){
            coleccion_de_docentes= "El computador no existe";
        }

		return coleccion_de_docentes;

    }
}


