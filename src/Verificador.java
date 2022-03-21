public class Verificador {
    private String expressao;
    private char[] dados;

    public Verificador(String expressao){
        this.expressao = expressao;
        this.dados = this.expressao.toCharArray();
    }

    public int verifica(){
        PilhaChar pilha = new PilhaChar(this.dados.length);


        char dado;
        for (char item : dados) {
            switch(item){
                case ')':
                    if(pilha.vazia()){
                        
                        return 0;
                    }
                    dado = pilha.desempilhar();
                    
                    if(dado != '('){ 
                        
                        return 0;   
                        
                    }
                    
                    break;

                case ']':
                    if(pilha.vazia()){
                        
                        return 0;
                    }
                    dado = pilha.desempilhar();
                    if(dado != '['){ 
                        
                        return 0;   
                        
                    }
                    
                    break;
                
                case '}':
                    if(pilha.vazia()){
                        
                        return 0;
                    }
                    dado = pilha.desempilhar();
                    if(dado != '{'){ 
                        
                        return 0;   
                        
                    }
                    
                    break;
                    
                default: 
                if(item == '(' ||item == '{' ||item == '['){
                    
                    pilha.empilhar(item);
                }
            }
        }
        if(!pilha.vazia()){
            return 0;
        }else{
            return 1;
        }
    }

}
