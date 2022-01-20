package cursor_education_JB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(100);
        list.add(101);
        list.add(-1);
        list.add(-99);
//
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);
//
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

//
        list.add(104);
        list.add(106);
        list.sort((o1, o2) -> {
            System.out.println("*-*-*-*");
            System.out.print(o1 + " " + o2 + "-> ");
            System.out.println(o1.compareTo(o2));
            return o1.compareTo(o2);
        });
        System.out.println(list);

//метод по умолчанию
        list.add(2406);
        list.add(2307);
        list.sort(Integer::compareTo);
        System.out.println(list);


        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                result.add(integer * 3);
            }
        }
        System.out.println(result);
        List<String> strRes = new ArrayList<>();
        result.forEach(integer -> strRes.add(integer.toString() + " _ _"));
        System.out.println(strRes);

        //

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(list);
        var arrayListStream = list.stream()
                .filter(it -> it % 2 == 0)
                .map(it -> it * 2)
                .map(it -> it + "_+_")
                .collect(Collectors.toList());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(arrayListStream);


        ///*-*-*-*-*-*-*-*

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(45);
        myList.add(79);
        myList.add(-54);
        myList.add(-1);
        myList.add(68);
        myList.add(-23);
        myList.add(-8);
        myList.add(54);
        myList.add(179);
        myList.add(-1103);
        myList.add(22);
        myList.add(455);
        myList.add(719);
        myList.add(-586);
        myList.add(-1128);
        myList.add(55);
        myList.add(-79);
        myList.add(-152);
        myList.add(450);
        myList.add(130);
        myList.add(-200);
        System.out.println("----------------------------------------------------");
        System.out.println(myList);
        var myNewList = myList.stream()
                .filter(it -> it % 2 == 0)
                .map(it -> "_(" + it + ")_")
                .collect(Collectors.toSet());

        System.out.println(myNewList);
    }
}
