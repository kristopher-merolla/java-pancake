public class StringManipulator {
  
  public static void main(String[] args) {
  
  }

  public String trimAndConcat(String str1, String str2) {
    String trimmedString1 = str1.trim();
    String trimmedString2 = str2.trim();
    String concatenatedString = trimmedString1 + trimmedString2;

    return concatenatedString;
  }

  public Integer getIndexOrNull(String inputString, String searchString) {
    int indx = inputString.indexOf(searchString);
    Integer indexOrNull = indx >= 0 ? indx : null;

    return indexOrNull;
  }

  public Integer getIndexOrNull(String inputString, char searchChar) {
    int indx = inputString.indexOf(searchChar);
    Integer indexOrNull = indx >= 0 ? indx : null;

    return indexOrNull;
  }

  public String concatSubstring(String str1 ,int startAt, int endAt, String str2) {
    String concatenatedString = "";
    String tempString = trimAndConcat(str1, str2);

    if (tempString.length() < endAt) {
      // if we don't have a long enough string, 
      // we should just return the concatenated strings
      return tempString;
    } else if (startAt > endAt) {
      // return tempString if start after end
      // consider refactor later to return reverse
      // string instead
      return tempString;
    } else {
      concatenatedString = tempString.substring(startAt, endAt);
    }

    return concatenatedString;
  }

}
