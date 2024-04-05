
package exercicio6lista6;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercicio6Lista6 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int[] media = {0,0,0,0,0,0,0,0,0,0};

      int x;
      int t;
      int c=0;  
      String m;

       

      for(x=1;x<=9;x++){

          System.out.println("Insira a média do "+x+"º aluno: ");

          t = sc.nextInt();

          media[x] = t;

      }    

       

      for(x=1;x<=9;x++){

          if(media[x]>=7)

              c++;

      }

       

      System.out.println("O número de alunos com média maior ou igual à 7 é:  "+c);
    }
    
}
