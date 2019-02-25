package logicaprog;
/*
Um numero palindromo pode ser lido da mesma forma da esquerdade
para a direita e da direita para esquerda. O maior palindromo resultado pelo 
produto de dois numeros de dois digitos é 9009 = 91*99.
Encontre o mair palindromo feito a partir do produto de dois numeros de 3 digitos
*/
public class AtividadePalindromo {
    public static void main(String[] args) {
        String palindromo = "";
        int maior = 0;
        int range = 1000;
        for(int i = 0; i < range; i++ ){
           for(int j = 0; j < range; j++ ){
            palindromo = String.valueOf(i * j);
            StringBuffer inverso = new StringBuffer(palindromo);
            inverso.reverse();
            if(palindromo.equals(inverso.toString()) ){
                if(maior < Integer.parseInt(palindromo)){
                    maior = Integer.parseInt(palindromo);
                }
            } 
           } 
        }
        System.out.println(maior);
    }
}
