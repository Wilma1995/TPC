package TPC_02;

import java.io.IOException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Disciplina disciplina = new Disciplina();
        String alunoMelhorNota;
        System.out.println("//------------------------------------------------------------//");

        // Chamada da classe Disciplina...
        System.out.println("====< Trazendo lista de aluno e suas notas! >====");
        disciplina.ListaAluno();

        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("Nota do aluno: " + Arrays.toString(aluno.getNotas()));
            System.out.println();
        }

        System.out.println("//------------------------------------------------------------//");
        // Chamada da classe Aluno...
        System.out.println("====< Verificando aluno com maior media! >====");

        Aluno aluno1 = new Aluno("Ana", new int[] { 15, 14, 13, 17, 18, 20 });
        Aluno aluno2 = new Aluno("Joana", new int[] { 17, 18, 12, 19, 15, 13 });
        Aluno aluno3 = new Aluno("Paulo", new int[] { 7, 14, 15, 12, 18, 18 });

        if (aluno1.calcularMedia() > aluno2.calcularMedia() && aluno1.calcularMedia() > aluno3.calcularMedia()) {
            System.out.println("Aluna " + aluno1.getNome() + " tem maior media.");
        } else if (aluno2.calcularMedia() > aluno1.calcularMedia() && aluno2.calcularMedia() > aluno3.calcularMedia()) {
            System.out.println("Aluna " + aluno2.getNome() + " tem maior media.");
        } else if (aluno3.calcularMedia() > aluno2.calcularMedia() && aluno3.calcularMedia() > aluno1.calcularMedia()) {
            System.out.println("Aluno " + aluno3.getNome() + " tem maior media.");
        }

        System.out.println("//------------------------------------------------------------//");

        System.out.println("====< Aluno(a) com melhor nota >==== ");
        // Converter um tipo Vetor para String...
        alunoMelhorNota = String.valueOf(disciplina.AlunoMelhorNota());
        System.out.println(alunoMelhorNota);

        System.out.println("//------------------------------------------------------------//");
        // Chamada da classe No...

        No no1 = new No(aluno1);
        No no2 = new No(aluno2);
        No no3 = new No(aluno3);

        // lista duplamente ligada
        // Configurando as referências dos nós
        no1.setProx(no2); // definir o próximo nó na lista duplamente ligada.
        no2.setAnt(no1); // difinir o nó anterior de um determinado nó.
        no2.setProx(no3);
        no3.setAnt(no2);

        /* SE USAR O PARAMETRO ABAIXO NAO CONSIGO LER MEU AQUIVO */

        /*
         * // Acessando as informações dos alunos através dos nós
         * System.out.println("====< Informaçoes do aluno! >====");
         * Aluno alunoDoNo1 = no1.getInfo();
         * Aluno alunoDoNo2 = no2.getInfo();
         * Aluno alunoDoNo3 = no3.getInfo();
         * System.out.println("Nome do Aluno(a): " + alunoDoNo1.getNome().toUpperCase()
         * + "\n Nota do Aluno(a): "
         * + Arrays.toString(alunoDoNo1.getNotas()) + "\n Média do Aluno(a): "
         * + Math.round(alunoDoNo1.calcularMedia() * 10.0) / 10.0 + "\n");
         * System.out.println("Nome do Aluno(a): " + alunoDoNo2.getNome().toUpperCase()
         * + "\n Nota do Aluno(a): "
         * + Arrays.toString(alunoDoNo2.getNotas()) + "\n Média do Aluno(a): "
         * + Math.round(alunoDoNo2.calcularMedia() * 10.0) / 10.0 + "\n");
         * System.out.println("Nome do Aluno(a): " + alunoDoNo3.getNome().toUpperCase()
         * + "\n Nota do Aluno(a): "
         * + Arrays.toString(alunoDoNo3.getNotas()) + "\n Média do Aluno(a): "
         * + Math.round(alunoDoNo3.calcularMedia() * 10.0) / 10.0 + "\n");
         */
        System.out.println("||===========================================================||");

        // chamada da classe Lista...
        System.out.println("====< Lendo o arquivo! >====");
        Lista list = new Lista();
        list.LerArquivo();

        System.out.println("||===========================================================||");
    }
}