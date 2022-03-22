## Abstração

## Encapsulamento

Encapsular significa **esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender**. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução;

* As propriedades por padrão são privadas até que se prove o contrário.

* Para poder acessar essas propriedades privadas usamos o getter e os setters.

* O encapsulamento tem a ver com o mecanismo de uso
* Palavra chaves - `private, public, protect, default, getter, setters`

## Herança

**Permite que você defina uma classe filha que reutiliza(herda), estende ou modifica o comportamento de uma classe pai.** A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

* Palavra chave - `extends`

**A interface** - Nada mais é uma classe abstrata com todos os métodos abstratos.

* A interface não permite ter corpo;
* Usar a palavra chave  `public` é redundante
* Palavra chave - `complements`

## Polimorfismo

**Capacidade de uma objeto poder ser referenciado de várias formas**, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica.

Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.