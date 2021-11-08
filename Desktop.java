public class Desktop extends Dispositivo implements Internet, Videos, VideoJuegos{
  public Desktop(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String navegar(String link){
    return "Se visitó la página " + link + " con la computadora de escritorio " + getMarca() + ".";
  }

  public String reproducir(){
    return "Se reprodujo un video con la computadora de escritorio " + getMarca() + ".";
  }

  public String ejecutar(String j){
    return "Se ejecutó con éxito el videojuego " + j + " por la computadora de escritorio " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return navegar(link) + "\n" + reproducir() + "\n" + ejecutar(j);
  }
}