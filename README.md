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

Segue a imagem da matriz inicial:
<br />
![image](https://github.com/jgstressertrigo/Pilha-Fila/assets/111205291/6f184a4d-988c-4728-9c5b-bd6877f4a9a3)


Segue as Imagens da Matriz ao ser iniciada, na metade do processo e ao ser finalizado o programa:
<br />
![image](https://github.com/jgstressertrigo/Pilha-Fila/assets/111205291/232b53f8-db3c-47fc-acaa-97085820b474)
![image](https://github.com/jgstressertrigo/Pilha-Fila/assets/111205291/d8104c45-f97b-4166-adbc-ac5938180656)
![image](https://github.com/jgstressertrigo/Pilha-Fila/assets/111205291/992d7afd-e6ef-4a9e-88e7-ce495cf6a30a)

Para a recuperação do trabalho, foram feitas mudanças no código de flood fill, onde se foi apagado o método foundcolorable(), para substituir tal método, foram implementados nos próprios códigos de colorpilha() e colorfila() verificações que serviriam para checar se a coordenada inicial e as 4 coordenadas vizinhas poderiam ser pintadas/alteradas. Primeiro ocorre uma verificação geral da coordenada, que verifica se ela está fora dos limites da matriz para então extrair o X e o Y da coordenada e pintar a mesma. Após isso são criadas 4 coordenadas novas (esq, dir, baixo, cima) que são enviadas para a fila/pilha , isso tudo ocorre dentro de um while que roda enquanto a fila/pilha não estiver vazia: "while (!fila.isEmpty())". Tanto o colorpilha e colorfila seguem a mesma lógica.
Outra melhoria feita em cima do código base, é a adição de scanners no main, que visam permitir o usuário a escolher as coordenadas desejadas e para qual número a matriz será 'pintada'.
Segue imagens da execução via Fila:
<br />

<br />
Segue imagens da execução via Pilha:
<br />

<br />

