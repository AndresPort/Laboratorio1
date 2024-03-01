public class Reserva{
	//Atributos
	private String cedula_docente;
	private String num_inventario_computo;
	private String fecha;
	private String hora_recogida;
	private String hora_entrega;

	//Metodos

	//Metodo constructor
	public Reserva (){
	}

	//Metodos set

	public void set_cedula_docente(String _cedula_docente){
		this.cedula_docente = _cedula_docente ;
	}

	public void set_num_inventario_computo(String _num_inventario_computo){
		this.num_inventario_computo = _num_inventario_computo ;
	}

	public void set_fecha(String _fecha){
		this.fecha= _fecha;
	}

	public void set_hora_recogida(String _hora_recogida){
		this.hora_recogida= _hora_recogida;
	}

	public void set_hora_entrega(String _hora_entrega){
		this.hora_entrega= _hora_entrega;
	}

	//Metodos get

	public String get_cedula_docente(){
		return cedula_docente;
	}

	public String get_num_inventario_computo(){
		return num_inventario_computo;
	}

	public String get_fecha(){
		return fecha;
	}

	public String get_hora_recogida(){
		return hora_recogida;
	}

	public String get_hora_entrega(){
		return hora_entrega;
	}	
}