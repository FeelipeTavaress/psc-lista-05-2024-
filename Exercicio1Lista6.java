
package exercicio1lista6;

import java.util.Scanner;


public class Exercicio1Lista6 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Digite 5 números:  ");
      int[] nums = new int[5];

      String n = "";



    for(int x = 0; x < 5; x++){

    nums[x] = sc.nextInt();

    n += "Posição do vetor:" + x + " | Valor armazenado: " + nums[x] + "\n";

}

  System.out.println(n);
    }
    
}
