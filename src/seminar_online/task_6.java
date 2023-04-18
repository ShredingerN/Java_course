package seminar_online;

/**
 * Проверка строки на палиндром
 */
public class task_6 {
    public static void main(String[] args) {
        String ourString = "А роза упала на лапу азора";
        String result = ourString.toLowerCase().replaceAll("\\s", "");
        System.out.println(isPalindrome(result));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder bd = new StringBuilder(str);
        String someStr = bd.reverse().toString();
        if (someStr.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
