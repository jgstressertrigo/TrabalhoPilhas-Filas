//Classe Cordenada que representa um ponto no plano cartesiano com coordenadas x e y.
//Ela fornece métodos para obter e definir essas coordenadas e também uma representação personalizada em string do ponto.
public class Cordenada {
    private int x;
    private int y;
    public Cordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cordenada{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
