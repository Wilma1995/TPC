package TPC_02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Disciplina {
    private String titulo;
    private String nomeDocente;
    private List<Aluno> alunos;

    public Disciplina(String titulo, String nomeDocente) {
        this.titulo = titulo;
        this.nomeDocente = nomeDocente;
        this.alunos = new ArrayList<>();
    }

    public Disciplina() {
        this.titulo = titulo;
        this.nomeDocente = nomeDocente;
        this.alunos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Todas as informaçoes do Alunos estao dentro do Atributo "alunos".
    public void ListaAluno() throws IOException {
        Aluno aluno1 = new Aluno("Ana", new int[] { 15, 14, 13, 17, 18, 20 });
        Aluno aluno2 = new Aluno("Joana", new int[] { 17, 18, 12, 19, 15, 13 });
        Aluno aluno3 = new Aluno("Paulo", new int[] { 7, 14, 15, 12, 18, 18 });
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        Lista lis = new Lista();
        lis.Inserir(alunos);
    }

    /*
     * public TPC.Aluno AlunoMelhorNota() {
     * TPC.Aluno alunoMelhorNota = null;
     * double maiorMedia = 0.0;
     * for (TPC.Aluno aluno : alunos) {
     * double media = aluno.calcularMedia();
     * if (media > maiorMedia) {
     * maiorMedia = media;
     * alunoMelhorNota = aluno;
     * }
     * }
     * return alunoMelhorNota;
     * }
     */

    public Aluno AlunoMelhorNota() {
        // :: Referência de método de instância
        return Collections.max(alunos, Comparator.comparingDouble(Aluno::calcularMedia));
        // Collections.max( retorna o elemento máximo em uma coleção)
        // Comprador é usado para classificar
        // Esse comparador pode ser usado para objetos com base em um valor
        // numérico em ponto flutuante.

    }
}