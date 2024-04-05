
package exercicio4lista6;

import java.util.Scanner;


public class Exercicio4Lista6 {


    public static void main(String[] args) {
        
    char[] vetor = new char[10];
		char vetoraux;
		int cons = 0;
		Scanner sc = new Scanner(System.in);
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("Informe um caractere:");
			vetor[c] = sc.next().charAt(0);
			if (vetor[c] != 'a' && vetor[c] != 'e' && vetor[c] != 'i' && vetor[c] != 'o' && vetor[c] != 'u') {
    cons += 1;
			}

		}

		System.out.println("A quantidade de consoantes lidas é :" + cons);
		
    }
    
    }
    

