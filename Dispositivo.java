public abstract class Dispositivo{
  private double precio;
  private String serie;
  private String marca;
  private String fechaFabric;
  private String AR;
  private String producto;

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
  public void setPrecio(double p){
    precio = p;
  }

  public String getPrecio(){
    return precio+"";
  }

  public void setSerie(String s){
    serie = s;
  }

  public String getSerie(){
    return serie;
  }

  public void setMarca(String m){
    marca = m;
  }

  public String getMarca(){
    return marca;
  }

  public void setFecha(String f){
    fechaFabric = f;
  }

  public String getFecha(){
    return fechaFabric;
  }

  public void setAR(String a){
    AR = a;
  }

  public String getAR(){
    return AR;
  }

  public void setProducto(String pr){
    producto = pr;
  }

  public String getProducto(){
    return producto;
  }

  //------------------Terminan setters y getters de las propiedades---------------------------

  //Método abstracto que servirá para probar un dispositivo.
  public abstract String probar(String n, String link, String j);

  //Método que escribe todas las propiedades del dispositivo.
  public String toString(){
    return getProducto() + " marca " + getMarca() + ", serie " + getSerie() + ", con un valor de " + getPrecio() + " y fabricado el " + getFecha() + ";  código AR: " + getAR();
  }
}