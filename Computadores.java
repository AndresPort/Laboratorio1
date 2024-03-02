public class Computadores {
    //atributos
    private String marca;
    private int ano_compra;
    private int num_inventario_computo;

    //metodos

    //metodo constructor
    public Computadores(){
    } 

    //metodos get

    //metododo get marca
    public String get_marca(){
        return marca;
    }

    public int get_ano_compra(){
        return ano_compra;
    }

    //metodo get num_inventario_computo
    public int get_num_inventario_computo(){
        return num_inventario_computo;
    }
    
    //Metodos set

    //set marca
    public void set_marca(String _marca){
        this.marca= _marca;
    }

    //set ano de compra
    public void set_ano_compra(int _ano_compra){
        this.ano_compra=_ano_compra;
    }

    //set numero de el computador en el inventario
    public void set_num_inventario_computo(int _num_inventario_computo){
        this.num_inventario_computo=_num_inventario_computo;
    }

}
