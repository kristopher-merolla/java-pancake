public class TestBasics {
  public static void main(String[] args) {
    Basics tester = new Basics();

    // Successful Tests
    tester.printNumbers(255);
    tester.printOddNumbers(255);
    System.out.println(tester.sigma(255));

    // Fail Tests
    tester.printNumbers(-1);
    tester.printOddNumbers(-2);
    System.out.println(tester.sigma(-3));


  }
}