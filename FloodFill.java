public class FloodFill {
    Cordenada cordenada;
    int voriginal;
    int vnovo;
    public Cordenada[] memory = new Cordenada[0];
    Matriz matriz;

    public FloodFill(Cordenada cordenada, Matriz matriz,int vnovo) {
        this.cordenada = cordenada;
        this.matriz = matriz;
        this.voriginal = this.matriz.matrix[cordenada.getX()][cordenada.getY()];
        this.vnovo = vnovo;
    }

    public Cordenada foundcolorable(Cordenada cord){
        add(cord);
        //checar se cordenada x-1,y deve ser pintada ( =voriginal & inbounds)
        if (cord.getX()-1 >= 0 && cord.getX()-1 <= matriz.getWithd()){
            Cordenada newcord = new Cordenada(cord.getX()-1,cord.getY());
            if (matriz.matrix[cord.getX()-1][cord.getY()] == voriginal && !search(newcord)){
                foundcolorable(newcord);
            }
        }
        //checar se cordenada x,y-1 deve ser pintada ( =voriginal & inbounds)
        if (cord.getY()-1 >= 0 && cord.getY()-1 <= matriz.getHeight()){
            Cordenada newcord = new Cordenada(cord.getX(),cord.getY()-1);
            if (matriz.matrix[cord.getX()][cord.getY()-1] == voriginal && !search(newcord)){
                foundcolorable(newcord);
            }
        }
        //checar se cordenada x+1,y deve ser pintada ( =voriginal & inbounds)
        if (cord.getX()+1 >= 0 && cord.getX()+1 <= matriz.getWithd()){
            Cordenada newcord = new Cordenada(cord.getX()+1,cord.getY());
            if (matriz.matrix[cord.getX()+1][cord.getY()] == voriginal && !search(newcord)){
                foundcolorable(newcord);
            }
        }

        //checar se cordenada x,y+1 deve ser pintada ( =voriginal & inbounds)
        if (cord.getY()+1 >= 0 && cord.getY()+1 <= matriz.getHeight()){
            Cordenada newcord = new Cordenada(cord.getX(),cord.getY()+1);
            if (matriz.matrix[cord.getX()][cord.getY()+1] == voriginal && !search(newcord)){
                foundcolorable(newcord);
            }
        }
        return cord;
    }

    // aplicar mudança com pilha

    // aplicar mudança com fila

    public void add(Cordenada ponto){
        int size = this.memory.length+1;
        Cordenada[] temp = new Cordenada[size];
        for (int i = 0; i < this.memory.length; i++){
            temp[i] = this.memory[i];
        }
        temp[size-1] = ponto;
        this.memory = temp;
    }
    public boolean search(Cordenada ponto){
        for (int i = 0; i < memory.length; i++){
            if (memory[i].getX() == ponto.getX() && memory[i].getY() == ponto.getY()){
                return true;
            }
        }
        return false;
    }
}
