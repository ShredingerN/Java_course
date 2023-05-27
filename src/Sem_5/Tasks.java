package Sem_5;

//import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        printStringCount("java java python c# c++ java python sql kotlin pascal go js react php java");
        printStringLengthStats("java java python c# c++ java python  sql kotlin pascal go js react php java");

        System.out.println(isIsomorph("egg", "add")); // true
        System.out.println(isIsomorph("paper", "title")); // true
        System.out.println(isIsomorph("foo", "bar")); // false
        System.out.println(isIsomorph("red", "cat")); // true
        System.out.println(isIsomorph("abcde", "aaaaa")); // true
        System.out.println(isIsomorph("aaaaa", "aaaaa")); // true
        System.out.println(isIsomorph("aaaaa", "abcde")); // false
        // parentheses

        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("[](){}")); // true
        System.out.println(isCorrectParentheses("[)")); // false
        System.out.println(isCorrectParentheses("([{}()<>])")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("((")); // false
    }

    /**
     * 1 задача
     * Дан текст, который состоит из слов, разделенных пробелами
     * Нужно распечатать статистику слов, т.е. определить, какое слово сколько раз встречалось
     * Частоту нужно вывести в порядке возрастания
     * <p>
     * 1 -> react php js
     * 2 -> python
     * 3 -> java
     */
    private static void printStringCount(String text) {
        Map<Integer, List<String>> stats = new LinkedHashMap<>(); //можно тримап, можно просто хэшмап.
        List<String> words = Arrays.asList(text.split("\\s++"));//разделяет по пробелам(их может быть много)
        for (String word : words) {
            int freq = Collections.frequency(words, word);
            //достаем из хэш-мэпа значение по ключу, если по freq не находится значение, создается новый список
            List<String> toAdd = stats.getOrDefault(freq, new ArrayList<>());
            toAdd.add(word);//в этот подсписок добавляем все слова, которые встречаются freq раз
            stats.put(freq, toAdd);//кладем ключ(freq) и значение(toAdd)
        }
        System.out.println(stats);// просто выводим наш словарь.
        //вариант, как можно вывести в консоль сколько раз какое число встречается.
        for (Map.Entry<Integer, List<String>> pairs : stats.entrySet()) { // итерируемся по всем парам <key value>
            Integer key = pairs.getKey();
            List<String> value = pairs.getValue();
            System.out.println(key + " -> " + value);
        }
    }

    /**
     * 2 Задача
     * Дан текст, который состоит из слов, разделенных пробелами
     * Нужно распечатать статистику длин слов, т.е. определить, какие слова какую длину имеют
     * Вывод должен быть отсортировать по возрастанию длин
     * <p>
     * 2 -> js c# go
     * 3 -> php sql c++
     * 4 -> java
     * 5 -> react
     * 6 -> python kotlin pascal
     */
    private static void printStringLengthStats(String text) {
        //set - множество, где нет дубликатов
        Map<Integer, Set<String>> stats = new TreeMap<>();
        List<String> words = Arrays.asList(text.split("\\s++"));
        for (String word : words) {
            int length = word.length();
            if (!stats.containsKey(length)) {
                Set<String> value = new HashSet<>(); // HashSet, TreeSet, LinkedHashSet, ...у них хэшмэпы под капотом
                value.add(word);
                stats.put(length, value);
            } else {
                Set<String> value = stats.get(length);
                value.add(word);
            }
        }
        //цикл для вывода в консоль
        for (Map.Entry<Integer, Set<String>> pairs : stats.entrySet()) { // итерируемся по всем парам <key value>
            Integer key = pairs.getKey();
            Set<String> value = pairs.getValue();
            System.out.println(key + " -> " + value);
        }
    }

    /**
     * 3 задача
     * Нужно определить, являются ли слова изоморфными
     * Слова будем называть изоморфными, если каждую букву первого
     * можно однозначно перевести в соответствующую (по индексу) букву во втором слова
     * Примеры:
     * <p>
     * egg, add -> true [e -> a, g -> d]
     * paper, title -> true [p -> t, a -> i, e -> l, r -> e]
     * foo, bar -> false [f -> b, o -> a XXX]
     * note, code -> true [n -> c, o -> o, t -> d, e -> e]
     * red, cat -> true [r -> c, e -> a, d -> t]
     * abcde, aaaaa -> true [a -> a, b -> a, c -> a, d -> a, e -> a]
     * aaaaa, abcde -> false [a -> a, XXX]
     * aaaaa, aaaaa -> true [a -> a]
     */
    static boolean isIsomorph(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        // paper, title
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char firstSymbol = first.charAt(i); // p
            char secondSymbol = second.charAt(i); // t
            if (!mapping.containsKey(firstSymbol)) {
                mapping.put(firstSymbol, secondSymbol); // {p -> t, a -> i}
            } else {
                char anotherSecondSymbol = mapping.get(firstSymbol);
                if (anotherSecondSymbol != secondSymbol) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 4 Задача
     * Определить, является ли последовательность скобочек корректной
     * Скобочки могут быть следующих типов (){}[]<>
     * () -> true
     * [](){} -> true
     * [) -> false
     * ([{}()<>]) -> true
     * ([)] -> false
     * ( -> false
     */
    static boolean isCorrectParentheses(String input) {
        Map<Character, Character> pairs = Map.of(
                '(', ')',
                '[', ']',
                '{', '}',
                '<', '>'
        );
        Deque<Character> stack = new ArrayDeque<>(); //двусторонняя очередь
        //
        // LIFO Last In First Out - последний пришел, первый вышел(обработался)
        //
        // ] -> [
        // ) -> (
        // } -> {
        // > -> <
        // ((((
        // LinkedList -
        // stack.add() - добавляетв всегда в конец
        // stack.poll() - с конца забирает
        char[] chars = input.toCharArray();//метод делает массив символов из входящей строки
        for (char symbol : chars) { // symbol = ]
            if (pairs.containsKey(symbol)) { // symbol является открывающей скобочкой
                stack.addFirst(symbol);
            } else { // symbol является закрывающей скобочкой
                if (stack.isEmpty()) { // встретили закрывающую, а открывающей раньше не было
                    return false;
                }
                char lastSymbolOpenPair = stack.pollFirst(); // (
                // нужно проверить, что lastSymbol является открывающей по отношению к symbol
                char lastSymbolClosedPair = pairs.get(lastSymbolOpenPair); // )
                if (lastSymbolClosedPair != symbol) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    //Забегая вперед в ООП - можно моздать свой собственный тип класса
//    static MyPair getMyPair() {
//        return new MyPair(1, "abc");
//    }
//
//    static record MyPair(int integer, String string) {
//
//    }
//    static class MyPair {
//        int integer;
//        String string;
//
//        public MyPair(int integer, String string) {
//            this.integer = integer;
//            this.string = string;
//        }
//    }

}
