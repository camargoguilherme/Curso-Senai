package logicaprog;

public class Arr {
    public static void main(String[] args) {
        int diagonalPrin = 0;
        int diagonalSec = 0;
        
        String flag = "direita";
        int tamanho = 5;
        int andar = 1;
        int cont = 0;
        int matrizB[][] = new int[tamanho][tamanho];
        
        int a[][] = { 
            {21, 22, 23, 24, 25},
            {20, 7, 8, 9, 10},
            {19, 6, 1, 2, 11},
            {18, 5, 4, 3, 12},
            {17, 16, 15, 14, 13}
        };
        /*        
        for(int i = 0; i < a.length; i++ ){
            for(int j = 0; j < a[0].length; j++){
                if(i==j){
                    diagonalPrin += a[i][j];
                }
                
                if( i + j == a[0].length-1){
                    diagonalSec += a[i][j];
                    
                }
            }
        }
        System.out.print(diagonalPrin+diagonalSec);
        */
        
        for(int i = 1; i <= tamanho*tamanho; i++ ){
            switch (flag){
                case "direita":
                    flag = "desce";
                    break;                
                case "desce":
                    flag = "esquerda";
                    break;
                case "esquerda":
                    flag = "sobe";
                    break;
                case "sobe":
                    flag = "direita";
                    break;
                
            }
        }
        
    }
}
