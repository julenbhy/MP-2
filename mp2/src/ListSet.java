import java.util.ArrayList;
import java.util.Iterator;

public class ListSet implements Iterable<Integer>{

	ArrayList<Integer> array = new ArrayList<Integer>();	//podria cambiarse por LinkedList
	

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return array.iterator();
	}

	
	/**
	 * Constructor de la clase
	 */
	public ListSet() {
		super();
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
		return (array.size() < 1);
		
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
		//return array.containsAll(set);	//esto esta mal, no admite la clase
		for(Integer elem : set) {
			if(!this.contains(elem)) return false;
		}
		return true;
	}
	
	
	/**
	 * Adds element to the ListSet
	 * @param elem
	 */
	public void add(Integer elem) {
		if(!this.contains(elem)) array.add(elem);
	}
	
	
	/**
	 * Union of two ListSets
	 * @param set
	 */
	// En este link se explica como hacerlo https://howtodoinjava.com/java/collections/arraylist/merge-arraylists/
	public void addAll(ListSet set) {
		for(Integer elem : set) {
			this.add(elem);
		}
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
		for(Integer elem : set) {
			this.remove(elem);
		}
	}
	
	
	/**
	 * Intersection of two ListSets
	 * @param set
	 */
	public ListSet retainAll(ListSet set) {
		ListSet result = new ListSet();
		for(Integer elem : set) {
			if(array.contains(elem)) result.add(elem);
		}
		return result;
	}
	
	
	/**
	 * Prints the content of the set
	 */
	public void printSet() {
		System.out.println("Printing set: ");
		System.out.println(array.toString());
	}


}