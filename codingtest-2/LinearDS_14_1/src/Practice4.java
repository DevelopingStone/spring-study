public class Practice4 {

  public static void solution(String str) {

    int count = 0;
    for (String string : str.split("")) {
      if ("([{".contains(string)) {
        count += "([{".indexOf(string) + 1;
        System.out.println("count = " + count);

      } else if (")]}".contains(string)) {
        count -= ")]}".indexOf(string) + 1;
        System.out.println("count = " + count);

      }


    }

    if (count == 0) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

  }

  public static void main(String[] args) {
    // Test code
    solution("[yyyy]-[mm]-[dd]");               // Pass
    solution("System.out.println((arr[0][1))");  // FAIL
    solution("Support [Java or Python(3.x)]");  // PASS
    solution("([[{}])");                        // FAIL
    solution("Knight");


  }
}
