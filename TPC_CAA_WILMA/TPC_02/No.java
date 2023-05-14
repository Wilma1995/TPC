package TPC_02;

public class No {
    private No ant;
    private No prox;
    private No inf;

    public No(No ant, No prox, No inf) {
        this.ant = ant;
        this.prox = prox;
        this.inf = inf;
    }

    public No(Aluno aluno1) {
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getInf() {
        return inf;
    }

    public void setInf(No inf) {
        this.inf = inf;
    }

    public Aluno getInfo() {
        return null;
    }
}
