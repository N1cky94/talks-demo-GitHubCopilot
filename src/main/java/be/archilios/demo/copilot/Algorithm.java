package be.archilios.demo.copilot;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    private final int seed;
    
    public Algorithm(int seed) {
        if (seed == 1 || seed == 0) {
            throw new RuntimeException("Out of Algorithm Bounds");
        }
        this.seed = Math.abs(seed);
    }
    
    public boolean calculate() {
        return calculate(seed);
    }
    
    private boolean calculate(int number) {
        for(int i = 2; i < number; i++) {
            if (number % i == 0 ) {
                return false;
            }
        }
        
        return true;
    }
    
    public int calculateNearest() {
        if (calculate()) {
            return seed;
        }
        
        int before = calculateBefore();
        int after = calculateAfter();
        int beforeDelta = seed - before;
        int afterDelta = after - seed;
        if (beforeDelta < afterDelta) {
            return before;
        } else {
            return after;
        }
    }
    
    public int calculateBefore() {
        List<Integer> numbers = calcAllUpto();
        int before = numbers.get(numbers.size() - 1);
        if(before == seed) {
            return numbers.get(numbers.size() - 2);
        }
        return before;
    }
    
    public int calculateAfter() {
        int number = seed + 1;
        while (!calculate(number)) {
            number++;
        }
        return number;
    }
    
    public List<Integer> calcAllUpto() {
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 2; i <= seed; i++) {
            if (calculate(i)) {
                numbers.add(i);
            }
        }
        
        return numbers;
    }
    
    public String toString() {
        return """
                Is true: %b
                Nearest: %d
                Before: %d
                After: %d
                """.formatted(calculate(), calculateNearest(), calculateBefore(), calculateAfter());
    }
}
