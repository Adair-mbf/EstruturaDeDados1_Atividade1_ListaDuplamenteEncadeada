public class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    void limpar(){
        this.inicio = null;
        this.fim = null;
    }

    void exibir(){
        No atual = this.inicio;
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
        System.out.print("\n");
    }
    void inserirEm(int indice, String valor) {
        No novoNo = new No(valor);

        if (indice <= 0 || this.inicio == null) {
            novoNo.proximo = this.inicio;
            if (this.inicio != null) {
                this.inicio.anterior = novoNo;
            } else {
                this.fim = novoNo;
            }
            this.inicio = novoNo;
            return;
        }

        No atual = this.inicio;
        int i = 0;

        while (atual != null && i < indice - 1) {
            atual = atual.proximo;
            i++;
        }

        if (atual == null || atual.proximo == null) {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
        else {
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            atual.proximo.anterior = novoNo;
            atual.proximo = novoNo;
        }
    }
    void removerEm(int indice) {
        if (this.inicio == null || indice < 0) {
            return;
        }

        No atual = this.inicio;
        int i = 0;

        while (atual != null && i < indice) {
            atual = atual.proximo;
            i++;
        }

        if (atual == null) {
            return;
        }

        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        } else {
            this.inicio = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        } else {
            this.fim = atual.anterior;
        }
    }
    void inserir(String valor){
        No novoNo = new No(valor);
        if(this.inicio == null){
            this.inicio = novoNo;
            this.fim = novoNo;
        }
        else{
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
    }
    void remover(String valor){
        No atual = this.inicio;
        while(atual != null){
            if(atual.valor.equals(valor)){
                if(atual.anterior != null){
                    atual.anterior.proximo = atual.proximo;
                }
                else{
                    this.inicio = atual.proximo;
                }
                if(atual.proximo != null){
                    atual.proximo.anterior = atual.anterior;
                }
                else{
                    this.fim = atual.anterior;
                }
                atual = null;
                return;
            }
            atual = atual.proximo;
        }
    }
    void exibirTamanho(){
            int tamanho = 0;
            No atual = this.inicio;
            while (atual != null) {
                tamanho++;
                atual = atual.proximo;
            }
            System.out.println("A lista contém: " + tamanho + " posições");
            System.out.print("\n");
    }
    boolean contem(String valor) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    void verificacaoString(String valor) {
        if (contem(valor)) {
            System.out.println(valor + " está na lista");
            System.out.print("\n");
        } else {
            System.out.println(valor + " não está na lista");
            System.out.print("\n");
        }
    }
}
