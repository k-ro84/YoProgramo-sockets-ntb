/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bullaresinfo
 */
public class Servidor extends ConexionSockets{
     
    public Servidor() throws IOException{
      super("servidor");
     
   }
    
    public void startServer(){
        try{
            //el metodo accept inicilaiza el socket
            System.out.println("Esperando por una conexion:...."); 
            socketCliente =socketServidor.accept();
            //  se obtiene el flujo de salida del cliente
            System.out.println("cliente en linea");
            salidaCliente =new DataOutputStream(socketCliente.getOutputStream());
            //enviamos el mensaje al cliente
            salidaCliente.writeUTF("peticion recibida y aceptada");
            
            //se obtiene el flujo enreante desde el cliente
            BufferedReader entrada = new  BufferedReader (new InputStreamReader(socketCliente.getInputStream()) );
       
        while((mensajeServidor= entrada.readLine())!=null){
        
            System.out.println(mensajeServidor);
        } 
        
            System.out.println("fin de la conexion");
            socketServidor.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
}
