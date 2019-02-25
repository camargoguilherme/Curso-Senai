/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprog;

import java.util.Random;

/**
 *
 * @author Senai
 */
public class Operadores {
    public static void main(String[] args) {
        //aritmeticos
        //+, -, *, /, % 
        /*
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(15 / 6);
        System.out.println(15 % 6);
        */
        /*
        // combinacao
        // +=, -=, *=, /=, %=
        int idade = 26;
        //...
        idade += 29;
        */
        /*
        System.out.println("2 ^ 3: " + Math.pow(2, 3));
        System.out.println("sqrt(9): " + Math.sqrt(9));
        System.out.println("Round: " + Math.round(2.3));
        System.out.println("Ceil: " + Math.ceil(2.3));
        System.out.println("Floor " + Math.floor(2.3));
        System.out.println("ABS " + Math.abs(-15));
        */
        /*
        Random r = new Random();
        System.out.println(r.nextDouble()+ r.nextInt(5));
        */
        int soma = 0;
        int divisor = 0;
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    divisor++;
                }
            }
            if(divisor == 2){
                System.out.println(i);
            }
            divisor = 0;
        }
        
    }
}
