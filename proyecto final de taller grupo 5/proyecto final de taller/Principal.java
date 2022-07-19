import usuario1.*;
import paquetedeopciones.*;
import paquetedeopciones.*;
import juegosacc.*;
import juegosavent.*;
import juegosdepor.*;
import miedo.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal extends Usuario{
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
   //Opciones paquetedeopciones = new Opciones();
    boolean salir = false;
     System.out.println("1.obtener una menbresia");
      System.out.println("2.salir");
       int opciones = entrada.nextInt();
        entrada.nextLine();
         

          switch(opciones){//swicht principal
           case 1:
            Usuario usuario1 = new Usuario();
  	         System.out.println("te pediremos los siguietes datos para obtener tu menbresia del club");
  	          System.out.println("nombre/apellido/edad/genero/correo electronico/nombre de usaurio");
  	           System.out.println();
  	            System.out.println("ingrese su nombre");
  	             String nombre = entrada.nextLine();
  	              System.out.println("ingrese su apellido");
  	               String apellido = entrada.nextLine();
  	                System.out.println("ingrese su edad");
  	                 int edad =entrada.nextInt();
   	                  entrada.nextLine();
  	                   System.out.println("ingresu su genero");
  	                    String genero =entrada.nextLine();
   	                     System.out.println("ingrese un correo electronico");
                        	String gmail = entrada.nextLine();
   	                       System.out.println("ingresu su nombre de usuario");
   	                        String nombre1 = entrada.nextLine();
   	                         System.out.println();
     
                              usuario1.setNombre(nombre);
                               usuario1.setApellido(apellido);
                                usuario1.setEdad(edad);
                                 usuario1.setGenero(genero);
                                  usuario1.setGmail(gmail);
                                   usuario1.setNombre1(nombre1);

                                    ArrayList<String> datosdeusuario = new ArrayList<String>();
                                   datosdeusuario.add("tu nombre es:"+" "+usuario1.getNombre());
                                  datosdeusuario.add("tu apellido es:"+" "+usuario1.getApellido());
                                 datosdeusuario.add("tu edad es:"+" "+usuario1.getEdad());
                                datosdeusuario.add("tu genero es:"+" "+usuario1.getGenero());
                               datosdeusuario.add("");
                              for (String i :datosdeusuario) {
                             System.out.println(i);
}
                          System.out.println();
                         ArrayList<String>datosdeusuario1 = new ArrayList<String>();
                        datosdeusuario1.add("los datos de tu perfil que podran ver otros usuarios");
                       datosdeusuario1.add("nombre de usuario es:"+" "+usuario1.getNombre1());
                      datosdeusuario1.add("tu correo electronico es:"+" "+usuario1.getGmail());
                     for (String f :datosdeusuario1) {
                    System.out.println(f);
}
                   ArrayList<String>datosdeusuario2 = new ArrayList<String>();
                  datosdeusuario2.add(usuario1.getNombre1()+" "+usuario1.getGmail());
                 datosdeusuario2.add("");

               
               while(!salir){
              System.out.println();
             System.out.println ("1.eliminar una cuenta");
            System.out.println ("2.ver juegos de a tienda");
           System.out.println ("3.ver mienbros");
          System.out.println ("4.salir del programa");
         System.out.println ();
        System.out.println ("elige tu opcion");
       int opcion =entrada.nextInt();
     entrada.nextLine();
     
    switch(opcion) {//Swchit secundario
  case 1:
 System.out.println("hola usaurio por usar por usar nuestra tienda de juegos");
System.out.println("aqui eliminara todo tus datos");
 for (String g:datosdeusuario2) {
  System.out.println(g);
   datosdeusuario2.remove(0);
}
    for (String g:datosdeusuario2) {
     System.out.println("eliminacion exitosa");
      System.out.println(g);
       System.out.println("ya puedes salir de la tienda");
}
        break;//Swchi secundario
        case 2:
           Opciones paquetedeopciones = new Opciones();
    GeneroAccion juegosacc = new GeneroAccion();
     GeneroAventuras juegosavent = new GeneroAventuras();
      GeneroDeportes juegosdepor = new GeneroDeportes();
       GeneroTerror miedo = new GeneroTerror();
        
         int metodopago;
          int dias = 8;
           int n1;
            Double numtarjeta;  
             Double codseguridad;
              String moneda;
               int n2;
       //Guardaremos la opcion del usuario
          while(!salir){
           System.out.println(" Bienvenido al Menu de Generos de Juegos: ");
            System.out.println("1. Accion");
             System.out.println("2. Aventuras");
              System.out.println("3. Deportes");
               System.out.println("4. Terror");
                System.out.println("5. Salir");
                 System.out.println("Escribe una de las opciones");
                  int opcion6 = entrada.nextInt();
                   paquetedeopciones.setOpcion(opcion);
                    switch(opcion6){
                     case 1:
                      System.out.println("Los Juegos de Accion son: ");
                       
                       ArrayList<String>juegosdeaccion = new ArrayList<String>();
                        
                         juegosdeaccion.add(juegosacc.getJuego1());
                          juegosdeaccion.add(juegosacc.getJuego2());
                           juegosdeaccion.add(juegosacc.getJuego3());
                           
                        
                            for (String i:juegosdeaccion ) {
                             System.out.println(i);
}
                              System.out.println();
                               System.out.println("elgi la opcion que quieers ");
                                System.out.println("1.eliminar un juego ");
                                 System.out.println("2.alquilar el juego el juego");
                                  int opcion1 = entrada.nextInt();
                                   entrada.nextLine();
                       
                                    switch(opcion1){
                                     case 1:
                                      for (String i:juegosdeaccion) {
                                       System.out.println(i);
}
                                        System.out.println("que juego queires eliminar");
                                         int borrador = entrada.nextInt();
                                         entrada.nextLine();
                                          juegosdeaccion.remove(borrador);

                                           for (String e:juegosdeaccion ) {
                                            System.out.println(e);
}

                                              case 2:
                                               while (!salir) {
                                                System.out.println("Bienvenidos al Metodo de Pagos de Juegos");
                                                 System.out.println("Tu metodo de pago va ser: ");
                                                 System.out.println("1.Tarjeta de Credito");
                                                  System.out.println("2.Efectivo");
                                                   System.out.println("3.Salir");
                                                    metodopago = entrada.nextInt();
                                                     entrada.nextLine();

                                                      switch (metodopago) {
                                                       case 1:
                                                        System.out.println("Has Elegido el Metodo de Pago por Trajeta de Credito");
                                                         System.out.println("Ingrese cuantos Dias tendra el juego: ");
                                                          n1 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                                                           int resultado = dias*n1;
        //multiplicar y dar la respuesta
       
                                                            System.out.println("Su pago es de: " + "Q" + resultado);
                                                             System.out.println("Ingresa tu numero de Tarjeta de Credito: ");
                                                              numtarjeta = entrada.nextDouble();
                                                               System.out.println("Ingresa tu Codigo de Seguridad: ");
                                                                codseguridad = entrada.nextDouble();
                                                                 System.out.println("Ingresa en que Mondea deseas Pagar: ");
                                                                 moneda = entrada.nextLine();
                                                                System.out.println("-----------TU TRANSACCION FUE EXITOSA----------");
                                                               break;
                                                              case 2:
                                                             System.out.println("Has Elegido el Metodo de Pago  de Efectivo");
                                                            System.out.println("Ingrese cuantos Dias tendra el juego: ");
                                                            n2 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                                                          int resultado1 = dias*n2;
        //multiplicar y dar la respuesta
                                                         System.out.println(n2 + " * " + dias + " = ");
                                                        System.out.println("El pago que debe hacer es de: " + "Q" + resultado1);
                                                       System.out.println("--------Puedes Pagar en Recepcion tu Cantidad.---------");
                                                      break;
                                                     case 3:
                                                    salir = true;
                                                   break;
}
}
                                                break;
                                               case 3:
                                              break;
                          
}
                                             break;
                                            case 2:
                                           ArrayList<String>juegosdeaventuras = new ArrayList<String>();
                                          juegosdeaventuras.add("los juegos de Aventuras");
                                         juegosdeaventuras.add(juegosavent.getJuego4());
                                        juegosdeaventuras.add(juegosavent.getJuego5());
                                       juegosdeaventuras.add(juegosavent.getJuego6());
                        
                                      for (String i:juegosdeaventuras ) {
                                     System.out.println(i);
}
                        

                                    System.out.println();
                                   System.out.println("elgi la opcion que quieers ");
                                  System.out.println("1.eliminar un juego ");
                                 System.out.println("2.alquilar el juego el juego");
                                int opcion2 = entrada.nextInt();
                               entrada.nextLine();
                       
                             switch(opcion2){
                            case 1:
                           for (String i:juegosdeaventuras) {
                          System.out.println(i);
}
                         System.out.println("que juego queires eliminar");
                        int borrador = entrada.nextInt();
                       entrada.nextLine();
                      juegosdeaventuras.remove(borrador);

                     for (String e:juegosdeaventuras ) {
                    System.out.println(e);
}
                   case 2:
                  while (!salir) {
                 System.out.println("Bienvenidos al Metodo de Pagos de Juegos");
                System.out.println("Tu metodo de pago va ser: ");
               System.out.println("1.Tarjeta de Credito");
              System.out.println("2.Efectivo");
             System.out.println("3.Salir");
            metodopago = entrada.nextInt();
           entrada.nextLine();

          switch (metodopago) {
         case 1:
        System.out.println("Has Elegido el Metodo de Pago por Trajeta de Credito");
       System.out.println("Ingrese cuantos Dias tendra el juego: ");
      n1 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
   int resultado = dias*n1;
        //multiplicar y dar la respuesta
  System.out.println("Su pago es de: " + "Q" + resultado);
 System.out.println("Ingresa tu numero de Tarjeta de Credito: ");
numtarjeta = entrada.nextDouble();
 System.out.println("Ingresa tu Codigo de Seguridad: ");
  codseguridad = entrada.nextDouble();
   System.out.println("Ingresa en que Mondea deseas Pagar: ");
    moneda = entrada.nextLine();
     System.out.println("-----------TU TRANSACCION FUE EXITOSA----------");
      break;
       case 2:
        System.out.println("Has Elegido el Metodo de Pago  de Efectivo");
         System.out.println("Ingrese cuantos Dias tendra el juego: ");
          n2 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
            int resultado1 = dias*n2;
        //multiplicar y dar la respuesta
             System.out.println(n2 + " * " + dias + " = ");
              System.out.println("El pago que debe hacer es de: " + "Q" + resultado1);
               System.out.println("--------Puedes Pagar en Recepcion tu Cantidad.---------");
                break;
                 case 3:
                  salir = true;
                   break;
}
}
                    break;

}
                      break;
                       case 3:
                         ArrayList<String>juegosdeportes = new ArrayList<String>();
                          juegosdeportes.add("los juegos de Aventuras");
                           juegosdeportes.add(juegosdepor.getJuego7());
                            juegosdeportes.add(juegosdepor.getJuego8());
                             juegosdeportes.add(juegosdepor.getJuego9());
                              for (String i:juegosdeportes ) {
                               System.out.println(i);
}
                                System.out.println();
                                 System.out.println("elgi la opcion que quieers ");
                                  System.out.println("1.eliminar un juego ");
                                   System.out.println("2.alquilar el juego el juego");
                                    int opcion3 = entrada.nextInt();
                                     entrada.nextLine();
                       
                                      switch(opcion3){
                                       case 1:
                                        for (String i:juegosdeportes) {
                                         System.out.println(i);
}
                                          System.out.println("que juego queires eliminar");
                                           int borrador = entrada.nextInt();
                                            entrada.nextLine();
                                             juegosdeportes.remove(borrador);

                                               for (String e:juegosdeportes ) {
                                                System.out.println(e);
}
                                                 case 2:
                                                  while (!salir) {
                                                   System.out.println("Bienvenidos al Metodo de Pagos de Juegos");
                                                    System.out.println("Tu metodo de pago va ser: ");
                                                     System.out.println("1.Tarjeta de Credito");
                                                      System.out.println("2.Efectivo");
                                                      System.out.println("3.Salir");
                                                     metodopago = entrada.nextInt();
                                                    entrada.nextLine();

                                                  switch (metodopago) {
                                                 case 1:
                                                System.out.println("Has Elegido el Metodo de Pago por Trajeta de Credito");
                                               System.out.println("Ingrese cuantos Dias tendra el juego: ");
                                              n1 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                                             int resultado = dias*n1;
        //multiplicar y dar la respuesta
       
                                          System.out.println("Su pago es de: " + "Q" + resultado);
                                         System.out.println("Ingresa tu numero de Tarjeta de Credito: ");
                                        numtarjeta = entrada.nextDouble();
                                       System.out.println("Ingresa tu Codigo de Seguridad: ");
                                      codseguridad = entrada.nextDouble();
                                     System.out.println("Ingresa en que Mondea deseas Pagar: ");
                                    moneda = entrada.nextLine();
                                   System.out.println("-----------TU TRANSACCION FUE EXITOSA----------");
                                  break;
                                 case 2:
                                System.out.println("Has Elegido el Metodo de Pago  de Efectivo");
                               System.out.println("Ingrese cuantos Dias tendra el juego: ");
                              n2 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                             int resultado1 = dias*n2;
        //multiplicar y dar la respuesta
                            System.out.println(n2 + " * " + dias + " = ");
                           System.out.println("El pago que debe hacer es de: " + "Q" + resultado1);
                          System.out.println("--------Puedes Pagar en Recepcion tu Cantidad.---------");
                         break;
                        case 3:
                       salir = true;
                      break;
}
}
                     break;
}
                    case 4:
                   ArrayList<String>juegosdeterror = new ArrayList<String>();
                  juegosdeterror.add("los juegos de Terror");
                 juegosdeterror.add(miedo.getJuego10());
                juegosdeterror.add(miedo.getJuego11());
               juegosdeterror.add(miedo.getJuego12());
                        
              for (String i:juegosdeterror ) {
             System.out.println(i);
}
            System.out.println();
           System.out.println("elgi la opcion que quieers ");
          System.out.println("1.eliminar un juego ");
         System.out.println("2.alquilar el juego el juego");
        int opcion5 = entrada.nextInt();
       entrada.nextLine();
      switch(opcion5){
     case 1:
    for (String i:juegosdeterror) {
   System.out.println(i);
}
  System.out.println("que juego queires eliminar");
 int borrador = entrada.nextInt();
entrada.nextLine();
 juegosdeterror.remove(borrador);

  for (String e:juegosdeterror ) {
   System.out.println(e);
}
     case 2: 
      while (!salir) {
       System.out.println("Bienvenidos al Metodo de Pagos de Juegos");
        System.out.println("Tu metodo de pago va ser: ");
         System.out.println("1.Tarjeta de Credito");
          System.out.println("2.Efectivo");
           System.out.println("3.Salir");
            metodopago = entrada.nextInt();
             entrada.nextLine();
              switch (metodopago) {
               case 1:
                System.out.println("Has Elegido el Metodo de Pago por Trajeta de Credito");
                 System.out.println("Ingrese cuantos Dias tendra el juego: ");
                  n1 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                    int resultado = dias*n1;
        //multiplicar y dar la respuesta
       
                       System.out.println("Su pago es de: " + "Q" + resultado);
                        System.out.println("Ingresa tu numero de Tarjeta de Credito: ");
                         numtarjeta = entrada.nextDouble();
                          System.out.println("Ingresa tu Codigo de Seguridad: ");
                           codseguridad = entrada.nextDouble();
                            System.out.println("Ingresa en que Mondea deseas Pagar: ");
                             moneda = entrada.nextLine();
                              System.out.println("-----------TU TRANSACCION FUE EXITOSA----------");
                               break;
                                case 2:
                                 System.out.println("Has Elegido el Metodo de Pago  de Efectivo");
                                  System.out.println("Ingrese cuantos Dias tendra el juego: ");
                                   n2 = entrada.nextInt();
    //multiplicar
    //no mostrar multiplicacion
                                     int resultado1 = dias*n2;
        //multiplicar y dar la respuesta
                                       System.out.println(n2 + " * " + dias + " = ");
                                        System.out.println("El pago que debe hacer es de: " + "Q" + resultado1);
                                         System.out.println("--------Puedes Pagar en Recepcion tu Cantidad.---------");
                                          break;
                                           case 3:
                                            salir = true;
                                             break;

}
}

                                                break;
                
                      
} 
                                                   break;
                                                    case 5:
                                                     salir = true;
                                                    break;   
}     
}


        break;
        case 3:
        
          
        
ArrayList<String>mienbrosclub = new ArrayList<String>();
mienbrosclub.add("mienbros el club");
mienbrosclub.add("maria23 correo electronico mariaantonia45@gmail.com juegos de maria23 /call of duty /free fire");
mienbrosclub.add(usuario1.getNombre1()+" "+"correo electronico "+usuario1.getGmail());
mienbrosclub.add("juanpab45 correo electronico juanpablo34@gmail.com juegos de juanpab45 /grany/fifa 18");
for (String i :mienbrosclub ) {
  System.out.println(i);
}

        break;
        case 4:
        salir=true;
        break;
         

}
}


case 2:
break;




}







         
    
    

   }

}






 





