public interface Biblioteca<T>{

    void push(T data);
    T pop();
    int size();
    void clear();
    Boolean isFull();
    Boolean isEmpty();

}
