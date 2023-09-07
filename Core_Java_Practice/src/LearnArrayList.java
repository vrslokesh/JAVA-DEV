import java.util.*;

public class LearnArrayList {
    //Collection+Map
    //List+Set+Queue
    //Map: Hash map tree map linked Hash map

    //Array list class internally uses array class and enables to expand the size of the array
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        /*a1.add("Lokesh");
        a1.add("Java");
        System.out.println(a1);
        a1.add("123");
        System.out.println(a1);
        //add === will add all elements in Array
        //addall === will add all elements of existing list and adds new collection

        System.out.println();*/

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(null);
        a1.add(null);
        a1.add(4);
        a1.add(5);



     /*   System.out.println(a1);
        a1.remove(0);
        a1.remove(2);
        System.out.println(a1);
        a1.remove(Integer.valueOf(3));
        System.out.println(a1);*/

        a1.set(2,2000);
        System.out.println(a1);
        System.out.println(a1.contains(50));
        System.out.println(a1);

        for (int i = 0; i < a1.size() ; i++) {
            System.out.println("The element is " + a1.get(i));
        }



    }



}
