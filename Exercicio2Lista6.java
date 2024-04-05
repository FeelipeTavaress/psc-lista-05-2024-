
package exercicio2lista6;

import java.util.Scanner;


public class Exercicio2Lista6 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
      System.out.println("Digite 10 números:  ");
      int[] nums = new int[10];

      String n = "";



    for(int x = 0; x < 10; x++){

    nums[x] = sc.nextInt();

    n += "Posição do vetor:" + x + " | Valor armazenado: " + nums[x] + "\n";

}

  System.out.println(n);
    }
    
}
