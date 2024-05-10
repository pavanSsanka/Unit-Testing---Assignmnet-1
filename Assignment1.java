
public class Main {
    public static void main(String[] args) {
        System.out.println(emptyString());
//      System.out.println(testCaseForNull()); // it throws exception
        System.out.println(string());
        System.out.println(singleChar());
        System.out.println(charNumSpecial());
        System.out.println(upperCharacter());
        System.out.println(specialCharacter());
        System.out.println(stringWithSpaces());
        System.out.println(numbers());

    }
    //Method for upper case for given input string
    public static String convertToUppercase(String var) {
        String result = "";
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) >= 97 && var.charAt(i) <= 122) {
                result += (char) (var.charAt(i) - 32);

            } else {
                result += var.charAt(i);
            }

        }
        return result;
    }

    //Method for empty string
    public static boolean emptyString() {
        String expected = "";
        String input = "";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean testCaseForNull() {
        String expected = null;
        String input = null;
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean string() {
        String expected = "PHENOM";
        String input = "phenom";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean singleChar() {
        String expected = "P";
        String input = "p";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean numbers(){
        String expected = "12345";
        String input = "12345";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean spaceswithpattern(){
        String expected = "  P1A2V3A4N 1234  ";
        String input = "  p1a2v3a4n 1234  ";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }



    public static boolean charNumSpecial(){
        String expected = "SUNDAR()!888";
        String input = "sundar()!888";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean upperCharacter(){
        String expected = "PAAVAAN";
        String input = "paavAAn";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean specialCharacter(){
        String expected = "!*:)";
        String input = "!*:)";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean  stringWithSpaces(){
        String expected = "P A V A N";
        String input = "p a v a n";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }


   




}
