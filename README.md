# arvore-binaria

# 1. O que é recursividade?
Recursividade é uma técnica de programação em que uma função **chama a si mesma** para resolver um problema menor do mesmo tipo.  
Ela é muito útil quando um problema pode ser dividido em partes menores até chegar a um **caso base**, que encerra as chamadas recursivas.  

# 2. Como a recursividade é usada na percorrência (travessia) de uma árvore binária?
Na travessia de uma árvore binária, a recursividade é usada para visitar cada nó seguindo uma ordem específica (pré-ordem, em ordem ou pós-ordem).
Cada chamada da função visita um nó e chama a si mesma para percorrer os filhos à esquerda e à direita.

# 3. Qual a diferença entre recursão e laço (for/while)?
A principal diferença é que laços (for/while) repetem instruções de forma iterativa, enquanto a recursão resolve o problema chamando a própria função novamente.
Recursão é mais elegante para estruturas como árvores e problemas divididos em partes menores.
Laços são mais diretos e econômicos para repetições simples e sequenciais.

