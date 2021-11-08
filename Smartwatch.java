public class Smartwatch extends Dispositivo implements Fotos, Portable, Llamadas{
  public Smartwatch(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el smartwatch " + getMarca() + ".";
  }

  public String fotografiar(){
    return "Se abrió la cámara del smartwatch " + getMarca() + ".";
  }

  public String guardar(){
    return "Resulta portable el smartwatch " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return llamar(n) + "\n" + fotografiar() + "\n" + guardar();
  }
}