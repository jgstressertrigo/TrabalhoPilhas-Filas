//Implementação de uma Fila utilizando um array.
public class Fila<T> implements Biblioteca {
    private int top = -1;
    private int base = 0;
    private int size;
    //tamanho máximo da fila
    private T[] data;
    //array que armazena os elementos da fila

    public Fila(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
        //O construtor aceita o tamanho desejado para a fila e inicializa o array data com esse tamanho.
    }

    @Override
    public void push(Object data) {
        if (isFull()){
            System.out.println("A Fila está cheia");
        } else {
            top += 1;
            if(top == this.size){
                top = 0;
            }
            this.data[top] = (T) data;
        }
        //Este método insere um novo elemento na fila. Se a fila estiver cheia, imprime uma mensagem informando isso. Caso contrário, insere o elemento na próxima posição disponível.
    }


    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("A Fila já está vazia");
            return null;
        } else {
            T removed = this.data[base];
            this.data[base] = null;
            base += 1;
            if(base == this.size){
                base = 0;
            }
            return removed;
        }
        //Este método remove e retorna o elemento da base da fila. Se a fila estiver vazia, imprime uma mensagem e retorna null. Caso contrário, remove o elemento e o retorna.
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            this.data[i] = null;
        }
    }

    @Override
    public Boolean isFull() {
        //verifica se a fila está cheia
        for (int i = 0; i < size; i++){
            if (this.data[i] == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean isEmpty() {
        //verifica se está vazia
        for (int i = 0; i < size; i++){
            if (this.data[i] != null){
                return false;
            }
        }
        return true;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}