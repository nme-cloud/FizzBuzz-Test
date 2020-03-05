public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            
            int remainder3 = i % 3;
            int remainder5 = i % 5;

            if (remainder3 == 0 && remainder5 == 0) {
                System.out.println("FizzBuzz");

            } else if (remainder3 == 0) {
                System.out.println("Fizz");

            } else if (remainder5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
        
    }
    
}