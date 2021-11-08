public class Smartphone extends Dispositivo implements Llamadas, Fotos, Internet, Videos, Portable{
  public Smartphone(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el smartphone " + getMarca() + ".";
  }

  public String fotografiar(){
    return "Se abrió la cámara del smartphone " + getMarca() + ".";
  }

  public String navegar(String link){
    return "Se visitó la página " + link + " con el smartphone " + getMarca() + ".";
  }

  public String reproducir(){
    return "Se reprodujo un video con el smartphone " + getMarca() + ".";
  }

  public String guardar(){
    return "Resulta portable el smartphone " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return llamar(n) + "\n" + fotografiar() + "\n" + navegar(link) + "\n" + reproducir() + "\n" + guardar();
  }
}