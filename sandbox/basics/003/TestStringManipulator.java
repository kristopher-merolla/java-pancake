public class TestStringManipulator {

  public static void main(String[] args) {
    // Test 1
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld

    // Test 2
    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null

    // Test 3
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer a2 = manipulator.getIndexOrNull(word, subString);
    Integer b2 = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(a2); // 2
    System.out.println(b2); // null

    // Test 4
    String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(word2); // eworld
  }
  
}
