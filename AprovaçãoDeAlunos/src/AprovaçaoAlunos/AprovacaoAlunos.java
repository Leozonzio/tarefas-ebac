package AprovaçaoAlunos;

public class AprovacaoAlunos {
    public static void main(String args[]) {
        double nota1 = 2.9;
        double nota2 = 3.7;
        double nota3 = 3.3;
        double nota4 = 8.9;

        double media = nota1 + nota2 + nota3 + nota4;
        double mediaTotal = media / 4;

        {
            if (mediaTotal >= 7) {
                System.out.println("Aluno aprovado");
            } else if (mediaTotal < 7) {
                System.out.println("Aluno reprovado");
            }
        }
    }
}