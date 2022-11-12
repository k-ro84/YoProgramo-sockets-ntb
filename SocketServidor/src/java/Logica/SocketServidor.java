/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Sockets.Servidor;
import java.io.IOException;

/**
 *
 * @author bullaresinfo
 */
public class SocketServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       Servidor servi = new Servidor();
        System.out.println("Iniciando el servidor ... \n");
        servi.startServer();
        
    }
    
}
