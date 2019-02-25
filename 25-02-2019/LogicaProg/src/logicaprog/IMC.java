package logicaprog;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura;
        double peso;
        double imc;
        System.out.println("Informe sua altura (ex.: 1.85):");
        altura = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe seu peso (ex.: 89.700):");
        scanner = new Scanner(System.in);
        peso = Double.parseDouble(scanner.nextLine());
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.4f\n", imc);
    }
}
