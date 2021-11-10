/******************************************************************
TelFijo.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar un teléfono fijo.
******************************************************************/

public class TelFijo extends Dispositivo implements Llamadas{
  //Constructor
  public TelFijo(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: El número a llamar.
     * @return: Una cadena de prueba.
     */
  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el teléfono fijo " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return llamar(n);
  }
}