/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico5;

import java.util.TreeMap;



public class Directorio {

private TreeMap<Long, Cliente> clientes;  

    public Directorio(TreeMap<Long, Cliente> clientes) {
        this.clientes = clientes;
    }



public void agregarCliente(Long telefono, Cliente c){
    if (!clientes.containsKey(telefono)){
        clientes.put(telefono, c);
        }
    }
public void buscarCliente(Long telefono){
   clientes.get(telefono);
}

}
