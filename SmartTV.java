public class SmartTV extends Dispositivo implements Internet, Videos{
  public SmartTV(double p, String s, String m, String f, String a, String pr){
    super(p, s, m, f, a, pr);
  }

  public String navegar(String link){
    return "Se visitó la página " + link + " con la smartTV " + getMarca() + ".";
  }

  public String reproducir(){
    return "Se reprodujo un video con la smartTV " + getMarca() + ".";
  }

  public String probar(String n, String link, String j){
    return navegar(link) + "\n" + reproducir();
  }
}