public class Computadores {
    //atributos
    private String marca;
    private int ano_compra;
    private int num_inventario_computo;

    //metodos

    //metodo constructor
    public Computadores(String _marca, int _ano_compra, int _num_inventario_computo){
        this.marca= _marca;
        this.ano_compra=_ano_compra;
        this.num_inventario_computo=_num_inventario_computo;
    } 

    //metodo get num_inventario_computo
    public int get_num_inventario_computo(){
        return num_inventario_computo;
    }
    
    public String mostrar_datos(){
        return ("La marca del computador es "+marca+", el computador fue comprado en el "+ano_compra+
        " y el numero de inventario del computador es el "+num_inventario_computo);
    }
}
