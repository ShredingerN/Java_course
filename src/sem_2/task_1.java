package sem_2;

import java.util.HashMap;
import java.util.Map;

/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
 * используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":null}
 */
public class task_1 {
    public static void main(String[] args) {
        Map<String, String> given = new HashMap<>();
        given.put("name", "Ivanov");
        given.put("country", "Russia");
        given.put("city", "Moskow");
        given.put("age", null);
        System.out.println(getQuery(given));
    }

    private static String getQuery(Map<String, String> parameter) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> pair : parameter.entrySet()) {
            if (pair.getValue() != null) {
                sb.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 5) : "";
    }
}

