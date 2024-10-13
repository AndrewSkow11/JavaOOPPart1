public class Main {
    public static void main(String[] args) {


        Griffindor[] griffindorStudents = {
                new Griffindor("Гарри", "Поттер", -89, 92, 89, -7, 90),
                new Griffindor("Гермиона", "Грейнджер", 900, 92, 89, -7, 90),
                new Griffindor("Рон", "Уизли", 89, 92, 89, -7, -89),
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Захария", "Смит", 30, 35, 40, 41, 34),
                new Hufflepuff("Седрик", "Диггори", 30, 70, 40, 41, 34),
                new Hufflepuff("Джастин", "Финч-Флетчли", 30, 35, 40, 41, 34),

        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 100, 20, 20, 40, 20, 10),
                new Ravenclaw("Падма", "Патил", 100, 20, 15, 10, 20, 10),
                new Ravenclaw("Маркус", "Белби", 100, 20, 2, 40, 20, 10),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 50, 60, 70, 80, 90, 100, 90),
                new Slytherin("Грэхэм", "Монтегю", 50, 60, 70, 80, 90, 100, 90),
                new Slytherin("Грегори", "Гойл", 50, 60, 70, 80, 90, 100, 90),

        };


        ComparisonStudents comparisonStudents = new ComparisonStudents();
        PrintStudents printStudents = new PrintStudents();

        System.out.println("Студенты Гриффиндора");
        printStudents.printStudents(griffindorStudents);

        System.out.println("Студенты Слизерина");
        printStudents.printStudents(slytherins);

        System.out.println("Студенты Пуффендуя");
        printStudents.printStudents(hufflepuffStudents);

        System.out.println("Студенты Когтеврана");
        printStudents.printStudents(ravenclaws);

        comparisonStudents.comparisonInFaculty(griffindorStudents[0], griffindorStudents[1]);
        comparisonStudents.comparisonInFaculty(griffindorStudents[0], griffindorStudents[2]);
        comparisonStudents.comparisonInFaculty(griffindorStudents[1], griffindorStudents[2]);

        comparisonStudents.comparisonHogwarts(griffindorStudents[0], griffindorStudents[1]);
        comparisonStudents.comparisonHogwarts(slytherins[1], griffindorStudents[1]);


    }


}
