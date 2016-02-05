
package cajero;

import java.util.Scanner;

public class Cajero {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     Cuenta nueva = new Cuenta ();
     float c = 0;
    // AQUÍ ESTAN LOS 2 MENUS, EL PRIMERO PREGUNTA SI QUIERES UNA CUENTA DE 0 O EMPIEZA YA CON DINERO Y EL SEGUNDO QUE DEPENDE DE LA PRIMERA ELECCIÓN,
    //TE PERMITE SACAR, INTRODUCIR Y CONSULTAR TU SALDO ACTUAL, PARTIENDO DE 0 EUROS SI HAS
    //ELEGIDO LA PRIMERA OPCION O DE X EUROS SI HAS ELEGIDO LA SEGUNDA (DONDE X SON LOS QUE EL USUARIO QUIERA INTRODUCIR)
       System.out.println("¿Que deseas hacer? \n1- Crear cuenta vacia \n2- Crear cuenta con saldo inicial ");
       int cuack = sc.nextInt();
        switch(cuack){
            case 1:System.out.println("Ahora tienes una cuenta con un saldo de: 0 €");
                    System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
       int m2 = sc.nextInt();
       while (m2 >=1  && m2<4){
       switch (m2){
           case 1: System.out.println("Introduce la cantidad a ingresar: ");
           nueva.ingresar(sc.nextFloat());
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m2 = sc.nextInt();
           break;
           case 2: System.out.println("Introduce la cantidad que desea retirar: ");
           nueva.extraer(sc.nextFloat());
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m2 = sc.nextInt();
           break;
           case 3: System.out.println("Su saldo es de: ");
           nueva.imprimirSaldo();
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m2 = sc.nextInt();
           break;
           case 4: System.out.println("Cerrando...");          
           break;
       }
       };break;
            case 2: System.out.println("Introduce los euros con los que quieres abrir tu nueva cuenta...");
        Cuenta inicial = new Cuenta (sc.nextFloat());
                   System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
       int m3 = sc.nextInt();
       while (m3 >=1  && m3<4){
       switch (m3){
           case 1: System.out.println("Introduce la cantidad a ingresar: ");
           inicial.ingresar(sc.nextFloat());
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m3 = sc.nextInt();
           break;
           case 2: System.out.println("Introduce la cantidad que desea retirar: ");
           inicial.extraer(sc.nextFloat());
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m3 = sc.nextInt();
           break;
           case 3: System.out.println("Su saldo es de: ");
           inicial.imprimirSaldo();
            System.out.println("¿Que deseas hacer? \n1- Ingresar dinero \n2- Sacar dinero \n3- Ver Saldo \n4- Salir ");
           m3 = sc.nextInt();
           break;
           case 4: System.out.println("Cerrando...");          
           break;
           
       }
       }
       break;
        }
 
        
        
        
    }
    
}
