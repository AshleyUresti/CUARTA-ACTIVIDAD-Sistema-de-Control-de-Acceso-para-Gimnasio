public class MembresiaBasica extends Membresia {
    //atributos
    private int visitasRestantes;

    //constructor
    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasIniciales) {
        super(idMiembro, nombreUsuario);
        setVisitasRestantes(visitasIniciales);
    }

    //setter
    public void setVisitasRestantes(int visitasIniciales) {
        if (visitasIniciales < 0) {
            System.out.println("[Error] \n- Ingrese valores positivos!");
            return;
        }
        this.visitasRestantes = visitasIniciales;
    }

    //getter
    public int getVisitasRestantes() {
        return visitasRestantes;
    }

    //metodo reescrito
    @Override
    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            visitasRestantes--;
            System.out.println("[Acceso autorizado] \n" + "- Bienvenido " + nombreUsuario + ". Visitas restantes: " + visitasRestantes);
            System.out.println("-------------------------------------");
            return true;
        }
        System.out.println("[Acceso denegado] \n- " + nombreUsuario + ", tus visitas se agotaron: 0");
        System.out.println("-------------------------------------");
        return false;
    }
}