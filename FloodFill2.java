import java.util.Arrays;

// classe FloodFill representa uma implementação do algoritmo de preenchimento por inundação.
public class FloodFill2 {
    Coordenada coordenada;
    int cororigin;
    int novacor;
    public Coordenada[] memory = new Coordenada[0];
    Matriz matriz;

    public FloodFill2(Coordenada coordenada, Matriz matriz, int novacor) {
        this.coordenada = coordenada;
        this.matriz = matriz;
        this.cororigin = this.matriz.matrix[coordenada.getX()][coordenada.getY()];
        this.novacor = novacor;
    }

    // aplicar mudança com pilha
    public void colorpilha(Coordenada coordenada) {
        Pilha pilha = new Pilha<>(100);
        pilha.push(coordenada);
        while (!pilha.isEmpty()) {
            Coordenada cord = (Coordenada) pilha.pop();

            if (cord.getX() < 0 || cord.getX() >= matriz.getWithd() || cord.getY() < 0 || cord.getY() >= matriz.getHeight() || matriz.matrix[cord.getY()][cord.getX()] != cororigin) {
                continue;
            }

            this.matriz.matrix[cord.getY()][cord.getX()] = novacor;

            Coordenada esq = new Coordenada(cord.getX() - 1, cord.getY());
            pilha.push(esq);

            Coordenada dir = new Coordenada(cord.getX() + 1, cord.getY());
            pilha.push(dir);

            Coordenada baixo = new Coordenada(cord.getX(), cord.getY() - 1);
            pilha.push(baixo);

            Coordenada cima = new Coordenada(cord.getX(), cord.getY() + 1);
            pilha.push(cima);

            this.matriz.print();
            System.out.println("===========================================");
        }
    }

    // aplicar mudança com fila
    public void colorfila(Coordenada coordenada) {
        Fila fila = new Fila(100);
        fila.setTop(fila.size() - 1);
        fila.push(coordenada);
        while (!fila.isEmpty()) {
            Coordenada cord = (Coordenada) fila.pop();

            if (cord.getX() < 0 || cord.getX() >= matriz.getWithd() || cord.getY() < 0 || cord.getY() >= matriz.getHeight() || matriz.matrix[cord.getY()][cord.getX()] != cororigin) {
                continue;
            }

            this.matriz.matrix[cord.getY()][cord.getX()] = novacor;

            Coordenada esq = new Coordenada(cord.getX() - 1, cord.getY());
            fila.push(esq);

            Coordenada dir = new Coordenada(cord.getX() + 1, cord.getY());
            fila.push(dir);

            Coordenada baixo = new Coordenada(cord.getX(), cord.getY() - 1);
            fila.push(baixo);

            Coordenada cima = new Coordenada(cord.getX(), cord.getY() + 1);
            fila.push(cima);

            this.matriz.print();
            System.out.println("===========================================");
        }
    }
}