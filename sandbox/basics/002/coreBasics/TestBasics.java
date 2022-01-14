public class TestBasics {
  public static void main(String[] args) {
    Basics tester = new Basics();
    int[] testArray = {1,17,5,17,19,-2,4,-6,9,1};
    int[] testArray2 = {};
    int[] testArray3 = {-3,-5,-1,-11};
    int[] testArray4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int[] testArray5 = {4,5,72,134,672,1,6,348,7,23,435,6,37,34};

    // Successful Tests
    System.out.println("Starting Successful Tests");
    // tester.printNumbers(255);
    // tester.printOddNumbers(255);
    // System.out.println(tester.sigma(255));
    // tester.printArrayValues(testArray);
    // System.out.println(tester.findMaxValue(testArray));
    // System.out.println(tester.findMaxValue(testArray2));
    // System.out.println(tester.findMaxValue(testArray3));
    System.out.println(tester.oddNumberArray(testArray4));
    System.out.println(tester.getAverage(testArray5));

    System.out.println("Completed Successful Tests");

    // Fail Tests
    boolean runFailTests = false;
    if (runFailTests) {
      System.out.println("Starting Fail Tests");
      tester.printNumbers(-1);
      tester.printOddNumbers(-2);
      System.out.println(tester.sigma(-3));
      tester.printArrayValues(testArray2);
      System.out.println("Completed Fail Tests");
    }
  }
}