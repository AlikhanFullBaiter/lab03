package src;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack <E> {
    private LinkedList<E> list;

    public MyLinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

}
