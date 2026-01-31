package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) 
    {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingresa el digito 1");
        int a = Teclado.nextInt();
        
        System.out.println("Ingresa el digito 2");
        int b = Teclado.nextInt();
        
        Suma s = new Suma();
        Resta r = new Resta();
        
       
        System.out.println("La suma es: "+s.sumar(a,b));
        System.out.println("La resta es:"+r.restar(a,b));
    }
    
}
