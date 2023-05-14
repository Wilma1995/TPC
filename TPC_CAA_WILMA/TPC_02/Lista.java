package TPC_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;

public class Lista {
    private int tamanho;
    private int inicio;
    private int fim;

    public Lista() {
        this.tamanho = tamanho;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    // Nesse Metodo vamos ler o arquivo.
    public void LerArquivo() throws FileNotFoundException {

        try {
            // Instanciamos o File e criamos um objeto para poder armazenar nota.csv:
            File ficheiro = new File("notas.csv");
            // Nesse If se ficheiro exister ele vai ler o arquivo caso nao exister vai logo
            // para o else

            // criamos o Scanner para ler o conteudo do ficheiro.
            Scanner ler = new Scanner(ficheiro);

            // Esse while enquanto ouver lina para ler ele lê!
            while (ler.hasNext()) {
                // dados vai receber conteudos dentro do ficheiro
                String dados = ler.nextLine();
                System.out.println(dados);
            }
            ler.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Ficheiro nao existe:");
        }

        /*
         * // carregar alunos a partir de um arquivo CSV
         * try {
         * d.carregarAlunos("alunos.csv");
         * } catch (IOException e) {
         * System.out.println("Erro ao carregar alunos do arquivo");
         * e.printStackTrace();
         * }
         */
    }

    public void Inserir(List<Aluno> alunos) throws IOException {
        FileWriter list = new FileWriter("nota.csv");
        for (Aluno alunolista : alunos) {
            list.write(alunolista.toString());
        }
        /*
         * list.write(aluno1.toString());
         * list.write(aluno2.toString());
         * list.write(aluno3.toString());
         */
        list.close();
        System.out.println("O seu Ficheiro foi guardado com sucesso!");
    }

}