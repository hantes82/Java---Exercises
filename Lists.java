//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List; - dla ogolnych



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list = new ArrayList <String>();
		list.add("S1");
		list.add("S2");
		list.add("S3");
		list.add("S1");
		list.add("S5");
		list.add("S6");
		System.out.println(list);

		System.out.println (list.get(5));
		System.out.println (list.size()-1);

		list.remove(0);
		list.remove("S1");

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);	//nie doda 1 bo set nie dodaje dublujacych sie elementow
	//	set.remove(); // tylko poprzez element, nie mozna usuwac przez index bo nie ma indexu
		set.size();

		set.clear();
		list.clear();
		list.isEmpty();
		set.isEmpty();
	//	set.contains();
	//	list.contains();
	//	Collections.sort(lista)
		for (String ss : list) {
			System.out.println(ss);
		}

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			Integer element = iterator.next();

			System.out.println(element);

		}


		HashMap<String, String> myMap = new HashMap <String, String> ();

		myMap.put ("P", "Piotrek");
		myMap.put ("J", "John");

		myMap.remove(2);
		myMap.remove("P", "Piotrek");
		String j = myMap.get("J");

		System.out.println(j);

		//iterowanie po mapie - rozni sie od iterowania po liscie i secie bo to dwa zbiory
		Iterator<Map.Entry<String, String>> iterator1 = myMap.entrySet().iterator();


		while (iterator1.hasNext()) {
			Map.Entry<String, String> entry = iterator1.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is= "+key+" and value is= "+value);
		}
		// drugi sposob


		for (Map.Entry<String, String> entry : myMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is= "+key+" and value is= "+value);
		}



	}

}
