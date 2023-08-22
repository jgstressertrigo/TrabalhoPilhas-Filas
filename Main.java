public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada<>();
        l.add(1);
        l.add(2);
        l.add(4);
        l.printar();
        System.out.println(l.remove());
        l.printar();
    }
}