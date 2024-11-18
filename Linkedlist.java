import java.util.*;
class Linkedlist {  

    public static void main(String[] args) {
            
        List<Double> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
		List<String> l3 = new LinkedList<>();
                
        l1.add(2.5);
        l1.add(1.5);
		l1.add(1,2.0);
        System.out.println("Linked List of type Double.");
		System.out.println("Insertion"+l1);
		
        l2.add(2025);
		l2.add(0,2024);
		System.out.println("\nLinked List of integer type.");
        System.out.println("Insertion:"+l2);
		
		List<Integer> n = new ArrayList<>();
		n.add(3000);n.add(4000);n.add(5000);n.add(6000);
		
		l2.addAll(n);
		System.out.println("Add All:"+l2);
		l2.set(2,3024);
		System.out.println("Updated List:"+l2);
		System.out.println("get method:"+l2.get(2));
		l2.remove(new Integer(2025));
		System.out.println("Element removed from List:"+l2);
		System.out.println("Integer iteration values using for:");
		for(int no:l2){
			System.out.print(no+"->");
		}
		
		
		l3.add("Akanksha");
		l3.add("Kadam");
		l3.add(1,"Angad");
		System.out.println("\n\nLinked List of String type.");
		System.out.println("Insertion:"+l3);
		
		List<String> n1 = new ArrayList<>();
		n1.add("abc");
		n1.add("xyz");
		l3.addAll(n1);
		System.out.println("Add All:"+l3);
		
		l3.set(0,"ABC");
		System.out.println("Updated List:"+l3);
		System.out.println("get method:"+l3.get(2));
		l3.remove(1);
		System.out.println("Element removed from List:"+l3);
		
		Iterator<String> iter = l3.iterator();
		System.out.println("String iteration values using iterator:");
		while(iter.hasNext()){
			System.out.print(iter.next()+"->");
		}
		System.out.println();
		l3.clear();
		System.out.println("Cleared all list:"+l3);
    }
}