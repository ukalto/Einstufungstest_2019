public class Test {

    static int myMult(int x, int y) {
        int result = 0;
        if (x > 0 && y > 0) {
            for (int i = 0; i < y; i++) {
                result += x;
            }
        }
        return result;
    }

    static char findMaxChar(String text) {
        char result = 0;
        if (text.length() > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (result < text.charAt(i)) {
                    result = text.charAt(i);
                }
            }
        }
        return result;
    }

    static String replaceNthChar(String text, int n, char replaceChar) {
        String result = "";
        if (text.length() > 0 && n > 0) {
            for (int i = 0; i < text.length(); i++) {
                if (i != 0 && i % n == 0) {
                    result += replaceChar;
                } else {
                    result += text.charAt(i);
                }
            }
        }
        return result;
    }

    static void printPattern(int n, char character) {
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                for (int y = 0; y < j; y++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < n + j; i++) {
                    System.out.print(character);
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        short result;
        String test = "Teststring_Einstufungstest";

        result = (short) myMult(3, 7);
        System.out.println(result);

        System.out.println(myMult(21, 4));
        System.out.println(myMult(2, 3500));

        System.out.println(findMaxChar(test));
        System.out.println(findMaxChar("abcdefg"));
        System.out.println(findMaxChar("4321"));

        System.out.println(replaceNthChar(test, 1, '0'));
        System.out.println(replaceNthChar(test, 3, '#'));
        System.out.println(replaceNthChar(test, 10, '-'));
        System.out.println(replaceNthChar(test, 30, 'X'));
        System.out.println(replaceNthChar("A", 1, '#'));

        printPattern(3, '*');
        printPattern(5, '+');
    }
}
