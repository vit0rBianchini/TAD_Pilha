public class PilhaChar {
    private int top;

    private char[] dado;
    public int maximo;


    public PilhaChar(int tamanho){
        this.top = -1;
        this.dado = new char[tamanho];
        this.maximo = tamanho;
    }

    public boolean vazia(){
        return (this.top == -1);
    }

    public boolean cheia(){
        return (this.top == (this.maximo -1));
    }

    public char topo(){
        if(this.vazia()){
            return ' ';
        }else{
            return dado[this.top];
        }
    }

    public void empilhar(char valor) {
        
        if(!cheia()){
            this.top += 1;
            dado[top] = valor;
        }
        

    }

    public char desempilhar(){
        
        if(!vazia()){
            char valor = dado[top];
            this.top--;
            return valor;
        }else{
            return ' ';
        }
        
    }
}
