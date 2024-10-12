public class Main {
    public static void main(String[] args) {


        Griffindor [] griffindorStudents  =  {
                new Griffindor("Гарри", "Поттер", -89, 92, 89, -7, 90),
                new Griffindor("Гермиона", "Грейнджер", 900, 92, 89, -7, 90),
                new Griffindor("Рон", "Уизли", 89, 92, 89, -7, -89),
        };

        System.out.println("Студенты Гриффиндора");
        for (Griffindor griffindorStudent : griffindorStudents) {
            System.out.println(griffindorStudent);
        }

        ComparisonStudents comparisonStudents = new ComparisonStudents();
        comparisonStudents.comparisonInFaculty(griffindorStudents[0], griffindorStudents[1]);
        comparisonStudents.comparisonInFaculty(griffindorStudents[0], griffindorStudents[2]);
        comparisonStudents.comparisonInFaculty(griffindorStudents[1], griffindorStudents[2]);



    }



}
