package logicaprog;

public class RepFor {
    public static void main(String[] args) {
        String nomes[] = { "João", "Maria", "Pedro" };
        
        lb_parada:
        for(int i = 0; i < nomes.length; i++){
            for(int j = nomes[i].length()-1; j>=0; j--){
                if(nomes[i].charAt(j) == 'ã'){
                    break lb_parada;
                }
                System.out.print(nomes[i].charAt(j)); 
            }
            System.out.println();
        }
    }
}
