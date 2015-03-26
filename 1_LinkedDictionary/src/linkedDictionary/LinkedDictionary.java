package linkedDictionary;

import java.util.NoSuchElementException;

/**ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 * 
 * @author Mathieu Harter (#étudiant :  7377180) (courriel: matem12345@hotmail.fr)
 * @author Jonathan Horton (#étudiant :  7710257) (courriel: jhort062@uottawa.ca)
 * @version sqrt(1.0)
 */
public class LinkedDictionary implements Map<String, Token> {

	@Override
	public Token get(String key) throws NoSuchElementException,
			NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(String key) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(String key, Token value) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replace(String key, Token value) throws NoSuchElementException,
			NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Token remove(String key) throws NoSuchElementException,
			NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class Elem{
		private String key;
		private Token value;
		private Elem next;
	}

}
