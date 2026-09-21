public abstract class Membresia {
    //variables
    protected String idMiembro;
    protected String nombreUsuario;

    //constructor
    public Membresia(String idMiembro, String nombreUsuario) {
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    // metodo abstracto
    public abstract boolean verificarAcceso();

    //metodos concretos
    public void mostrarDatos() {
        System.out.println("ID: " + idMiembro + "\nNombre: " + nombreUsuario);
    }

    //setters
    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getIdMiembro() {
        return idMiembro;
    }

}