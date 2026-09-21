public class MembresiaPremium extends Membresia {
    //atributos
    private int pasesInvitado;

    //constructor
    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado) {
        super(idMiembro, nombreUsuario);
        setPasesInvitado(pasesInvitado);
    }

    //setter
    public void setPasesInvitado(int pasesInvitado) {
        if (pasesInvitado < 0) {
            System.out.println("[Error] \n- Ingrese valores positivos!");
            return;
        }
        this.pasesInvitado = pasesInvitado;
    }

    //getter
    public int getPasesInvitado() {
        return pasesInvitado;
    }

    //metodo reescrito
    @Override
    public boolean verificarAcceso() {
        System.out.println("[Acceso Premium] \n- Bienvenido " + nombreUsuario + "!");
        System.out.println("-------------------------------------");
        return true;
    }

    //metodo concreto
    public boolean ingresarConInvitado() {
        if (pasesInvitado > 0) {
            pasesInvitado--;
            System.out.println("[Invitado autorizado] \n- Ambos pueden pasar! Pases de invitado restantes: " + pasesInvitado);
            return true;
        }
        System.out.println("[Invitado denegado] \n- El pase de invitado está agotado: 0" + ". Solo puede ingresar " + nombreUsuario);
        return false;
    }
}