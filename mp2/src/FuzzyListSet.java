import java.util.ArrayList;
import java.util.Iterator;

public class FuzzyListSet extends ListSet{

	private ArrayList<Float> fuzzyArray = new ArrayList<Float>();	//podria cambiarse por LinkedList
	
	
	/**
	 * 
	 */
	public FuzzyListSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Set the FuzzyListSet to empty
	 */
	public void clear() {
		super.clear();
		fuzzyArray.clear();
	}
	
	
	/**
	 * Check if empty
	 * @return true if empty, false if not empty
	 */
	public boolean isEmpty() {
		return (super.isEmpty() && (fuzzyArray.size() < 1));
	}
	
	
	/**
	 * Cardinality
	 * @return the size of the FuzzyListSet
	 */
	public int size() {
		return super.size();	
	}
	
	
	/**
	 * Checks element inclusion 
	 * @param elem
	 * @return
	 */
	public boolean contains(Integer elem) {
		return super.contains(elem);
	}
	
	
	/**
	 * Checks set inclusion
	 * @param set
	 * @return
	 */
	public boolean containsAll(FuzzyListSet set) {
		//return array.containsAll(set);	//esto esta mal, no admite la clase
		for(Integer elem : set) {
			if(!this.contains(elem)) return false;
		}
		return true;
	}
	
	
	/**
	 * Adds element to the FuzzyListSet
	 * @param elem
	 */
	public void add(Integer elem, Float elem2) {
		if(super.add(elem)) fuzzyArray.add(elem2);
	}
	
	
	/**
	 * Union of two FuzzyListSets
	 * @param set
	 */
	// En este link se explica como hacerlo https://howtodoinjava.com/java/collections/arraylist/merge-arraylists/
	public void addAll(FuzzyListSet set) {
		int i = 0;
		for(Integer elem : set) {
			this.add(elem, set.getFuzzyFromIndex(i)); 	//gets the elem on index i from the fuzzyArray of set
			i++;
		}
	}
	
	
	/**
	 * Removes an elem from the FuzzyListSet
	 * @param elem
	 */
	public int remove(Integer elem) {
		int index = super.remove(elem);
		fuzzyArray.remove(index);	//gets the index from the super class remove method
		return index;
	}
	
	
	/**
	 * Removes the content of a ListSet from a ListSet 
	 * @param set
	 */
	public void removeAll(FuzzyListSet set) {
		for(Integer elem : set) {
			this.remove(elem);
		}
	}
	
	
	/**
	 * Intersection of two ListSets
	 * @param set
	 */
	public ListSet retainAll(FuzzyListSet set) {
		ListSet result = new ListSet();
		for(Integer elem : set) {
			if(array.contains(elem)) result.add(elem);
		}
		return result;
	}
	
	
	/**
	 * Prints the content of the set
	 */
	public String toString() {
		//String str = super.toString().substring(1, super.toString().length()-1); //the ListSet String deleting the claus
		return (super.toString() + fuzzyArray.toString());
	}
	
	
	
	public float getFuzzyFromIndex(int index) {
		return (fuzzyArray.get(index));
	}


}
