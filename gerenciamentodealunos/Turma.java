package gerenciamentodealunos;
import java.util.Scanner;


public class Turma {

    private int periodo;
    private Aluno alunos[] = new Aluno[2];
    private Notas notas[][] = new Notas[2][2];

    public int getPeriodo(){
        return periodo;
    }

    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }

    public void periodoTurma(Scanner sc){
        System.out.println("Qual é o período da turma? ");
        periodo = sc.nextInt();
    }

    public void registrandoAlunos(Scanner sc){
        for (int i = 0; i < alunos.length; i++){
            Aluno aluno = new Aluno();
            System.out.println("Informe o nome do aluno: ");
            sc.nextLine();
            aluno.setNome(sc.nextLine());
            System.out.println("Informe o número de sua matrícula: ");
            aluno.setNumMatricula(sc.nextInt());
            for (int j = 0; j < notas[i].length; j++){
                Notas nota = new Notas();
                nota.registrarNotas(sc);
                notas[i][j] = nota;
            }
            alunos[i] = aluno;
        }

    }

    public void imprimirTurmas(){
        System.out.println("--- Imprimindo Turmas ---");
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Período: " + periodo);
            System.out.println("Aluno " + i + ": " + alunos[i].getNome());
            System.out.println("Matrícula: " + alunos[i].getNumMatricula());
             System.out.println("Notas: ");
            for (int j = 0; j < notas[i].length; j++){
                notas[i][j].imprimirNotas();
            }
            System.out.println("------------------");
        }
    }

}
