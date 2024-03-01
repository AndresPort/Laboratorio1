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
	public void setMarca(int inventario_computo){
		num_inv_computo = inventario_computo ;
	}
	public void setColor(int fech){
		fecha= fech;
	}
	public void setCantTotalSerie(int h_recog){
		hora_recogida= h_recog;
	}
	public void setnumeroSerie(int h_ent){
		hora_entrega= h_ent;
	}

	public int getAnhoSerie(){
		return cedula_docente;
	}
	public int getMarca(){
		return num_inv_computo;
	}
	public int getColor(){
		return fecha;
	}
	public int getCantTotalSerie(){
		return hora_recogida;
	}
	public int getNumeroSerie(){
		return hora_entrega;
	}	
}