package 集合.map;/*

 */

import java.util.*;
import java.util.function.Predicate;

public class demo01 {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("a","1");
        stringStringHashMap.put("b","2");
        stringStringHashMap.put("c","1");
//key值
        for (String s:stringStringHashMap.keySet()) {

            if (stringStringHashMap.get(s)=="1"){
                System.out.println(stringStringHashMap.get("a"));
                System.out.println(stringStringHashMap.get("b"));

            }
        }
//键值对
//        Set<Map.Entry<String, String>> entries = stringStringHashMap.entrySet();
//        for (Map.Entry<String, String> s: entries
//             ) {
//            System.out.println(s.getValue());
//            System.out.println(s.getKey());
//        }
//迭代器
        Collection<String> values = stringStringHashMap.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        //迭代器
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.next());
//        }
//
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }

        for (String string : strings) {
            System.out.println(string);
        }
    }

}











 class Person {



     public static void main(String[] args) {
         Collection<Person> collection = new ArrayList();
         collection.add(new Person("张三", 22, "男"));
         collection.add(new Person("李四", 19, "女"));
         collection.add(new Person("王五", 34, "男"));
         collection.add(new Person("赵六", 30, "男"));
         collection.add(new Person("田七", 25, "女"));


         collection.removeIf(
//                 person -> person.getAge() >= 30 M B
                 new Predicate<Person>() {
                     @Override
                     public boolean test(Person person) {
                         return person.getAge()>30;
                     }
                 }
         );//过滤30岁以上的求职者

         System.out.println(collection.toString());//查看结果
     }















    private String name;//姓名
    private Integer age;//年龄
    private String gender;//性别

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getAge() {
         return age;
     }

     public void setAge(Integer age) {
         this.age = age;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
     }

     public Person(String name, Integer age, String gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     //重写toString，方便观看结果
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
