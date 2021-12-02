public class TestFizzBuzz {
    // This will be the launch point for the application
    // For now, we are using this method to test our 
    // FizzBuzz methods
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        
        System.out.println(tester.fizzBuzz(9));     // Fizz
        System.out.println(tester.fizzBuzz(10));    // Buzz
        System.out.println(tester.fizzBuzz(15));    // FizzBuzz
        System.out.println(tester.fizzBuzz(16));    // 16
        System.out.println(tester.fizzBuzz(2));     // 2

        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }

        System.out.println(tester.fizzBuzz(9, "Hello","World","Hello World!"));     // Hello
        System.out.println(tester.fizzBuzz(10, "Hello","World","Hello World!"));    // World
        System.out.println(tester.fizzBuzz(15, "Hello","World","Hello World!"));    // Hello World!
        System.out.println(tester.fizzBuzz(16, "Hello","World","Hello World!"));    // 16
        System.out.println(tester.fizzBuzz(2, "Hello","World","Hello World!"));     // 2
    }
}