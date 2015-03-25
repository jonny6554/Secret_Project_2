package file;

import java.util.LinkedList;
import java.util.List;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#�tudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#�tudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @author Marcel Turcotte
 * @version sqrt(1.0)
 */
public class CircularQueue<E> implements Queue<E> {

    private int front, rear, size;
    private final E[] elems;

    @SuppressWarnings("unchecked")

    public CircularQueue(int capacity) {
        elems = (E[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void enqueue(E value) {
        rear = (rear + 1) % elems.length;
        elems[rear] = value;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        E savedValue = elems[front];
        elems[front] = null; // ``scrubbing''
        size--;
        front = (front + 1) % elems.length;
        return savedValue;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder(getClass().getName() + "[");

        if (size > 0) {

            int offset = 0;

            str.append(elems[front]);
            offset = offset + 1;

            while (offset < size) {

                str.append(", ");
                str.append(elems[(front + offset) % elems.length]);
                offset = offset + 1;

            }

        }

        str.append("]");

        return str.toString();

    }
}
