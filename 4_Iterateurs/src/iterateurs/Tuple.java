package iterateurs;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#étudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#étudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @author Marcel Turcotte
 * @version sqrt(1.0)
 */
public class Tuple { 
 
    private final char c; 
    private boolean visited; 
 
    public Tuple(char c) { 
        this.c = c; 
        visited = false; 
    } 
 
    public void toggle() { 
        visited = ! visited; 
    } 
 
    public boolean visited() { 
        return visited; 
    } 
 
    public char getChar() { 
        return c; 
    } 
 
    @Override
    public String toString() { 
        if (visited) { 
            return "(" + c + ",t)"; 
        } else { 
            return "(" + c + ",f)"; 
        } 
    } 
}
