package entities;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Launch1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        Stream<Integer> stream = nums.stream();

        //------------For the consumer part(Converting nums to stream)-------------
        // Consumer<Integer> consumer = new Consumer<Integer>(){
        // public void accept(Integer i) {
        // System.out.println(i);
        // }
        // };
        
        //-----------Consumer shortcut with lamda Expression(Converting arraylist to stream)-----------
        // Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
        stream.forEach(n -> System.out.println(n));

        //--------------Predicate for filter the integer from streams--------------
        // Predicate<Integer> predicate = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //                                     //     if (n % 2 == 1) {
        //                                     //         return true;
        //                                     //     } else {
        //                                     //         return false;
        //                                     //     }
        //                                     // }
        //           return n%2==1;
        // };

        //-------------Shortcut(lamda Expression) Predicate for filter the integer from streams-----------
        // Predicate<Integer> predicate = n -> n%2==1;
        
        //----------------Function for map -------------------
        // Function<Integer, Integer> func = new Function<Integer, Integer>(){
        //     public Integer apply(Integer n){
            //         return n*2;
        //     }
        // };

        //--------------Lamda Expression for map-------------------------
        // Function<Integer, Integer> func = n ->  n*2;
        // |-> this is return type    
        // Function<Integer, Double> func = n ->  n*2.5;
        
        //-------BinaryOperation for reduce---------------
        // BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
            //     @Override
            //     public Integer apply(Integer s,Integer e){
                //         System.out.println(s+":"+e);
                //         return s+e;
                //     }
                // };
                
                //------BinaryOperation LamdaExpression----------------
        
        
        // Stream<Integer> stream1 = nums.stream();
        // // Predicate<Integer> predicate = n -> n%2==1;
        // Stream<Integer> stream2 = stream1.filter(n -> n%2==1);
        // // Function<Integer, Integer> func = n ->  n*2;
        // Stream<Integer> stream3 = stream2.map(n ->  n*2);
        // //  BinaryOperator<Integer> bi =(s,e) -> s+e;
        // int result = stream3.reduce(0, (s,e) -> s+e);
        // System.out.println("Result:"+result);

        Integer stream1 = nums.stream()
                          .filter(n -> n%2==1)
                          .map(n -> n*2)
                          .reduce(0,(s,e) -> s+e); 


        System.out.println(stream1);
        
        Integer stream2 = nums.parallelStream()
                .filter(n -> n%2==1)
                .map(n -> n*2)
                .reduce(0,(s,e) -> s+e); 

        System.out.println(stream2);

        // stream3.forEach(n -> System.out.println(n));

    }
}









