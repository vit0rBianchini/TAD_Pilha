public class Pilha {
    private int top;

    private int[] dado;
    public int maximo;

    public Pilha(int tamanho){
        this.top = -1;
        this.maximo = tamanho;
    }

    // Retorna verdadeiro ou falso se a pilha está vazia
    // No exercicio pede para retornar 1 se true e 0 quando false, mas aqui acho melhor retornar somente true e false
    public boolean vazia(){
        return (this.top == -1);
    }
    // Retorna verdadeiro ou falso se a pilha está cheia
    // No exercicio pede para retornar 1 se true e 0 quando false, mas aqui acho melhor retornar somente true e false
    public boolean cheia(){
        return (this.top == (this.maximo -1));
    }
    // Devolve o dado que está no topo da pilha, caso não exista ela retornará -1
    public int topo(){
        if(this.vazia()){
            return -1;
        }else{
            return dado[this.top];
        }
    }
    // Coloca um valor no topo da lista
    public void empilhar(int valor) {
        if(this.cheia()){
            System.out.println("A PILHA ESTÁ CHEIA, DESEMPILHE E COLOQUE OUTRA COISA");
        }else{
            this.top += 1;
            dado[top] = valor;
        }


    }
    // Desempilha um valor da pilha
    public int desempilhar(){
        int valor = dado[top];
        if(top == -1/* vazia() */){
            return -1;
        }else{
            this.top -= 1;
            return valor;
        }

    }

    // Cria o array
    public int[] cria_pilha() {
        this.dado = new int[this.maximo];
        return this.dado;
    }

    // Mostra os itens que estão no array
    public void mostraPilha(){
        for (int i : dado) {
            System.out.println(i);
        }
    }
}

