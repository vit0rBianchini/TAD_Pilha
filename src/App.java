public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Exercicio 1: \n");
        Pilha p = new Pilha(4);
        p.cria_pilha();
        p.mostraPilha();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        p.mostraPilha();
        System.out.println("\nExercicio 2: \n");
        Verificador um = new Verificador("(1+5)*(56+12)");
        Verificador dois = new Verificador("(1+5)*)56+12)");
        Verificador tres = new Verificador("(1+5)*[56+12)");
        Verificador quatro = new Verificador("(((1+2) - 3 )* 6)");
    
        mostraresultado(um.verifica());
        mostraresultado(dois.verifica());
        mostraresultado(tres.verifica());
        mostraresultado(quatro.verifica());
        
    }

    public static void mostraresultado(int valor) {
        if(valor == 1){
            System.out.println("Expressão válida");
        }else{
            System.out.println("Expressão INválida");
        }
    }
}
