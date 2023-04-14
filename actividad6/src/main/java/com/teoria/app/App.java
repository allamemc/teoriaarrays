/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.teoria.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Tecnicos
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Colecciones en Java");
        System.out.println("tipos de datos,orden,repeticiones,add/remove");
        
        System.out.println("Interface List - ArrayList");
        
        ArrayList lista_array = new ArrayList();
        //permite almacenar diferentes datos
        //admite repeticiones
        //admite eliminar items
        //soporta ordenar a traves de un comparador
        lista_array.add("juan");
        lista_array.add(2);
        lista_array.add(2);
        lista_array.add(new Date());
        lista_array.remove(2);
        
        for(Object o:lista_array){
            System.out.println(o);
        }

        
        System.out.println("Interface Set - HashSet");

        HashSet<String> conjunto = new HashSet();
        //set es fuertemente tipado. Admite el mismo tipo de dato
        // *** HashSet<Object> conjunto = new HashSet();
        // no soporta repeticiones pero no genera error
        //ordenar se almacena no por orden de entrada (no con AL)
        conjunto.add("item1");
        conjunto.add("item2");
        conjunto.add("item1");
        conjunto.add("item3");
        conjunto.add("item4");
        conjunto.add("item5");
        conjunto.add("item6");
        conjunto.add("item7");
        conjunto.add("item2");
        
        for(String s:conjunto){
            System.out.println(s);
        }
        
        System.out.println("Interface Queue - Queue");
        //tipos de datos : si
        //soporta repeticion: si
        //add remove : si/si
        //orden : FIFO
        
        Queue cola = new LinkedList();
        
        //admite repeticion
        //admite distintos tipos de datos
        cola.add("cosa1");
        cola.add("cosa2");
        cola.add("cosa3");
        cola.add("cosa1");
        cola.add(2);
        //elimina el primer elemento que encuentre con el filtro
        cola.remove("cosa1");
        
        for(Object j:cola){
            System.out.println(j);
        }
        
        System.out.println("Inferface Map - HashMap");
        
        //polimorfismo
        Map mapa1 = new HashMap();
        Map mapa2 = new TreeMap();
        
        HashMap<String,Float> mapa = new HashMap<>();
        mapa.put("Courtois", 8.59f);//puedes utilizar diferentes tipos
        mapa.put("Oblak", 0.01f);
        mapa.put("Oblak", 0.02f);//repetir es actualizar
        mapa.put("Arconada", 1.52f);//guarda orden de entrada FIFO
        for(String m : mapa.keySet()){
            System.out.println("Nombre: " + m + " Goles: " + mapa.get(m));
        }
    }
}
