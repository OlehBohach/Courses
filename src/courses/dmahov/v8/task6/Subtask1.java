package courses.dmahov.v8.task6;

public class Subtask1{
    public static void main(String[] args) {
        String stroka = "Кот ток, Класс школа, Ваня Янав";
        stroka = stroka.replaceAll("\\pP", "");
        String[] outstroka = stroka.split(" ");
        int max = outstroka.length;
        String strout1;
        String outstroka1;
        String outstroka2;
        System.out.println("Одинаковые слова: ");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                strout1 = new StringBuilder(outstroka[j]).reverse().toString();
                outstroka1 = strout1.toLowerCase();
                outstroka2 = outstroka[i].toLowerCase();
                if (outstroka1.equals(outstroka2)) {
                    String vivod = outstroka1+" - "+outstroka[j].toLowerCase();
                    System.out.println(vivod);
                }
            }
        }
    }
}
