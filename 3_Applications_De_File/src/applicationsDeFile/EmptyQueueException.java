package applicationsDeFile;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#�tudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#�tudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @author Marcel Turcotte
 * @version sqrt(1.0)
 */
public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
    }

    public EmptyQueueException( String message ) {
        super( message );
    }
}
