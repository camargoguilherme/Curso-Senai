package logicaprog;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = s.nextLine();
        s = new Scanner(System.in);
        
        System.out.println("Informe sua idade:");
        int idade = s.nextInt();
        System.out.printf("Nome: %s\nIdade: %d\n", nome, idade);
    }
}
