import java.util.ArrayList;
import java.util.HashMap;

public class hashMaps {
public static void main(String[] args) {

	HashMap map = new HashMap();
	map.put("Ian", 1);
	map.put("Juan", 2);
	map.put("Bob" , 3);
	map.put("Connor", 4);
	System.out.println(getFavFood(map,"Ian"));
	System.out.println(checkPerson(map,"Ian"));
	System.out.println(getNum(map));
	System.out.println(getPeopleWhoLike(map,1));
}
public static Object getFavFood(HashMap map, String name){
	return map.get(name);
}
public static boolean checkPerson(HashMap map, String name){
	if (map.containsKey(name)) {
		return true;
	}
	else
	return false;
}
public static Object getNum(HashMap map){
	return map.values();
}
public static ArrayList<Object> getPeopleWhoLike(HashMap map,int x){
	ArrayList<Object> names = new ArrayList<Object>();
	for(Object name : map.keySet()){
		if ((int)map.get(name) == x) {
			names.add(name);
			
		}
		
	}
	return names;
}
}
