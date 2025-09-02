/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_gui;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Hernan
 */
public class Directorio {

    TreeMap<Long, Contacto> lista = new TreeMap<>();

    public Directorio() {
    }

    public void agregarContacto(Long nroTelefono, Contacto contacto) {
        if (!lista.containsKey(nroTelefono)) {
            lista.put(nroTelefono, contacto);
        }
    }

    public Contacto buscarContacto(Long nroTelefono) {
        if (lista.containsKey(nroTelefono)) {
            return lista.get(nroTelefono);
        }
        return null;
    }

    public Long buscarTelefono(String apellido) {
        for (Long numeros : lista.keySet()) {
            Contacto auxiliar = lista.get(numeros);
            if (auxiliar.getApellido().equalsIgnoreCase(apellido)) {
                return numeros;
            }
        }
        return null;
    }

    public Contacto buscarContactos(String ciudad) {
        for (Contacto contactos : lista.values()) {
            ArrayList<Contacto> listafinal = new ArrayList<>();
            listafinal.add(contactos);
            for(Contacto aux: listafinal){
                if(aux.getCiudad().equalsIgnoreCase(ciudad))
                    return aux;
            }
        }
        return null;
    }
    public void borrarContacto(Long nroTelefono){
        if(lista.containsKey(nroTelefono)){
            lista.remove(nroTelefono);
        }
    }
}
