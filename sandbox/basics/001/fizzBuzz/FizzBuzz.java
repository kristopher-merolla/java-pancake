public class FizzBuzz {
    public String fizzBuzz(int number) {
        // % 3 = 0 > Fizz
        // % 5 = 0 > Buzz
        // % 3 & 5 = 0 > FizzBuzz

        String outputWord = "";

        if (number % 3 == 0) {
          outputWord += "Fizz";
        }
        if (number % 5 == 0) {
          outputWord += "Buzz";
        }
        if (outputWord.length() == 0) {
          outputWord = String.valueOf(number);
        }

        return outputWord;
    }

    public String fizzBuzz(
      // Params
      int number,
      String multOf3Word,
      String multOf5Word,
      String multOf15Word
    ) {

      String numberCheck = fizzBuzz(number);
      
    }
}
