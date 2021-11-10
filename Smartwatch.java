/******************************************************************
Smartwatch.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar un reloj inteligente.
******************************************************************/

public class Smartwatch extends Dispositivo implements Fotos, Portable, Llamadas{
  //Constructor.
  public Smartwatch(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: El número a llamar.
     * @return: Una cadena de prueba.
     */
  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el smartwatch " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String fotografiar(){
    return "Se abrió la cámara del smartwatch " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String guardar(){
    return "Resulta portable el smartwatch " + getMarca() + ".";
  }

  /********************************
     * @param: El número, el link y el videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return llamar(n) + "\n" + fotografiar() + "\n" + guardar();
  }
}