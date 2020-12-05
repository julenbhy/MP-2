public class TestListSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListSet setA = new ListSet();
		if(setA.isEmpty()) System.out.println("Set is empty");
		setA.add(Integer.valueOf(1));
		if(!setA.isEmpty()) System.out.println("Set isn't empty");
		setA.add(Integer.valueOf(2));
		setA.add(Integer.valueOf(3));
		System.out.println("Printing setA: " + setA.toString());
		System.out.println("Set's size: "+setA.size());
		if(setA.contains(Integer.valueOf(2))) System.out.println("The set contains 2");
		if(!setA.contains(Integer.valueOf(4))) System.out.println("The set doesn't contains 4");
		System.out.println("Remove element 3");
		setA.remove(Integer.valueOf(3));
		System.out.println("Printing setA: " + setA.toString());
		//System.out.println("Set's size: "+setA.size());
		System.out.println("Clear set");
		setA.clear();
		System.out.println("Printing setA: " + setA.toString());
		//System.out.println("Set's size: "+setA.size());
		
		
		/*Ahora comprobamos las operaciones entre sets*/
		setA.add(Integer.valueOf(1));
		setA.add(Integer.valueOf(2));
		setA.add(Integer.valueOf(3));
		setA.add(Integer.valueOf(9));
		setA.add(Integer.valueOf(-3));
		
		ListSet setB = new ListSet();
		setB.add(Integer.valueOf(2));
		setB.add(Integer.valueOf(15));
		setB.add(Integer.valueOf(69));
		if(!setB.containsAll(setA)) System.out.println("Set B doesn't contain set A");
		
		ListSet setC = new ListSet();
		setC.add(Integer.valueOf(1));
		setC.add(Integer.valueOf(2));
		if(setA.containsAll(setC)) System.out.println("Set A contains set C");
		
		System.out.println("Printing retail of setB and setA: ");
		ListSet retail = setB.retainAll(setA);
		System.out.println("Printing retail: " + retail.toString());
		
		System.out.println("Printing sum of setA and set B:");
		setA.addAll(setB);
		System.out.println("Printing setA: " + setA.toString());
		
		System.out.println("Printing remove of setC on setA:");
		setA.removeAll(setC);
		System.out.println("Printing setA: " + setA.toString());

	}
}