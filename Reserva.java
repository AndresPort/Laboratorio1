public class Reserva{

	private String cedula_docente;
	private String num_inv_computo;
	private String fecha;
	private String hora_recogida;
	private String hora_entrega;

	public Reserva (){}

	public void set_cedula_docente(String cel_doc){
		cedula_docente = cel_doc ;
	}
	public void set_num_inv_computo(String inventario_computo){
		num_inv_computo = inventario_computo ;
	}
	public void set_fecha(String fech){
		fecha= fech;
	}
	public void set_hora_recogida(String h_recog){
		hora_recogida= h_recog;
	}
	public void set_hora_entrega(String h_ent){
		hora_entrega= h_ent;
	}

	public String getcedula_docente(){
		return cedula_docente;
	}
	public String getnum_inv_computo(){
		return num_inv_computo;
	}
	public String getfecha(){
		return fecha;
	}
	public String gethora_recogida(){
		return hora_recogida;
	}
	public String gethora_entrega(){
		return hora_entrega;
	}	
}