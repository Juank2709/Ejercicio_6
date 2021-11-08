public class Tablet extends Dispositivo implements Fotos, Internet, Videos, Portable{
  public Tablet(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String fotografiar(){
    return "Se abrió la cámara de la tablet " + getMarca() + ".";
  }

  public String navegar(String link){
    return "Se visitó la página " + link + " con la tablet " + getMarca() + ".";
  }

  public String reproducir(){
    return "Se reprodujo un video con la tablet " + getMarca() + ".";
  }

  public String guardar(){
    return "Resulta portable la tablet " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return fotografiar() + "\n" + navegar(link) + "\n" + reproducir() + "\n" + guardar();
  }
}