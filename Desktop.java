/******************************************************************
Desktop.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de simular una computadora de escritorio.
******************************************************************/

public class Desktop extends Dispositivo implements Internet, Videos, VideoJuegos{
  //Constructor.
  public Desktop(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: El link a visitar.
     * @return: Una cadena de prueba.
     */
  public String navegar(String link){
    return "Se visitó la página " + link + " con la computadora de escritorio " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String reproducir(){
    return "Se reprodujo un video con la computadora de escritorio " + getMarca() + ".";
  }

  /********************************
     * @param: El nombre del videojuego a ejecutar.
     * @return: Una cadena de prueba.
     */
  public String ejecutar(String j){
    return "Se ejecutó con éxito el videojuego " + j + " por la computadora de escritorio " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return navegar(link) + "\n" + reproducir() + "\n" + ejecutar(j);
  }
}