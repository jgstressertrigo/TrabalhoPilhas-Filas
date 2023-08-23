public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Cordenada cordenada = new Cordenada(0,0);
        FloodFill floodFill = new FloodFill(cordenada,matriz,2);
        floodFill.foundcolorable(cordenada);
        System.out.println(floodFill.memory.length);
        for (int i = 0; i < floodFill.memory.length; i++) {
            System.out.println("Elemento no índice " + i + ": " + floodFill.memory[i]);
        }
    }
}

