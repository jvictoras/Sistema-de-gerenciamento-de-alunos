package gerenciamentodealunos;
import java.util.Scanner;

public class SistemaFaculdade{
    
    private Turma turmas[] = new Turma[2];
    
    public void registrandoTurmas(Scanner sc){
        for (int i = 0; i < turmas.length; i++){
            Turma turma = new Turma();
            turma.periodoTurma(sc);
            turma.registrandoAlunos(sc);
            turmas[i] = turma;
        }
    }

    public void imprimirDados(){
        for(int i = 0; i < turmas.length; i++){
            turmas[i].imprimirTurmas();
        }
    }
    
}
