PJBL 1 da matéria de Resolução de Problemas Estruturados em computação referente a pilhas e filas em Java.
Para o desenvolvimento do código solicitado pela professora da matéria, nossa equipe implementou o mesmo em torno de 8 classes, sendo:

-1 interface (classe Biblioteca) a ser usada pelas classes Fila e Pilha
-1 classe main
-1 classe para a matriz 
-1 classe para as listas duplamente encadeadas 
-1 classe do próprio Flood Fill
-1 classe para a Coordenada da Matriz

Durante o desenvolvimento do algoritmo, a equipe optou por utilizar do tipo Genérico ("<T>"), que é implementado nas classes Biblioteca, Fila e Pilha. Também são utilizados outros tipos de dados mais conhecidos como o int, principalmente para a criação dos atributos bases da Fila e Pilha como: o top, o base, o size.

Ao rodar a classe Main, o programa executa o construtor de matrizes que vêm com um tamanho padrão de 10x10, porém o código pode ser executado com matrizes maiores, após isso é executado o construtor de coordenada que vêm predefinida, no caso da matriz padrão a coordenada inicial seria x=9 e y=1 que seria o canto direito da matriz 10x10.

Após a criação da matriz e a determinação da coordenada inicial, o programa executa o contrutor da classe FloodFill, pegando a matriz, a coordenada e define o novo número/cor, no nosso caso seria o número 2 , para então analisar os seus "vizinhos" diretos para verificar se esses números podem ser alterados/pintados, neste caso qualquer número diferente de 2 (0 e 1) e então adiciona os mesmos à Pilha/Fila, logo após verificar as 4 posições cardeais relativas a coordenada, o programa altera o valor da coordenada e de seus vizinhos.

