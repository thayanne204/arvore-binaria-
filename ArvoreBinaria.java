package arvorebinariar;

public class ArvoreBinaria {
    private no raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void insertr(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }
    
    //CASO BASE: nó nulo 
   // CHAMADA RECURSIVA: navega para esquerda ou direita
    private no inserirRecursivo(no atual, int valor) {
        // CASO BASE: encontrou posição vazia para inserir
        if (atual == null) {
            return new no(valor);
        }
        
        // CHAMADA RECURSIVA: decide para qual lado navegar
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        return atual;
    }
    public boolean buscar(int valor) {
        return buscarValor(raiz, valor);
    }
    
    //  CASO BASE 1: nó nulo 
    //  CASO BASE 2: valor igual
    //  CHAMADA RECURSIVA: busca na subárvore apropriada
    private boolean buscarValor(no atual, int valor) {
        // CASO BASE 1: chegou ao fim sem encontrar
        if (atual == null) {
            return false;
        }
        
        // CASO BASE 2: encontrou o valor procurado
        if (valor == atual.valor) {
            return true;
        }
        
        // CHAMADA RECURSIVA: continua a busca na subárvore correta
        if (valor < atual.valor) {
            return buscarValor(atual.esquerda, valor);
        } else {
            return buscarValor(atual.direita, valor);
        }
    }
    public void preOrdem() {
        percorrerPreOrdem(raiz);
        System.out.println();
    }
    
    // Método recursivo para pré-ordem
     // CASO BASE: nó nulo
     //CHAMADA RECURSIVA: visita esquerda e direita
    private void percorrerPreOrdem(no atual) {
        // CASO BASE: não há mais nós para visitar
        if (atual == null) {
            return;
        }
        
        // Processa o nó atual (raiz)
        System.out.print(atual.valor + " ");
        
        // CHAMADA RECURSIVA: visita subárvore esquerda
        percorrerPreOrdem(atual.esquerda);
        
        // CHAMADA RECURSIVA: visita subárvore direita
        percorrerPreOrdem(atual.direita);
    }
     void emOrdem() {
        percorrerEmOrdem(raiz);
        System.out.println();
    }
    private void percorrerEmOrdem(no atual) {
        // CASO BASE: fim da subárvore
        if (atual == null) {
            return;
        }
        
        // CHAMADA RECURSIVA: visita toda a esquerda primeiro
        percorrerEmOrdem(atual.esquerda);
    
        System.out.print(atual.valor + " ");
        
        // CHAMADA RECURSIVA: visita toda a direita depois
        percorrerEmOrdem(atual.direita);
    }
    
    public void posOrdem() {
        percorrerPosOrdem(raiz);
        System.out.println();
    }
    private void percorrerPosOrdem(no atual) {
        // CASO BASE: não há filhos para visitar
        if (atual == null) {
            return;
        }
        
        // CHAMADA RECURSIVA: esquerda primeiro
        percorrerPosOrdem(atual.esquerda);
        
        // CHAMADA RECURSIVA: direita depois
        percorrerPosOrdem(atual.direita);
   
        System.out.print(atual.valor + " ");
    }
}
