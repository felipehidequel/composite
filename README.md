# Composite
## Intenção
_Compor objetos em estruturas de árvore para representar hierarquias partes/todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos._

## Sobre
O composite é um padrão de projeto que permite ao cliente tratar um único objeto ou uma formada de vários objetos aninhados hierarquicamente da mesma maneira.

Na vida real lidamos com o padrão composite o tempo todo. Por exemplo, pense em produtos que podem ser comprados por unidade ou em caixas (como leite, cerveja e outros). Você pode ir ao supermercado e comprar um único produto. ELe contar com um código de barras. No entanto, você também pode comprar uma caixa do mesmo produto. Ela também vai contar com um código de barras da mesma maneira.

O supermercado vai tratar uma estrutura inteira de objetos (a caixa de produtos) como um único objeto com código de barras e preço. Porém, se o cliente quiser, também pode obter um único produto de dentro da caixa e realizar a compra da mesmíssima maneira que fizemos com a caixa. Ambos, a caixa e o produto possuem seus próprios códigos de barra.

O padrão Composite é exatamente isso: podemos tratar um único objeto ou uma estrutura de objetos da mesma maneira. Conseguimos através de uma interface em comum entre objetos compostos (caixa) e objetos folha (produtos).

## Estrutura
![image](https://github.com/user-attachments/assets/af071a67-7974-4efc-a04b-6714c6d73aac)
* A interface **Component** descreve operações que são comuns tanto para elementos simples como para elementos complexos da árvore.
* A **Leaf** (Folha) é um eletno básico de uma árvore que não tem sub-elementos. Geralmente, componentes folha acabam fazendo boa parte do verdadeiro trabalho, uma vez que não tem mais ninguém para delegá-lo.
* O **Composite**(ou contêiner) é o elemento que tem sub-elementos: folhas ou outros contêineres. Um contêiner não sabe a classe concreta de seus filhos. Ele trabalha com todos os sub-elementos apenas através da interface componente.

Ao receber um pedido, um contêiner delega o trabalho para seus sub-elementos, processa os resultados intermediários, e então retorna o resultado final para o cliente.

* O **Clienete** trabalha com todos os elementos através da interface componente. Como resultado, o cliente pode trabalhar da mesma forma tanto com elementos simples como elementos complexos da árvore.

  ## Vantagens

  * Você pode trabalhar com estruturas de árvore complexas mais convenientemente.
  * _Princípio aberto/fechado_. Você pode introduzir novos tipos de elemento na aplicação sem quebrar o código existente, o que agora funciona com a árvore de objetos.
 
  ## Desvantagens
  * Pode ser difícil providenciar uma interface comum para classes cuja funcionalidade difere muito. Em certos cenários, você precisaria generalizar muito a interface componente, fazendo dela uma interface de dificil compreensão.

## Referencias
* https://refactoring.guru/pt-br/design-patterns/composite
* https://www.youtube.com/watch?v=VFGaqoxA_lo
