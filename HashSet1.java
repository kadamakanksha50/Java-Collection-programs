import java.util.*;
class HashSet1{
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>();
		Set<Integer> set11 = new LinkedHashSet<>();
		Set<Integer> set22 = new TreeSet<>();
		set.add(4384);set.add(5284);set.add(4004);set.add(3000);set.add(2384);set.add(6084);set.add(1285);set.add(2088);

		set11.addAll(set);
		set22.addAll(set);
		System.out.println("Integer Values");

		System.out.println("HashSet Values:"+set);
		System.out.println("LinkedHashSet Values:"+set11);
		System.out.println("TreeSet Values:"+set22);	
		
		Set<Double> sete = new HashSet<>();
		Set<Double> set1 = new LinkedHashSet<>();
		Set<Double> sett = new TreeSet<>();

		set1.add(1.5);set1.add(0.55);set1.add(1.25);set1.add(2.5);set1.add(22.05);set1.add(11.22);set1.add(3.00);set1.add(8.34);
		sete.addAll(set1);
		sett.addAll(set1);
		System.out.println("\n\nDouble Values");
		System.out.println("HashSet Values:"+sete);
		System.out.println("LinkedHashSet Values:"+set1);
		System.out.println("TreeSet Values:"+sett);	


		Set<String> set2 = new TreeSet<>();
		Set<String> set3 = new HashSet<>();
		Set<String> set4 = new LinkedHashSet<>();
		set2.add("Bob");set2.add("Jully");set2.add("Harry");set2.add("Youtube");set2.add("google");set2.add("abc");set2.add("Xyz");
		set3.addAll(set2);
		set4.addAll(set2);
		System.out.println("\n\nString Values");
		System.out.println("HashSet Values:"+set3);
		System.out.println("LinkedHashSet Values:"+set4);
		System.out.println("TreeSet Values:"+set2);
	}
}