import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Vista{
  private Scanner scan;

  //Constructor de la clase.
  public Vista(){
    scan = new Scanner(System.in);
  }

  
  public void queSucur(ArrayList<String> s){
    System.out.println("\n¡Bienvenido a Electrónica Latinoamericana! Tenemos de todo si de tecnología se trata.");
    System.out.println("Tenemos a tu disposición varias sucursales, elige la más cercana a ti:");

    
  }

  public ArrayList<Integer> agregarA(ArrayList<Dispositivo> prods){
    //Se muestran los productos disponibles.
    mostrar(prods);

    boolean bandera = false;
    int op = 0;

    while (!bandera)
      //Bloque try-catch para validar un ingreso de datos del tipo incorrecto.
      try
      {
        System.out.println("\n¿Deseas adquirir algún producto?");
        System.out.println("1. Sí\n2. No");

        op = scan.nextInt();

        //Validación del rango de respuesta.
        if ((op == 1) || (op == 2)) bandera = true;
        else /* Mensaje de error */ System.out.println("\nIngresa números dentro del rango [1, 2].");
      }
      catch (InputMismatchException e)
      {
        scan.next();

        //Mensaje de error.        
        System.out.println("\nIngresa números enteros solamente.");

        bandera = false;
      }
    
    ArrayList<Integer> ops = new ArrayList<Integer>();

    if (op == 2)
    {
      ops.add(0);
      return ops;
    }
    else
    {
      boolean bandera3 = false;
      int respuesta2 = 0;
      
      while (!bandera3)
        try
        {
          bandera = false;
          op = 0;

          while (!bandera)
            try
            {
              System.out.print("\n¿Cuántos productos deseas agregar al carrito? ");

              op = scan.nextInt();

              bandera = true;
            }
            catch (InputMismatchException e)
            {
              scan.next();
              System.out.println("\nIngresa únicamente números enteros.");
            }

          System.out.println("\nIngresa el índice numérico de los productos que desees agregar al carrito:");
      
          bandera = false;
          int contador = 0;
          while (!bandera && contador < op)
            try
            {
              System.out.println("\nProducto " + (contador+1) + ": ");
              int opcion = scan.nextInt();

              if ((opcion >= 1) && (opcion <= prods.size()))
              {
                boolean bandera2 = false;
                int respuesta = 0;
                
                while(!bandera2)
                  try
                  {
                    System.out.println("\n¿Deseas probar el dispositivo antes de agregarlo al carrito?");

                    System.out.println("1. Sí\n2. No");

                    respuesta = scan.nextInt();

                    if ((respuesta == 1) || (respuesta == 2)) bandera2 = true;
                    else System.out.println("\nIngresa únicamente números enteros dentro del rango [1, 2].");
                  }
                  catch (InputMismatchException e)
                  {
                    scan.next();
                    System.out.println("Ingresa únicamente números enteros.");
                    bandera2 = false;
                  }

                if (respuesta == 1) probar(prods.get(opcion));

                //Se agrega al carrito
                ops.add(opcion);

                //Se incrementa el contador.
                contador++;
              }
              else System.out.println("\nIngresa solo números dentro del rango [1, " + prods.size() + "]");
            }
            catch (InputMismatchException e)
            {
              scan.next();
              System.out.println("\nIngresa solo números enteros.");
              bandera = false;
            }

          System.out.println("¿Deseas agregar algo más?");
          System.out.println("1. Sí\n2.No")

          respuesta2 = scan.nextInt();

          if ((respuesta2 = 1) || (respuesta2 = 2)) bandera3 = true;
          else System.out.println("Ingresa solo números enteros.");
        }
        catch (InputMismatchException e)
        {
          scan.next();
          System.out.println("Ingresa únicamente números enteros.");
          bandera3 = false;
        }

      return ops;
    }
  }

  private void mostrar(ArrayList<Dispositivo> prods){
    System.out.println("");
    for (int i = 0; i < prods.size(); i++)
      System.out.println((i+1)+". " + prods.get(i).toString());
  }

  private void probar(Dispositivo compra){
    String num = "";
    String link = "";
    String juego = "";

    //if para verificar si el dispositivo es uno que puede llamar.
    if ((compra.getProducto().equals("Smartphone")) || (compra.getProducto().equals("Telefono Celular")) || (compra.getProducto().equals("Telefono Fijo")) || (compra.getProducto().equals("Smartwatch")))
    {
      System.out.print("¿A qué número deseas llamar? ");
      scan.skip(System.lineSeparator());
      num = scan.nextLine();
    }

    //if para verificar si el dispositivo puede navegar por internet.
    if ((compra.getProducto().equals("Smartphone")) || (compra.getProducto().equals("Desktop")) || (compra.getProducto().equals("SmartTV")) || (compra.getProducto().equals("Laptop")) || (compra.getProducto().equals("Tablet")))
    {
      System.out.print("¿Qué sitio deseas visitar? Ingresa el link...");
      scan.skip(System.lineSeparator());
      link = scan.nextLine();
    }

    //ir para verificar si el dispositivo puede ejecutar videojuegos.
    if ((compra.getProducto().equals("Desktop")) || (compra.getProducto().equals("Laptop")))
    {
      System.out.print("¿Qué videojuego deseas ejecutar? ");
      scan.skip(System.lineSeparator());
      juego = scan.nextLine();
    }

    //Llamada a método del dispositivo para probarlo.
    System.out.println("\n" + compra.probar(num, link, juego));
  }

  /*public int ordenar(){

  }*/

  public void factura(ArrayList<Dispositivo> compras){
    System.out.println("\nPara generar tu factura:");

    //Para solicitar el nombre.
    System.out.print("¿Cuál es tu nombre? ");
    scan.skip(System.lineSeparator());
    String nombre = scan.nextLine();

    //Para solicitar el NIT.
    System.out.print("\nIngresa tu NIT: ");
    scan.skip(System.lineSeparator());
    String nit = scan.nextLine();

    //Proceso para obtener la fecha actual.
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime ahora = LocalDateTime.now();
    String fecha = formato.format(ahora);
    //Referencia para estas instrucciones: https://www.javatpoint.com/java-get-current-date.

    //Proceso para generar el número de factura.
    Random rnd = new Random();
    int numF = rnd.nextInt(1001);

    //Proceso para obtener el monto total.
    double monto = 0.0;
    for (int i = 0; i < compras.size(); i++)
      monto += Double.parseDouble(compras.get(i).getPrecio());
    
    //Se muestra la factura
    System.out.println("\n---------Factura No. " + numF + "---------");
    System.out.println("Cliente: " + nombre);
    System.out.println("NIT: " + nit);
    System.out.println("Fecha de la compra: " + fecha);
    System.out.println("Monto: $" + monto);
  }

  /*public boolean otraCompra(){
    
  }*/

  public void despedida(){
    System.out.println("Gracias por utilizar el programa de ventas de Electrónica Latinoamericana.");
  }
}