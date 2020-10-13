public class AdvancedTest {

    static int myMult(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }

    static float myDivide(float x, float y) {
        float z = 0;
        float result = x;
        float a = y;
        if(y<0){
            y*=-1;
        }
        for (int i = 0; i < x; i++) {
            if (result > 0 && y > 0) {
                result -= y;
                z++;
            }
        }
        if(a<0) {
            z*=-1;
            return z;
        }
        else{
            return z;
        }
    }/* else {
            float result = x;
            for (int i = 0; i < x; i++) {
                if (result < 0) {
                    result -= y;
                    z++;
                }
            }
            return z;
        }*/

    static char findMaxChar(String text) {
        char result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (result < text.charAt(i)) {
                result = text.charAt(i);
            }
        }
        return result;
    }

    static String replaceNthChar(String text, int n, char replaceChar) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (i != 0 && i % n == 0) {
                result += replaceChar;
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }

    static void printPattern(int n, char character) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n + i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    static void printPatternDescending(int n, char character) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n+n-1-i; j > 0; j--) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        short result = (short) myMult(3, 7);
        String test = "Teststring_Einstufungstest";

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

        System.out.println(myDivide(10, 2));
        System.out.println(myDivide(42, -8));

        printPatternDescending(3, '*');
        printPatternDescending(5, '+');
    }
}
