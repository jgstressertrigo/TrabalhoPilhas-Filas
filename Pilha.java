public class Pilha<T> implements Biblioteca {
    private int top =-1;
    private int size;
    private T[] data;

    public Pilha(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    @Override
    public void push(Object data) {
        if (isFull()){
            System.out.println("Pilha Cheia");
        } else {
            this.top += 1;
            this.data[this.top] = (T) data;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("A pilha já está vazia");
            return null;
        } else {
            T removed = this.data[this.top];
            this.data[this.top] = null;
            this.top -= 1;
            return removed;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.size; i++){
            this.data[i] = null;
            this.top = -1;
        }
    }

    @Override
    public Boolean isFull() {
        return this.top == this.size-1;
    }

    @Override
    public Boolean isEmpty() {
        return this.top < 0;
    }
    public void setData(T[] data) {
        this.data = data;
    }
    public T[] getData() {
        return data;
    }
    public void setTop(int top) {
        this.top = top;
    }
}