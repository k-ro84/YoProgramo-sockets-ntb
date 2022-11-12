/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Sockets.Cliente;
import java.io.IOException;

/**
 *
 * @author bullaresinfo
 */
public class SocketCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Cliente cli = new Cliente();
        
        System.out.println("Iniciando cliente \n");
        cli.startCliente();
    }
    
}
