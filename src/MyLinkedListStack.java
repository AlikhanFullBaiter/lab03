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

    /**
            * Pushes an element onto the top of this stack.
    *
         * @param element the element to be pushed onto this stack.
    */
    public void push(E element) {
        list.addFirst(element);
    }

    /**
     * Removes the element at the top of this stack and returns that element.
    *
     * @return the element at the top of this stack.
    * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (checkList()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    /**
     * Looks at the element at the top of this stack without removing it from the stack.
    *
     * * @return the element at the top of this stack.
    * @throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (checkList()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    /**
            * Checks if the stack is empty.
            *
            * @return true if the stack is empty, false otherwise.
    */

    public boolean checkList () {
        return list.isEmpty();
    }


    public int size() {
        return list.size();
    }
}
