package src.file;

import java.util.List;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#étudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#étudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @author Marcel Turcotte
 * @version sqrt(1.0)
 */
public class Test {

    public static void main(String[] args) {
        
        CircularQueue<Integer> q;
        q = new CircularQueue<Integer>(8);
        
        for (int i = 0; i < 6; i++) {
            q.enqueue(i);
        }
        
        while (! q.isEmpty()) {
            q.dequeue();
        }

        for (int i = 0; i < 8; i++) {
            q.enqueue(i);
        }

        List<Integer> l;
        l = q.dequeue(3);

        System.out.print("[");
        for (int i = 0; i < l.size(); i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(l.get(i));
        }
        System.out.println("]");

    }

}
