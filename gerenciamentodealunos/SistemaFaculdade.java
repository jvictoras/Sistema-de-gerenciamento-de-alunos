package gerenciamentodealunos;
import java.util.Scanner;

public class SistemaFaculdade {
    
    private Turma turmas[] = new Turma[2];
    
    public void registrandoTurmas(Scanner sc){
        Turma turma = new Turma();
        for (int i = 0; i < turmas.length; i++){
            turma.periodoTurma(sc);
            turma.registrandoAlunos(sc);
            turmas[i] = turma;
        }
    }

    public void imprimirTurmas(){
        
    }
    
}
