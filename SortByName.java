/******************************************************************
SortByName.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase para ordenar según el nombre.
******************************************************************/

import java.util.*;
    
    public class SortByName implements Comparator<Dispositivo>{
        /********************************
     * @param: Dos dispositivos.
     * @return: Un entero.
     */
        @Override
        public int compare(Dispositivo a, Dispositivo b){
            return a.getMarca().compareTo(b.getMarca());
        }
    }
