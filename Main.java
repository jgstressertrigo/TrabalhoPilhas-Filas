public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Cordenada cordenada = new Cordenada(9,1);
        FloodFill floodFill = new FloodFill(cordenada,matriz,2);
        floodFill.foundcolorable(cordenada);
        floodFill.colorpilha();
    }
}

