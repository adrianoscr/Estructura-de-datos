package semana11_clienteservidor;

//Clase hilo
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente extends Thread {

    //Trabajar con sockets.
    private Socket socket;

    //Permite enviar objetos al servidor
    private ObjectOutputStream objectOutputStream;
    //Permite recivir objetos que nos envien.
    private ObjectInputStream objectInputStream;

    private String identificador;
    private String host; //IP
    private int puertoComunicacion;
    private FRM_ChatCliente chat;
    private boolean escuchar;

    public Cliente(String identificador, String host, int puertoComunicacion, FRM_ChatCliente chat) {
        this.identificador = identificador;
        this.host = host;
        this.puertoComunicacion = puertoComunicacion;
        this.chat = chat;

        //¡¡¡¡¡¡¡¡¡¡¡Poner para iniciar el Hilo!!!!!!!!!.
        this.start();
    }

    public void solicitudConexion(String indentificador) {
        //Lista enlazada
        LinkedList<String> listaConexion = new LinkedList<>();
        listaConexion.add("Nueva Conexión");
        listaConexion.add(identificador);
        try {
            objectOutputStream.writeObject(listaConexion);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error con la solicitud de conexión", "Error Servidor", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    public void solicitudDesconexion(){
        LinkedList<String> listaConexion = new LinkedList<>(); // lista enlazada
        listaConexion.add("Nueva Desconexion");
        listaConexion.add(identificador);
        try {
            objectOutputStream.writeObject(listaConexion);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: No se puede leer o escribir en el serivdor");
        }
    }

    public void escucharConexion() {
        try {
            while (escuchar) {
                Object obj = objectInputStream.readObject();
                if (obj != null) {
                    if (obj instanceof LinkedList) {
                        //Se debe ejecutar
                        this.iniciar((LinkedList<String>) obj);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error con la lectura del objeto", "Error de Objeto", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error el socket viene en NULL", "Error de Socket", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se tiene conexión con el servidor\nEl chat se cerrará", "Error Comunicación", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }

    //Se encarga de
    public void iniciar(LinkedList<String> listaConexion) {
        String accion = listaConexion.get(0);
        switch (accion) {
            case "Aceptar Conexion":
                identificador = listaConexion.get(1);
                chat.setTitle(identificador);

                for (int i = 2; i < listaConexion.size(); i++) {
                    chat.addUsuarios(listaConexion.get(i));

                }

                break;
            case "Nuevo Usuario":
                chat.addUsuarios(listaConexion.get(1));
                break;
            case "Desconecta Usuario":
                chat.dropUsuario(listaConexion.get(1));
                break;
                
            case "Mensaje":
                chat.addmensaje(listaConexion.get(1), listaConexion.get(3));
                break;

        }
    }
    public void desconectar(){
        try {
            objectOutputStream.close();
            objectInputStream.close();
            socket.close();
            escuchar = false;
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviarMensaje(String usuarioRecibe, String mensaje){
         //Lista enlazada
        LinkedList<String> listaConexion = new LinkedList<>();
        listaConexion.add("Mensaje");
        listaConexion.add(identificador);
        listaConexion.add(usuarioRecibe);
        listaConexion.add(mensaje);
        
        try {
            objectOutputStream.writeObject(listaConexion);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error con la solicitud de conexión", "Error Servidor", JOptionPane.ERROR_MESSAGE);

        }
    }

    //Cuando hay hilos, simpre tiene que haber un RUN
    @Override
    public void run() {
        try {
            socket = new Socket(host, puertoComunicacion);
            //Obtener lo que se va a enviar
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            objectInputStream = new ObjectInputStream(socket.getInputStream());
            this.solicitudConexion(identificador);
            this.escucharConexion();
            JOptionPane.showMessageDialog(null, "Conexión levantada correctamente.");

        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede abrir la conexión.\nPuede ser la ip incorrecta.\nO bien el servidor no está corriendo\nEste chat será cerrado.");
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
