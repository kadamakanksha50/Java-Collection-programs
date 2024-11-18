import java.util.*;
class SetOperations{
	public static void main(String[] args){
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);set.add(5);set.add(45);set.add(20);set.add(30);
		System.out.println("Set 1:"+set);

		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(44);set1.add(102);set1.add(50);set1.add(62);set1.add(20);set1.add(54);
		System.out.println("Set 2:"+set1);
		
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(40);set2.add(100);set2.add(52);set2.add(65);set2.add(20);set2.add(54);
		System.out.println("Set 3:"+set2);
		
		set1.addAll(set2);
		System.out.println("Union of Set 2 & Set 3:"+set1);
		
		set.retainAll(set1);
		System.out.println("Intersection of Set 1 & Set 2:"+set);

		set1.removeAll(set2);
		System.out.println("Difference of Set 2 & Set 3:"+set1);

	}
}