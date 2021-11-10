/******************************************************************
Tablet.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar una tablet.
******************************************************************/

public class Tablet extends Dispositivo implements Fotos, Internet, Videos, Portable{
  //Constructor
  public Tablet(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String fotografiar(){
    return "Se abrió la cámara de la tablet " + getMarca() + ".";
  }

  /********************************
     * @param: El link a visitar.
     * @return: Una cadena de prueba.
     */
  public String navegar(String link){
    return "Se visitó la página " + link + " con la tablet " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */ 
  public String reproducir(){
    return "Se reprodujo un video con la tablet " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String guardar(){
    return "Resulta portable la tablet " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return fotografiar() + "\n" + navegar(link) + "\n" + reproducir() + "\n" + guardar();
  }
}