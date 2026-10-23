package gerenciamentodealunos;
import java.util.Scanner;

public class SistemaMain {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        SistemaFaculdade uepb = new SistemaFaculdade();

        uepb.registrandoTurmas(sc);

        uepb.imprimirDados();

    }
}
