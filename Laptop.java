/******************************************************************
Laptop.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar una laptop.
******************************************************************/

public class Laptop extends Dispositivo implements Internet, Videos, VideoJuegos, Portable{

  //Constructor.
  public Laptop(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: El link a visitar.
     * @return: Una cadena de prueba.
     */
  public String navegar(String link){
    return "Se visitó la página " + link + " con la laptop " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String reproducir(){
    return "Se reprodujo un video con la laptop " + getMarca() + ".";
  }

  /********************************
     * @param: El nombre del videojuego a ejecutar.
     * @return: Una cadena de prueba.
     */
  public String ejecutar(String j){
    return "Se ejecutó con éxito el videojuego " + j + " por la laptop " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String guardar(){
    return "Es portable la laptop " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return navegar(link) + "\n" + reproducir() + "\n" + ejecutar(j) + "\n" + guardar();
  }
}