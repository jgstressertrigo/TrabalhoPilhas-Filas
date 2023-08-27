import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de Flood Fill feito por - Gustavo Farignoli, João Trigo e Gabriel Molec");
        System.out.println("Gerando a matriz padrão");
        Matriz matriz = new Matriz();
        System.out.println("Definindo a coordenada a ser inicial");
        Cordenada cordenada = new Cordenada(9,1);
        System.out.println("Analisando coordenadas vizinhas");
        FloodFill floodFill = new FloodFill(cordenada,matriz,2);
        floodFill.foundcolorable(cordenada);
        System.out.println("Escolha 1 para realizar a troca de valores através de Fila ou 2 para realizar com Pilha.");
        int op = teclado.nextInt();
        switch (op){
            case 1:
                floodFill.colorfila();
                break;
            case 2:
                floodFill.colorpilha();
                break;
        }
    }
}

