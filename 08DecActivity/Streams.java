import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Streams {
    public static void main(String[] args) {
        List<Integer> example = Arrays.asList(2,3,4,5,45,30, 19);

        System.out.println("Actual List for Operation: " + example);

        //ToArray
        // toArray() returns an array containing the elements of this stream.
        Object[] toArray = example.toArray();
        System.out.println("toArray :" + Arrays.toString(toArray));
        
        //Sum
        //Sum() method to calculate the sum of the stream's elements.
        int sum =  example.stream().mapToInt(x->x).sum();
        System.out.println("Sum"+ sum);

        //Average
        //average() method help us to calculate avgerage of all values present in the stream.
        OptionalDouble average = example.stream().mapToInt(x->x).average();
        System.out.println("Average:" + average);

        //anyMatch
        //anyMatch() method help us to find if there is any match or not and return boolean.
        boolean anyMatch = example.stream().anyMatch(x->(x%2==0));
        System.out.println("anyMatch: "+ anyMatch);

        //findAny
        Integer findMatch = example.stream().findAny().orElse(null);
        System.out.println("Find match :" + findMatch);
        
        //Count
        //count() method help us to count total no. of elements present in the stream
        long count = example.stream().count();
        System.out.println("Count: " + count);


    
    }
}
