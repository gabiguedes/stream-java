### Stream 

A API de Stream Java 8 fornece os métodos map() e flatMap(). Ambos os métodos são intermediários e retornam outro fluxo como parte da saída.

#### map() method -> Transformação de dados
> O map é uma operação intermediária que permite transformar um objeto em algum outro tipo de objeto. 

* método map() usado para transformação.

Sua função de mapeador produz um valor único para cada valor de entrada. Portanto, também é chamado de mapeamento Um-para-Um.

#### flatMap() method -> map() + flattering
Sua função de mapeador produz vários valores para cada valor de entrada. Portanto, também é chamado de mapeamento Um-para-Muitos.

* flatMap() usado para transformação e achatação
* flatMap() -> map() + flattering

##### Operações intermediárias e terminais
> As operações intermediárias retornam um novo Stream para que possamos encadear várias operações intermediárias sem usar ponto e vírgula.

> As operacões terminais que retornam um valor ou objeto, exemplo:
