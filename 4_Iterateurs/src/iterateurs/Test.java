package iterateurs;

import java.util.LinkedList;
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
        List<Tuple> l;
        l = new LinkedList<Tuple>();

        l.add(new Tuple('a'));
        l.add(new Tuple('b'));
        l.add(new Tuple('a'));
        l.add(new Tuple('c'));
        l.add(new Tuple('b'));
        l.add(new Tuple('a'));
        l.add(new Tuple('c'));
        l.add(new Tuple('a'));
        l.add(new Tuple('d'));
        l.add(new Tuple('d'));
        l.add(new Tuple('b'));

        Frequency.frequency(l);

    }
}
