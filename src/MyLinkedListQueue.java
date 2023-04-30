
package src;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue <E> {
    private LinkedList<E> list;
    public MyLinkedListQueue(){
        list = new LinkedList<>();
    }

    public void enqueue(E element) {
        list.addFirst(element);
    }

    public E dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
    }
}
