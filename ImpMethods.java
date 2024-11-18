import java.util.*;
class ImpMethods{
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(1001);l1.add(1050);l1.add(1001);l1.add(1002);l1.add(1010);l1.add(1005);l1.add(1100);l1.add(1035);l1.add(2555);l1.add(1050);
		
		System.out.println("Integer List: "+l1);
		System.out.println("1.Contains 1000: "+l1.contains(1000));
		System.out.println("2.IndexOf 1000 "+l1.indexOf(1000));
		System.out.println("3.LastIndexOf 1001: "+l1.lastIndexOf(1001));
		System.out.println("4.List is Empty: "+l1.isEmpty());
		Collections.reverse(l1);
		System.out.println("5.Reverse List: "+l1);
		Collections.sort(l1);
		System.out.println("6.Sorted List: "+l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("7.Reverse Order List: "+l1);
		System.out.println("8.Minimum element from the List: "+Collections.min(l1));
		System.out.println("9.Maximum element from the List: "+Collections.max(l1));
		Collections.shuffle(l1);
		System.out.println("10.Shuffled List: "+l1);
		Object[] arr = l1.toArray();
		System.out.println("11.list to Array:");
		for(Object ele:arr){
			System.out.print(ele+"-");
		}
		System.out.println("\n\n12.Multiple time unique Shuffled List: ");
		for(int i=0;i<10;i++){
			Collections.shuffle(l1);
			System.out.println(l1);
		}
	}
}