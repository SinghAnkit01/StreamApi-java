
// import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.List;
// import java.util.stream.Collector;   
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamobject {
    public static void main(String[] args) {
        // how to access object of stream interface.
        // not only we can use collection to get the object of stream but also we can
        // access it(stream) using group of object like Arrays.stream()
        // Arrays.stream(null);

        // 5 ways to get object of stream interface

        // creating blank stream
        Stream<Object> emptystream = Stream.empty();
        // stream of type object
        emptystream.forEach(e->{
        System.out.println(e);
        // output:nothing will be display
        });

        // 2-method creating stream by using array
        String names[] = { "Ankit", "Ayush", "Amit", "Aman" };   
        // converting names[] array to stream<String>(stream of type string) by using
        // Stream.of() method
        Stream<String> names1 = Stream.of(names);
        // Stream contains object of type String
        names1.forEach(e -> {
            System.out.println(e);
            // names -> names1 -> e
        });

        // 3-method to create a stream by using builder()
        Stream<Object> build1 = Stream.builder().build();
         build1.forEach(e->{
        System.out.println(e);
        // output:nothing will be display
        });

        // 4-method to stream stream by the use of array

        IntStream stream = Arrays.stream(new int[] { 1, 2, 3, 4 });
        // stream.filter(e->e%2==0).collect((Supplier<R>) Collectors.toList());
        stream.forEach(e -> {
            System.out.println(e);
        });

        // 5-method(imp) working on collection like(List,set,arraylist)
        List<Integer> ar = new ArrayList<Integer>();
        // ar is the object of child arraylist<> class
        // we can store object of child class object in place of parent class object. 
        ar.add(100);
        ar.add(2);
        ar.add(300);
        ar.add(9);
        ar.forEach(e->{
            System.out.println(e);
            // this will not print values in the form of list this will print values to next-line
        });
        Stream<Integer> stream2 = ar.stream();
        // List<Integer> collect = ar.stream().filter(e->e>50).collect(Collectors.toList());
        List<Integer> collect = stream2.filter(e->e>50).collect(Collectors.toList());
        // by the use of collection class object we can directly initialize stream() method by using Stream interface like Stream<Integer> stream1 = .......
        System.out.println(collect);
    }

}
