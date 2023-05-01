
package src;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
        * This class implements a queue using a LinkedList.
        *
        * @param <E> the type of elements stored in the queue
 */
public class MyLinkedListQueue <E> {
    private LinkedList<E> list; // the list that holds the elements of the queue
       /**
               * Constructs an empty queue.
         */
    public MyLinkedListQueue(){
        list = new LinkedList<>();
    }

    /**
            * Adds the specified element to the back of the queue.
            *
            * @param element the element to be added to the queue
     */
    public void enqueue(E element) {
        list.addLast(element);
    }

    /**
            * Removes and returns the front element of the queue. Throws an exception if the queue is empty.
            *
            * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (checkList()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

     /**
             * Returns the front element of the queue without removing it. Throws an exception if the queue is empty.
            *
            * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (checkList()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    /**
            * Returns true if the queue is empty, false otherwise.
             * @return true if the queue is empty, false otherwise
     */
    public boolean checkList() {
        return list.isEmpty();
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }

}
