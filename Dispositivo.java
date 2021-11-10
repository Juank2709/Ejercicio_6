/******************************************************************
Dispositivo.java
@author: Juan Carlos Marroquín y Herber Sebastián Silva.
@version: 0.0.0
Última modificación: 2021-11-09

Descripción: Clase encargada de representar las propiedades y métodos básicos de cualquier dispositivo en venta.
******************************************************************/

public abstract class Dispositivo{
  private double precio;
  private String serie;
  private String marca;
  private String fechaFabric;
  private String AR;
  private String producto;

  //constructor
  public Dispositivo(double p, String s, String m, String f, String a, String pr){
    //Setteo de las propiedades del dispositivo.
    setPrecio(p);
    setSerie(s);
    setMarca(m);
    setFecha(f);
    setAR(a);
    setProducto(pr);
  }
  
  //--------------------Inician los setters y getters de las propiedades----------

  /********************************
     * @param: El precio
     * @return: -
     */
  public void setPrecio(double p){
    precio = p;
  }

  /********************************
     * @param: -
     * @return: El precio.
     */
  public String getPrecio(){
    return precio+"";
  }

  /********************************
     * @param: La serie.
     * @return: -
     */
  public void setSerie(String s){
    serie = s;
  }

  /********************************
     * @param: -
     * @return: La serie.
     */
  public String getSerie(){
    return serie;
  }

  /********************************
     * @param: La marca.
     * @return: -
     */
  public void setMarca(String m){
    marca = m;
  }

  /********************************
     * @param: -
     * @return: La marca.
     */
  public String getMarca(){
    return marca;
  }

  /********************************
     * @param: La fecha
     * @return: -
     */
  public void setFecha(String f){
    fechaFabric = f;
  }

  /********************************
     * @param: -
     * @return: La fecha.
     */
  public String getFecha(){
    return fechaFabric;
  }

  /********************************
     * @param: El código AR.
     * @return: -
     */
  public void setAR(String a){
    AR = a;
  }

  /********************************
     * @param: -
     * @return: El código AR.
     */
  public String getAR(){
    return AR;
  }

  /********************************
     * @param: El tipo de producto.
     * @return: -
     */
  public void setProducto(String pr){
    producto = pr;
  }

  /********************************
     * @param: -
     * @return: El tipo de producto.
     */
  public String getProducto(){
    return producto;
  }

  //------------------Terminan setters y getters de las propiedades---------------------------

  //Método abstracto que servirá para probar un dispositivo.
  /********************************
     * @param: El nombre, link y videojuego.
     * @return: Una cadena de prueba.
     */
  public abstract String probar(String n, String link, String j);

  /********************************
     * @param: -
     * @return: Una cadena representativa del dispositivo.
     */
  //Método que escribe todas las propiedades del dispositivo.
  public String toString(){
    return getProducto() + " marca " + getMarca() + ", serie " + getSerie() + ", con un valor de " + getPrecio() + " y fabricado el " + getFecha() + ";  código AR: " + getAR();
  }

  /********************************
     * @param: Un dispositivo.
     * @return: Un entero.
     */
  @Override
  public int compareTo(Dispositivo d){
      if(d.getPrecio()>precio){
          return -1;
      } else if (d.getPrecio()>precio){
          return 0;
      } else{
          return 1;
      }
  }
}