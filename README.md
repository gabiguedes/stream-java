## Stream Api - Java

Stream é um recurso do Java que facilita o desenvolvimento, são expressões lambda (São Expressões Lambda (EL)),
reduz o tamanho do código e simplifica o uso do parelelismo.

> E os que estão acostumados, por exemplo, a galera que já trabalhou com Js, Clojure, Scala, trabalhar com stream vai ser moleza.

> Ao contrário da galera que o costume é escrever métodos que recebem apenas objetos ou tipos primitivos como parâmetro.
(Treinar te deixar melhor)

#### 1 - Pq facilita o desenvolvimento?

*Laço de repeticão comum*

```java
for(int i = 0; i < list.size(); i++) {
  System.out.println(list.get(i));
}
```

*Laço de repeticão comum*

```java
for (Pessoa pessoa : pessoas) {
	System.out.println(pessoa);
}
```

*Laço de repetição com Stream*

```java
list.stream().forEach(System.out::println);
```

#### 2 - são expressões lambda?
> Expressões lambda são aquelas do tipo A vai para B, significando primordialmente uma transformação.

#### 3 - reduz o tamanho do código

```java
list.stream().forEach(System.out::println);
```

#### 4 - simplifica o uso do parelelismo
Com o aperfeiçoamento constante do hardware, sobretudo a proliferação das _CPUs multicore_, a API levou isso em consideração e com o apoio do *paradigma funcional*, 
suporta a _paralelização_ de operações para processar os dados – abstraindo a lógica de baixo nível para se ter um código _multithreading_ – 
e deixa o desenvolvedor concentrar-se totalmente nas regras existentes.

Ex:
(parallel stream)

```java
list.stream().parallel()
```

Stream = fluxo de dados!!!
