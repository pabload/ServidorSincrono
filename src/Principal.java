
public class Principal {

    public static void main(String[] args) throws Exception {
        try {
            Servidor servidor = new Servidor(args[0]);
            servidor.CrearServidor();
        } catch (Exception e) {
            System.out.println("Error al iniciar el servidor " + e);
        }
    }
}
