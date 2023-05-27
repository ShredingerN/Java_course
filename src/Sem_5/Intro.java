package Sem_5;

import java.util.*;

public class Intro {

    public static void main(String[] args) {
        // Generic (Обобщение)
        // load factor = 0.75
        HashMap<String, Integer> hashMap = new HashMap<>(36);
        // [null, null, null, null, ..., null] size = 16
        hashMap.put("java", 4);
        // key -> int key_hash = hash(key) = 18 ~ 2
        // 18 -> 2
        // [null, null, {"java", 4}, null, ..., null] size = 16
        hashMap.put("python", 6);
        // key -> int key_hash = hash(key) = 18 ~ 2
        // [null, null, [{"java", 4}, {"python", 6}], null, ..., null] size = 16

        hashMap.get("java");
        // key -> int key_hash = hash(key) = 18 ~ 2
        // получение значения по ключу
        int javaLength = hashMap.get("java");
        //вернуть множество ключей
        Set<String> keys = hashMap.keySet();
        //вернуть множество значений
        Collection<Integer> values = hashMap.values();
        //удаление по ключу
        hashMap.remove("python");
        System.out.println("java".hashCode());
        System.out.println("python".hashCode());

        Map<Integer, String> treeMap = new HashMap<>(); //не будет порядка в выводе
        Map<Integer, String> treeMap1 = new TreeMap<>(); //ключи в порядке возрастания
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//в том порядке, в котром добавляли
        treeMap.put(5, "five");
        treeMap.put(1, "one");
        treeMap.put(3, "three");
        treeMap.put(10, "ten");
        System.out.println(treeMap);

    }

}
