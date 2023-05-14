package TPC_02;

//import

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int[] notas;

    // Contrutor com parametro
    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Contrutor com parametro
    public Aluno() {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;

        return nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public int[] setNotas(int[] notas) {
        this.notas = notas;
        return notas;
    }

    /*
     * public void notaPAraFicheiro() throws IOException {
     * // Instancial
     * TPC.Lista list = new TPC.Lista();
     * 
     * int[] notaAna = setNotas((new int[]{15, 14, 13, 17, 18, 20}));
     * TPC.Aluno aluno1 = new TPC.Aluno("Ana", notaAna);
     * 
     * int[] notaJoana = setNotas((new int[]{17, 18, 12, 19, 15, 13}));
     * TPC.Aluno aluno2 = new TPC.Aluno("Joana", notaJoana);
     * 
     * int[] notaPaulo = setNotas((new int[]{7, 14, 15, 12, 18, 18}));
     * TPC.Aluno aluno3 = new TPC.Aluno("Paulo", notaPaulo);
     * 
     * list.Inserir(aluno1, aluno2, aluno3);
     * }
     */

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nNotas: " + Arrays.toString(notas);
    }

    public double calcularMedia() {

        int soma = 0;
        for (int nota : notas) {
            soma += nota;

        }
        return (double) soma / notas.length;
    }

    public void exibirMediaOrdenada() {
        // converte um array de valor primitivo em um array de objeto Integer[]
        // para poder utilizar a notaçao de ponto para usar APis ou biblioteca que
        // existe objetos
        Integer[] notasOrdenadas = Arrays.stream(notas).boxed().toArray(Integer[]::new);

        Arrays.sort(notasOrdenadas);
        System.out.println("Média das notas (da menor para maior):");
        for (int nota : notasOrdenadas) {
            System.out.println(nota);
        }
    }
}
