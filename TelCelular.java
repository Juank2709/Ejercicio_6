public class TelCelular extends Dispositivo implements Llamadas, Portable{
  public TelCelular(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String llamar(String n){
    return "Se llamó al número " + n + " con éxito, con el teléfono celular " + getMarca() + ".";
  }

  public String guardar(){
    return "Resulta portable el teléfono celular " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return llamar(n) + "\n" + guardar();
  }
}