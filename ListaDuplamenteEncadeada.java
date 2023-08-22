public class ListaDuplamenteEncadeada<T> {
    No primeiro;
    No ultimo;

    public static class No<T> {
        T data;
        No anterior;
        No proximo;

        public No(T data) {
            this.data = data;
            this.anterior = null;
            this.proximo = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public No getAnterior() {
            return anterior;
        }

        public void setAnterior(No anterior) {
            this.anterior = anterior;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }

    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void add(T value){
        No node = new No<>(value);
        if (this.primeiro == null){
            this.primeiro = node;
            this.ultimo = node;
        } else {
            node.setAnterior(this.ultimo);
            this.ultimo.setProximo(node);
            this.ultimo = node;
        }
    }
    public No remove(){
        System.out.println("removendo");
        if (this.primeiro != null){
            if (getSize() > 1){
                this.ultimo.anterior.proximo = null;
                this.ultimo = this.ultimo.anterior;
                return this.ultimo;
            } else {
                this.primeiro = null;
                this.ultimo = null;
                return null;
            }
        } else {
            return null;
        }
    }

    public int getSize(){
        No node = this.primeiro;
        int size = 0;
        while (node != null){
            size += 1;
            node = node.proximo;
        }
        return size;
    }

    public void printar(){
        No node = this.primeiro;
        while (node != null){
            System.out.println(node.getData());
            node = node.proximo;
        }
    }
}
