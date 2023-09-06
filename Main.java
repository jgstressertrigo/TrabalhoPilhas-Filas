import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de Flood Fill (Recuperação) feito por - Gabriel Molec e João Trigo  ");
        System.out.println("Gerando a matriz padrão");
        Matriz matriz = new Matriz();
        System.out.println("Defina a coordenada inicial para o FLood Fill:");
        System.out.print("Digite a coordenada X: ");
        int x = teclado.nextInt();
        System.out.print("Digite a coordenada Y: ");
        int y = teclado.nextInt();
        System.out.print("Escolha um número para trocar o 1 na matriz: ");
        int cor = teclado.nextInt();
        Coordenada coordenada = new Coordenada(x,y);
        System.out.println("Analisando coordenadas vizinhas");
        FloodFill2 floodFill = new FloodFill2(coordenada,matriz,cor);
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

