public class Main {
    public static void main(String[] args) {

        Gryffindor [] studentsGryffindor = {
                new Gryffindor("Гарри", "Поттер", (byte)100, (byte)100, (byte)100, (byte)100, (byte)100),
                new Gryffindor("Гермиона", "Грейнджер", (byte)100, (byte)100, (byte)100, (byte)100, (byte)100),
                new Gryffindor("Рон", "Уизли", (byte)100, (byte)100, (byte)100, (byte)100, (byte)100),
        };

        for (Gryffindor gryffindor : studentsGryffindor) {
            System.out.println(gryffindor);
        }

    }

}