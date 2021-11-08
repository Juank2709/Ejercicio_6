public class Cam extends Dispositivo implements Fotos, Videos, Portable{
  public Cam(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String fotografiar(){
    return "Se probó el lente de la cámara " + getMarca() + " con éxito.";
  }

  public String reproducir(){
    return "Se reprodujo un video en la cámara " + getMarca() + ".";
  }

  public String guardar(){
    return "Resulta portable la cámara " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return fotografiar() + "\n" + reproducir() + "\n" + guardar();
  }
}