/**

 A stack implementation using a linked list.
 This class uses the built-in LinkedList class provided by Java.
 @param <E> the type of elements in the stack.
 */
package src;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack <E> {
    private LinkedList<E> list;

    /**
     * Constructs an empty stack.
     */
    public MyLinkedListStack() {
        list = new LinkedList<>();
    }

    
    public void push(E element) {
        list.addFirst(element);
    }

    public E pop() {
        if (checkList()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (checkList()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean checkList () {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
