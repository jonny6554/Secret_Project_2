package recursion;

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

        SinglyLinkedList<String> l;
        l = new SinglyLinkedList<String>();
        
        l.addFirst("A");
        l.addFirst("D");
        l.addFirst("C");
        l.addFirst("A");
        l.addFirst("A");
        l.addFirst("B");
        l.addFirst("A");

        System.out.println(l);
        System.out.println(l.indexOfAll("A"));
       
        // Expected result
        // {A,B,A,A,C,D,A}
        // {0,2,3,6}
    }
    
}
