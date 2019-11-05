# Projeto PROO 2019

## 1. Objetivos

Este projeto tem como objetivo servir como instrumento avaliador para o 4º bimestre na disciplina de Programação Orientada a Objetos.


O sistema consiste de uma biblioteca de programação (API) voltada para o gerenciamento de blogs. Nesta pode-se:
   * Realizar operações de CRUD nos perfis de usuários, blogs, posts e comentários.

Para o desenvolvimento da referida biblioteca, foi disponibilizada uma classe denominada Fachada que contem as funcionalidades que a biblioteca deve atender tais como métodos de criação de perfil de usuário, edição, criação de blogs, criação de postagens etc. A utilização dessa classe fachada tem por objetivo criar uma camada de abstração entre a lógica de negócio implementada no interior da biblioteca e os possíveis clientes de tal biblioteca seguindo os preceitos do padrão de projeto Fachada (ver maiores detalhes em https://www.devmedia.com.br/padrao-de-projeto-facade-em-java/26476). Neste sentido, é importante prestar atenção aos seguintes aspectos:

   1. Por se tratar de uma biblioteca cujo acesso se dá a partir dos métodos da fachada que especificam a lista de parâmetros passados pelo cliente, não há necessidade de interação alguma com o usuário. Isto é, não é necessário em nenhum ponto da implementação a leitura de dados do teclado ou a escrita de dados na tela);
   2. Conforme discutido no artigo acima, a utilização de uma fachada indica a criação de uma camada de abstração e não a criação de uma classe 

O desenvolvimento do p


Os detalhes da especificação do projeto deve-se ler a documentação apresentada na própria classe Fachada e nos testes Us01 à Us11.




## 2. Forma de avaliação

* 50% desempenho nos testes de unidade
* 25% modelagem das classes Java
* 25% salvamento dos dados no banco de dados via JDBC

==Data de entrega==

A entrega da atividade será dividida em duas etapas com igual objetivo sendo que a segunda etapa consistirá da reapresentação do trabalho visando avaliar as correções aplicadas pelos grupos. Caso algum grupo atinja a nota 10,0 na primeira apresentação não será necessário a reapresentação.

==Penalidade por cópia==

Caso seja detectado cópia entre trabalhos, ainda que em trecho mínimo, todo o trabalho será desconsiderado para ambas as equipes.
