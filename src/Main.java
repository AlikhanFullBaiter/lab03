package src;

public class Main {
    public static <E> void main(String[] args) {
        MyLinkedListStack list = new MyLinkedListStack<E>();
        list.push(12);
        list.push(45);
        list.push("Alikhan");
        list.push("Messi");
        list.push("GOAT");
        list.push(8);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        System.out.println(list.size());

        MyLinkedListQueue list2 = new MyLinkedListQueue<E>();
        list2.enqueue("Ankara");
        list2.enqueue("Messi");
        list2.enqueue("que");
        list2.enqueue("mira");
        list2.enqueue("Bobo");
        list2.enqueue("SUIII");
        list2.dequeue();
        System.out.println(list2.peek());
        list2.dequeue();
        System.out.println(list2.size());
    }
}
