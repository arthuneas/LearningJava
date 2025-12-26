package Exercicios;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        double a, b, c;
        double a2, b2, c2;
        double temp;
        boolean retangulo, obtusangulo, equilatero, isoceles, isNotTriangule;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sc.close();

        //bubble sort de 3 variaveis, nao pode usar array no exercicio
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = c;
            c = a;
            a = temp;
        }
        
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        
        //facilitar a leitura
        a2 = Math.pow(a, 2);
        b2 = Math.pow(b, 2);
        c2 = Math.pow(c, 2);
        
        //facilitar a leitura
        isNotTriangule = (a >= (b + c));
        retangulo = (a2 == (b2 + c2));
        obtusangulo = (a2 > (b2 + c2));
        equilatero = (a2 == b2 && b2 == c2);
        isoceles = (a2 == b2 || b2 == c2 || a2 == c2);
        
        if (isNotTriangule) {
            System.out.println("NAO FORMA TRIANGULO");
            System.exit(0);
        
        } else {
        
            //angulos do triangulo
            if (retangulo) {
                System.out.println("TRIANGULO RETANGULO");
        
            } else if (obtusangulo) {
                System.out.println("TRIANGULO OBTUSANGULO");
        
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
        
            }
            
            //lados do triangulo
            if (equilatero) {
                System.out.println("TRIANGULO EQUILATERO");
        
            } else if (isoceles) {
                System.out.println("TRIANGULO ISOSCELES");
                
            }
        
        }

    }
    
}
