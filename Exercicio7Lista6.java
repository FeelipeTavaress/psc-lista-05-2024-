
package exercicio7lista6;

import java.util.Scanner;


public class Exercicio7Lista6 {

   
    public static void main(String[] args) {
       int soma = 0;
       int multiplicacao = 1;
       int numeros;
       
             

     Scanner sc = new Scanner(System.in);
        
      System.out.println("Digite 5 números:  ");
      int[] nums = new int[5];

      String n = "";



    for(int x = 0; x < 5; x++){

    nums[x] = sc.nextInt();

    n += "Posição do vetor:" + x + " | Valor armazenado: " + nums[x] + "\n";

 soma = soma +  nums[x];
 multiplicacao = multiplicacao *  nums[x];

    } 
    

System.out.println(n);
System.out.println("a soma é: "+ soma );
System.out.println("a multiplicação é: "+ multiplicacao);

    
}
}
    

