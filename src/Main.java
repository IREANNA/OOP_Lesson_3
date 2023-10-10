import java.awt.font.LayoutPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    //      - Создать класс Студент
    //      - Создать класс УчебнаяГруппаИтератор
    //      - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
    //      - Реализовать его контракты (включая удаление)

    //    ДЗ:
    //      — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
    //      — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
    //      — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;



    public static void main(String[] args) {

        Student student1 = new Student("Vasya", 20);
        Student student2 = new Student("Ivan", 19);
        Student student3 = new Student("Alla", 19);

        Student student4 = new Student("Anton", 20);
        Student student5 = new Student("Maria", 19);
        Student student6 = new Student("Polina", 21);

        Student student7 = new Student("Andrey", 21);

        Student student8 = new Student("Vlad", 19);
        Student student9 = new Student("Nikita", 18);
        Student student10 = new Student("Anna", 19);

        Student student11 = new Student("Egor", 19);
        Student student12 = new Student("Artur", 18);
        Student student13 = new Student("Olga", 20);

        Student student14 = new Student("Marat", 18);
        Student student15 = new Student("Oleg", 19);

        Student student16 = new Student("Margo", 19);
        Student student17 = new Student("Danila", 19);

        List<Student> studentsList1 = new ArrayList<Student>(List.of(student1, student2, student3));

        System.out.println("Работа итератора:");
        StudyGroupIterator studyGroupIterator = new StudyGroupIterator(studentsList1);
        System.out.println("Первоначальный итератор: " + studyGroupIterator);

        studyGroupIterator.setCurrentIndex(studyGroupIterator.searchStudent("Ivan",19));
        System.out.println("Индексу присвоено значение " + studyGroupIterator.getCurrentIndex() + ", соответствующее Студенту Ivan в списке");

        studyGroupIterator.remove();
        System.out.println("Итератор после удаления студента " + studyGroupIterator);

        studyGroupIterator.reset();
        System.out.println("index = " + studyGroupIterator.getCurrentIndex() + " (сброс значения индекса)");

        while (studyGroupIterator.hasNext()) {
            System.out.print(studyGroupIterator.getStudent(studyGroupIterator.getCurrentIndex()));
            studyGroupIterator.next();
        }
        System.out.println();
        System.out.println("-".repeat(50));



        System.out.println("Работа с классом Группа: ");
        StudyGroup studyGroup1 = new StudyGroup("Mathematics", studentsList1);
        System.out.println(studyGroup1);
        studyGroup1.addStudent(student4);
        System.out.println("Обновленные данные по группе Mathematics " + studyGroup1.getStudentList());

        StudyGroup studyGroup2 = new StudyGroup("Physics");
        System.out.println(studyGroup2);
        studyGroup2.addListStudents( new ArrayList<Student>(List.of(student5, student6, student7)));

        StudyGroup studyGroup3 = new StudyGroup("English", new ArrayList<Student>(List.of(student8, student9, student10, student11)));
        System.out.println(studyGroup3);
        studyGroup1.removeStudent(student10);
        System.out.println("Обновленные данные по группе English " + studyGroup3.getStudentList());

        System.out.println("-".repeat(50));



        System.out.println("Работа класса Поток: ");
        Stream stream1 = new Stream("Technics", new ArrayList<StudyGroup>(List.of(studyGroup1,studyGroup2)));
        System.out.println(stream1);

        Stream stream2 = new Stream("Language");
        stream2.addGroup(studyGroup3);
        stream2.addGroup("Belarusian", new ArrayList<Student>(List.of(student12, student13)));
        stream2.addGroup("Russian", new ArrayList<Student>(List.of(student14, student15)));

        System.out.println(stream2);
        Stream stream3 = new Stream("Humanitarian");
        stream3.addGroup("History",new ArrayList<Student>(List.of(student16, student17)));




        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));

        List<Stream> streamList = new ArrayList<>(List.of(stream1,stream2,stream3));

        for (Stream inStream : streamList) {
            System.out.println("Stream group count: " + inStream.getGroupsCount());
        }
        StreamService streamService = new StreamService();
        streamService.sortStreams(streamList);

        streamService.sortStreams(streamList);
        for (Stream inStream : streamList) {
            System.out.println("Stream group count: " + inStream.getGroupsCount());
        }

    }
}
