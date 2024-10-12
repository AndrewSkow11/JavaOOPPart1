public class Main {
    public static void main(String[] args) {
        System.out.println("About Hogwarts");
        Hogwarts people1 = new Hogwarts("firstName",
                "lastName", 56, 30);
        System.out.println(people1);

        Griffindor [] griffindorStudents  =  {
                new Griffindor("Гарри", "Поттер", -89, 92, 89, -7, 90),
                new Griffindor("Гермиона", "Грейнджер", 900, 92, 89, -7, 90),
                new Griffindor("Рон", "Уизли", 89, 92, 89, -7, -89),
        };

        System.out.println("Студенты Гриффиндора");
        for (Griffindor griffindorStudent : griffindorStudents) {
            System.out.println(griffindorStudent);
        }

    }



}
