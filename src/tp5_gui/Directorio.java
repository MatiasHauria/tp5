/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Hernan
 */
public class Directorio {

     public TreeMap<Long, Contacto> lista = new TreeMap<>();

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

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> listafinal = new ArrayList<>();
        for (Contacto aux : lista.values()) {
            if (aux.getCiudad().equalsIgnoreCase(ciudad)) {
                listafinal.add(aux);
            }
        }
        return listafinal;
    }

    public void borrarContacto(Long nroTelefono) {
        Iterator<Map.Entry<Long, Contacto>> it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Contacto> entry = it.next();
            if (entry.getKey().equals(nroTelefono)){
                it.remove();
                return;
            }
        }
    }
}
