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

  
  public int queSucur(ArrayList<String> s) {
        int opcion = 0;
        try {
            System.out.println("\n¡Bienvenido a Electrónica Latinoamericana! Tenemos de todo si de tecnología se trata.");
            System.out.println("Tenemos a tu disposición varias sucursales, elige la más cercana a ti:");
            for (int i = 0; i < s.size(); i++) {
                System.out.println((i + 1) + ". " + s.get(i));
            }
            System.out.println("¿Qué sucursal le queda más cerca?");
            opcion = scan.nextInt();
            while (opcion <= 0 || opcion > s.size()) {
                System.out.println("Ingrese una opción valida");
                opcion = scan.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return opcion;
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

    if (op == 2) return ops;
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

              if (op > 0)  bandera = true;
              else System.out.println("Ingresa números enteros mayores a 0.");
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

                if (respuesta == 1) probar(prods.get(opcion-1));

                //Se agrega al carrito
                ops.add(opcion-1);

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
          System.out.println("1. Sí\n2.No");

          respuesta2 = scan.nextInt();

          if ((respuesta2 < 1) || (respuesta2 > 2)) System.out.println("Ingresa solo números dentro del rango [1, 2].");
          else if (respuesta2 == 1) bandera3 = false;
          else bandera3 = true;
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

    scan.skip(System.lineSeparator());

    //if para verificar si el dispositivo es uno que puede llamar.
    if ((compra.getProducto().equals("Smartphone")) || (compra.getProducto().equals("Telefono Celular")) || (compra.getProducto().equals("Telefono Fijo")) || (compra.getProducto().equals("Smartwatch")))
    {
      System.out.print("¿A qué número deseas llamar? ");
      num = scan.nextLine();
    }

    //if para verificar si el dispositivo puede navegar por internet.
    if ((compra.getProducto().equals("Smartphone")) || (compra.getProducto().equals("Desktop")) || (compra.getProducto().equals("SmartTV")) || (compra.getProducto().equals("Laptop")) || (compra.getProducto().equals("Tablet")))
    {
      System.out.print("¿Qué sitio deseas visitar? Ingresa el link...");
      link = scan.nextLine();
    }

    //ir para verificar si el dispositivo puede ejecutar videojuegos.
    if ((compra.getProducto().equals("Desktop")) || (compra.getProducto().equals("Laptop")))
    {
      System.out.print("¿Qué videojuego deseas ejecutar? ");
      juego = scan.nextLine();
    }

    //Llamada a método del dispositivo para probarlo.
    System.out.println("\n" + compra.probar(num, link, juego));
  }

  public int ordenar(){
    boolean bandera = false;
    int op = 0;

    while (!bandera)
      try
      {
        System.out.println("¿Deseas ordenar tu lista?");
        System.out.println("1. Sí\n2. No");
        op = scan.nextInt();
        if ((op == 1) || (op == 2)) bandera = true;
        else System.out.println("\nIngresa números dentro del rango [1, 2].");
      }
      catch (InputMismatchException e)
      {
        scan.next();
        System.out.println("\nIngresa solamente números enteros.");
        bandera = false;
      }

    if (op == 2) return 0;
    else
    {
      bandera = false;
      op = 0;

      while (!bandera)
        try
        {
          System.out.println("\n¿Qué tipo de ordenamiento quieres efectuar?");
          System.out.println("1. De precio\n2. De fecha de fabricación\n3. De marca");

          op = scan.nextInt();

          if ((op >= 1) && (op <= 3)) bandera = true;
          else System.out.println("\nIngresa números dentro del rango [1, 3]");
        }
        catch (InputMismatchException e)
        {
          scan.next();
          System.out.println("\nIngresa solamente números enteros.");
          bandera = false;
        }
      
      return op;
    }
  }

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

  public boolean otraCompra(){
    boolean bandera = false;
    int r = 0;

    while (!bandera)
      try
      {
        System.out.println("¿Deseas realizar otra compra?");
        System.out.println("1. Sí\n2. No");

        r = scan.nextInt();

        if ((r == 1) || (r == 2)) bandera = true;
        else System.out.println("Ingresa números dentro del rango [1, 2].");
      }
      catch (InputMismatchException e)
      {
        scan.next();
        System.out.println("Ingresa únicamente números enteros");
      }
    
    return r == 1 ? true : false; 
  }

  public void despedida(){
    System.out.println("Gracias por utilizar el programa de ventas de Electrónica Latinoamericana.");
  }
}