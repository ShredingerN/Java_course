package seminars_online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

public class task_9 {
    public static void main(String[] args) {

        HashMap<Integer, String> planets = new HashMap<Integer, String>();
        planets.put(1, "Меркурий");
        planets.put(2, "Венера");
        planets.put(3, "Земля");
        planets.put(4, "Марс");
        planets.put(5, "Юпитер");
        planets.put(6, "Сатурн");
        planets.put(7, "Уран");
        planets.put(8, "Нептун");
        planets.put(9, "Плутон");
        Random rnd = new Random();
        ArrayList<String> arr_planets = new ArrayList<>(21);
        for (int i = 0; i < 21; i++) {
            int key = rnd.nextInt(1, 10);
            String planet = planets.get(key);
            arr_planets.add(planet);
        }
        System.out.println(arr_planets);
        HashMap<String, Integer> count_planet = new HashMap<String, Integer>();
        int count = 0;
        for (int j = 0; j < 20; j++) {
            if (arr_planets.get(j).equals(arr_planets.get(j + 1))) {
                count++;
            }
            count_planet.put(arr_planets.get(j), count);
        }
        System.out.println(count_planet);
    }

}
