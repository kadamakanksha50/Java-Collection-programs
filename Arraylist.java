import java.util.*;
class Arraylist {  

    public static void main(String[] args) {
            
        List<Double> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();
                
        l1.add(2.5);
        l1.add(1.5);
		l1.add(1,2.0);
        System.out.println("Array List of type Double.");
		System.out.println("Insertion"+l1);
		
        l2.add(2025);
		l2.add(0,2024);
		System.out.println("\nList of integer type.");
        System.out.println("Insertion:"+l2);
		
		List<Integer> n = new ArrayList<>();
		n.add(3000);n.add(4000);n.add(5000);n.add(6000);
		
		l2.addAll(n);
		System.out.println("Add All:"+l2);
		l2.set(2,3024);
		System.out.println("Updated List:"+l2);
		
		l3.add("Akanksha");
		l3.add("Kadam");
		l3.add(1,"Angad");
		System.out.println("\nArray List of type String.");
		System.out.println("Insertion:"+l3);
		
		List<String> n1 = new ArrayList<>();
		n1.add("abc");
		n1.add("xyz");
		l3.addAll(n1);
		System.out.println("Add All:"+l3);
		
		l3.set(0,"ABC");
		System.out.println("Updated List:"+l3);
    }
}