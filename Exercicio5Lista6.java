
package teste2;

import java.util.Scanner;


public class Teste2 {

   
    public static void main(String[] args) {
      int i = 0; 

    Scanner sc = new Scanner(System.in);

    int []lido= new int [20];

    int []par = new int [20];

    int []impar = new int [20]; 

System.out.println("digite 20 números para o vetor ");

for(i=0; i<20;i++){

int n = sc.nextInt();

lido[i]=n;

        if (lido[i] % 2 ==0 ) {

            par[i]= lido [i];

        }

        else {

            impar[i]= lido [i];

        }

         }

    System.out.print("o vetor de números lidos é: " );

    for (i=0; i<19; i++){

        System.out.println (lido[i]);

    }

    System.out.print("O vetor de números pares é: ");

    for (i=0; i<par.length; i++) {

        System.out.println (par[i]);

    }

    System.out.print("O vetor de números ímpares é: ");

    for (i=0; i<impar.length; i++){

        System.out.println(impar[i]);
    }
    }
}
