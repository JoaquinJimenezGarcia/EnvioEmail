public class Main {

    public static void main(String[] args) {
        EnviarCorreo();
    }

    public static void EnviarCorreo(){
        Correo c = new Correo();
        Controlador controlador = new Controlador();

        c.setPasswd("TU_CONTRASEÑA");
        c.setUsuarioCorreo("TU_CORREO");
        c.setAsunto("");
        c.setDestino("");
        c.setMsg("");

        if (controlador.enviarCorreo(c)){
            System.out.println("Enviado");
        }else{
            System.out.println("No enviado.");
        }
    }
}
