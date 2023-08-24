public class Fila<T> implements Biblioteca {
    private int top = -1;
    private int base = 0;
    private int size;
    private T[] data;

    public Fila(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
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
        for (int i = 0; i < size; i++){
            if (this.data[i] == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean isEmpty() {
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