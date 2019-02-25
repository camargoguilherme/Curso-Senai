package logicaprog;

public class DesvoMulti {
    public static void main(String[] args) {
        String fruta = "abacaxi";
        
        switch(fruta){
            case "uva" :
                System.out.println("Roxo | Verde");
                break;
            case "morango":
                System.out.println("Vermelho");
                break;
            case "abacaxi":
                System.out.println("Amarelo");
                break;
            default:
                System.out.println("Fruta invalida");
                break;
        }
    }
}
