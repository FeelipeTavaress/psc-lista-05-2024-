
package exercicio3lista6;

import java.util.Scanner;


public class Exercicio3Lista6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
                
        System.out.println("Insira uma nota: ");
       nota1 =  sc.nextDouble();
         System.out.println("Insira outra nota: ");
         nota2 =  sc.nextDouble();
          System.out.println("Insira mais uma nota: ");
          nota3 =  sc.nextDouble();
           System.out.println("Insira mais uma nota: ");
           nota4 =  sc.nextDouble();
           
           media = (nota1 + nota2 + nota3 + nota4)/4;
           
            System.out.println("A sua nota 1 é: "+ nota1);
            System.out.println("A sua nota 2 é: "+ nota2);
            System.out.println("A sua nota 3 é: "+ nota3);
            System.out.println("A sua nota 4 é: "+ nota4);
            
            System.out.println("A média das notas é:"+ media);
            
           
    }
    
}
