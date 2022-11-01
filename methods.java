import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class methods {
    public static void main(String[] args) {
        // filter()
        // filter takes predicate(argument) as an argument means boolean value function
        // filter will be called for every element if predicate is true it will going to
        // collect(Collectors.toList()) an element.
        // and predicate will release false element
        // syntax of predicate e -> {return true/false} or e->true/false

        // map()
        // with the help of map() we can perform operations on each elements.
        // map() can return element itself it will not return any bool value.
        // map() takes function which returns value and create stream on the basis of
        // value.
        // for eg :- i need to square every element of list and return new element.
        List<String> ar = new ArrayList<String>();
        ar.add("Ankit");
        ar.add("nagesh");
        ar.add("ritik");
        ar.add("Aman");
        ar.add("Ayush");

        // 1-method to print
        List<String> collect1 = ar.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(collect1);
        // print in the form of list

        // 2-method to print
        ar.stream().filter(e -> e.startsWith("A")).forEach(i -> {
            System.out.println(i);
        });
        // print each data in new row

        // 3-method to print
        collect1.stream().forEach(System.out::println);
        // System.out::println -> this is a method reference this operation will perform on e
        // :: -> double colon operator 
        // although we can perform same operation with constructor
        
        // map()

        List<Integer> ar1 = new ArrayList<Integer>();
        // List<Integer> ar1 = List.of(1,2,3,4,5);
        // List<String> ar1 = List.of("Anil","Ankit","Aman");
        ar1.add(1);
        ar1.add(2);
        ar1.add(32);
        ar1.add(14);
        ar1.add(14);
        List<Integer> collect = ar1.stream().filter(e->e>0).collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("Before squaring element "+collect);
        System.out.println("After squaring element");
        ar1.stream().map(i -> i * i).collect(Collectors.toList()).forEach(e -> {
            System.out.println("Squaring each element : "+ e);
            // getting stream of arraylist by using ar1.stream() and applying map() on it.
            // forEach() is a consumer which consumes data one-by-one.
        });

        // List<Integer> collect2 =
        // ar1.stream().map(n->n*n).collect(Collectors.toList());
        // System.out.println(collect2);


        // min()/max()/sorted()/collect()
        // // two different ways to print statement
        List<Integer> collect2 = ar1.stream().filter(e->e>0).collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("Before sorting element"+collect2);
        System.out.println("Ascending Order");
        ar1.stream().sorted().forEach(e->{
            // by-deafult ascending order
         
            System.out.println("After Sorting element " + e);
            
        });

        List<Integer> collect3 = ar1.stream().filter(e->e>0).collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("Before sorting element"+collect3);
        System.out.println("Descending Order");
        ar1.stream().sorted(Comparator.reverseOrder()).forEach(e->{
            // by-deafult ascending order
         
            System.out.println("After Sorting element " + e);
            
        });
        // ar1.stream().sorted().forEach(System.out::println);

        Integer integer = ar1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("\n");
        System.out.println("Minimum value in list :" + integer);
        // (x,y)->x.compareTo(y) implementation of comparator which returns bool vlue
        // by-default return type is optional for min() and max() so use get() to store values

        Integer integer1 = ar1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("\n");
        System.out.println( "Maximum value in list :" + integer1);

        Set<Integer> collect4 = ar1.stream().collect(Collectors.toSet());
        // set is a collection that contains no duplicate elements.
        System.out.println("\n");
        System.out.println(collect4);
    }
}
