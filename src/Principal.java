

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args )throws Exception{
        ServerSocket sockeServer =new ServerSocket(2500);
        Socket socket = sockeServer.accept();
        BufferedReader lector =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String entrada;
        Scanner scanner =new  Scanner(System.in);
        String salida;
        PrintWriter escritor= new PrintWriter(socket.getOutputStream(),true);
        do {            
            entrada=lector.readLine();
            
            System.out.println(entrada);
            if (entrada.equalsIgnoreCase("fin")) {
                System.out.println("me voy");
                socket.close();
                sockeServer.close();
                System.exit(0);
            }
            salida=scanner.nextLine();
            escritor.println(salida);
        } while (!entrada.equalsIgnoreCase("fin"));
    }
    
    public static void CrearServidor(){
        try {
         ServerSocket sockeServer =new ServerSocket(2500);
        Socket socket = sockeServer.accept();
        } catch (Exception e) {
           System.out.println("Error al crear socket del servidor "+e);
        }     
    }
    public static void ConfigurarServidor(Socket socket, ServerSocket sockeServer){
        try {
            
        } catch (Exception e) {
        }
        BufferedReader lector =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String entrada;
        Scanner scanner =new  Scanner(System.in);
        String salida;
        PrintWriter escritor= new PrintWriter(socket.getOutputStream(),true);
        do {            
            entrada=lector.readLine();
            
            System.out.println(entrada);
            if (entrada.equalsIgnoreCase("fin")) {
                cerrarSockets(socket, sockeServer);
            }
            salida=scanner.nextLine();
            escritor.println(salida);
        } while (!entrada.equalsIgnoreCase("fin"));
        
    }
    public static void cerrarSockets(Socket socket, ServerSocket sockeServer){
        try {
        socket.close();
        sockeServer.close();
        System.exit(0);
        } catch (Exception e) {
          System.out.println("Error al cerrar sockets "+e);
        }
    }
    
}
