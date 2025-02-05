import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            // check if fizz, buzz or fizzbuzz
            if (i % 15 == 0) {
                resultList.add("FizzBuzz");
            } else if (i % 5 == 0) {
                resultList.add("Buzz");
            } else if (i % 3 == 0) {
                resultList.add("Fizz");
            } else {
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }
}

