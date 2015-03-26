package src.linkedDictionary;

import java.util.NoSuchElementException;

/**
 * Un map est responsable pour la cr�ation de l'association cl�-valeur.
 * Elle peut contenir des cl�s dupliqu�es: lorsque c'est le cas, les m�thodes
 * get, put, replace, et remove se r�f�re � la derni�re valeur pour une cl� donn�e.
 * 
 * @param <K> repr�sente le cl� � associ� � une valeur. (le cl� est le nom de la variable)
 * @param <V> repr�sente la valeur actuelle. (la valeur est la valeur associ� avec cette variable)
 * @author Jonathan Horton (#num�ro�tudiant : 7710257) & Mathieu Harter (#num�ro�tudiant : 7377180)
 * @version sqrt(1.0)
 */
public interface Map<K,V> {
	
	/**
	 * Retourne la valeur associ� � la cl� sp�cifi�e.
	 * Dans le cas d'un conflit, elle retourne la valeur la plus � gauche.
	 * 
	 * @param key la cl� est associ� � une valeur.
	 * @return on retourne la valeur associ� � la cl� donn�e
	 * @throws NoSuchElementException est g�n�r� lorsqu'aucun valeur est associ� � la cl�.
//	 * @throws NullPointerException est g�n�r� lorsque la cl� sp�cifi� est null.
	 */
	public abstract V get(K key)throws NoSuchElementException, NullPointerException;
	
	/**
	 * Retourne true si une association existe pour la cl� sp�cifi�e.
	 * 
	 * @param key est la cl� est associ� � une valeur.
	 * @return est vrai seulement s'il existe une association pour la cl� donn�e
	 * @throws NullPointerException si la cl� sp�cifi� est null.
	 */
	public abstract boolean contains(K key) throws NullPointerException;
	
	/**
	 * Cr�e une nouvelle association cl�-valeur.
	 * 
	 * @param key est la cl� qui sera associ� � la valeur donn�e
	 * @param value est la valeur qui sera associ� � la cl� donn�.
	 * @throws NullPointerException si la cl� sp�cifi� est null.
	 */
	public abstract void put(K key, V value) throws NullPointerException;
	
	/**
	 * Cette m�thode remplace la valeur associ� au cl� sp�cifi�.
	 * Dans le cas d'un conflit, elle remplace la valeur la plus � gauche.
	 * 
	 * @param key est la cl� pour laquelle la valeur sera remplac�
	 * @param value est la nouvelle valeur � associ� au cl�.
	 * @throws NoSuchElementException est g�n�r� lorsqu'il n'y a pas de cl� existent que l'on peut remplacer.
	 * @throws NullPointerException est g�n�r� si la cl� sp�cifi� est null.
	 */
	public abstract void replace(K key, V value) throws NoSuchElementException, NullPointerException;
	
	/**
	 * Cette m�thode permet d'enlev� la valeur associ� � une cl�.
	 * Dans le cas d'un conflit, elle enl�ve la valeur la plus � gauche.
	 * 
	 * @param key est la cl� pour laquelle l'association sera enlev�.
	 * @return la valeur qui vient d'�tre enlev�.
	 * @throws NoSuchElementException  est g�n�r� lorsqu'il n'y a pas de cl� existent que l'on peut enlever.
	 * @throws NullPointerException est g�n�r� si la cl� sp�cifi� est null.
	 */
	public abstract  V remove(K key) throws NoSuchElementException, NullPointerException;
}
