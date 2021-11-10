import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class Controlador{
  public static void main(String[] args) {
    Vista vista = new Vista();
    boolean flag = true;
    while(flag){
      //-------------Se pide la sucursal---------------

      //-------------Se muestran los productos y se pregunta si se quiere comprar alguno (aquí va a un while)-----------------
      ArrayList<Dispositivo> productos = Listado();
      ArrayList<Integer> indices = vista.agregarA(productos);
      ArrayList<Dispositivo> compras = new ArrayList<Dispositivo>();

      if (indices.size() == 0) flag = false;
      else
      {
        for (int i = 0; i < indices.size(); i++)
          compras.add(productos.get(indices.get(i)));

        //-------------Para este punto, ya debe tenerse la lista de los dispositivos a comprar--------------

        //int queOrden = 
        
        //------------Pregunta si quiere eliminar algún elemento-------------------
        ArrayList<Dispositivo> eliminar = new ArrayList<Dispositivo>();
        eliminar = vista.eliminar(compras);

        //En caso de que sí quiera eliminar algo.
        if (eliminar.size() > 0)
          /* Ciclo de eliminación */ for (int j = 0; j < eliminar.size(); j++) compras.remove(eliminar.get(j));

        //-------------Generar factura---------------
        vista.factura(compras);
      }

      //------------Preguntar si desea realizar otra compra------
      flag = vista.otraCompra();
    }

    //Mensaje de despedida para el usuario.
    vista.despedida();
  }
  
  // Método que devuelve un ArrayList con clases Dispositivo que se encuentran en el listado csv
  public static ArrayList<Dispositivo> Listado() {
        ArrayList<Dispositivo> dispositivos = new ArrayList(1);
        try {
            FileReader lector = new FileReader("sansalvador.csv");
            BufferedReader BR = new BufferedReader(lector);
            String mensaje = "";
            boolean comparador = true;
            int i = 0;
            do {
                mensaje = BR.readLine();
                if (mensaje == null) {
                    comparador = false;
                } else {
                    i++;
                    if (i > 1) {
                        String[] atributos = mensaje.split(",");
                        if (atributos[1].equals("Smartphone")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Smartphone(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Smartphone"));
                        } else if (atributos[1].equals("Telefono Celular")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new TelCelular(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Telefono Celular"));
                        } else if (atributos[1].equals("Telefono Fijo")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new TelFijo(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Telefono Fijo"));
                        } else if (atributos[1].equals("Camara")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Cam(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Camara"));
                        } else if (atributos[1].equals("Desktop")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Desktop(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Desktop"));
                        } else if (atributos[1].equals("Laptop")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Laptop(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Laptop"));
                        } else if (atributos[1].equals("SmartTV")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new SmartTV(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Smart TV"));
                        } else if (atributos[1].equals("Tablet")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Tablet(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Tablet"));
                        } else if (atributos[1].equals("Smartwatch")) {
                            double precio = Double.parseDouble(atributos[6]);
                            dispositivos.add(new Smartwatch(precio, atributos[2], atributos[3], atributos[4], atributos[5], "Smartwatch"));
                        }
                    }
                }
            } while (comparador == true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dispositivos;
    }
//Método para obtener el ArrayList de las sucursales disponibles.
        public static ArrayList<String> ListadoSucursales() {
        ArrayList<String> sucursales = new ArrayList(1);
        try {
            FileReader lector = new FileReader("sucursales.csv");
            BufferedReader BR = new BufferedReader(lector);
            String mensaje = "";
            boolean comparador = true;
            int i = 0;
            do {
                mensaje = BR.readLine();
                if (mensaje == null) {
                    comparador = false;
                } else {
                    i++;
                    if (i > 1) {
                        String[] atributos = mensaje.split(",");
                        String direccion = "Direccion: " + atributos[1] + ", Codigo: " + atributos[2] + ", Pais: " + atributos[3] + ", Ciudad: " + atributos[4];
                        sucursales.add(direccion);
                    }
                }
            } while (comparador == true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sucursales;
    }

    //Método para ordenar un ArrayList de Dispositivos por Precio.
    public static void FiltroPrecio(ArrayList<Dispositivo> dispos){
        Collections.sort(dispos);
        for(Dispositivo d: dispos){
            System.out.println(d);
        }
    }
    
    //Método para ordenar un ArrayList de dispositivos por Marca
    public static void FiltroMarca(ArrayList<Dispositivo> dispos){
        Collections.sort(dispos, new SortByName());
        for(Dispositivo d: dispos){
            System.out.println(d);
        }
    }
  //Método para ordenar un ArrayList de dispositivos por Fecha
    public static void FiltroFecha(ArrayList<Dispositivo> dispos){
        Collections.sort(dispos, new SortByDate());
        for(Dispositivo d: dispos){
            System.out.println(d);
        }
    }
}