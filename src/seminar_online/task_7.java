package seminar_online;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class task_7 {
    public static void main(String[] args) {
        testToFile(testStr());
    }

    private static String testStr() {
        StringBuilder testBuild = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            testBuild.append("TeSt\n");
        }
        return testBuild.toString();
    }

    private static void testToFile(String str) {
        File testFile = new File("C:\\Users\\jo467\\Downloads\\Тестировщик\\GR3483\\Java_course\\src\\seminar_online\\testFile.txt");
        try {
            FileWriter fw = new FileWriter(testFile);
            fw.append(str);
            fw.flush();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }
}