# Recursividade em Java 🔄

Este repositório é dedicado a **exemplos práticos e explicações de recursividade em Java**. Ele abrange conceitos fundamentais, problemas clássicos e desafios avançados, ajudando estudantes e desenvolvedores a dominar este poderoso paradigma de programação.

---

## 📖 O Que é Recursividade?

**Recursividade** é uma técnica de programação onde uma função chama a si mesma para resolver subproblemas menores de um problema maior.  
Ela é amplamente usada para resolver problemas que possuem uma estrutura naturalmente divisível, como árvores, grafos e sequências.

### Estrutura Básica de uma Função Recursiva
1. **Caso Base**: Condição que encerra a recursão.
2. **Caso Recursivo**: Chamadas à própria função com subproblemas menores.

```java
public int fatorial(int n) {
    if (n == 0) { // Caso Base
        return 1;
    }
    return n * fatorial(n - 1); // Caso Recursivo
}
