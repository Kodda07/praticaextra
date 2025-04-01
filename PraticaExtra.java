package praticaextra;
import java.util.Scanner;
public class PraticaExtra {
 public String[] nomesAlunos = new String[5];
    public int[] faltasAlunos = new int[5];
    public double[][] notasAlunos = new double[5][3]; // Matriz para 3 notas por aluno
    
    public void apresentarAlunos() {
        double somaNotasTurma = 0;

        System.out.println("\n===== Dados dos Alunos =====");
        for (int i = 0; i < 5; i++) {
            double somaNotasAluno = 0;
            System.out.println("Nome: " + this.nomesAlunos[i]);
            System.out.println("Faltas: " + this.faltasAlunos[i]);
            System.out.print("Notas: ");

            for (int j = 0; j < 3; j++) {
                System.out.print(this.notasAlunos[i][j] + " ");
                somaNotasAluno += this.notasAlunos[i][j];
            }

            double mediaAluno = somaNotasAluno / 3;
            somaNotasTurma += mediaAluno;
            System.out.println("\nMédia: " + mediaAluno);
            System.out.println("__");
        }

        double mediaTurma = somaNotasTurma / 5;
        System.out.println("Média da Turma: " + mediaTurma);
    }
    
    public static void main(String[] args) {
        PraticaExtra diariotin3 = new PraticaExtra();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o Nome do Aluno:");
            diariotin3.nomesAlunos[i] = scan.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.println("Digite a Nota " + (j + 1) + " do Aluno:");
                diariotin3.notasAlunos[i][j] = scan.nextDouble();
            }

            System.out.println("Digite a Quantidade de Faltas do Aluno:");
            diariotin3.faltasAlunos[i] = scan.nextInt();
            scan.nextLine(); // Limpa o buffer
        }

        diariotin3.apresentarAlunos();
        scan.close();
    }
}
        
    
    

