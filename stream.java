import java.util.ArrayList;
// import java.util.stream.Collector;
import java.util.stream.Collectors;
// import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

    // 1st way of creating list
    // create a list and filter all even nos from list
    // there are many to create a list(Arraylist,List.of()) 
    ArrayList<Integer> ar = new ArrayList<Integer>();
    // ArrayList<Integer> ar1 = new ArrayList<Integer>();
    // List interface <- Collection interface <- Iterable interface
    ar.add(100);
    ar.add(2);
    ar.add(300);
    ar.add(9);
    // System.out.println(ar);

    // 2 way of creating list
    // List<Integer> ar1 =Arrays.asList(1,2,3,4);
    // // this is an un modifiable list returns an Arraylist<>
    // // Array.asList() are immutable once defined we cannot change or add anything into the list.
    //  System.out.println(ar1);

      // question => take all even elements from old-list and store it into new-list. 


      // without stream
      // this old method code is known as boiler-plate code
      ArrayList<Integer> evenno = new ArrayList<>();
      
      for ( Integer i: ar) {
        if (i>=50){
          evenno.add(i);
        }
      
      }
      System.out.println(ar);
      System.out.println(evenno);


      // with using stream api
       Stream<Integer> stream = ar.stream();
      // stream is an interface and sub-package of util package which takes generic parameter 
      // we are creating object of stream api and accessing it by using stream() method with collection(list,arraylist,stack,queue)
      // 1 method to get object of stream ==>  we can use stream() on any collection(ar) to get object of stream .
      List<Integer> newlist= stream.filter(i->i>=50).collect(Collectors.toList());
      // if condition returns a bool value to be true the var i will be filter out .
      // we have to filter the elements on the basis of this lambda expression (i->i%2==0).
      // then collect() will collect all the filtered elements by using Collectors.toList() method and elements will be stored in the form of list and returns list
       
      System.out.println(newlist);


      // by chaining stream with filter
      // ArrayList<Integer> newlist1 =  (ArrayList<Integer>) ar.stream().filter(i->i%2==0).collect(Collectors.toList());
      List<Integer> newlist1 =  ar.stream().filter(i->i>=50).collect(Collectors.toList());
      // filter() will always return list so use List Class with generic to store elements also we can do it by using Arraylist but for that 
      // we need to cast filter() with ArrayList<Integer>.
      System.out.println(newlist1);

      // package java.util.stream;
      // stream is an interface and sub-package of util package stream interface which contains all default-methods like filter(), map(), mapToInt, mapToLong, mapToDouble,distinct,sorted,peek and many more.
      // static method such as empty(),of(),ofNullable(), which has been implementd in interface also we can use static method in interface 
      // and also we can call static method using interface.

      // ways to create stream object and access it
      // we cant create object of any interface with new keyword but we can get their existing object.


    }
}
