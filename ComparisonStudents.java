
/*
Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников
 одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству,
  которое присуще ученику данного факультета.
  Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
   Метод должен выводить в консоль результат сравнения учеников.
 */

/*
Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов.
 У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти.
 Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.

 */
// for Gryffindor
public class ComparisonStudents {
    public void comparisonInFaculty (Griffindor student1, Griffindor student2) {
        int resultStudent1 = student1.getNobility() + student1.getCourage() + student1.getHonor();
        int resultStudent2 = student2.getNobility() + student2.getCourage() + student2.getHonor();

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getFirstName() + " лучший Гриффиндорец, чем " + student2.getFirstName() + '.');
        }
        else if (resultStudent1 ==  resultStudent2) {
            System.out.println(student1.getFirstName() + " такой же хороший Гриффиндорец, как " + student2.getFirstName() + '.');
        }
        else {
            System.out.println(student2.getFirstName() + " лучший Гриффиндорец, чем " + student1.getFirstName() + '.');

        }
    }

    /*
    Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
     и выводит в консоль сравнительную оценку между двумя учениками.
     */

    public void comparisonHogwarts (Hogwarts student1, Hogwarts student2) {
        int resultStudent1 = student1.getPowerOfMagic() + student1.getTransgressionDistance();
        int resultStudent2 = student2.getPowerOfMagic() + student2.getTransgressionDistance();

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getFirstName() + " лучший студент Хогвартса, чем " + student2.getFirstName() + '.');
        }
        else if (resultStudent1 ==  resultStudent2) {
            System.out.println(student1.getFirstName() + " такой же хороший студент Хогвартса, как " + student2.getFirstName() + '.');
        }
        else {
            System.out.println(student2.getFirstName() + " лучший студент Хогвартса, чем " + student1.getFirstName() + '.');

        }
    }


    }
