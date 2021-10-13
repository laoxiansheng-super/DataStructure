package 集合.map;/*

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class demo02 {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("a","1");
        stringStringHashMap.put("b","2");

        System.out.println(stringStringHashMap.get("b"));
        ArrayList<String> strings = new ArrayList<>();
        test(stringStringHashMap,strings);

//
//        Iterator<String> iterator1 = strings.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }

    }
    public static void test(HashMap<String,String> map, ArrayList<String> arrayList){
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();

        while (iterator.hasNext()){
            arrayList.add(iterator.next());

        }
//        Iterator<String> iterator1 = arrayList.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//
//            System.out.println("jjjjjjjjjjjjjjjjjjj");
//        }


    }
}
