# Recursividade

### Requisitos
- Chamar a si mesma
- Condição de parada

### Exemplo
```Java
public static void contarRegressivamenteR(int n){
    System.out.println(n);
    if (n < 0){
        return;
    }
    contarRegressivamenteR(n-1);
    // Ainda não está subtraindo.
    // n só é alterado quando volta para o começo da função.
}

public static void main(String[] args){
    System.out.println("Digite um número natural: ");
    int numeroNatural = sc.nextInt();
    contarRegressivamenteR(numeroNatural);
}
```
### Output

```output
Digite um número natural: 
5  
<!-- Input do Usuário -->
5
4
3
2
1
0
-1
```
Dá erro porque o `System.out.println()` está antes da condição `if` e ele atualiza o valor antes de verificar se ele está funcionando de fato.

Ver código correto em [Au1.java](./Au1.java)


[
