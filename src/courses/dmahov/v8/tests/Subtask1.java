package courses.dmahov.v8.tests;

public class Subtask1 {
    public static void main(String args) {
        bd(args);
    }

    public static void bd(String args) {
        String user1 = "Данил";
        String user2 = "Алексей";
        if (args.equals(user1)) {
            String name = userbd1("name");
            String fam = userbd1("fam");
            String age = userbd1("age");
            System.out.println(name + fam + age);
        } else if (args.equals(user2)) {
            String name = userbd2("name");
            String fam = userbd2("fam");
            String age = userbd2("age");
            System.out.println(name + fam + age);
        } else {
            System.out.println("Такого человека нету");
        }
    }
    public static String userbd1(String args) {
        String name= "Данил ";
        String fam = "Махов ";
        String age = "15 ";
        if (args.equals("name")) return name;
        if (args.equals("fam")) return fam;
        if (args.equals("age")) return age;
        return args;
    }
    public static String userbd2(String args) {
        String name= "Алексей ";
        String fam = "Рахимов ";
        String age = "42 ";
        if (args.equals("name")) return name;
        if (args.equals("fam")) return fam;
        if (args.equals("age")) return age;
        return args;
    }
}