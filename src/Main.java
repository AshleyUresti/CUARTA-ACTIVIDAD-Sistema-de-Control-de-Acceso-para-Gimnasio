import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //crear el arraylist miembros
        ArrayList<Membresia> miembros = new ArrayList<>();
        miembros.add(new MembresiaBasica("Basico-017", "Ceniza", 2));
        miembros.add(new MembresiaPremium("Premium-001", "Mimi", 1));
        miembros.add(new MembresiaBasica("Basico-022", "Mein", 0));

        System.out.println("\nD A T O S - M I E M B R O S\n");

        //ciclo for para recorrer la lista
        for (Membresia membresia : miembros) {
            membresia.mostrarDatos();
            membresia.verificarAcceso();
        }

        //ingresar con un invitado
        MembresiaPremium miembroPrueba = new MembresiaPremium("Premium-002", "James", 1);
        miembroPrueba.mostrarDatos();
        miembroPrueba.verificarAcceso();
        miembroPrueba.ingresarConInvitado();
        miembroPrueba.ingresarConInvitado();


    }
}