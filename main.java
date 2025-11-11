package arvorebinariar;

public class main {
    public static void main(String[] args) {
        System.out.println("🚀 INICIANDO DEMONSTRAÇÃO DA ÁRVORE BINÁRIA");

        ArvoreBinaria minhaArvore = new ArvoreBinaria();

        System.out.println("📊 FASE 1 - CONSTRUINDO A ÁRVORE");
        
        int[] numeros = {50, 30, 70, 20, 40, 60, 80, 35, 45};
        
        for (int numero : numeros) {
            minhaArvore.insertr(numero);
            System.out.println("✓ Inserido: " + numero);
        }
        
        System.out.println("\n🔄 FASE 2 - PERCURSOS DA ÁRVORE");
        
        System.out.print("• Pré-ordem  → ");
        minhaArvore.preOrdem();
        
        System.out.print("• Em ordem   → ");
        minhaArvore.emOrdem();
        
        System.out.print("• Pós-ordem  → ");
        minhaArvore.posOrdem();

        System.out.println("\n🔍 FASE 3 - TESTES DE BUSCA");
        
        int[] testesBusca = {40, 25, 70, 90, 35, 100};
        
        for (int alvo : testesBusca) {
            boolean encontrado = minhaArvore.buscar(alvo);
            String resultado = encontrado ? "✅ ENCONTRADO" : "❌ NÃO ENCONTRADO";
            System.out.println("• Buscando " + alvo + ": " + resultado);
        }

        System.out.println("\n🌳 FASE 4 - ESTRUTURA VISUAL");
        System.out.println("---------------------------");
        exibirEstrutura();

        System.out.println("\n🎯 FASE 5 - CASOS ESPECIAIS");
        testarCasosEspeciais();
    }
    
    private static void exibirEstrutura() {
        System.out.println("       50");
        System.out.println("     /    \\");
        System.out.println("   30      70");
        System.out.println("  /  \\    /  \\");
        System.out.println("20   40  60   80");
        System.out.println("    /  \\");
        System.out.println("   35  45");
    }
  
    private static void testarCasosEspeciais() {
        System.out.println("Testando árvore vazia:");
        ArvoreBinaria arvoreVazia = new ArvoreBinaria();
        
        System.out.print("Percursos em árvore vazia - ");
        System.out.print("Pré-ordem: ");
        arvoreVazia.preOrdem();
        
        System.out.print("Busca em árvore vazia: ");
        boolean resultado = arvoreVazia.buscar(10);
        System.out.println(resultado ? "Encontrado" : "Não encontrado");
        
        System.out.println("\nTestando inserção sequencial:");
        ArvoreBinaria arvoreSequencial = new ArvoreBinaria();
        int[] sequencia = {10, 20, 30, 40, 50};
        
        for (int num : sequencia) {
            arvoreSequencial.insertr(num);
        }
        
        System.out.print("Em ordem (deve ser ordenado): ");
        arvoreSequencial.emOrdem();
    }
}
