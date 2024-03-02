public class Docentes {
    //atributos
    private int numero_de_cedula;
    private String nombres;
    private String apellidos;
    private String curso;

    //metodos

    //metodo constructor
    public Docentes(){
    }

    //Metodos get

    //get numero de cedula
    public int get_numero_de_cedula() {
        return numero_de_cedula;
    }

    //get nombres
    public String get_nombres() {
        return nombres;
    }

    //get apellidos
    public String get_apellidos() {
        return apellidos;
    }

    //get curso
    public String get_curso() {
        return curso;
    }

    //Metodos set

    //set numero de cedula
    public void set_numero_de_cedula(int _numero_de_cedula) {
        this.numero_de_cedula = _numero_de_cedula;
    }

    //set nombre
    public void set_nombres(String _nombres) {
        this.nombres = _nombres;
    }

    //set apellido
    public void set_apellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }

    //set curso
    public void set_curso(String _curso) {
        this.curso = _curso;
    }

    
}
