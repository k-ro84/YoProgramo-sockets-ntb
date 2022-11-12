/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author bullaresinfo
 */
public class Cliente extends ConexionSockets {
//pasamos el tipo para que conexion lo tome e inicialice
    public Cliente() throws IOException {
        super("cliente");
    }

    public void startCliente(){
       try{
           //flujo de datos hacia el servidor
           salidaServidor = new DataOutputStream(socketCliente.getOutputStream());
           for (int i = 0; i < 2; i++)
            {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
            }

            socketCliente.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        } 
    } 
    
}
