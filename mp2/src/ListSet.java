import java.util.ArrayList;
import java.util.Iterator;

public class ListSet implements Iterator<Integer>{

	ArrayList<Integer> array;	//podria cambiarse por LinkedList
	
	
	
	/**
	 * Constructor de la clase
	 */
	public ListSet() {
		super();
	}
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * Set the ListSet to empty
	 */
	public void clear() {
		array.clear(); //.clear() es mas eficiente, pero removeAll() tambien podria ser interesante
	}
	
	
	/**
	 * Check if empty
	 * @return true if empty, false if not empty
	 */
	public boolean isEmpty() {
		if (array.size() < 1) return true;
		return false;
	}
	
	
	/**
	 * Cardinality
	 * @return the size of the ListSet
	 */
	public int size() {
		return array.size();	
	}
	
	
	/**
	 * Checks element inclusion 
	 * @param elem
	 * @return
	 */
	public boolean contains(Integer elem) {
		return array.contains(elem);
	}
	
	
	/**
	 * Checks set inclusion
	 * @param set
	 * @return
	 */
	public boolean containsAll(ListSet set) {
		return array.containsAll(set);	//esto esta mal, no admite la clase
	}
	
	
	/**
	 * Adds element to the ListSet
	 * @param elem
	 */
	public void add(Integer elem) {
		array.add(elem);
	}
	
	
	/**
	 * Union of two ListSets
	 * @param set
	 */
	// En este link se explica como hacerlo https://howtodoinjava.com/java/collections/arraylist/merge-arraylists/
	public void addAll(ListSet set) {
		
	}
	
	
	/**
	 * Removes an elem from the ListSet
	 * @param elem
	 */
	public void remove(Integer elem) {
		array.remove(elem);
	}
	
	
	/**
	 * Removes the content of a ListSet from a ListSet 
	 * @param set
	 */
	public void removeAll(ListSet set) {
		array.removeAll(set);	//no funciona por lo mismo que el contains all
		
	}
	
	
	/**
	 * Intersection of two ListSets
	 * @param set
	 */
	public void retainAll(ListSet set) {
		
	}
	

}
