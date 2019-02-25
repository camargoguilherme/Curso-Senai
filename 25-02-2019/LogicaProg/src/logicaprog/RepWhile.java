package logicaprog;

import java.util.Arrays;
import java.util.Scanner;

public class RepWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Informe a quantidade de alunos");
        int qtd = s.nextInt();
        Aluno alunos[] = new Aluno[qtd];
        
        int i = 0;
        while(i < qtd){
            s = new Scanner(System.in);
            alunos[i] = new Aluno();
            System.out.println("Informe o nome:");
            alunos[i].nome = s.nextLine();
            
            s = new Scanner(System.in);
            System.out.println("Informe a frequencia:");
            alunos[i].freq = s.nextInt();
            i++;
        }
        
        System.out.println(Arrays.toString(alunos));
    }
}

class Aluno{
    String nome = "";
    int freq = 0;
    @Override
    public String toString(){
        return  nome + " - " + freq + "\n";
    }
}
