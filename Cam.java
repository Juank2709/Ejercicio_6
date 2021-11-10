/******************************************************************
Camara.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de simular una cámara.
******************************************************************/

public class Cam extends Dispositivo implements Fotos, Videos, Portable{
  
  //Constructor de la clase.
  public Cam(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String fotografiar(){
    return "Se probó el lente de la cámara " + getMarca() + " con éxito.";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String reproducir(){
    return "Se reprodujo un video en la cámara " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String guardar(){
    return "Resulta portable la cámara " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return fotografiar() + "\n" + reproducir() + "\n" + guardar();
  }
}