public class Laptop extends Dispositivo implements Internet, Videos, VideoJuegos, Portable{
  public Laptop(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String navegar(String link){
    return "Se visitó la página " + link + " con la laptop " + getMarca() + ".";
  }

  public String reproducir(){
    return "Se reprodujo un video con la laptop " + getMarca() + ".";
  }

  public String ejecutar(String j){
    return "Se ejecutó con éxito el videojuego " + j + " por la laptop " + getMarca() + ".";
  }

  public String guardar(){
    return "Es portable la laptop " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return navegar(link) + "\n" + reproducir() + "\n" + ejecutar(j) + "\n" + guardar();
  }
}