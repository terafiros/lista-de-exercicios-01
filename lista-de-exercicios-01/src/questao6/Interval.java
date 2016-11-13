package questao6;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            numbers.add(i);
        }
        numbers.stream().filter(a -> a % 2 != 0).forEach(System.out::println);       
    }
    
}
