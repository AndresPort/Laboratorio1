public class Reserva{

	private int cedula_docente;
	private int num_inv_computo;
	private int fecha;
	private int hora_recogida;
	private int hora_entrega;

	public Reserva (){}

	public void set_cedula_docente(int cel_doc){
		cedula_docente = cel_doc ;
	}
	public void set_num_inv_computo(int inventario_computo){
		num_inv_computo = inventario_computo ;
	}
	public void set_fecha(int fech){
		fecha= fech;
	}
	public void set_hora_recogida(int h_recog){
		hora_recogida= h_recog;
	}
	public void set_hora_entrega(int h_ent){
		hora_entrega= h_ent;
	}

	public int getcedula_docente(){
		return cedula_docente;
	}
	public int getnum_inv_computo(){
		return num_inv_computo;
	}
	public int getfecha(){
		return fecha;
	}
	public int gethora_recogida(){
		return hora_recogida;
	}
	public int gethora_entrega(){
		return hora_entrega;
	}	
}