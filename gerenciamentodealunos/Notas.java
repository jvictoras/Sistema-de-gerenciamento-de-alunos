package gerenciamentodealunos;
import java.util.Scanner;

public class Notas {
    
    private double nota;

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }


    public void registrarNotas(Scanner sc){

        System.out.println("Informe sua nota: ");
        nota = sc.nextDouble();

    }

    public void imprimirNotas(){
        System.out.println("Nota: " + nota);
    }

}
