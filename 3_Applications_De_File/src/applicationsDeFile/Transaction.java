package applicationsDeFile;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#étudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#étudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @author Marcel Turcotte
 * @version sqrt(1.0)
 */
public class Transaction {

    private int shares;
    private int sharePrice;

    public Transaction( int shares, int sharePrice ) {
	this.shares = shares;
	this.sharePrice = sharePrice;
    }

    public int getShares() {
	return shares;
    }

    public void sell( int num ) {
	if ( num > shares ) {
	    throw new IllegalArgumentException( "can't sell more than you have" );
	}
	shares = shares - num;
    }

    public int getSharePrice() {
	return sharePrice;
    }

}
