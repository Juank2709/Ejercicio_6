/******************************************************************
Smartphone.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar un teléfono inteligente.
******************************************************************/

public class Smartphone extends Dispositivo implements Llamadas, Fotos, Internet, Videos, Portable{
  //Constructor
  public Smartphone(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  /********************************
     * @param: El número a llamar.
     * @return: Una cadena de prueba.
     */
  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el smartphone " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String fotografiar(){
    return "Se abrió la cámara del smartphone " + getMarca() + ".";
  }

  /********************************
     * @param: El link a visitar.
     * @return: Una cadena de prueba.
     */
  public String navegar(String link){
    return "Se visitó la página " + link + " con el smartphone " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String reproducir(){
    return "Se reprodujo un video con el smartphone " + getMarca() + ".";
  }

  /********************************
     * @param: -
     * @return: Una cadena de prueba.
     */
  public String guardar(){
    return "Resulta portable el smartphone " + getMarca() + ".";
  }

  /********************************
     * @param: El número, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public String probar(String n, String link, String j){
    return llamar(n) + "\n" + fotografiar() + "\n" + navegar(link) + "\n" + reproducir() + "\n" + guardar();
  }
}