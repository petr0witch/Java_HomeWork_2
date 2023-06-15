public class First {
    public static void main(String[] args) {

//        1) Дана строка sql-запроса "select * from students WHERE ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

        StringBuilder output = new StringBuilder("select * from students WHERE ");
        String input = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";

        generater(output, input);
    }
    public static void generater (StringBuilder a, String input) {

        String line = input.replace("{", "").replace("\"", "")
                            .replace("}", "").replace(":", " = ");
        System.out.println(line);
        String[] arr = line.split(", ");
        boolean isNull = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("null")){
                isNull = false;
            } else {
                a.append(i + 2 == arr.length ? (arr[i]) : (arr[i] + ", "));

            }
        }
        System.out.println(a);
    }
}